package ga3;

/* loaded from: classes15.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ga3.v f269855d;

    public g(ga3.v vVar) {
        this.f269855d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ga3.v vVar = this.f269855d;
        long j17 = vVar.f269891q;
        vVar.l();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "LiteAppRecorderManager startTimer");
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new ga3.o(vVar), false);
        vVar.f269889o = b4Var;
        b4Var.c(j17, j17);
    }
}
