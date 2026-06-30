package com.tencent.mm.plugin.forcenotify.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyAcceptUIOld;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-force-notify_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ForceNotifyAcceptUIOld extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f137332d = "MicroMsg.ForceNotifyAcceptUI";

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f137333e = new com.tencent.mm.sdk.platformtools.n3("MicroMsg.ForceNotifyAcceptUI");

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f137334f;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bb8;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        getWindow().addFlags(6815872);
        super.onCreate(bundle);
        fullScreenNoTitleBar(true);
        setBackBtn(new k13.k(this));
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, false, k13.l.f303232d);
        this.f137334f = Q;
        if (Q != null) {
            Q.show();
        }
        android.os.Bundle extras = getIntent().getExtras();
        java.lang.String string = extras != null ? extras.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA) : null;
        if (string == null) {
            finish();
            return;
        }
        this.f137333e.post(new k13.n(string, this));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.f482333bn)).setOnClickListener(new k13.q(this, string));
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.b5d)).setOnClickListener(new k13.r(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f137334f;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
