package com.tencent.mm.plugin.finder.nearby.video;

/* loaded from: classes2.dex */
public final class d0 implements com.tencent.mm.plugin.finder.nearby.video.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f122175d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment f122176e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.video.a f122177f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f122178g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.vj0 f122179h;

    /* renamed from: i, reason: collision with root package name */
    public int f122180i;

    /* renamed from: m, reason: collision with root package name */
    public final cp2.u1 f122181m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f122182n;

    /* renamed from: o, reason: collision with root package name */
    public final cs2.i f122183o;

    public d0(com.tencent.mm.ui.MMActivity baseContext, com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment fragment, com.tencent.mm.plugin.finder.nearby.video.a presenter, android.view.View parent) {
        kotlin.jvm.internal.o.g(baseContext, "baseContext");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f122175d = baseContext;
        this.f122176e = fragment;
        this.f122177f = presenter;
        this.f122178g = parent;
        this.f122179h = new com.tencent.mm.plugin.finder.nearby.video.r(baseContext);
        this.f122180i = -1;
        this.f122181m = new cp2.u1(baseContext, fragment, 15, null);
        this.f122182n = jz5.h.b(new com.tencent.mm.plugin.finder.nearby.video.c0(this));
        this.f122183o = new cs2.i(baseContext, a().getInteger(5));
    }

    public final r45.qt2 a() {
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment fragment = this.f122176e;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        return ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
    }

    public com.tencent.mm.view.RefreshLoadMoreLayout f() {
        com.tencent.mm.view.RefreshLoadMoreLayout g17 = g();
        kotlin.jvm.internal.o.f(g17, "<get-rlLayout>(...)");
        return g17;
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout g() {
        return (com.tencent.mm.view.RefreshLoadMoreLayout) ((jz5.n) this.f122182n).getValue();
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f122175d;
    }

    public androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return g().getRecyclerView();
    }
}
