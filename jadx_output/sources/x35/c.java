package x35;

/* loaded from: classes10.dex */
public final class c extends androidx.recyclerview.widget.p2 implements x35.a {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Rect f451650d;

    /* renamed from: e, reason: collision with root package name */
    public final int f451651e = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 1.0f);

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int i17 = ((androidx.recyclerview.widget.GridLayoutManager) layoutManager).f11861w;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        androidx.recyclerview.widget.GridLayoutManager.LayoutParams layoutParams2 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) layoutParams;
        if (layoutParams2.f11866i != i17) {
            int i18 = this.f451651e;
            outRect.top = i18;
            outRect.bottom = i18;
            int i19 = layoutParams2.f11865h;
            if (i19 == 0) {
                outRect.left = 0;
                outRect.right = i18;
            } else if (i19 == i17 - 1) {
                outRect.left = i18;
                outRect.right = 0;
            } else {
                outRect.left = i18;
                outRect.right = i18;
            }
        }
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDrawOver(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDrawOver(c17, parent, state);
        if (parent.getAdapter() != null && (parent.getAdapter() instanceof x35.b) && parent.getChildCount() > 0) {
            androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
            kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.pin.PinnedHeaderAdapter<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
            x35.b bVar = (x35.b) adapter;
            int u07 = parent.u0(parent.getChildAt(0));
            while (true) {
                if (-1 >= u07) {
                    u07 = -1;
                    break;
                } else if (((d45.q) bVar).getItemViewType(u07) == 2) {
                    break;
                } else {
                    u07--;
                }
            }
            if (u07 == -1) {
                this.f451650d = null;
                return;
            }
            androidx.recyclerview.widget.k3 onCreateViewHolder = bVar.onCreateViewHolder(parent, bVar.getItemViewType(u07));
            bVar.onBindViewHolder(onCreateViewHolder, u07);
            android.view.View itemView = onCreateViewHolder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            if (itemView.isLayoutRequested()) {
                androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) itemView.getLayoutParams();
                if (layoutParams == null) {
                    throw new java.lang.NullPointerException("PinnedHeaderItemDecoration");
                }
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec((parent.getMeasuredWidth() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824);
                int i17 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height;
                itemView.measure(makeMeasureSpec, i17 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i17, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                itemView.layout(0, 0, itemView.getMeasuredWidth(), itemView.getMeasuredHeight());
            }
            int childCount = parent.getChildCount();
            int i18 = 0;
            for (int i19 = 0; i19 < childCount; i19++) {
                if (((d45.q) bVar).getItemViewType(parent.u0(parent.getChildAt(i19))) == 2) {
                    int top = parent.getChildAt(i19).getTop();
                    int height = itemView.getHeight();
                    if (1 <= top && top < height) {
                        i18 = top - height;
                    }
                }
            }
            int save = c17.save();
            kotlin.jvm.internal.o.e(itemView.getLayoutParams(), "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            c17.translate(((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) r2)).leftMargin, i18);
            c17.clipRect(0, 0, parent.getWidth(), itemView.getMeasuredHeight());
            itemView.draw(c17);
            c17.restoreToCount(save);
            if (this.f451650d == null) {
                this.f451650d = new android.graphics.Rect();
            }
            android.graphics.Rect rect = this.f451650d;
            kotlin.jvm.internal.o.d(rect);
            rect.set(0, 0, parent.getWidth(), itemView.getMeasuredHeight() + i18);
        }
    }
}
