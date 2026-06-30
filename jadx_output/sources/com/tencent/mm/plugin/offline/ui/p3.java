package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class p3 implements zs4.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.q3 f152691a;

    public p3(com.tencent.mm.plugin.offline.ui.q3 q3Var) {
        this.f152691a = q3Var;
    }

    @Override // zs4.p
    public boolean run(int i17, int i18, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "getDisclaimer   resultCode=" + i17 + ";errCode=" + i18 + ";errMsg=" + str + ";hadAgree = " + z17);
        com.tencent.mm.plugin.offline.ui.q3 q3Var = this.f152691a;
        if (i17 == 2) {
            q3Var.f152696d.f152701g.doSceneProgress(new ys4.j(1, "collect"), false);
        } else if (i17 == 0 && z17) {
            q3Var.f152696d.f152701g.doSceneProgress(new ys4.j(1, "collect"), false);
        } else {
            android.app.Dialog dialog = q3Var.f152696d.f152701g.f152547y0;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
        return true;
    }
}
