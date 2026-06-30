package lx;

/* loaded from: classes11.dex */
public final class n4 implements com.tencent.mm.storage.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f321882a;

    public n4(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin) {
        this.f321882a = flutterBizPlugin;
    }

    @Override // com.tencent.mm.storage.z1
    public final void a(java.lang.Object obj, com.tencent.mm.storage.x1 x1Var) {
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi;
        com.tencent.pigeon.biz_base.BizNotifyTipsInfo g17 = yw.h1.f466332a.g();
        if (g17 == null || (bizBaseCallbackApi = this.f321882a.f65254e) == null) {
            return;
        }
        bizBaseCallbackApi.onNotifyChange(g17, lx.m4.f321867d);
    }
}
