package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class p extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.ColorDrawable f202413d;

    /* renamed from: e, reason: collision with root package name */
    public final int f202414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.y f202415f;

    public p(com.tencent.mm.ui.chatting.presenter.y yVar) {
        this.f202415f = yVar;
        this.f202413d = new android.graphics.drawable.ColorDrawable(yVar.f202541d.getResources().getColor(com.tencent.mm.R.color.f478959lz));
        this.f202414e = (int) yVar.f202541d.getResources().getDimension(com.tencent.mm.R.dimen.f479563f);
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = recyclerView.getChildAt(i17);
            if (childAt.getTag() != null) {
                com.tencent.mm.ui.chatting.adapter.f0 h17 = this.f202415f.h(((java.lang.Integer) childAt.getTag()).intValue() + 1);
                if (h17 == null || h17.a() != Integer.MAX_VALUE) {
                    int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                    int i18 = this.f202414e + bottom;
                    android.graphics.drawable.ColorDrawable colorDrawable = this.f202413d;
                    colorDrawable.setBounds(paddingLeft, bottom, width, i18);
                    colorDrawable.draw(canvas);
                }
            }
        }
    }
}
