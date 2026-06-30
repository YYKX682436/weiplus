package lx;

/* loaded from: classes11.dex */
public final class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.BizRecommandMockCardEvent f321806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f321807e;

    public i4(com.tencent.mm.autogen.events.BizRecommandMockCardEvent bizRecommandMockCardEvent, com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin) {
        this.f321806d = bizRecommandMockCardEvent;
        this.f321807e = flutterBizPlugin;
    }

    @Override // java.lang.Runnable
    public final void run() {
        am.z0 z0Var = this.f321806d.f54009g;
        com.tencent.pigeon.biz_base.MockCanvasModel mockCanvasModel = new com.tencent.pigeon.biz_base.MockCanvasModel(z0Var.f8498a, z0Var.f8499b);
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f321807e.f65254e;
        if (bizBaseCallbackApi != null) {
            bizBaseCallbackApi.onInsertMockCanvasModel(0L, mockCanvasModel, lx.h4.f321788d);
        }
    }
}
