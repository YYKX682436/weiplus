package uu0;

/* loaded from: classes5.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uu0.c f431234d;

    public h(uu0.c cVar) {
        this.f431234d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        uu0.c cVar = this.f431234d;
        long j17 = cVar.f431219n;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "stopTimer");
        com.tencent.mm.sdk.platformtools.b4 b4Var = cVar.f431217l;
        if (b4Var != null) {
            b4Var.d();
        }
        cVar.f431217l = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "startTimer");
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(new uu0.f(cVar), false);
        cVar.f431217l = b4Var2;
        b4Var2.c(j17, j17);
    }
}
