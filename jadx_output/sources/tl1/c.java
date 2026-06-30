package tl1;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public tl1.b f420200d;

    public final tl1.b b(boolean z17) {
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.appbrand.widget.input.h1 d17;
        com.tencent.mm.plugin.appbrand.jsapi.t tVar;
        tl1.b bVar = this.f420200d;
        if (bVar != null) {
            return bVar;
        }
        com.tencent.mm.plugin.appbrand.jsapi.picker.k kVar = (com.tencent.mm.plugin.appbrand.jsapi.picker.k) this;
        try {
            viewGroup = ((com.tencent.mm.plugin.appbrand.page.ia) ((com.tencent.mm.plugin.appbrand.jsapi.t) kVar.f82742f.get()).getCustomViewContainer()).f86757a;
        } catch (java.lang.NullPointerException unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiPickerHandler", "getInvokerView: return a null invoker view");
            viewGroup = null;
        }
        if (viewGroup == null || (d17 = com.tencent.mm.plugin.appbrand.widget.input.h1.d(viewGroup)) == null) {
            return null;
        }
        int i17 = tl1.b.f420199w;
        tl1.b bVar2 = (tl1.b) d17.getRootView().findViewById(com.tencent.mm.R.id.f483189z2);
        if (bVar2 == null && z17) {
            bVar2 = new tl1.b(viewGroup.getContext());
            java.lang.ref.WeakReference weakReference = kVar.f82742f;
            if (weakReference != null && (tVar = (com.tencent.mm.plugin.appbrand.jsapi.t) weakReference.get()) != null) {
                bVar2.setOrientationGetter(com.tencent.mm.plugin.appbrand.jsapi.picker.k.f82740i.a(tVar));
            }
        }
        d17.a(bVar2, true);
        return bVar2;
    }

    public final com.tencent.mm.plugin.appbrand.jsapi.picker.f c(java.lang.Class cls) {
        cls.getSimpleName();
        tl1.b b17 = b(true);
        this.f420200d = b17;
        if (b17 == null) {
            return null;
        }
        try {
            b17.setPickerImpl((com.tencent.mm.plugin.appbrand.jsapi.picker.f) cls.getDeclaredConstructor(android.content.Context.class).newInstance(b17.getContext()));
            return b17.getPicker();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
