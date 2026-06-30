package vd1;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f435600a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f435601b;

    /* renamed from: c, reason: collision with root package name */
    public int f435602c;

    /* renamed from: d, reason: collision with root package name */
    public int f435603d;

    /* renamed from: e, reason: collision with root package name */
    public int f435604e;

    /* renamed from: f, reason: collision with root package name */
    public int f435605f;

    /* renamed from: g, reason: collision with root package name */
    public int f435606g;

    /* renamed from: h, reason: collision with root package name */
    public vd1.l f435607h;

    /* renamed from: i, reason: collision with root package name */
    public long f435608i;

    /* renamed from: j, reason: collision with root package name */
    public int f435609j;

    /* renamed from: k, reason: collision with root package name */
    public vd1.m f435610k;

    public final void a() {
        java.lang.String str;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String str2 = this.f435600a;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("instanceId");
            throw null;
        }
        linkedList.add(str2);
        java.lang.String str3 = this.f435601b;
        if (str3 == null) {
            kotlin.jvm.internal.o.o("appId");
            throw null;
        }
        linkedList.add(str3);
        linkedList.add(java.lang.String.valueOf(this.f435602c));
        linkedList.add(java.lang.String.valueOf(this.f435603d));
        linkedList.add(java.lang.String.valueOf(this.f435604e));
        linkedList.add(java.lang.String.valueOf(this.f435605f));
        linkedList.add(java.lang.String.valueOf(this.f435606g));
        vd1.l lVar = this.f435607h;
        if (lVar == null) {
            kotlin.jvm.internal.o.o(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY);
            throw null;
        }
        int ordinal = lVar.ordinal();
        if (ordinal == 0) {
            str = "2";
        } else if (ordinal == 1) {
            str = "3";
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            str = "1";
        }
        linkedList.add(str);
        linkedList.add(java.lang.String.valueOf(this.f435608i));
        linkedList.add(java.lang.String.valueOf(this.f435609j));
        vd1.m mVar = this.f435610k;
        if (mVar == null) {
            kotlin.jvm.internal.o.o("action");
            throw null;
        }
        linkedList.add(java.lang.String.valueOf(mVar.f435599d));
        java.lang.String h17 = u46.l.h(linkedList, ",");
        com.tencent.mm.plugin.appbrand.profile.c cVar = (com.tencent.mm.plugin.appbrand.profile.c) nd.f.d(com.tencent.mm.plugin.appbrand.profile.c.class, true);
        if (cVar != null) {
            ((ch1.d) cVar).b(26761, h17);
        }
    }

    public final void b(com.tencent.mm.plugin.appbrand.y yVar) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u07 = (yVar == null || (t37 = yVar.t3()) == null) ? null : t37.u0();
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU = u07 instanceof com.tencent.luggage.sdk.config.AppBrandInitConfigLU ? (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) u07 : null;
        java.lang.String str = appBrandInitConfigLU != null ? appBrandInitConfigLU.f47277w : null;
        if (str == null) {
            str = "";
        }
        this.f435600a = str;
        java.lang.String appId = yVar != null ? yVar.getAppId() : null;
        this.f435601b = appId != null ? appId : "";
        this.f435602c = appBrandInitConfigLU != null ? appBrandInitConfigLU.L : 0;
        this.f435603d = (appBrandInitConfigLU != null ? appBrandInitConfigLU.f77281g : -1) + 1;
        this.f435604e = (appBrandInitConfigLU != null ? appBrandInitConfigLU.f47284z : -1000) + 1000;
    }
}
