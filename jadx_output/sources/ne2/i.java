package ne2;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ne2.k f336532d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ne2.k kVar) {
        super(4);
        this.f336532d = kVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String source = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        long longValue = ((java.lang.Number) obj3).longValue();
        r45.td2 td2Var = (r45.td2) obj4;
        kotlin.jvm.internal.o.g(source, "source");
        ne2.l lVar = ne2.l.f336545a;
        r45.q84 b17 = intValue != 1 ? intValue != 2 ? null : ne2.l.b(lVar, longValue, td2Var, 0, 4, null) : lVar.a(longValue, td2Var);
        this.f336532d.getClass();
        com.tencent.mars.xlog.Log.i("LiveFreeTimeManager", source + " timer generator liveId:" + longValue + ", mode:" + intValue + ", " + cm2.a.f43328a.r(b17));
        return b17;
    }
}
