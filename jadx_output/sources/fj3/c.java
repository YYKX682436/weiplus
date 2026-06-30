package fj3;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj3.f f263195d;

    public c(fj3.f fVar) {
        this.f263195d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fj3.f fVar = this.f263195d;
        com.tencent.mars.xlog.Log.i(fVar.f263199a, "release gl environment");
        rs0.i.f399296a.u(fVar.f263203e);
    }
}
