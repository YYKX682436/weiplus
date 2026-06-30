package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class b8 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.hf2 f151061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fm3.u f151062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f151063c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.n0 f151064d;

    public b8(r45.hf2 hf2Var, fm3.u uVar, android.view.ViewGroup viewGroup, com.tencent.mm.plugin.mv.ui.uic.n0 n0Var) {
        this.f151061a = hf2Var;
        this.f151062b = uVar;
        this.f151063c = viewGroup;
        this.f151064d = n0Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public final void a(boolean z17, boolean z18) {
        fm3.u uVar;
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var;
        android.view.ViewGroup viewGroup;
        java.lang.String str;
        fm3.u uVar2;
        r45.hf2 hf2Var = this.f151061a;
        if (hf2Var == null || (uVar = this.f151062b) == null) {
            return;
        }
        fm3.j0 j0Var = fm3.j0.f264078a;
        android.view.ViewGroup viewGroup2 = this.f151063c;
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var2 = this.f151064d;
        if (z17) {
            android.content.Context context = viewGroup2.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            n0Var = n0Var2;
            viewGroup = viewGroup2;
            str = "getContext(...)";
            uVar2 = uVar;
            j0Var.f(context, hf2Var, uVar, 2, 1, 2, (r27 & 64) != 0 ? 2 : 0, (r27 & 128) != 0 ? 1 : n0Var2.Q6(), (r27 & 256) != 0 ? 1 : n0Var2.O6(), (r27 & 512) != 0 ? "" : n0Var2.P6(), (r27 & 1024) != 0 ? 2 : n0Var2.E);
        } else {
            n0Var = n0Var2;
            viewGroup = viewGroup2;
            str = "getContext(...)";
            uVar2 = uVar;
        }
        if (z18) {
            android.content.Context context2 = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context2, str);
            j0Var.f(context2, hf2Var, uVar2, 2, 3, 2, (r27 & 64) != 0 ? 2 : 0, (r27 & 128) != 0 ? 1 : n0Var.Q6(), (r27 & 256) != 0 ? 1 : n0Var.O6(), (r27 & 512) != 0 ? "" : n0Var.P6(), (r27 & 1024) != 0 ? 2 : n0Var.E);
        }
    }
}
