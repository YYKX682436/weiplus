package wd4;

/* loaded from: classes4.dex */
public final class p implements zh1.c1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wd4.h f444993c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.k5 f444994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f444995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wd4.q f444996f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444997g;

    public p(java.lang.String str, wd4.h hVar, com.tencent.mm.plugin.appbrand.service.k5 k5Var, java.util.List list, wd4.q qVar, yz5.a aVar) {
        this.f444992b = str;
        this.f444993c = hVar;
        this.f444994d = k5Var;
        this.f444995e = list;
        this.f444996f = qVar;
        this.f444997g = aVar;
    }

    @Override // zh1.c1
    public final void a(java.lang.Runnable openTask) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("executeOrDefer", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2");
        kotlin.jvm.internal.o.g(openTask, "openTask");
        java.lang.String str = this.f444992b;
        com.tencent.mars.xlog.Log.i(str, "tryEnable, open");
        wd4.h hVar = this.f444993c;
        hVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoroutineScope", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoroutineScope", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$Params");
        ((kotlinx.coroutines.c3) kotlinx.coroutines.l.d(hVar.f444911a, null, null, new wd4.n(this.f444994d, this.f444993c, this.f444995e, this.f444992b, this.f444996f, this.f444997g, openTask, null), 3, null)).p(new wd4.o(str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("executeOrDefer", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2");
    }
}
