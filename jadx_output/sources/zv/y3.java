package zv;

/* loaded from: classes9.dex */
public final class y3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f476139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e31.j f476140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f476141f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476142g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin, e31.j jVar, java.util.List list, java.lang.String str) {
        super(0);
        this.f476139d = flutterBrandEcsPlugin;
        this.f476140e = jVar;
        this.f476141f = list;
        this.f476142g = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin = this.f476139d;
        com.tencent.pigeon.brand_service.BrandServiceCallbackApi brandServiceCallbackApi = flutterBrandEcsPlugin.f65191f;
        if (brandServiceCallbackApi != null) {
            brandServiceCallbackApi.onUpdateTemplateMsgScopeItemList(this.f476140e.f247084j, this.f476141f, new zv.x3(flutterBrandEcsPlugin, this.f476142g));
        }
        return jz5.f0.f302826a;
    }
}
