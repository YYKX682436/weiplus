package com.tencent.mm.ui.transmit;

/* loaded from: classes.dex */
public class RetransmitPreviewUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f210979d = null;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488525vz;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        this.f210979d = getIntent().getStringExtra("Retr_Msg_content");
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ghb);
        com.tencent.mm.smiley.x1 Di = com.tencent.mm.smiley.x1.Di();
        getContext();
        textView.setText(Di.Ri(this.f210979d, true));
        setBackBtn(new dk5.n2(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
