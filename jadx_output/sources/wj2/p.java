package wj2;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.w f446711d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(wj2.w wVar) {
        super(4);
        this.f446711d = wVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        r45.py1 resp = (r45.py1) obj4;
        kotlin.jvm.internal.o.g(resp, "resp");
        wj2.w wVar = this.f446711d;
        if (intValue == 0 && intValue2 == 0) {
            pm0.v.X(new wj2.o(resp, wVar));
        }
        com.tencent.mars.xlog.Log.i(wVar.getTAG(), "doHighLightLikeLive errType:" + intValue + " errCode:" + intValue2 + " errMsg:" + str);
        return jz5.f0.f302826a;
    }
}
