package t93;

/* loaded from: classes8.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t93.a0 f416582d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t93.a0 a0Var) {
        super(4);
        this.f416582d = a0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        r45.nw1 liveInfo;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        r45.z61 resp = (r45.z61) obj4;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.HashMap hashMap = new java.util.HashMap();
        t93.a0 a0Var = this.f416582d;
        if (intValue == 0 && intValue2 == 0) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1);
            hashMap.put("isLiving", java.lang.Boolean.valueOf((finderObject == null || (liveInfo = finderObject.getLiveInfo()) == null || liveInfo.getInteger(2) != 1) ? false : true));
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) resp.getCustom(1);
            hashMap.put("isCharge", java.lang.Boolean.valueOf(((com.tencent.mm.feature.finder.live.v4) w0Var).hk(finderObject2 != null ? finderObject2.getLiveInfo() : null)));
            com.tencent.mars.xlog.Log.i("LiteAppJsapiGetLiveInfo", "LiteAppJsapiGetLiveInfo return is living = " + hashMap.get("isLiving") + ", isCharge = " + hashMap.get("isCharge"));
            a0Var.f143443f.b(hashMap);
        } else {
            com.tencent.mars.xlog.Log.e("LiteAppJsapiGetLiveInfo", "get last object failed, errType = " + intValue + ", errCode = " + intValue2 + ", errMsg = " + str);
            a0Var.f143443f.a("request failed");
        }
        return jz5.f0.f302826a;
    }
}
