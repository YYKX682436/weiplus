package n8;

/* loaded from: classes15.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.f f335532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n8.m f335533e;

    public k(n8.m mVar, o8.f fVar) {
        this.f335533e = mVar;
        this.f335532d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f335532d) {
        }
        this.f335533e.f335537b.i(this.f335532d);
    }
}
