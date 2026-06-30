package i5;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.WorkDatabase f288429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i5.d f288431f;

    public b(i5.d dVar, androidx.work.impl.WorkDatabase workDatabase, java.lang.String str) {
        this.f288431f = dVar;
        this.f288429d = workDatabase;
        this.f288430e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        j5.w i17 = ((j5.g0) this.f288429d.n()).i(this.f288430e);
        if (i17 == null || !i17.b()) {
            return;
        }
        synchronized (this.f288431f.f288435f) {
            ((java.util.HashMap) this.f288431f.f288438i).put(this.f288430e, i17);
            ((java.util.HashSet) this.f288431f.f288439m).add(i17);
            i5.d dVar = this.f288431f;
            dVar.f288440n.b(dVar.f288439m);
        }
    }
}
