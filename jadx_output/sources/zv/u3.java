package zv;

/* loaded from: classes9.dex */
public final class u3 implements e31.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f476116a;

    public u3(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin) {
        this.f476116a = flutterBrandEcsPlugin;
    }

    @Override // e31.h
    public void a(java.lang.String bizUsername, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        com.tencent.pigeon.brand_service.BrandServiceCallbackApi brandServiceCallbackApi = this.f476116a.f65191f;
        if (brandServiceCallbackApi != null) {
            brandServiceCallbackApi.onUpdateTemplateMsgScopeGlobalRecv(bizUsername, z17, zv.t3.f476113d);
        }
    }
}
