package sj0;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj0.e f408347d;

    public d(sj0.e eVar) {
        this.f408347d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f408347d.f408350d = android.view.Choreographer.getInstance();
        synchronized (this.f408347d.f408352f) {
            this.f408347d.f408352f.notify();
        }
    }
}
