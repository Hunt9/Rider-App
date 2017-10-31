package com.example.android.riderapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class SignUp extends AppCompatActivity {



    private EditText myFirstName;
    private EditText myLastName;
    private EditText myEmail;
    private EditText myPassword;
    private Button signup;

    private String fname;
    private String lname;
    private String email;
    private String pass;
    private String bgroup;


//    private FirebaseDatabase mFirebaseDatabase;
//    private DatabaseReference mUsersDatabaseRefrence;


//    private FirebaseAuth mAuth;
//    private FirebaseAuth.AuthStateListener mAuthListener;
//
//    private Users userz;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

//
//
//        mFirebaseDatabase = mFirebaseDatabase.getInstance();
//        mUsersDatabaseRefrence = mFirebaseDatabase.getReference().child("Users");
//
//        mAuth = FirebaseAuth.getInstance();
//
//        mAuthListener = new FirebaseAuth.AuthStateListener() {
//            @Override
//            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//                FirebaseUser user = firebaseAuth.getCurrentUser();
//                if (user != null) {
//                    // User is signed in
//                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
//                } else {
//                    // User is signed out
//                    Log.d(TAG, "onAuthStateChanged:signed_out");
//                }
//                // ...
//            }
//        };
//
//
//        myFirstName = (EditText)view.findViewById(R.id.FirstName);
//        myLastName = (EditText)view.findViewById(R.id.LastName);
//        myEmail = (EditText)view.findViewById(R.id.Email);
//        myPassword = (EditText)view.findViewById(R.id.Password);
//        myBloodGroup = (Spinner)view.findViewById(R.id.SelectBloodGroup);
//        signup = (Button)view.findViewById(R.id.SignUp);
//
//        signup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                fname = myFirstName.getText().toString();
//                lname = myLastName.getText().toString();
//                email = myEmail.getText().toString();
//                pass = myPassword.getText().toString();
//                bgroup = myBloodGroup.getSelectedItem().toString();
//
//                mAuth.createUserWithEmailAndPassword(email,pass)
//                        .addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                Log.d(TAG, "createUserWithEmail:onComplete:" + task.isSuccessful());
//
//                                userz = new Users(fname,lname,email,bgroup);
//                                mUsersDatabaseRefrence.push().setValue(userz);
//
//                                Intent intent = new Intent(getActivity(), Feeds.class);
//                                intent.putExtra("Name", mAuth.getCurrentUser().getDisplayName().toString());
//                                startActivity(intent);
//
//
//
//                                // If sign in fails, display a message to the user. If sign in succeeds
//                                // the auth state listener will be notified and logic to handle the
//                                // signed in user can be handled in the listener.
//                                if (!task.isSuccessful()) {
//
//                                    Toast.makeText(getActivity(), "hahahahaha", Toast.LENGTH_SHORT).show();
//
//                                }
//
//
//                            }
//                        });
//
//
//                myFirstName.setText("");
//                myLastName.setText("");
//                myEmail.setText("");
//                myPassword.setText("");
//
//            }
//        });
//
//
//
//    }
//
//
//    @Override
//    public void onStart() {
//        super.onStart();
//        mAuth.addAuthStateListener(mAuthListener);
//    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//        if (mAuthListener != null) {
//            mAuth.removeAuthStateListener(mAuthListener);
//        }
    }
}
