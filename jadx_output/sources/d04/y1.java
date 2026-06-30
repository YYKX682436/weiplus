package d04;

/* loaded from: classes8.dex */
public final class y1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d04.g f225558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView f225559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.ScanProductDetectRectView f225560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sz3.a1 f225561g;

    public y1(d04.g gVar, com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView scanProductMaskDecorView, com.tencent.mm.plugin.scanner.view.ScanProductDetectRectView scanProductDetectRectView, sz3.a1 a1Var) {
        this.f225558d = gVar;
        this.f225559e = scanProductMaskDecorView;
        this.f225560f = scanProductDetectRectView;
        this.f225561g = a1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f225559e.removeView(this.f225560f);
        d04.w1 w1Var = this.f225559e.f159762f;
        if (w1Var != null) {
            sz3.a1 requestInfo = this.f225561g;
            kotlin.jvm.internal.o.g(requestInfo, "requestInfo");
            com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo = requestInfo.f413959a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductMaskDecorView", "addNewProduct trackId: " + scanProductInfo.getId());
            synchronized (w1Var.f225540m) {
                if (w1Var.f225540m.containsKey(java.lang.Integer.valueOf(scanProductInfo.getId()))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductMaskDecorView", "addNewProduct trackId: " + scanProductInfo.getId() + " insert");
                    w1Var.f225539i.add(0, java.lang.Integer.valueOf(scanProductInfo.getId()));
                    w1Var.notifyItemInserted(1);
                } else {
                    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = w1Var.f225535e.getLayoutManager();
                    if (layoutManager != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "addProductInfo", "(Lcom/tencent/mm/plugin/scanner/scan_goods_new/ScanProductRequestInfo;)V", "Undefined", "scrollToPosition", "(I)V");
                        layoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(layoutManager, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "addProductInfo", "(Lcom/tencent/mm/plugin/scanner/scan_goods_new/ScanProductRequestInfo;)V", "Undefined", "scrollToPosition", "(I)V");
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductMaskDecorView", "addNewProduct trackId: " + scanProductInfo.getId() + " pending insert");
                    w1Var.f225542o.add(java.lang.Integer.valueOf(scanProductInfo.getId()));
                }
            }
        }
        this.f225558d.a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f225558d.b();
    }
}
