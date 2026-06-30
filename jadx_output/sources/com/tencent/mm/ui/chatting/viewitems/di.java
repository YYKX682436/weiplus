package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class di implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f203795c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f203796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f203798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate f203799g;

    public di(com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        this.f203799g = chattingItemDyeingTemplate;
        this.f203793a = str;
        this.f203794b = str2;
        this.f203795c = i17;
        this.f203796d = i18;
        this.f203797e = str3;
        this.f203798f = appBrandStatObject;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemDyeingTemplate", "update bizInfo fail, skip launch wxa");
            return;
        }
        qk.o b17 = r01.z.b(this.f203793a);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(b17 == null);
        objArr[1] = b17 == null ? "null" : b17.field_appId;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemDyeingTemplate", "try to launchWxa, bizInfo == null?: %b, appId: %s", objArr);
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Vi(this.f203799g.f203175s.g(), this.f203794b, null, this.f203795c, this.f203796d, this.f203797e, this.f203798f, b17 == null ? null : b17.field_appId);
        com.tencent.mm.ui.chatting.viewitems.c.a(1);
    }
}
