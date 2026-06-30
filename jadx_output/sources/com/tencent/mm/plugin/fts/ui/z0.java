package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class z0 implements z21.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI f138386a;

    public z0(com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI) {
        this.f138386a = fTSBaseVoiceSearchUI;
    }

    @Override // z21.b
    public void a(java.lang.String[] strArr, java.util.List list) {
        if (strArr == null || strArr.length <= 0 || lj.f.f(strArr[0])) {
            return;
        }
        java.lang.String str = strArr[0];
        com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI = this.f138386a;
        fTSBaseVoiceSearchUI.Y = str;
        com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI.U6(fTSBaseVoiceSearchUI);
        fTSBaseVoiceSearchUI.f137937y0.t(fTSBaseVoiceSearchUI.Y, k23.r2.f303684f);
    }

    @Override // z21.b
    public void b(java.util.List list) {
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onRecognize Finish");
        com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI = this.f138386a;
        com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI.U6(fTSBaseVoiceSearchUI);
        fTSBaseVoiceSearchUI.f137937y0.t(fTSBaseVoiceSearchUI.Y, k23.r2.f303684f);
        fTSBaseVoiceSearchUI.Y = "";
    }

    @Override // z21.b
    public void e(final int i17, final int i18, final int i19, long j17) {
        com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI.U6(this.f138386a);
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable(i17, i18, i19) { // from class: com.tencent.mm.plugin.fts.ui.z0$$a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f138388e;

            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI = com.tencent.mm.plugin.fts.ui.z0.this.f138386a;
                fTSBaseVoiceSearchUI.f137937y0.t(fTSBaseVoiceSearchUI.Y, k23.r2.f303684f);
                fTSBaseVoiceSearchUI.h7();
                if (this.f138388e == 12) {
                    fTSBaseVoiceSearchUI.q7(fTSBaseVoiceSearchUI.getString(com.tencent.mm.R.string.fh9));
                } else {
                    fTSBaseVoiceSearchUI.q7(fTSBaseVoiceSearchUI.getString(com.tencent.mm.R.string.fh_));
                }
                db5.d5 d5Var = fTSBaseVoiceSearchUI.f137920m;
                if (d5Var != null && d5Var.isShowing()) {
                    fTSBaseVoiceSearchUI.f137920m.dismiss();
                }
                fTSBaseVoiceSearchUI.n7(8);
            }
        });
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
        com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI = this.f138386a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onRecordFin() onRecordFin currentState = %s", fTSBaseVoiceSearchUI.Z);
        com.tencent.mm.sdk.platformtools.b4 b4Var = fTSBaseVoiceSearchUI.f137940z1;
        if (b4Var != null) {
            b4Var.d();
        }
    }
}
