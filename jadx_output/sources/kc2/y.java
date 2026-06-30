package kc2;

/* loaded from: classes15.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f306540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kc2.c0 f306541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f306542f;

    public y(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, kc2.c0 c0Var, int i17) {
        this.f306540d = jbVar;
        this.f306541e = c0Var;
        this.f306542f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f306540d;
        int i17 = this.f306542f;
        kc2.c0 c0Var = this.f306541e;
        if (jbVar == null) {
            kc2.a2.a(c0Var.e(), i17, false, 2, null);
            return;
        }
        kc2.a2.a(c0Var.c(), i17, false, 2, null);
        c0Var.f306347q = i17;
        kc2.h1.f306405a.b(c0Var.g(), c0Var.f306346p, c0Var.f306348r, c0Var.f306347q);
    }
}
