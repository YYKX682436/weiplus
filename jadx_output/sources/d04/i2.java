package d04;

/* loaded from: classes8.dex */
public final class i2 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f225442e = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);

    @Override // in5.r
    public in5.s0 d(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View convertView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(convertView, "convertView");
        return new d04.c2(convertView);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489425en0;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        d04.j2 item = (d04.j2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        if (holder instanceof d04.c2) {
            d04.c2 c2Var = (d04.c2) holder;
            android.view.ViewGroup viewGroup = c2Var.f225393n;
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                int i19 = item.f225449g;
                layoutParams.width = i19;
                layoutParams.height = i19;
            } else {
                layoutParams = null;
            }
            viewGroup.setLayoutParams(layoutParams);
            android.view.View view = c2Var.f225396q;
            android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                int i27 = com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.E;
                layoutParams2.width = i27;
                layoutParams2.height = i27;
                if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
                    int i28 = com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.F;
                    marginLayoutParams.rightMargin = i28;
                    marginLayoutParams.bottomMargin = i28;
                }
            } else {
                layoutParams2 = null;
            }
            view.setLayoutParams(layoutParams2);
            android.widget.ProgressBar progressBar = c2Var.f225395p;
            android.view.ViewGroup.LayoutParams layoutParams3 = progressBar.getLayoutParams();
            if (layoutParams3 != null) {
                int i29 = com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.E;
                layoutParams3.width = i29;
                layoutParams3.height = i29;
                if (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
                    int i37 = com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.F;
                    marginLayoutParams2.rightMargin = i37;
                    marginLayoutParams2.bottomMargin = i37;
                }
            } else {
                layoutParams3 = null;
            }
            progressBar.setLayoutParams(layoutParams3);
            sz3.w0 w0Var = item.f225446d;
            if (w0Var.f414137h == 1) {
                c2Var.f225395p.setVisibility(0);
                android.view.View view2 = c2Var.f225396q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductNewMaskDecorView$ScanProductListNormalItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductNewMaskDecorView$ScanProductLiveListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductNewMaskDecorView$ScanProductListNormalItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductNewMaskDecorView$ScanProductLiveListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                c2Var.f225395p.setVisibility(8);
                android.view.View view3 = c2Var.f225396q;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductNewMaskDecorView$ScanProductListNormalItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductNewMaskDecorView$ScanProductLiveListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductNewMaskDecorView$ScanProductListNormalItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductNewMaskDecorView$ScanProductLiveListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            c2Var.f225394o.setRadius(com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.D);
            c2Var.f225394o.setImageBitmap(null);
            c2Var.f225394o.setTag(java.lang.Integer.valueOf(w0Var.f414138i));
            int i38 = w0Var.f414138i;
            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = c2Var.f225394o;
            byte[] bArr = w0Var.f414135f;
            int i39 = w0Var.f414136g;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.H.get(java.lang.String.valueOf(i38));
            if (bitmap == null || bitmap.isRecycled()) {
                ((ku5.t0) ku5.t0.f312615d).g(new d04.h2(i39, bArr, this, i38, mMRoundCornerImageView));
            } else {
                mMRoundCornerImageView.setImageBitmap(bitmap);
            }
            w0Var.toString();
        }
    }
}
