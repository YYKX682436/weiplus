package com.tencent.mm.plugin.fingerprint.ui;

/* loaded from: classes3.dex */
public class SoterPayTestUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bai;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        findViewById(com.tencent.mm.R.id.ndw).setOnClickListener(new qz2.h0(this));
        findViewById(com.tencent.mm.R.id.ls7).setOnClickListener(new qz2.j0(this));
        findViewById(com.tencent.mm.R.id.ls8).setOnClickListener(new qz2.k0(this));
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterPayTestUI", "hy: on scene end: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        db5.t7.makeText(this, java.lang.String.format("on scene end: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str), 1).show();
        gm0.j1.i();
        gm0.j1.n().f273288b.q(m1Var.getType(), this);
    }
}
