package zv;

/* loaded from: classes11.dex */
public final class m3 implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f476054d;

    public m3(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin) {
        this.f476054d = flutterBrandEcsPlugin;
    }

    @Override // l75.z0
    public final void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.pigeon.brand_service.BrandServiceCallbackApi brandServiceCallbackApi;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) obj;
        if (!yo.a.b(qw.a.f367052b, str)) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (((n17 == null || n17.m2()) ? false : true) || (brandServiceCallbackApi = this.f476054d.f65191f) == null) {
                return;
            }
            brandServiceCallbackApi.onConversationChange(zv.l3.f476026d);
        }
    }
}
