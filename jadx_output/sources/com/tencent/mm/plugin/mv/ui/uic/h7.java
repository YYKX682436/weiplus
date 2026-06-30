package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class h7 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q7 f151189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.hf2 f151190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fm3.u f151191c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f151192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.n0 f151193e;

    public h7(com.tencent.mm.plugin.mv.ui.uic.q7 q7Var, r45.hf2 hf2Var, fm3.u uVar, int i17, com.tencent.mm.plugin.mv.ui.uic.n0 n0Var) {
        this.f151189a = q7Var;
        this.f151190b = hf2Var;
        this.f151191c = uVar;
        this.f151192d = i17;
        this.f151193e = n0Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public final void a(boolean z17, boolean z18) {
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var;
        int i17;
        int i18 = this.f151192d;
        com.tencent.mm.plugin.mv.ui.uic.q7 q7Var = this.f151189a;
        fm3.j0 j0Var = fm3.j0.f264078a;
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var2 = this.f151193e;
        if (z17) {
            n0Var = n0Var2;
            i17 = 3;
            j0Var.f(q7Var.getActivity(), this.f151190b, this.f151191c, 2, 1, i18 == 3 ? 5 : 3, (r27 & 64) != 0 ? 2 : 0, (r27 & 128) != 0 ? 1 : n0Var2.Q6(), (r27 & 256) != 0 ? 1 : n0Var2.O6(), (r27 & 512) != 0 ? "" : n0Var2.P6(), (r27 & 1024) != 0 ? 2 : n0Var2.E);
        } else {
            n0Var = n0Var2;
            i17 = 3;
        }
        if (z18) {
            j0Var.f(q7Var.getActivity(), this.f151190b, this.f151191c, 2, 3, i18 == i17 ? 5 : i17, (r27 & 64) != 0 ? 2 : 0, (r27 & 128) != 0 ? 1 : n0Var.Q6(), (r27 & 256) != 0 ? 1 : n0Var.O6(), (r27 & 512) != 0 ? "" : n0Var.P6(), (r27 & 1024) != 0 ? 2 : n0Var.E);
        }
    }
}
