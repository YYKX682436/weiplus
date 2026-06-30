package l06;

/* loaded from: classes15.dex */
public class l implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l06.o f314884d;

    public l(l06.o oVar) {
        this.f314884d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.EnumMap enumMap = new java.util.EnumMap(l06.r.class);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (l06.r rVar : l06.r.values()) {
            java.lang.String h17 = rVar.f314905d.h();
            l06.o oVar = this.f314884d;
            f26.z0 b17 = l06.o.b(oVar, h17);
            f26.z0 b18 = l06.o.b(oVar, rVar.f314906e.h());
            enumMap.put((java.util.EnumMap) rVar, (l06.r) b18);
            hashMap.put(b17, b18);
            hashMap2.put(b18, b17);
        }
        return new l06.n(enumMap, hashMap, hashMap2, null);
    }
}
