package w36;

/* loaded from: classes16.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w36.h f442778d;

    public f(w36.h hVar) {
        this.f442778d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        w36.h hVar = this.f442778d;
        synchronized (hVar) {
            if (hVar.f442801s) {
                return;
            }
            w36.m mVar = hVar.f442791i;
            int i17 = hVar.f442803u ? hVar.f442802t : -1;
            hVar.f442802t++;
            hVar.f442803u = true;
            if (i17 == -1) {
                try {
                    mVar.a(9, x36.o.f451695g);
                    return;
                } catch (java.io.IOException e17) {
                    hVar.c(e17, null);
                    return;
                }
            }
            hVar.c(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + hVar.f442786d + "ms (after " + (i17 - 1) + " successful ping/pongs)"), null);
        }
    }
}
