package v22;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.f f432807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f432808e;

    public e(v22.f fVar, yz5.a aVar) {
        this.f432807d = fVar;
        this.f432808e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        v22.f fVar = this.f432807d;
        boolean b17 = fVar.f432811c.b();
        com.tencent.mars.xlog.Log.i(fVar.f432809a, "finishEncode used " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + ", ret:" + b17 + ", totally used " + (android.os.SystemClock.elapsedRealtime() - fVar.f432812d) + "ms");
        fVar.f432810b.quit();
        yz5.a aVar = this.f432808e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
