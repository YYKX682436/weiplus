package ic5;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ic5.a f290427d = new ic5.a();

    public a() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedHashMap map = (java.util.LinkedHashMap) obj;
        kotlin.jvm.internal.o.g(map, "map");
        ic5.h hVar = ic5.h.f290441a;
        java.util.Collection values = map.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        wg3.k d17 = hVar.d(kz5.n0.S0(values));
        cl0.g h17 = new cl0.g().h(dm.i4.COL_ID, d17.f445730a);
        h17.o("pic", d17.f445731b);
        h17.o("live", d17.f445733d);
        h17.o("vd", d17.f445732c);
        java.lang.String gVar = h17.toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        return gVar;
    }
}
