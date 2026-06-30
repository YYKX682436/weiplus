package p5;

/* loaded from: classes16.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final p5.m f351990a = new p5.m();

    public void a(java.lang.Exception exc) {
        boolean z17;
        p5.m mVar = this.f351990a;
        synchronized (mVar.f351985a) {
            if (mVar.f351986b) {
                z17 = false;
            } else {
                mVar.f351986b = true;
                mVar.f351988d = exc;
                mVar.f351985a.notifyAll();
                mVar.b();
                z17 = true;
            }
        }
        if (!z17) {
            throw new java.lang.IllegalStateException("Cannot set the error on a completed task.");
        }
    }
}
