package p5;

/* loaded from: classes16.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.n f351980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Callable f351981e;

    public l(p5.g gVar, p5.n nVar, java.util.concurrent.Callable callable) {
        this.f351980d = nVar;
        this.f351981e = callable;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        p5.n nVar = this.f351980d;
        try {
            if (nVar.f351990a.c(this.f351981e.call())) {
            } else {
                throw new java.lang.IllegalStateException("Cannot set the result of a completed task.");
            }
        } catch (java.util.concurrent.CancellationException unused) {
            p5.m mVar = nVar.f351990a;
            synchronized (mVar.f351985a) {
                if (mVar.f351986b) {
                    z17 = false;
                } else {
                    mVar.f351986b = true;
                    mVar.f351985a.notifyAll();
                    mVar.b();
                    z17 = true;
                }
                if (!z17) {
                    throw new java.lang.IllegalStateException("Cannot cancel a completed task.");
                }
            }
        } catch (java.lang.Exception e17) {
            nVar.a(e17);
        }
    }
}
