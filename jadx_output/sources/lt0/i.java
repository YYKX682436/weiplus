package lt0;

/* loaded from: classes15.dex */
public abstract class i implements lt0.c {

    /* renamed from: a, reason: collision with root package name */
    public kk.l f321173a;

    /* renamed from: b, reason: collision with root package name */
    public final lt0.a f321174b;

    /* renamed from: c, reason: collision with root package name */
    public final kk.h f321175c;

    /* renamed from: d, reason: collision with root package name */
    public final kk.i f321176d;

    public i(lt0.a aVar, kk.h hVar, kk.i iVar) {
        this.f321174b = null;
        this.f321174b = aVar;
        this.f321175c = hVar;
        this.f321176d = iVar;
        this.f321173a = new kk.l(aVar.f321163a, new lt0.g(this), new lt0.h(this));
    }

    public void a(double d17) {
        double d18 = d17 + 1.0d;
        com.tencent.mars.xlog.Log.i("MicroMsg.UsageLruMap", "growMaxSize %s and old %s  result %s", java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(this.f321174b.f321163a), java.lang.Integer.valueOf((int) (r1.f321163a * d18)));
        this.f321173a.s((int) (r1.f321163a * d18));
    }

    public abstract java.lang.Object b(java.lang.Object obj, java.lang.Object obj2);
}
