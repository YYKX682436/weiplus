package di1;

/* loaded from: classes8.dex */
public final class f implements zh1.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f232629a;

    /* renamed from: b, reason: collision with root package name */
    public final bi1.g f232630b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection f232631c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f232632d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f232633e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f232634f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f232635g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f232636h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f232637i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashSet f232638j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f232639k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f232640l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f232641m;

    public f(long j17, bi1.g _openMaterialScene, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection, java.lang.String str) {
        kotlin.jvm.internal.o.g(_openMaterialScene, "_openMaterialScene");
        this.f232629a = j17;
        this.f232630b = _openMaterialScene;
        this.f232631c = appBrandOpenMaterialCollection;
        jz5.i iVar = jz5.i.f302831f;
        this.f232632d = jz5.h.a(iVar, di1.d.f232627d);
        this.f232633e = jz5.h.a(iVar, di1.e.f232628d);
        this.f232634f = jz5.h.a(iVar, di1.b.f232625d);
        this.f232635g = jz5.h.a(iVar, new di1.a(this));
        this.f232636h = jz5.h.a(iVar, new di1.c(this));
        this.f232637i = new java.util.HashSet();
        this.f232638j = new java.util.HashSet();
        if (str == null) {
            str = c01.n2.a("OpenMaterial#" + _openMaterialScene.name());
            kotlin.jvm.internal.o.f(str, "buildSessionId(...)");
        }
        this.f232640l = str;
        this.f232641m = "MicroMsg.AppBrand.AppBrandOpenMaterialReporter#" + this.f232640l;
    }

    public long a() {
        int ordinal = this.f232630b.ordinal();
        if (ordinal == 0) {
            return 1L;
        }
        if (ordinal == 1) {
            return 2L;
        }
        if (ordinal == 2) {
            return 3L;
        }
        if (ordinal == 3) {
            return 4L;
        }
        if (ordinal == 4) {
            return 5L;
        }
        if (ordinal == 5) {
            return 6L;
        }
        throw new jz5.j();
    }

    public final long b() {
        return ((java.lang.Number) this.f232635g.getValue()).longValue();
    }

    public final com.tencent.mm.autogen.mmdata.rpt.WeChat_use_weapp_openStruct c() {
        return (com.tencent.mm.autogen.mmdata.rpt.WeChat_use_weapp_openStruct) this.f232632d.getValue();
    }

    public void d() {
        com.tencent.mars.xlog.Log.i(this.f232641m, "onBottomSheetListPageEntranceExposure");
        if (this.f232639k) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.WeChat_use_weapp_openStruct c17 = c();
        c17.p(this.f232640l);
        c17.f62904k = this.f232629a;
        c17.f62898e = 2L;
        c17.f62899f = a();
        c17.f62900g = b();
        c17.f62901h = 0L;
        c17.k();
        this.f232639k = true;
    }

    public void e() {
        com.tencent.mars.xlog.Log.i(this.f232641m, "onBottomSheetMoreClick");
        com.tencent.mm.autogen.mmdata.rpt.WeChat_use_weapp_openStruct c17 = c();
        c17.p(this.f232640l);
        c17.f62904k = this.f232629a;
        c17.f62898e = 3L;
        c17.f62899f = a();
        c17.f62900g = b();
        c17.f62901h = 0L;
        c17.k();
    }

    public void f(com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel openMaterialDetailModel) {
        java.util.List list;
        kotlin.jvm.internal.o.g(openMaterialDetailModel, "openMaterialDetailModel");
        com.tencent.mars.xlog.Log.i(this.f232641m, "onListPageAppBrandClick");
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = this.f232631c;
        long indexOf = ((appBrandOpenMaterialCollection == null || (list = appBrandOpenMaterialCollection.f86252g) == null) ? 0 : list.indexOf(openMaterialDetailModel)) + 1;
        com.tencent.mm.autogen.mmdata.rpt.wechat_use_weapp_clickStruct wechat_use_weapp_clickstruct = (com.tencent.mm.autogen.mmdata.rpt.wechat_use_weapp_clickStruct) this.f232633e.getValue();
        wechat_use_weapp_clickstruct.f63199d = wechat_use_weapp_clickstruct.b("session", this.f232640l, true);
        wechat_use_weapp_clickstruct.f63204i = this.f232629a;
        wechat_use_weapp_clickstruct.f63205j = 2L;
        wechat_use_weapp_clickstruct.f63200e = ((java.lang.Number) this.f232636h.getValue()).longValue();
        wechat_use_weapp_clickstruct.f63201f = indexOf;
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel = openMaterialDetailModel.f86255d;
        wechat_use_weapp_clickstruct.f63202g = wechat_use_weapp_clickstruct.b("weapp_ID", appBrandOpenMaterialModel.f86262d, true);
        java.lang.String str = appBrandOpenMaterialModel.f86267i;
        if (str == null) {
            str = "";
        }
        wechat_use_weapp_clickstruct.f63203h = wechat_use_weapp_clickstruct.b("weapp_name", str, true);
        wechat_use_weapp_clickstruct.k();
    }

    public void g(com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel openMaterialModel) {
        kotlin.jvm.internal.o.g(openMaterialModel, "openMaterialModel");
        com.tencent.mars.xlog.Log.i(this.f232641m, "onListPageAppBrandExposure");
        java.util.HashSet hashSet = this.f232638j;
        if (hashSet.contains(openMaterialModel)) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.wechat_use_weapp_exposeStruct wechat_use_weapp_exposestruct = (com.tencent.mm.autogen.mmdata.rpt.wechat_use_weapp_exposeStruct) this.f232634f.getValue();
        wechat_use_weapp_exposestruct.f63209d = wechat_use_weapp_exposestruct.b("session", this.f232640l, true);
        wechat_use_weapp_exposestruct.f63214i = this.f232629a;
        wechat_use_weapp_exposestruct.f63215j = 2L;
        wechat_use_weapp_exposestruct.f63210e = 2L;
        wechat_use_weapp_exposestruct.f63211f = wechat_use_weapp_exposestruct.b("weapp_id", openMaterialModel.f86262d, true);
        java.lang.String str = openMaterialModel.f86267i;
        if (str == null) {
            str = "";
        }
        wechat_use_weapp_exposestruct.f63212g = wechat_use_weapp_exposestruct.b("weapp_name", str, true);
        wechat_use_weapp_exposestruct.k();
        hashSet.add(openMaterialModel);
    }

    public void h(long j17, java.lang.String str, java.lang.String str2, long j18) {
        com.tencent.mars.xlog.Log.i(this.f232641m, "onListPageItemClick " + j17);
        com.tencent.mm.autogen.mmdata.rpt.wechat_use_weapp_clickStruct wechat_use_weapp_clickstruct = (com.tencent.mm.autogen.mmdata.rpt.wechat_use_weapp_clickStruct) this.f232633e.getValue();
        wechat_use_weapp_clickstruct.f63199d = wechat_use_weapp_clickstruct.b("session", this.f232640l, true);
        wechat_use_weapp_clickstruct.f63204i = this.f232629a;
        wechat_use_weapp_clickstruct.f63205j = j17;
        wechat_use_weapp_clickstruct.f63206k = wechat_use_weapp_clickstruct.b("device_ID", str, true);
        wechat_use_weapp_clickstruct.f63207l = wechat_use_weapp_clickstruct.b("display_name", str2, true);
        wechat_use_weapp_clickstruct.f63208m = j18;
        wechat_use_weapp_clickstruct.k();
    }

    public void i(long j17, java.lang.String str, java.lang.String str2, long j18) {
        com.tencent.mars.xlog.Log.i(this.f232641m, "onListPageItemExposure " + j17);
        com.tencent.mm.autogen.mmdata.rpt.wechat_use_weapp_exposeStruct wechat_use_weapp_exposestruct = (com.tencent.mm.autogen.mmdata.rpt.wechat_use_weapp_exposeStruct) this.f232634f.getValue();
        wechat_use_weapp_exposestruct.f63209d = wechat_use_weapp_exposestruct.b("session", this.f232640l, true);
        wechat_use_weapp_exposestruct.f63214i = this.f232629a;
        wechat_use_weapp_exposestruct.f63215j = j17;
        wechat_use_weapp_exposestruct.f63210e = 2L;
        wechat_use_weapp_exposestruct.f63216k = wechat_use_weapp_exposestruct.b("device_ID", str, true);
        wechat_use_weapp_exposestruct.f63217l = wechat_use_weapp_exposestruct.b("display_name", str2, true);
        wechat_use_weapp_exposestruct.f63218m = j18;
        wechat_use_weapp_exposestruct.k();
    }

    public /* synthetic */ f(long j17, bi1.g gVar, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection appBrandOpenMaterialCollection, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this(j17, gVar, (i17 & 4) != 0 ? null : appBrandOpenMaterialCollection, (i17 & 8) != 0 ? null : str);
    }
}
