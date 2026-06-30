package kh4;

/* loaded from: classes15.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh4.d f308048d;

    public c(kh4.d dVar) {
        this.f308048d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f308048d.f308051d = android.view.Choreographer.getInstance();
        synchronized (this.f308048d.f308056i) {
            this.f308048d.f308056i.notify();
        }
    }
}
