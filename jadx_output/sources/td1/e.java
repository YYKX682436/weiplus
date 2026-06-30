package td1;

/* loaded from: classes7.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter f417600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f417601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f417602f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter jsApiGetRecentUsageList$Companion$Parameter, yz5.l lVar, com.tencent.mm.ipcinvoker.r rVar) {
        super(2);
        this.f417600d = jsApiGetRecentUsageList$Companion$Parameter;
        this.f417601e = lVar;
        this.f417602f = rVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        boolean n07 = com.tencent.mm.plugin.appbrand.appusage.c1.n0();
        yz5.l lVar = this.f417601e;
        if (n07 || booleanValue) {
            com.tencent.mm.plugin.appbrand.appusage.c1 z07 = com.tencent.mm.plugin.appbrand.appusage.c1.z0();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            z07.u0(java.lang.System.currentTimeMillis(), false, null, 3, 0, this.f417600d.f82908d, longValue, new td1.d(lVar, longValue, this.f417602f), null);
        } else {
            lVar.invoke(java.lang.Long.valueOf(longValue));
        }
        return jz5.f0.f302826a;
    }
}
