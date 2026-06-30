package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class a extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f121165d;

    /* renamed from: e, reason: collision with root package name */
    public final int f121166e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f121167f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f121168g;

    /* renamed from: h, reason: collision with root package name */
    public final int f121169h;

    /* renamed from: i, reason: collision with root package name */
    public final int f121170i;

    public a(android.content.Context context, int i17, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f121165d = i17;
        this.f121166e = i18;
        this.f121167f = z17;
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.FG_3));
        this.f121168g = colorDrawable;
        this.f121169h = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479642bh);
        this.f121170i = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479658bv);
        colorDrawable.setBounds(0, 0, 0, ym5.x.a(context, 1.0f));
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        androidx.recyclerview.widget.k3 w07 = parent.w0(view);
        java.lang.Integer valueOf = w07 != null ? java.lang.Integer.valueOf(w07.getItemViewType()) : null;
        if (valueOf != null && valueOf.intValue() == this.f121165d && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.width = -1;
        }
        int i17 = this.f121166e;
        outRect.left = i17;
        outRect.right = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDraw(c17, parent, state);
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = parent.getChildAt(i17);
            androidx.recyclerview.widget.k3 w07 = parent.w0(childAt);
            java.lang.Integer valueOf = w07 != null ? java.lang.Integer.valueOf(w07.getItemViewType()) : null;
            android.graphics.drawable.Drawable drawable = this.f121168g;
            int i18 = this.f121169h;
            if (i17 != 0 && (valueOf == null || valueOf.intValue() != this.f121165d)) {
                drawable.setBounds(childAt.getLeft() + this.f121170i, childAt.getTop(), childAt.getRight(), childAt.getTop() + i18);
                drawable.draw(c17);
            } else if (i17 != 0 || this.f121167f) {
                drawable.setBounds(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getTop() + i18);
                drawable.draw(c17);
            }
        }
    }

    public /* synthetic */ a(android.content.Context context, int i17, int i18, boolean z17, int i19, kotlin.jvm.internal.i iVar) {
        this(context, i17, i18, (i19 & 8) != 0 ? true : z17);
    }
}
