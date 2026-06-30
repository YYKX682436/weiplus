package rm;

/* loaded from: classes7.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f397393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rm.a0 f397394e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.ipcinvoker.r rVar, rm.a0 a0Var) {
        super(2);
        this.f397393d = rVar;
        this.f397394e = a0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        com.tencent.wechat.mm.biz.b bVar = (com.tencent.wechat.mm.biz.b) obj;
        com.tencent.wechat.mm.biz.b bVar2 = (com.tencent.wechat.mm.biz.b) obj2;
        com.tencent.mm.ipcinvoker.r rVar = this.f397393d;
        if (bVar == null || bVar2 == null) {
            java.lang.String str2 = (bVar == null && bVar2 == null) ? "fetch both biz and photo failed" : bVar == null ? "fetch biz failed" : "fetch photo failed";
            if (rVar != null) {
                rVar.a(new com.tencent.mm.brandService.GetBizResponse(false, "", 0, str2, null, false, null, 112, null));
            }
        } else {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                rm.a0 a0Var = this.f397394e;
                jSONArray.put(rm.a0.a(a0Var, 1, bVar));
                jSONArray.put(rm.a0.a(a0Var, 2, bVar2));
                str = jSONArray.toString();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("GetPersonalCenterBizTask", "Failed to create biz list JSON", e17);
                str = "[]";
            }
            java.lang.String str3 = str;
            kotlin.jvm.internal.o.d(str3);
            com.tencent.mm.brandService.GetBizResponse getBizResponse = new com.tencent.mm.brandService.GetBizResponse(true, "", 0, "", str3, false, null, 96, null);
            if (rVar != null) {
                rVar.a(getBizResponse);
            }
        }
        return jz5.f0.f302826a;
    }
}
