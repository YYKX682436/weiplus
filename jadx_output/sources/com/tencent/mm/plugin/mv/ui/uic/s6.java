package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class s6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.t6 f151442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f151443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f151444f;

    public s6(com.tencent.mm.plugin.mv.ui.uic.t6 t6Var, long j17, long j18) {
        this.f151442d = t6Var;
        this.f151443e = j17;
        this.f151444f = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mv.ui.uic.t6 t6Var = this.f151442d;
        com.tencent.mm.plugin.mv.ui.uic.l6 l6Var = (com.tencent.mm.plugin.mv.ui.uic.l6) kz5.n0.a0(t6Var.f151460e, t6Var.f151463h);
        if (l6Var != null) {
            if (l6Var.f151276e != null) {
                t6Var.O6().notifyItemChanged(t6Var.f151463h + t6Var.O6().a0(), 2);
            }
            l6Var.f151279h = ((float) this.f151443e) / ((float) this.f151444f);
            t6Var.O6().notifyItemChanged(t6Var.f151463h + t6Var.O6().a0(), 2);
        }
    }
}
