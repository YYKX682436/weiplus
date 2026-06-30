package tm2;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.g f420501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(tm2.g gVar) {
        super(5);
        this.f420501d = gVar;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        java.lang.String errMsg = (java.lang.String) obj4;
        km2.b bVar = (km2.b) obj5;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        tm2.g gVar = this.f420501d;
        pm0.v.X(new tm2.d(booleanValue, bVar, gVar));
        com.tencent.mars.xlog.Log.i(gVar.f420509g, "finish live result:" + booleanValue + ',' + bVar);
        return jz5.f0.f302826a;
    }
}
