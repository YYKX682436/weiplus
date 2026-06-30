package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.a0 f153375d;

    public y(com.tencent.mm.plugin.product.ui.a0 a0Var, com.tencent.mm.plugin.product.ui.b0 b0Var) {
        this.f153375d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductImageAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.MallProductImageAdapter", "henryyr user: clicked the ImageView");
        com.tencent.mm.plugin.product.ui.a0 a0Var = this.f153375d;
        com.tencent.mm.plugin.product.ui.x xVar = a0Var.f153268f.f153273g;
        if (xVar != null) {
            java.lang.String str = a0Var.f153267e;
            com.tencent.mm.plugin.product.ui.MallGalleryUI mallGalleryUI = ((com.tencent.mm.plugin.product.ui.k) xVar).f153309a;
            boolean z17 = !mallGalleryUI.f153197i;
            mallGalleryUI.f153197i = z17;
            if (z17) {
                mallGalleryUI.showTitleView();
            } else {
                mallGalleryUI.hideTitleView();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductImageAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
