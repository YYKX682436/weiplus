package uu0;

/* loaded from: classes5.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uu0.c f431235d;

    public i(uu0.c cVar) {
        this.f431235d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        uu0.c cVar = this.f431235d;
        cVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "stopTimer");
        com.tencent.mm.sdk.platformtools.b4 b4Var = cVar.f431217l;
        if (b4Var != null) {
            b4Var.d();
        }
        cVar.f431217l = null;
    }
}
