package com.tencent.mm.plugin.finder.live.wish.view;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.view.x f120621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.RoundedCornerFrameLayout f120622e;

    public b(com.tencent.mm.plugin.finder.live.wish.view.x xVar, com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout) {
        this.f120621d = xVar;
        this.f120622e = roundedCornerFrameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.LinearLayout.LayoutParams layoutParams;
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout avatarViewBg = this.f120622e;
        kotlin.jvm.internal.o.f(avatarViewBg, "$avatarViewBg");
        com.tencent.mm.plugin.finder.live.wish.view.x xVar = this.f120621d;
        android.view.View view = xVar.f120675l;
        kotlin.jvm.internal.o.d(view);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = b17.y;
        int i18 = b17.x;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f3u);
        int[] t17 = pm0.v.t(avatarViewBg);
        int i19 = t17[0];
        int width = avatarViewBg.getWidth() + i19;
        int i27 = t17[1];
        float dimension = avatarViewBg.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479644bj);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null ? k0Var.isLandscape() : false) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (int) ((i17 - i27) - dimension));
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f3w);
            float width2 = (i18 - width) + ((avatarViewBg.getWidth() / 2) - (view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn) / 2));
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams3 != null) {
                layoutParams3.rightMargin = (int) width2;
                findViewById.setLayoutParams(layoutParams3);
            }
            int measureText = ((int) textView.getPaint().measureText(textView.getText().toString())) + textView.getPaddingLeft() + textView.getPaddingRight();
            com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView = xVar.f120664a;
            int width3 = ((maxHeightWxRecyclerView != null ? maxHeightWxRecyclerView.getWidth() : 0) / 2) - (measureText / 2);
            if (width3 < 0) {
                width3 = 0;
            }
            android.view.ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
            layoutParams = layoutParams4 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams4 : null;
            if (layoutParams != null) {
                layoutParams.rightMargin = width3;
                textView.setLayoutParams(layoutParams);
            }
        } else {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (int) ((i17 - i27) - dimension));
            float width4 = i19 + ((avatarViewBg.getWidth() / 2) - (view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn) / 2));
            android.view.ViewGroup.LayoutParams layoutParams5 = findViewById.getLayoutParams();
            layoutParams = layoutParams5 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams != null) {
                layoutParams.leftMargin = (int) width4;
                findViewById.setLayoutParams(layoutParams);
            }
        }
        android.view.View view2 = xVar.f120675l;
        kotlin.jvm.internal.o.d(view2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$GiftWallItemConvert$onBindViewHolder$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/wish/view/GiftWallViewHelper$GiftWallItemConvert$onBindViewHolder$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
