package sa1;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f405269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f405270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f405271f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f405272g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f405273h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sa1.e f405274i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.ui.MagicBrushView f405275m;

    public d(int i17, int i18, int i19, int i27, int i28, sa1.e eVar, com.tencent.magicbrush.ui.MagicBrushView magicBrushView) {
        this.f405269d = i17;
        this.f405270e = i18;
        this.f405271f = i19;
        this.f405272g = i27;
        this.f405273h = i28;
        this.f405274i = eVar;
        this.f405275m = magicBrushView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.luggage.sdk.jsapi.component.b V0;
        com.tencent.mm.plugin.appbrand.page.ia customViewContainer;
        float[] fArr = {this.f405269d, this.f405270e, this.f405271f, this.f405272g, this.f405273h};
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) this.f405274i.f405259d.F();
        if (yVar == null || (V0 = yVar.V0()) == null || (customViewContainer = V0.getCustomViewContainer()) == null) {
            return;
        }
        int virtualElementId = this.f405275m.getVirtualElementId();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        customViewContainer.w(virtualElementId, fArr, 0, bool, bool);
    }
}
