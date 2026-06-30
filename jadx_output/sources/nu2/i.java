package nu2;

@j95.b
/* loaded from: classes12.dex */
public final class i extends i95.w implements ts5.n {

    /* renamed from: d, reason: collision with root package name */
    public final ou2.d f340181d = new ou2.d();

    public void Ai(ts5.a collectWhat, org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(collectWhat, "collectWhat");
        kotlin.jvm.internal.o.g(data, "data");
        nu2.h hVar = new nu2.h(data);
        ou2.d dVar = this.f340181d;
        dVar.getClass();
        dVar.b(hVar, new ts5.p(collectWhat, null, 2, null), true);
    }

    public ts5.d wi(ts5.c whichCollector, ts5.a collectWhat) {
        kotlin.jvm.internal.o.g(whichCollector, "whichCollector");
        kotlin.jvm.internal.o.g(collectWhat, "collectWhat");
        int ordinal = whichCollector.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? new nu2.g() : new qu2.r(collectWhat) : new qu2.f(collectWhat) : new qu2.b(collectWhat) : new qu2.l(collectWhat) : new qu2.o(collectWhat) : new qu2.k(collectWhat);
    }
}
