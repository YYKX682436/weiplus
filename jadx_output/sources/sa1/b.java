package sa1;

/* loaded from: classes7.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.ui.MagicBrushView f405260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f405261e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f405262f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sa1.e f405263g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f405264h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f405265i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f405266m;

    public b(com.tencent.magicbrush.ui.MagicBrushView magicBrushView, int i17, int i18, sa1.e eVar, int i19, int i27, int i28) {
        this.f405260d = magicBrushView;
        this.f405261e = i17;
        this.f405262f = i18;
        this.f405263g = eVar;
        this.f405264h = i19;
        this.f405265i = i27;
        this.f405266m = i28;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.luggage.sdk.jsapi.component.b V0;
        com.tencent.mm.plugin.appbrand.page.ia customViewContainer;
        android.content.Context f147807d;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        this.f405260d.setOpaque(false);
        float f17 = this.f405261e;
        float f18 = this.f405262f;
        sa1.e eVar = this.f405263g;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) eVar.f405259d.F();
        java.lang.Float valueOf = (yVar == null || (f147807d = yVar.getF147807d()) == null || (resources = f147807d.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? null : java.lang.Float.valueOf(displayMetrics.density);
        if (valueOf != null) {
            valueOf.floatValue();
            if (f17 <= 0.0f) {
                f17 = 100 * valueOf.floatValue();
            }
            if (f18 <= 0.0f) {
                f18 = 100 * valueOf.floatValue();
            }
        }
        float[] fArr = {this.f405264h, this.f405265i, f17, f18, this.f405266m};
        com.tencent.luggage.sdk.jsapi.component.service.y yVar2 = (com.tencent.luggage.sdk.jsapi.component.service.y) eVar.f405259d.F();
        if (yVar2 == null || (V0 = yVar2.V0()) == null || (customViewContainer = V0.getCustomViewContainer()) == null) {
            return;
        }
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = this.f405260d;
        customViewContainer.e(magicBrushView, magicBrushView.getVirtualElementId(), 0, fArr, 0, false);
    }
}
