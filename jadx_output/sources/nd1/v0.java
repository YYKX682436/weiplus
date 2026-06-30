package nd1;

/* loaded from: classes7.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f336405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f336406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f336407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f336408g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nd1.w0 f336409h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f336410i;

    public v0(com.tencent.mm.plugin.appbrand.e9 e9Var, com.tencent.mm.plugin.appbrand.page.w2 w2Var, boolean z17, int i17, nd1.w0 w0Var, kotlin.jvm.internal.h0 h0Var) {
        this.f336405d = e9Var;
        this.f336406e = w2Var;
        this.f336407f = z17;
        this.f336408g = i17;
        this.f336409h = w0Var;
        this.f336410i = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f336405d;
        if (e9Var.getRuntime().x0() == null) {
            com.tencent.mars.xlog.Log.w("JsApiSetNavigateBackConfirmDialog", "pageContainer is null, return");
            return;
        }
        oi1.l lVar = null;
        com.tencent.mm.plugin.appbrand.page.w2 w2Var = this.f336406e;
        java.lang.String currentUrl = w2Var != null ? w2Var.getCurrentUrl() : null;
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = e9Var.getRuntime().x0().getCurrentPage();
        if (android.text.TextUtils.equals(currentUrl, currentPage != null ? currentPage.getCurrentUrl() : null)) {
            boolean z17 = this.f336407f;
            if (z17) {
                arrayList = new java.util.ArrayList();
                java.util.Iterator it = kz5.c0.i("scene_actionbar_back", "scene_back_key_pressed", "scene_jsapi_navigate_back").iterator();
                while (it.hasNext()) {
                    arrayList.add(new oi1.m(z17, (java.lang.String) it.next()));
                }
            } else {
                arrayList = null;
            }
            com.tencent.mm.plugin.appbrand.page.w2 currentPage2 = e9Var.getRuntime().x0().getCurrentPage();
            if (currentPage2 != null) {
                oi1.n nVar = oi1.n.f345608e;
                if (arrayList != null) {
                    java.lang.Object element = this.f336410i.f310123d;
                    kotlin.jvm.internal.o.f(element, "element");
                    lVar = new oi1.l((java.lang.String) element, arrayList);
                }
                currentPage2.K(nVar, lVar);
            }
            e9Var.a(this.f336408g, this.f336409h.o("ok"));
        }
    }
}
