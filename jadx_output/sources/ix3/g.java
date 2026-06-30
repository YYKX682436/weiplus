package ix3;

/* loaded from: classes10.dex */
public final class g implements android.util.Printer {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.i f295418d;

    public g(ix3.i iVar) {
        this.f295418d = iVar;
    }

    @Override // android.util.Printer
    public final void println(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        kotlin.jvm.internal.o.d(str);
        boolean y17 = r26.i0.y(str, ">>>", false);
        ix3.i iVar = this.f295418d;
        if (!y17) {
            if (!r26.i0.y(str, "<<<", false) || (n3Var = iVar.f295438b) == null) {
                return;
            }
            n3Var.removeCallbacks(iVar.f295440d);
            return;
        }
        if (iVar.f295437a == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("RepairerBlockMonitorThread");
            handlerThread.start();
            iVar.f295438b = new com.tencent.mm.sdk.platformtools.n3(handlerThread.getLooper());
            iVar.f295437a = handlerThread;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var2 = iVar.f295438b;
        if (n3Var2 != null) {
            n3Var2.removeCallbacks(iVar.f295440d);
        }
        iVar.f295440d = new ix3.h(iVar);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        iVar.f295441e = java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.n3 n3Var3 = iVar.f295438b;
        if (n3Var3 != null) {
            n3Var3.postAtTime(iVar.f295440d, android.os.SystemClock.uptimeMillis() + iVar.f295443g);
        }
    }
}
