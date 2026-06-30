package n11;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final o11.d f334051a;

    /* renamed from: b, reason: collision with root package name */
    public p11.j f334052b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.Executor f334053c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f334054d = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f334055e = new java.util.HashMap();

    public b(o11.d dVar) {
        this.f334051a = dVar;
        this.f334052b = dVar.f342074l;
        this.f334053c = dVar.f342075m;
        ((com.tencent.mm.modelimage.loader.impr.a) dVar.f342069g).f71246a = dVar.f342071i;
    }

    public void a(s11.b bVar) {
        n11.c cVar;
        java.util.HashMap hashMap = this.f334055e;
        if (hashMap == null || bVar == null || (cVar = bVar.f402106e) == null) {
            return;
        }
        hashMap.remove(java.lang.Integer.valueOf(cVar.f334057b));
    }

    public void b(n11.c cVar) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(cVar.f334057b);
        java.util.Map map = this.f334054d;
        map.remove(valueOf);
        map.size();
    }
}
