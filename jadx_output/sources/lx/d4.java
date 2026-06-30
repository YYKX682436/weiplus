package lx;

/* loaded from: classes11.dex */
public final class d4 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f321725d;

    public d4(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin) {
        this.f321725d = flutterBizPlugin;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin = this.f321725d;
        if (i17 == flutterBizPlugin.f65259m && i18 == -1 && intent != null) {
            int intExtra = intent.getIntExtra("personalizedOperation", 0);
            com.tencent.pigeon.biz.BizCallbackApi bizCallbackApi = flutterBizPlugin.f65255f;
            if (bizCallbackApi != null) {
                bizCallbackApi.markPersonalizedChanged(intExtra, lx.c4.f321713d);
            }
        }
    }
}
