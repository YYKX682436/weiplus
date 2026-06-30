package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class o0 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p0 f121842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f121843e;

    public o0(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p0 p0Var, java.util.ArrayList arrayList) {
        this.f121842d = p0Var;
        this.f121843e = arrayList;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p0 p0Var = this.f121842d;
        if (u07 == 0) {
            outRect.left = i65.a.b(p0Var.f121869e, 12);
        } else {
            outRect.left = i65.a.b(p0Var.f121869e, 10);
        }
        if (u07 == this.f121843e.size() - 1) {
            outRect.right = i65.a.b(p0Var.f121869e, 12);
        }
    }
}
