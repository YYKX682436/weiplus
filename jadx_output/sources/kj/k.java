package kj;

/* loaded from: classes12.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.FrameMetrics f308233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f308234f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f308235g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kj.l f308236h;

    public k(kj.l lVar, java.lang.String str, android.view.FrameMetrics frameMetrics, float f17, float f18) {
        this.f308236h = lVar;
        this.f308232d = str;
        this.f308233e = frameMetrics;
        this.f308234f = f17;
        this.f308235g = f18;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f308236h) {
            kj.j jVar = (kj.j) this.f308236h.f308238b.get(this.f308232d);
            if (jVar != null) {
                jVar.a(this.f308232d, this.f308233e, this.f308234f, this.f308235g);
            }
            java.util.Iterator it = this.f308236h.f308239c.values().iterator();
            while (it.hasNext()) {
                ((kj.j) it.next()).a(this.f308232d, this.f308233e, this.f308234f, this.f308235g);
            }
        }
    }
}
