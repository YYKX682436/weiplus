package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class s3 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f141754d;

    /* renamed from: e, reason: collision with root package name */
    public final int f141755e;

    public s3(com.tencent.mm.plugin.game.ui.GameIndexListView gameIndexListView, android.content.res.Resources resources, int i17) {
        this.f141754d = new android.graphics.drawable.ColorDrawable(resources.getColor(i17));
        this.f141755e = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479812fx);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        rect.set(0, 0, 0, this.f141755e);
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i17 = 0; i17 < childCount - 1; i17++) {
            android.view.View childAt = recyclerView.getChildAt(i17);
            android.view.View childAt2 = ((android.view.ViewGroup) childAt).getChildAt(0);
            if ((childAt2 instanceof com.tencent.mm.plugin.game.ui.GameBestSellingItemView) || (childAt2 instanceof com.tencent.mm.plugin.game.ui.GameBestSellingTitle) || (childAt2 instanceof com.tencent.mm.plugin.game.ui.GameFeedModuleTitle)) {
                super.onDraw(canvas, recyclerView, h3Var);
            } else {
                int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                int i18 = this.f141755e + bottom;
                android.graphics.drawable.Drawable drawable = this.f141754d;
                drawable.setBounds(paddingLeft, bottom, width, i18);
                drawable.draw(canvas);
            }
        }
    }
}
