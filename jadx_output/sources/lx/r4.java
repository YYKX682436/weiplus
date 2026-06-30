package lx;

/* loaded from: classes11.dex */
public final class r4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f321933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin) {
        super(0);
        this.f321933d = flutterBizPlugin;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin = this.f321933d;
        com.tencent.mars.xlog.Log.i(flutterBizPlugin.f65253d, "onScreenShot");
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = flutterBizPlugin.f65254e;
        if (bizBaseCallbackApi != null) {
            bizBaseCallbackApi.onBizPageScreenShot(lx.q4.f321925d);
        }
        return jz5.f0.f302826a;
    }
}
