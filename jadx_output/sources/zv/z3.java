package zv;

/* loaded from: classes9.dex */
public final class z3 implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f476151a;

    public z3(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin) {
        this.f476151a = flutterBrandEcsPlugin;
    }

    @Override // e31.i
    public void a() {
        com.tencent.mars.xlog.Log.e(this.f476151a.f65189d, "onSubscribeMsgStatusChanged error");
    }

    @Override // e31.i
    public void b(java.lang.String templateId, e31.j result) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin = this.f476151a;
        com.tencent.mars.xlog.Log.i(flutterBrandEcsPlugin.f65189d, "onSubscribeMsgStatusChanged templateId: " + templateId + ", businessType: " + result.f247083i + ", isSubscribed: " + result.f247075a + ", isSwitchOpened: " + result.f247076b);
        pm0.v.X(new zv.y3(flutterBrandEcsPlugin, result, kz5.b0.c(new com.tencent.pigeon.brand_service.BrsTemplateMsgScopeItem(templateId, java.lang.Long.valueOf((long) result.f247083i), java.lang.Boolean.valueOf(result.f247075a), java.lang.Boolean.valueOf(result.f247081g), java.lang.Boolean.valueOf(result.f247082h))), templateId));
    }
}
