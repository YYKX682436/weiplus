package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class qj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.uj f132899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(com.tencent.mm.plugin.finder.view.uj ujVar) {
        super(0);
        this.f132899d = ujVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.uj ujVar = this.f132899d;
        int i17 = ujVar.f133182a.getResources().getDisplayMetrics().heightPixels;
        android.content.Context context = ujVar.f133182a;
        int i18 = context.getResources().getDisplayMetrics().widthPixels;
        int i19 = (int) (i17 * 0.8d);
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(context);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorMoreActionBottomSheet", "peekHeight:" + i19);
        if (i19 <= 0) {
            i19 = -2;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i18, -2);
        android.view.View view = ujVar.f133188g;
        e3Var.g(view, layoutParams);
        if (i19 > 0) {
            com.tencent.mm.plugin.finder.view.FinderMaxSizeLinearLayout finderMaxSizeLinearLayout = view instanceof com.tencent.mm.plugin.finder.view.FinderMaxSizeLinearLayout ? (com.tencent.mm.plugin.finder.view.FinderMaxSizeLinearLayout) view : null;
            if (finderMaxSizeLinearLayout != null) {
                finderMaxSizeLinearLayout.setMaxHeight(i19);
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorMoreActionBottomSheet", "setMaxHeight");
        }
        e3Var.f131965o = true;
        e3Var.c(true);
        e3Var.a();
        return e3Var;
    }
}
