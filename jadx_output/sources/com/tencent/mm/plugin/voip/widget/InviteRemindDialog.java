package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes.dex */
public class InviteRemindDialog extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f177092e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f177093f = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f177094g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f177095h;

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.c1o);
        this.f177094g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jlm);
        this.f177095h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jli);
        this.f177092e = getIntent().getStringExtra("InviteRemindDialog_User");
        int intExtra = getIntent().getIntExtra("InviteRemindDialog_Type", 0);
        this.f177093f = intExtra;
        if (intExtra == 0) {
            this.f177094g.setText(getString(com.tencent.mm.R.string.kd8));
            this.f177095h.setText(getString(com.tencent.mm.R.string.f493468kc1));
        } else if (intExtra == 1) {
            this.f177094g.setText(getString(com.tencent.mm.R.string.kdn));
            this.f177095h.setText(getString(com.tencent.mm.R.string.kdk));
        }
        findViewById(com.tencent.mm.R.id.mm_alert_ok_btn).setOnClickListener(new com.tencent.mm.plugin.voip.widget.c(this));
        findViewById(com.tencent.mm.R.id.mm_alert_cancel_btn).setOnClickListener(new com.tencent.mm.plugin.voip.widget.d(this));
    }
}
