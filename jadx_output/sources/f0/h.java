package f0;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.d2 f258098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0.c f258099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0.d f258100f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d0.d2 d2Var, f0.c cVar, d0.d dVar) {
        super(2);
        this.f258098d = d2Var;
        this.f258099e = cVar;
        this.f258100f = dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        p2.f fVar = (p2.f) obj;
        long j17 = ((p2.c) obj2).f351377a;
        kotlin.jvm.internal.o.g(fVar, "$this$null");
        if (!(p2.c.h(j17) != Integer.MAX_VALUE)) {
            throw new java.lang.IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
        }
        p2.s sVar = p2.s.Ltr;
        d0.d2 d2Var = this.f258098d;
        int h17 = p2.c.h(j17) - fVar.G(d0.a2.e(d2Var, sVar) + d0.a2.d(d2Var, sVar));
        int G = fVar.G(this.f258100f.a());
        f0.b bVar = (f0.b) this.f258099e;
        bVar.getClass();
        int i17 = bVar.f258006a;
        int i18 = h17 - (G * (i17 - 1));
        int i19 = i18 / i17;
        int i27 = i18 % i17;
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        int i28 = 0;
        while (i28 < i17) {
            arrayList.add(java.lang.Integer.valueOf((i28 < i27 ? 1 : 0) + i19));
            i28++;
        }
        java.util.List V0 = kz5.n0.V0(arrayList);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) V0;
        int size = arrayList2.size();
        for (int i29 = 1; i29 < size; i29++) {
            arrayList2.set(i29, java.lang.Integer.valueOf(((java.lang.Number) arrayList2.get(i29)).intValue() + ((java.lang.Number) arrayList2.get(i29 - 1)).intValue()));
        }
        return V0;
    }
}
