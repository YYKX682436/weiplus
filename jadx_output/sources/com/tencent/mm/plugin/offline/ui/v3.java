package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class v3 implements zs4.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.w3 f152743a;

    public v3(com.tencent.mm.plugin.offline.ui.w3 w3Var) {
        this.f152743a = w3Var;
    }

    @Override // zs4.p
    public boolean run(int i17, int i18, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "getDisclaimer   resultCode=" + i17 + ";errCode=" + i18 + ";errMsg=" + str + ";hadAgree = " + z17);
        com.tencent.mm.plugin.offline.ui.w3 w3Var = this.f152743a;
        if (i17 == 2) {
            w3Var.f152753d.f152762g.doSceneProgress(new ys4.j(1, "reward"), false);
        } else if (i17 == 0 && z17) {
            w3Var.f152753d.f152762g.doSceneProgress(new ys4.j(1, "reward"), false);
        } else {
            android.app.Dialog dialog = w3Var.f152753d.f152762g.f152547y0;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
        return true;
    }
}
