package xx0;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f457915a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f457916b;

    /* renamed from: c, reason: collision with root package name */
    public final xx0.i f457917c;

    /* renamed from: d, reason: collision with root package name */
    public final float f457918d;

    /* renamed from: e, reason: collision with root package name */
    public uu3.u f457919e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f457920f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f457921g;

    /* renamed from: h, reason: collision with root package name */
    public xx0.l f457922h;

    /* renamed from: i, reason: collision with root package name */
    public xx0.j f457923i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f457924j;

    public n(android.view.ViewGroup viewGroup, kotlinx.coroutines.y0 scope, xx0.i dataProvider, float f17) {
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(dataProvider, "dataProvider");
        this.f457915a = viewGroup;
        this.f457916b = scope;
        this.f457917c = dataProvider;
        this.f457918d = f17;
    }

    public final xx0.c a() {
        uu3.u uVar = this.f457919e;
        if (uVar == null) {
            return null;
        }
        vu3.c centerComponent = uVar.getCenterComponent();
        kotlin.jvm.internal.o.e(centerComponent, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.drawer.component.DefaultDrawerComponent");
        android.view.View view = ((vu3.d) centerComponent).f440225b;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.template_panel.MoreTemplateDrawerContentView");
        return (xx0.c) view;
    }

    public final void b() {
        xx0.f0 f0Var;
        e06.k kVar;
        int i17;
        int i18;
        xx0.c a17 = a();
        if (a17 != null && (f0Var = a17.f457864g) != null) {
            java.util.Iterator it = ((java.util.LinkedHashMap) f0Var.f457899h).values().iterator();
            while (it.hasNext()) {
                xx0.d0 d0Var = ((xx0.e0) it.next()).f457888a;
                if (d0Var.f457884o) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TemplateTabPageView", "notifyIsHidden tab: " + d0Var.f457877e.f440039a);
                    d0Var.f457884o = false;
                    if (!kotlin.jvm.internal.o.b(d0Var.f457883n, new e06.k(Integer.MIN_VALUE, Integer.MIN_VALUE)) && (i17 = (kVar = d0Var.f457883n).f246209d) <= (i18 = kVar.f246210e)) {
                        while (true) {
                            d0Var.f457881i.z(i17);
                            if (i17 != i18) {
                                i17++;
                            }
                        }
                    }
                }
            }
        }
        uu3.u uVar = this.f457919e;
        if (uVar != null) {
            com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout.a(uVar, false, 1, null);
        }
    }
}
