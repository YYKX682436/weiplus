package sa1;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sa1.e f405267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.ui.MagicBrushView f405268e;

    public c(sa1.e eVar, com.tencent.magicbrush.ui.MagicBrushView magicBrushView) {
        this.f405267d = eVar;
        this.f405268e = magicBrushView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.luggage.sdk.jsapi.component.b V0;
        com.tencent.mm.plugin.appbrand.page.ia customViewContainer;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) this.f405267d.f405259d.F();
        if (yVar == null || (V0 = yVar.V0()) == null || (customViewContainer = V0.getCustomViewContainer()) == null) {
            return;
        }
        customViewContainer.r(this.f405268e.getVirtualElementId());
    }
}
