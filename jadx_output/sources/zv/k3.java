package zv;

/* loaded from: classes11.dex */
public final class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.EcsTLMockRecCanvasCardEvent f476012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f476013e;

    public k3(com.tencent.mm.autogen.events.EcsTLMockRecCanvasCardEvent ecsTLMockRecCanvasCardEvent, com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin) {
        this.f476012d = ecsTLMockRecCanvasCardEvent;
        this.f476013e = flutterBrandEcsPlugin;
    }

    @Override // java.lang.Runnable
    public final void run() {
        am.l4 l4Var = this.f476012d.f54099g;
        com.tencent.pigeon.biz_base.MockCanvasModel mockCanvasModel = new com.tencent.pigeon.biz_base.MockCanvasModel(l4Var.f7222a, l4Var.f7223b);
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f476013e.f65190e;
        if (bizBaseCallbackApi != null) {
            bizBaseCallbackApi.onInsertMockCanvasModel(0L, mockCanvasModel, zv.j3.f476006d);
        }
    }
}
