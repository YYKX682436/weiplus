package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tb0 implements ff0.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dc0 f114380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cm2.g0 f114381c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f114382d;

    public tb0(android.view.View view, com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var, cm2.g0 g0Var, boolean z17) {
        this.f114379a = view;
        this.f114380b = dc0Var;
        this.f114381c = g0Var;
        this.f114382d = z17;
    }

    @Override // ff0.x
    public void a(ff0.z zVar) {
        jz5.f0 f0Var;
        boolean z17 = this.f114382d;
        cm2.g0 g0Var = this.f114381c;
        com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var = this.f114380b;
        android.view.View view = this.f114379a;
        if (zVar != null) {
            view.setBackgroundColor(e3.b.g(zVar.f261596b, -1));
            dc0Var.c(g0Var, false, z17);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            view.setBackgroundResource(com.tencent.mm.R.drawable.a8s);
            dc0Var.c(g0Var, true, z17);
        }
    }
}
