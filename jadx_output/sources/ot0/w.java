package ot0;

/* loaded from: classes9.dex */
public final class w implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f348800b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348801c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f348802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f348803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348804f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f348805g;

    public w(java.lang.String str, android.content.Context context, java.lang.String str2, int i17, int i18, java.lang.String str3, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        this.f348799a = str;
        this.f348800b = context;
        this.f348801c = str2;
        this.f348802d = i17;
        this.f348803e = i18;
        this.f348804f = str3;
        this.f348805g = appBrandStatObject;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        if (!bool.booleanValue()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppMsgBizClickHandler", "update bizInfo fail, skip launch wxa");
            return;
        }
        qk.o b17 = r01.z.b(this.f348799a);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(b17 == null);
        objArr[1] = b17 == null ? "null" : b17.field_appId;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgBizClickHandler", "try to launchWxa, bizInfo == null?: %b, appId: %s", objArr);
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Vi(this.f348800b, this.f348801c, null, this.f348802d, this.f348803e, this.f348804f, this.f348805g, b17 != null ? b17.field_appId : null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1908L, 1, 1L, false);
    }
}
