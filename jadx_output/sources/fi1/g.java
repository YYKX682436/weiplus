package fi1;

/* loaded from: classes8.dex */
public final class g extends androidx.appcompat.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView f262783f;

    /* renamed from: g, reason: collision with root package name */
    public ei1.a f262784g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f493921n);
        kotlin.jvm.internal.o.g(context, "context");
        this.f262783f = new com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView(context, null);
        C(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f262783f.hide();
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        android.view.ViewGroup.LayoutParams layoutParams;
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
        }
        com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView hybridOpenMaterialView = this.f262783f;
        if (hybridOpenMaterialView.f86278i) {
            android.graphics.Rect rect = new android.graphics.Rect();
            hybridOpenMaterialView.getWindowVisibleDisplayFrame(rect);
            rect.toString();
            layoutParams = new android.view.ViewGroup.LayoutParams((int) ((rect.right * 1.0f) / 2.0f), -1);
        } else {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(layoutParams.width, layoutParams.height);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setWindowAnimations(com.tencent.mm.R.style.f493922o);
        }
        hybridOpenMaterialView.setListener(new fi1.e(this));
        setContentView(hybridOpenMaterialView, new android.view.ViewGroup.LayoutParams(-1, -1));
        setOnShowListener(new fi1.f(this));
        setCancelable(true);
    }
}
