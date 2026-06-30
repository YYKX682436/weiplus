package ed5;

/* loaded from: classes10.dex */
public final class t extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f251384d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f251385e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f251386f = true;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f251387g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f251388h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.drawable.ColorDrawable f251389i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f251390m;

    public t() {
        this.f251387g = j62.e.g().c(new com.tencent.mm.repairer.config.msg_history_gallery.RepairerConfigMsgHistoryGalleryStickyAnchorDebug()) == 1;
        this.f251389i = new android.graphics.drawable.ColorDrawable(android.graphics.Color.argb(64, 255, 0, 0));
    }

    public final void d(android.view.ViewGroup viewGroup, android.view.View view) {
        int width = (viewGroup.getWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
        if (width < 0) {
            width = 0;
        }
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 0);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(makeMeasureSpec, 0, layoutParams != null ? layoutParams.width : -1);
        int paddingTop = viewGroup.getPaddingTop() + viewGroup.getPaddingBottom();
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        view.measure(childMeasureSpec, android.view.ViewGroup.getChildMeasureSpec(makeMeasureSpec2, paddingTop, layoutParams2 != null ? layoutParams2.height : -2));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    @Override // androidx.recyclerview.widget.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDrawOver(android.graphics.Canvas r24, androidx.recyclerview.widget.RecyclerView r25, androidx.recyclerview.widget.h3 r26) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ed5.t.onDrawOver(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.h3):void");
    }
}
