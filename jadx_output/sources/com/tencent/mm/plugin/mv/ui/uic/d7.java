package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class d7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f151099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q7 f151100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fm3.u f151101f;

    public d7(o25.y1 y1Var, com.tencent.mm.plugin.mv.ui.uic.q7 q7Var, fm3.u uVar) {
        this.f151099d = y1Var;
        this.f151100e = q7Var;
        this.f151101f = uVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        com.tencent.mm.plugin.mv.ui.uic.c7 c7Var = new com.tencent.mm.plugin.mv.ui.uic.c7(this.f151100e, this.f151101f);
        ((com.tencent.mm.pluginsdk.forward.m) this.f151099d).aj((db5.h4) menuItem, c7Var);
    }
}
