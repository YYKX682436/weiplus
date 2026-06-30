package com.tencent.mm.plugin.webwx.ui;

@db5.a(3)
/* loaded from: classes5.dex */
public class WebWXUnlockUI extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a_p;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        if (getIntent() != null) {
            java.lang.String stringExtra = getIntent().getStringExtra("deviceName");
            int intExtra = getIntent().getIntExtra("lockDevice", 0);
            java.lang.String stringExtra2 = getIntent().getStringExtra("uuid");
            java.lang.String stringExtra3 = getIntent().getStringExtra("unlockTitle");
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f484074cx1);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486645m00);
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lzq);
            if (stringExtra3 != null) {
                textView.setText(stringExtra3);
            } else if (intExtra == 2 || intExtra == 37) {
                weImageView.setImageResource(com.tencent.mm.R.raw.connect_pc_locked);
                textView.setText(com.tencent.mm.R.string.l87);
            } else if (intExtra == 1 || intExtra == 38) {
                weImageView.setImageResource(com.tencent.mm.R.raw.connect_mac_locked);
                textView.setText(com.tencent.mm.R.string.l86);
            } else {
                weImageView.setImageResource(com.tencent.mm.R.raw.connect_pc_locked);
                textView.setText(com.tencent.mm.R.string.n3m);
            }
            android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oso);
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.vk9);
            com.tencent.mm.plugin.webwx.ui.n0 n0Var = new com.tencent.mm.plugin.webwx.ui.n0(this, textView3, intExtra, stringExtra2);
            textView3.setOnClickListener(n0Var);
            findViewById.setOnClickListener(n0Var);
            com.tencent.mm.ui.bk.s0(textView.getPaint());
            textView2.setText(getString(com.tencent.mm.R.string.f493677l85, stringExtra.trim()));
        }
        setBackBtn(new com.tencent.mm.plugin.webwx.ui.l0(this), com.tencent.mm.R.raw.actionbar_icon_close_black);
    }
}
