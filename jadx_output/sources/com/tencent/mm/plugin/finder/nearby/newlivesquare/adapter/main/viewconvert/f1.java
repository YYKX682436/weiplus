package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class f1 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1 f121663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f121664e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp2.o f121665f;

    public f1(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1 p1Var, boolean z17, vp2.o oVar) {
        this.f121663d = p1Var;
        this.f121664e = z17;
        this.f121665f = oVar;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1 p1Var = this.f121663d;
        if (u07 == 0) {
            outRect.left = i65.a.b(p1Var.f121870e, 12);
        } else {
            outRect.left = i65.a.b(p1Var.f121870e, this.f121664e ? 9 : 10);
        }
        if (u07 == this.f121665f.f438948e.size() - 1) {
            outRect.right = i65.a.b(p1Var.f121870e, 12);
        }
    }
}
