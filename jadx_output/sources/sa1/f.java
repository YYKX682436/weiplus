package sa1;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sa1.i f405276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.ui.MagicBrushView f405277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f405278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f405279g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f405280h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f405281i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f405282m;

    public f(sa1.i iVar, com.tencent.magicbrush.ui.MagicBrushView magicBrushView, int i17, int i18, int i19, int i27, int i28) {
        this.f405276d = iVar;
        this.f405277e = magicBrushView;
        this.f405278f = i17;
        this.f405279g = i18;
        this.f405280h = i19;
        this.f405281i = i27;
        this.f405282m = i28;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context f147807d;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        com.tencent.luggage.sdk.jsapi.component.b V0;
        com.tencent.mm.plugin.appbrand.page.ia customViewContainer;
        com.tencent.luggage.sdk.jsapi.component.b V02;
        android.content.Context f147807d2;
        sa1.i iVar = this.f405276d;
        java.lang.Float f17 = null;
        if (iVar.f405292e == null) {
            com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) iVar.f405259d.F();
            iVar.f405292e = (yVar == null || (f147807d2 = yVar.getF147807d()) == null) ? null : new android.widget.FrameLayout(f147807d2);
            if (iVar.f405292e != null) {
                com.tencent.luggage.sdk.jsapi.component.service.y yVar2 = (com.tencent.luggage.sdk.jsapi.component.service.y) iVar.f405259d.F();
                if (((yVar2 == null || (V02 = yVar2.V0()) == null) ? null : V02.getCustomViewContainer()) != null) {
                    com.tencent.luggage.sdk.jsapi.component.service.y yVar3 = (com.tencent.luggage.sdk.jsapi.component.service.y) iVar.f405259d.F();
                    if (yVar3 != null && (V0 = yVar3.V0()) != null && (customViewContainer = V0.getCustomViewContainer()) != null) {
                        android.widget.FrameLayout frameLayout = iVar.f405292e;
                        kotlin.jvm.internal.o.d(frameLayout);
                        com.tencent.mm.plugin.appbrand.page.he.a(customViewContainer, frameLayout);
                    }
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.LegacyScreenCanvasViewDelegate", "hy: component or context already released!");
            return;
        }
        hh.g gVar = iVar.f405293f;
        android.widget.FrameLayout frameLayout2 = iVar.f405292e;
        kotlin.jvm.internal.o.d(frameLayout2);
        int i17 = this.f405278f;
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = this.f405277e;
        int a17 = gVar.a(frameLayout2, magicBrushView, i17);
        magicBrushView.setOpaque(false);
        com.tencent.luggage.sdk.jsapi.component.service.y yVar4 = (com.tencent.luggage.sdk.jsapi.component.service.y) iVar.f405259d.F();
        if (yVar4 != null && (f147807d = yVar4.getF147807d()) != null && (resources = f147807d.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f17 = java.lang.Float.valueOf(displayMetrics.density);
        }
        int i18 = this.f405279g;
        int i19 = this.f405280h;
        if (f17 != null) {
            f17.floatValue();
            if (i18 <= 0) {
                i18 = (int) (100 * f17.floatValue());
            }
            if (i19 <= 0) {
                i19 = (int) (100 * f17.floatValue());
            }
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i18, i19);
        layoutParams.setMargins(this.f405281i, this.f405282m, 0, 0);
        android.widget.FrameLayout frameLayout3 = iVar.f405292e;
        kotlin.jvm.internal.o.d(frameLayout3);
        frameLayout3.addView(magicBrushView, a17, layoutParams);
        magicBrushView.setOpaque(false);
    }
}
