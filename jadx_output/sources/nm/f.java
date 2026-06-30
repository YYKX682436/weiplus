package nm;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nm.g f338432d;

    public f(nm.g gVar) {
        this.f338432d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f338432d.f338433a.f338440d) {
            nm.i.a(this.f338432d.f338433a);
        }
    }
}
