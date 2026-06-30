package rx4;

/* loaded from: classes8.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.k0 f401194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx4.m f401195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f401196f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rx4.l f401197g;

    public i0(rx4.k0 k0Var, rx4.m mVar, int i17, rx4.l lVar) {
        this.f401194d = k0Var;
        this.f401195e = mVar;
        this.f401196f = i17;
        this.f401197g = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHotspotBoxUIC$renderHotspotContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rx4.k0 k0Var = this.f401194d;
        k0Var.hideVKB();
        rx4.m mVar = this.f401195e;
        boolean z17 = mVar.f401231d.length() > 0;
        int i17 = this.f401196f;
        if (z17) {
            rx4.k0.T6(k0Var, vu4.a.f440243m, mVar, i17);
            int i18 = mVar.f401232e;
            rx4.l lVar = this.f401197g;
            if (i18 == 0) {
                android.app.Activity context = k0Var.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(rx4.h2.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                ((rx4.h2) a17).t7(lVar.f401221c, mVar.f401229b, mVar.f401231d, kz5.q0.f314001d);
            } else {
                android.app.Activity context2 = k0Var.getContext();
                kotlin.jvm.internal.o.g(context2, "context");
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((rx4.h2) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(rx4.h2.class)).m7(lVar.f401221c, mVar.f401229b, mVar.f401231d);
            }
        } else {
            rx4.k0.T6(k0Var, vu4.a.f440244n, mVar, i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHotspotBoxUIC$renderHotspotContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
