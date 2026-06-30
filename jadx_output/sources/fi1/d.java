package fi1;

/* loaded from: classes8.dex */
public final class d implements ei1.b, android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f262773d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f262774e;

    /* renamed from: f, reason: collision with root package name */
    public final fi1.g f262775f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f262776g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewTreeObserver f262777h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f262778i;

    /* renamed from: m, reason: collision with root package name */
    public int f262779m;

    /* JADX WARN: Multi-variable type inference failed */
    public d(android.content.Context context, yz5.l contentViewConfigureAction) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contentViewConfigureAction, "contentViewConfigureAction");
        this.f262773d = context;
        fi1.g gVar = new fi1.g(context);
        this.f262775f = gVar;
        this.f262776g = jz5.h.a(jz5.i.f302831f, new fi1.c(this));
        com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialWebView openMaterialWebView = new com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialWebView(context instanceof com.tencent.mm.ui.vas.VASActivity ? ((com.tencent.mm.ui.vas.VASActivity) context).getContainerActivity() : context);
        contentViewConfigureAction.invoke(openMaterialWebView);
        gVar.f262783f.setContentView(openMaterialWebView);
        gVar.setOnDismissListener(new fi1.a(this));
        fi1.b bVar = new fi1.b(this);
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar != null) {
            yVar.mo133getLifecycle().a(new com.tencent.mm.lifecycle.MMLifecycleExtensionKt$addOnDestroyObserver$1(bVar));
        }
    }

    public final void a() {
        android.view.ViewTreeObserver viewTreeObserver = this.f262777h;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                android.view.View view = (android.view.View) this.f262776g.getValue();
                viewTreeObserver = view != null ? view.getViewTreeObserver() : null;
                this.f262777h = viewTreeObserver;
            }
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            this.f262777h = null;
        }
    }

    @Override // im5.a
    public void dead() {
        this.f262775f.f262783f.dead();
    }

    public void hide() {
        android.content.Context context = this.f262773d;
        boolean z17 = context instanceof android.app.Activity;
        fi1.g gVar = this.f262775f;
        if (!z17 || ((android.app.Activity) context).isFinishing() || ((android.app.Activity) context).isDestroyed()) {
            gVar.dismiss();
        } else {
            gVar.dismiss();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.f262775f.isShowing()) {
            android.view.View view = (android.view.View) this.f262776g.getValue();
            boolean z17 = true;
            if (!(view == null || !(view.isShown() || view.getVisibility() == 0))) {
                boolean z18 = this.f262778i;
                android.content.Context context = this.f262773d;
                if (z18 == (2 == context.getResources().getConfiguration().orientation)) {
                    if (this.f262779m == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        z17 = false;
                    }
                }
                if (!z17) {
                    return;
                }
            }
            hide();
        }
    }
}
