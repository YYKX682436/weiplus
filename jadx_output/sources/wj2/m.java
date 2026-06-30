package wj2;

/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.w f446707d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(wj2.w wVar) {
        super(4);
        this.f446707d = wVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        r45.tp2 resp = (r45.tp2) obj4;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f446707d.getTAG(), "doHighLightLikeLive errType:" + intValue + " errCode:" + intValue2 + " errMsg:" + ((java.lang.String) obj3));
        return jz5.f0.f302826a;
    }
}
