package rm;

/* loaded from: classes7.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f397395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.biz.b f397396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f397397f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z17, com.tencent.wechat.mm.biz.b bVar, com.tencent.mm.ipcinvoker.r rVar) {
        super(0);
        this.f397395d = z17;
        this.f397396e = bVar;
        this.f397397f = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ipcinvoker.r rVar = this.f397397f;
        com.tencent.wechat.mm.biz.b bVar = this.f397396e;
        boolean z17 = this.f397395d;
        if (z17) {
            java.lang.String biz = bVar.f217889e;
            if (!(biz == null)) {
                if (rVar != null) {
                    kotlin.jvm.internal.o.f(biz, "biz");
                    boolean z18 = bVar.f217897p;
                    boolean z19 = bVar.f217894m;
                    java.lang.String jSONObject = pm0.b0.g(bVar).toString();
                    kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                    rVar.a(new com.tencent.mm.brandService.GetBizResponse(true, biz, z18 ? 1 : 0, "", null, z19, jSONObject));
                }
                return jz5.f0.f302826a;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getBizForPublish failed, ret=");
        sb6.append(z17);
        sb6.append(" resp.biz=");
        java.lang.String str = bVar.f217889e;
        if (str == null) {
            str = "null";
        }
        sb6.append(str);
        sb6.append(',');
        com.tencent.mars.xlog.Log.e("GetPersonalCenterBizTask", sb6.toString());
        bVar.toJSON();
        if (rVar != null) {
            rVar.a(new com.tencent.mm.brandService.GetBizResponse(false, "", 0, "getBiz failed", null, false, null, 112, null));
        }
        return jz5.f0.f302826a;
    }
}
