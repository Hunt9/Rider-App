package com.example.android.riderapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;




public class SignIn extends AppCompatActivity {

    private static final String TAG = "";

    TextView create;
    Button submit;

    public String myemail;
    private String mypassword;
    EditText email;
    EditText pass;

//    private FirebaseAuth mAuth;
//    private FirebaseAuth.AuthStateListener mAuthListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        email = (EditText)findViewById(R.id.Email);
        pass = (EditText)findViewById(R.id.Password);


        submit = (Button)findViewById(R.id.Submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SignIn.this,BaseActivity.class);
                startActivity(intent);

            }
        });
//
//        mAuth = FirebaseAuth.getInstance();
//
//
//        mAuthListener = new FirebaseAuth.AuthStateListener() {
//            @Override
//            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//                FirebaseUser user = firebaseAuth.getCurrentUser();
//                if (user != null) {
//                    // User is signed in
//                    Toast.makeText(this, user.getDisplayName(), Toast.LENGTH_SHORT).show();
//                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
//                } else {
//                    // User is signed out
//                    Toast.makeText(getParent(), "yararar", Toast.LENGTH_SHORT).show();
//                    Log.d(TAG, "onAuthStateChanged:signed_out");
//                }
//            }
//        };
//
//
//
        create =(TextView) findViewById(R.id.Create);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn.this,SignUp.class);
                startActivity(intent);

            }
        });




//    @Override
//    public void onStart() {
//        super.onStart();
//        mAuth.addAuthStateListener(mAuthListener);
//        // ...
//    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//        if (mAuthListener != null) {
//            mAuth.removeAuthStateListener(mAuthListener);
//        }
//        // ...
//    }
//
//    public void getLogin(final String emails, String pass)
//    {
//
//        email.setText("");
//        pass.setText("");
//
//        mAuth.signInWithEmailAndPassword(emails, pass)
//                .addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        Log.d(TAG, "signInWithEmail:onComplete:" + task.isSuccessful());
//
//                        Toast.makeText(getActivity(), "Success"+ mAuth.getCurrentUser().getDisplayName(), Toast.LENGTH_SHORT).show();
//
//                        gotoact(emails);
//                        // If sign in fails, display a message to the user. If sign in succeeds
//                        // the auth state listener will be notified and logic to handle the
//                        // signed in user can be handled in the listener.
//                        if (!task.isSuccessful()) {
//                            Log.w(TAG, "signInWithEmail:failed", task.getException());
//                            Toast.makeText(getActivity(), "Failed", Toast.LENGTH_SHORT).show();
//                        }
//
//                        // ...
//                    }
//                });



    }

}
