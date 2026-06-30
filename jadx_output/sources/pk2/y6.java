package pk2;

/* loaded from: classes3.dex */
public final class y6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.c7 f356401d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(pk2.c7 c7Var) {
        super(0);
        this.f356401d = c7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pk2.c7 c7Var = this.f356401d;
        int i17 = c7Var.f355618a.getResources().getDisplayMetrics().heightPixels;
        android.content.Context context = c7Var.f355618a;
        int i18 = context.getResources().getDisplayMetrics().widthPixels;
        int i19 = (int) (i17 * 0.6d);
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(context);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isLandscape:");
        boolean z17 = c7Var.f355619b;
        sb6.append(z17);
        sb6.append(", peekHeight:");
        sb6.append(i19);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorMoreActionBottomSheet", sb6.toString());
        android.view.View view = c7Var.f355624g;
        if (z17) {
            e3Var.g(view, new android.widget.FrameLayout.LayoutParams(i17, -2));
        } else {
            if (i19 <= 0) {
                i19 = -2;
            }
            e3Var.g(view, new android.widget.FrameLayout.LayoutParams(i18, -2));
            if (i19 > 0) {
                com.tencent.mm.plugin.finder.view.FinderMaxSizeLinearLayout finderMaxSizeLinearLayout = view instanceof com.tencent.mm.plugin.finder.view.FinderMaxSizeLinearLayout ? (com.tencent.mm.plugin.finder.view.FinderMaxSizeLinearLayout) view : null;
                if (finderMaxSizeLinearLayout != null) {
                    finderMaxSizeLinearLayout.setMaxHeight(i19);
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorMoreActionBottomSheet", "setMaxHeight");
            }
        }
        e3Var.f131965o = true;
        e3Var.c(true);
        e3Var.a();
        return e3Var;
    }
}
