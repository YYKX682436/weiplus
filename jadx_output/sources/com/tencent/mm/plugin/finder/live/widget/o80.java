package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes16.dex */
public final class o80 extends androidx.recyclerview.widget.p2 {
    public final int T;
    public final int U;

    public o80(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.T = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        this.U = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        int i17 = u07 % 5;
        if (u07 / 5 < ((((parent.getAdapter() != null ? r4.getItemCount() : 0) + 5) - 1) / 5) - 1) {
            outRect.bottom = this.T;
        }
        int i18 = this.U;
        if (i17 == 0) {
            outRect.left = 0;
            outRect.right = i18 / 2;
        } else if (i17 != 4) {
            outRect.left = i18 / 2;
            outRect.right = i18 / 2;
        } else {
            outRect.left = i18 / 2;
            outRect.right = 0;
        }
    }
}
