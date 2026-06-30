package sm2;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.f f409420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(sm2.f fVar) {
        super(5);
        this.f409420d = fVar;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        java.lang.String errMsg = (java.lang.String) obj4;
        km2.b bVar = (km2.b) obj5;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        sm2.f fVar = this.f409420d;
        pm0.v.X(new sm2.c(booleanValue, bVar, fVar, intValue));
        com.tencent.mars.xlog.Log.i(fVar.f409448f, "finish live result:" + booleanValue + ',' + bVar);
        return jz5.f0.f302826a;
    }
}
