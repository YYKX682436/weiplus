package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h4 f151081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fm3.q f151083f;

    public c4(com.tencent.mm.plugin.mv.ui.uic.h4 h4Var, int i17, fm3.q qVar) {
        this.f151081d = h4Var;
        this.f151082e = i17;
        this.f151083f = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = this.f151081d;
        com.tencent.mm.plugin.mv.ui.uic.g3 g3Var = h4Var.f151171r;
        if (g3Var != null) {
            int i17 = com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.f150868u;
            com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView Z6 = ((jm3.c0) g3Var).f300300a.Z6();
            if (Z6 != null) {
                Z6.k();
            }
        }
        com.tencent.mm.plugin.mv.ui.uic.g3 g3Var2 = h4Var.f151171r;
        if (g3Var2 != null) {
            ((jm3.c0) g3Var2).a(this.f151082e, this.f151083f, true, null);
        }
    }
}
