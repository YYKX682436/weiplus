package iu1;

/* loaded from: classes9.dex */
public final class q extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f294936d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f294937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294938f;

    public q(com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI) {
        this.f294938f = cardHomePageNewUI;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f294936d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f294937e = paint2;
        paint.setColor(cardHomePageNewUI.getResources().getColor(com.tencent.mm.R.color.a4m));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setFlags(1);
        paint2.setColor(cardHomePageNewUI.getResources().getColor(com.tencent.mm.R.color.aaw));
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setFlags(1);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int u07 = parent.u0(view);
        iu1.c cVar = this.f294938f.f95184m;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mHomePageAdapter");
            throw null;
        }
        if (u07 != cVar.getItemCount() - 1) {
            outRect.bottom = 1;
        } else {
            int i17 = com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.N;
            outRect.bottom = com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.N;
        }
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDraw(c17, parent, state);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = this.f294938f.f95183i;
        if (loadMoreRecyclerView == null) {
            kotlin.jvm.internal.o.o("mRecyclerView");
            throw null;
        }
        int paddingLeft = loadMoreRecyclerView.getPaddingLeft();
        int i17 = com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.N;
        int i18 = paddingLeft + com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.P;
        int width = loadMoreRecyclerView.getWidth() - loadMoreRecyclerView.getPaddingRight();
        int childCount = loadMoreRecyclerView.getChildCount();
        int i19 = 0;
        while (true) {
            int i27 = 1;
            int i28 = childCount - 1;
            if (i19 >= i28) {
                return;
            }
            android.view.View childAt = loadMoreRecyclerView.getChildAt(i19);
            android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams)).bottomMargin;
            if (i19 == i28) {
                int i29 = com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.N;
                i27 = com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI.N;
            }
            int i37 = bottom + i27;
            c17.drawRect(i18, bottom, width, i37, this.f294936d);
            c17.drawRect(0, bottom, i18, i37, this.f294937e);
            i19++;
        }
    }
}
