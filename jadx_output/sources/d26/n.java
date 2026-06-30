package d26;

/* loaded from: classes16.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f226029a;

    /* renamed from: b, reason: collision with root package name */
    public final e26.w f226030b;

    /* renamed from: c, reason: collision with root package name */
    public final e26.x f226031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.x f226032d;

    public n(d26.x xVar) {
        this.f226032d = xVar;
        java.util.List list = xVar.f226053h.f287658z;
        kotlin.jvm.internal.o.f(list, "getEnumEntryList(...)");
        int d17 = kz5.b1.d(kz5.d0.q(list, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        for (java.lang.Object obj : list) {
            linkedHashMap.put(b26.t0.b(xVar.f226060r.f17516b, ((i16.c0) obj).f287378g), obj);
        }
        this.f226029a = linkedHashMap;
        d26.x xVar2 = this.f226032d;
        this.f226030b = ((e26.u) xVar2.f226060r.f17515a.f17483a).d(new d26.l(this, xVar2));
        this.f226031c = ((e26.u) this.f226032d.f226060r.f17515a.f17483a).b(new d26.m(this));
    }
}
