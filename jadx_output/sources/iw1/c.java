package iw1;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iw1.f f295200d;

    public c(iw1.f fVar) {
        this.f295200d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iw1.f fVar = this.f295200d;
        com.tencent.mars.xlog.Log.i(fVar.f295204a, "release gl environment");
        rs0.i.f399296a.u(fVar.f295208e);
    }
}
