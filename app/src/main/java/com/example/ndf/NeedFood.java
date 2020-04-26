package com.example.ndf;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class NeedFood extends AppCompatActivity {
        private EditText et1,et2,et3,et4,et5;
        private Button bt;
        DatabaseReference dbRefer;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_need_food);

            dbRefer= FirebaseDatabase.getInstance().getReference("nd");
        et1=(EditText) findViewById(R.id.editText1);
        et2=(EditText) findViewById(R.id.editText2);
        et3=(EditText) findViewById(R.id.editText3);
        et4=(EditText) findViewById(R.id.editText4);
        et5=(EditText) findViewById(R.id.editText5);
        bt=(Button) findViewById(R.id.button1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDetails();
            }
        });

        }
        public void addDetails()
        {
            String t1=et1.getText().toString();
            String t2=et2.getText().toString();
            String t3=et3.getText().toString();
            String t4=et4.getText().toString();
            String t5=et5.getText().toString();
            if(!TextUtils.isEmpty(t1) && !TextUtils.isEmpty(t2) && !TextUtils.isEmpty(t3)&& !TextUtils.isEmpty(t4) && !TextUtils.isEmpty(t5))
            {
                String id=dbRefer.push().getKey();
                NF nf=new NF(id, t1,t2,t3,t4,t5);
                dbRefer.child(id).setValue(nf);
                et1.setText("");
                et2.setText("");
                et3.setText("");
                et4.setText("");
                et5.setText("");
            }
        }
    }


    /*protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_need_food);
        txt=(TextView) findViewById(R.id.textView);
        et1=(EditText) findViewById(R.id.editText1);
        et2=(EditText) findViewById(R.id.editText2);
        et3=(EditText) findViewById(R.id.editText3);
        et4=(EditText) findViewById(R.id.editText4);
        bt=(Button) findViewById(R.id.button1);
    }
    public void btnConn(View v)
    {
        Send s= new Send();
        s.execute("");
    }
    private class Send extends AsyncTask<String, String, String>  {
        String t1=et1.getText().toString();
        String t2=et2.getText().toString();
        String t3=et3.getText().toString();
        String t4=et4.getText().toString();
        int id=0;
        String msg;

        @Override
        protected void onPreExecute() {
            txt.setText("please wait");
        }

        @Override
        protected String doInBackground(String... strings) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn= DriverManager.getConnection(DB_URL,user,pass);
                if(conn==null)
                {
                    msg="Connection wrong";
                }
                else {
                    String query = "INSERT INTO need_request (ID,Name,Address,Cno,Quantity) VALUES ('" + id + "," + t1 + "," + t2 + "," + t3 + "," + t4 + "')";
                    Statement st = conn.createStatement();
                    st.executeUpdate(query);
                    msg="Inserted Successfully";
                }
                conn.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                //msg="Connection wrong";
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return msg;
        }

        protected void onPostExecute(String msg)
        {
            txt.setText(msg);
        }
    }*/




