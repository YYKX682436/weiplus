package nv;

/* loaded from: classes9.dex */
public final /* synthetic */ class b2$$a implements java.util.function.Consumer {
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        sn1.j jVar = (sn1.j) obj;
        final bw5.s10 s10Var = (bw5.s10) jVar.f410031a;
        int i17 = jVar.f410032b;
        if (i17 == 0 && jVar.f410033c == 0 && s10Var != null) {
            yn1.k4.d(true);
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: nv.b2$$c
                @Override // java.lang.Runnable
                public final void run() {
                    android.content.Context launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
                    if (launcherUI == null) {
                        launcherUI = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    }
                    mv.w wVar = (mv.w) i95.n0.c(mv.w.class);
                    ((yn1.h4) wVar).bj(launcherUI, bw5.s10.this, mv.a.f331473i);
                }
            });
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupCore", "getConnectInfoAsync fail, errType:%s, errCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(jVar.f410033c));
            yn1.k4.d(false);
            final bw5.zi0 zi0Var = (jVar.f410032b != 4 || jVar.f410033c == 0) ? bw5.zi0.ERROR_CODE_NETWORK_DISCONNECT : bw5.zi0.ERROR_CODE_ACCOUNT_MISMATCH;
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: nv.b2$$b
                @Override // java.lang.Runnable
                public final void run() {
                    android.content.Context launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
                    if (launcherUI == null) {
                        launcherUI = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    }
                    mv.w wVar = (mv.w) i95.n0.c(mv.w.class);
                    ((yn1.h4) wVar).ij(launcherUI, bw5.zi0.this, mv.a.f331473i);
                }
            });
        }
    }
}
