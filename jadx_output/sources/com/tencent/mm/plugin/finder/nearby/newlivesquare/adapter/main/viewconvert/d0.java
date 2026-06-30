package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class d0 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.e f121623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 f121624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f121625f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x f121626g;

    public d0(vp2.e eVar, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 m0Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x xVar) {
        this.f121623d = eVar;
        this.f121624e = m0Var;
        this.f121625f = h0Var;
        this.f121626g = xVar;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).a0();
        if (i17 < a07) {
            return true;
        }
        int i18 = i17 - a07;
        so2.j5 j5Var = (so2.j5) kz5.n0.a0(this.f121623d.f438915e, i18);
        if (!(j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
            return true;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
        if (!zl2.q4.f473933a.C(baseFinderFeed)) {
            return true;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 m0Var = this.f121624e;
        com.tencent.mm.ui.widget.dialog.k0 a17 = r4Var.a1(context, baseFinderFeed, 1005, m0Var.f121799i, new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.c0(this.f121623d, i18, j5Var, m0Var, adapter, i17, this.f121625f, this.f121626g));
        if (a17 == null) {
            return true;
        }
        a17.v();
        return true;
    }
}
