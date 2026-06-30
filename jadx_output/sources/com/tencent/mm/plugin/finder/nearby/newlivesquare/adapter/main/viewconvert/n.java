package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class n extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t f121817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f121818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vp2.c f121819c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f121820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f121821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121822f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f121823g;

    public n(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t tVar, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView, vp2.c cVar, boolean z17, kotlin.jvm.internal.h0 h0Var, in5.s0 s0Var, yz5.p pVar) {
        this.f121817a = tVar;
        this.f121818b = wxRecyclerView;
        this.f121819c = cVar;
        this.f121820d = z17;
        this.f121821e = h0Var;
        this.f121822f = s0Var;
        this.f121823g = pVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.String str = this.f121817a.f121942h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindAggregationCardRecyclerView isExposed: ");
        sb6.append(z17);
        sb6.append(", curCardId: ");
        sb6.append(this.f121818b.getTag());
        sb6.append(" cardId: ");
        vp2.c cVar = this.f121819c;
        sb6.append(cVar.f438910d.f379347d);
        sb6.append(" loopIndex: ");
        sb6.append(cVar.f438912f);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        kotlin.jvm.internal.h0 h0Var = this.f121821e;
        if (!z17 || !this.f121820d) {
            kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) h0Var.f310123d;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                return;
            }
            return;
        }
        kotlinx.coroutines.r2 r2Var2 = (kotlinx.coroutines.r2) h0Var.f310123d;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        kotlinx.coroutines.y0 y0Var = this.f121822f.f293120d;
        h0Var.f310123d = y0Var != null ? kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m(this.f121823g, null), 3, null) : null;
    }
}
