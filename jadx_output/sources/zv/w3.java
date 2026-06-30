package zv;

/* loaded from: classes11.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f476126d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin) {
        super(0);
        this.f476126d = flutterBrandEcsPlugin;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin = this.f476126d;
        com.tencent.mars.xlog.Log.i(flutterBrandEcsPlugin.f65189d, "onScreenShot");
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = flutterBrandEcsPlugin.f65190e;
        if (bizBaseCallbackApi != null) {
            bizBaseCallbackApi.onBizPageScreenShot(zv.v3.f476122d);
        }
        return jz5.f0.f302826a;
    }
}
