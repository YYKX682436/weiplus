package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class z4 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f133450d;

    public z4(int i17) {
        this.f133450d = i17;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        jz5.l lVar;
        jz5.l lVar2;
        java.lang.Integer valueOf;
        java.lang.Integer valueOf2;
        java.lang.Integer valueOf3;
        java.lang.Integer valueOf4;
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        androidx.recyclerview.widget.f2 adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        boolean z17 = view.getResources().getConfiguration().getLayoutDirection() == 1;
        int i17 = this.f133450d;
        int b17 = a06.d.b(i17 * 1.6f);
        int i18 = i17 / 2;
        if (itemCount == 1) {
            lVar = new jz5.l(java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(b17));
        } else {
            if (u07 == 0) {
                if (z17) {
                    valueOf3 = java.lang.Integer.valueOf(i18);
                    valueOf4 = java.lang.Integer.valueOf(b17);
                } else {
                    valueOf3 = java.lang.Integer.valueOf(b17);
                    valueOf4 = java.lang.Integer.valueOf(i18);
                }
                lVar2 = new jz5.l(valueOf3, valueOf4);
            } else if (u07 == itemCount - 1) {
                if (z17) {
                    valueOf = java.lang.Integer.valueOf(b17);
                    valueOf2 = java.lang.Integer.valueOf(i18);
                } else {
                    valueOf = java.lang.Integer.valueOf(i18);
                    valueOf2 = java.lang.Integer.valueOf(b17);
                }
                lVar2 = new jz5.l(valueOf, valueOf2);
            } else {
                lVar = new jz5.l(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i18));
            }
            lVar = lVar2;
        }
        outRect.set(((java.lang.Number) lVar.f302833d).intValue(), 0, ((java.lang.Number) lVar.f302834e).intValue(), 0);
    }
}
