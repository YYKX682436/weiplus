package o8;

/* loaded from: classes15.dex */
public class i extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.j f343614d;

    public i(o8.j jVar) {
        this.f343614d = jVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        o8.j jVar = this.f343614d;
        jVar.getClass();
        do {
            try {
            } catch (java.lang.InterruptedException e17) {
                throw new java.lang.IllegalStateException(e17);
            }
        } while (jVar.d());
    }
}
