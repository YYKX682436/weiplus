package gt4;

/* loaded from: classes14.dex */
public final class l0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f275466d;

    public l0(gt4.s0 s0Var) {
        this.f275466d = s0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        gt4.s0 s0Var = this.f275466d;
        android.widget.LinearLayout linearLayout = s0Var.f275542o;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("headerView");
            throw null;
        }
        int height = linearLayout.getHeight();
        android.widget.LinearLayout linearLayout2 = s0Var.f275547t;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("buttonLayout");
            throw null;
        }
        int height2 = linearLayout2.getHeight();
        int k17 = i65.a.k(s0Var.f275534d);
        int p17 = com.tencent.mm.ui.bk.p(s0Var.f275534d);
        int b17 = i65.a.b(s0Var.f275534d, 56);
        int b18 = ((((k17 + p17) - b17) - height) - height2) - i65.a.b(s0Var.f275534d, 64);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGlobalLayout: ");
        sb6.append(k17);
        sb6.append('+');
        sb6.append(p17);
        sb6.append('-');
        sb6.append(b17);
        sb6.append('-');
        sb6.append(height);
        sb6.append('-');
        sb6.append(height2);
        sb6.append(" max:");
        sb6.append(b18);
        sb6.append(" now:");
        androidx.recyclerview.widget.RecyclerView recyclerView = s0Var.B;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("dayListView");
            throw null;
        }
        sb6.append(recyclerView.getHeight());
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletComplexDatePicker", sb6.toString());
        com.tencent.mm.plugin.wallet_core.ui.view.WalletMaxHeightLinearLayout walletMaxHeightLinearLayout = s0Var.f275544q;
        if (walletMaxHeightLinearLayout == null) {
            kotlin.jvm.internal.o.o("sectionLayout");
            throw null;
        }
        walletMaxHeightLinearLayout.setMaxHeightPx(b18);
        gt4.a1 a1Var = s0Var.f275533J;
        if (a1Var != null) {
            float c17 = (((i65.a.c(s0Var.f275534d, b18) - 56) - 54) - 52) - ((a1Var.f275393n + 17) * ((((java.util.ArrayList) s0Var.E).size() - 2) - ((gt4.j1) kz5.n0.i0(s0Var.E)).f275457b));
            if (c17 > 0.0f) {
                a1Var.f275392m = (int) c17;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletComplexDatePicker", "onGlobalLayout last is " + c17);
        }
        android.view.View view = s0Var.f275535e;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
    }
}
