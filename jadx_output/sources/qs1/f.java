package qs1;

/* loaded from: classes8.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs1.m f366221d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(qs1.m mVar) {
        super(0);
        this.f366221d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qs1.m mVar = this.f366221d;
        java.lang.Object systemService = mVar.f366228a.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((android.view.WindowManager) systemService).getDefaultDisplay().getRealMetrics(new android.util.DisplayMetrics());
        int i17 = (int) (r2.heightPixels * 0.75d);
        ss1.d dVar = new ss1.d(mVar.f366228a, 0, 2, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCustomBottomSheetHelper", "peekHeight:" + i17);
        if (i17 <= 0) {
            i17 = -2;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(mVar.a(), -1);
        android.view.ViewGroup viewGroup = dVar.f411897s;
        kotlin.jvm.internal.o.d(viewGroup);
        android.view.View view = mVar.f366237j;
        viewGroup.addView(view, 0, layoutParams);
        if (i17 > 0) {
            com.tencent.mm.plugin.brandservice.ui.widget.BizMaxSizeLinearLayout bizMaxSizeLinearLayout = view instanceof com.tencent.mm.plugin.brandservice.ui.widget.BizMaxSizeLinearLayout ? (com.tencent.mm.plugin.brandservice.ui.widget.BizMaxSizeLinearLayout) view : null;
            if (bizMaxSizeLinearLayout != null) {
                bizMaxSizeLinearLayout.setMaxHeight(i17);
            }
        }
        dVar.f411892n = true;
        android.view.ViewGroup viewGroup2 = dVar.f411898t;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        dVar.f411896r = true;
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = dVar.f411893o;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.f44453z = new ss1.a(dVar);
        }
        return dVar;
    }
}
