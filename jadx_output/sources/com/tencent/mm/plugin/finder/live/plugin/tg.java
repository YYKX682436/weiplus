package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tg implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f114392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.r0 f114393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114394f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f114395g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114396h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f114397i;

    public tg(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, in5.r0 r0Var, android.view.View view, dk2.zf zfVar, android.view.View view2, kotlin.jvm.internal.h0 h0Var) {
        this.f114392d = mgVar;
        this.f114393e = r0Var;
        this.f114394f = view;
        this.f114395g = zfVar;
        this.f114396h = view2;
        this.f114397i = h0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.finder.view.zq zqVar = com.tencent.mm.plugin.finder.view.zq.f133490a;
        gk2.e S0 = this.f114392d.S0();
        kotlinx.coroutines.y0 y0Var = this.f114393e.f293120d;
        android.view.View view = this.f114394f;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f114392d;
        android.view.ViewGroup viewGroup = mgVar.f365323d;
        kotlin.jvm.internal.o.d(menuItem);
        zqVar.c(1, S0, y0Var, view, mgVar, viewGroup, menuItem, i17, this.f114395g);
        this.f114396h.setBackground((android.graphics.drawable.Drawable) this.f114397i.f310123d);
        com.tencent.mm.plugin.finder.view.oc.f132781a.a();
    }
}
