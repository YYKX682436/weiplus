package kc2;

/* loaded from: classes15.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.c0 f306493d;

    public u(kc2.c0 c0Var) {
        this.f306493d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kc2.c0 c0Var = this.f306493d;
        c0Var.c().f();
        c0Var.e().f();
        c0Var.j().f();
        r45.us2 a17 = kc2.h1.f306405a.a(c0Var.g());
        c0Var.f306346p = a17.getInteger(2);
        c0Var.f306347q = a17.getInteger(1);
        c0Var.f306348r = a17.getInteger(0);
        com.tencent.mars.xlog.Log.i(c0Var.m(), "init leftEntrancePath=" + c0Var.f306334d + " rightEntrancePath=" + c0Var.f306335e + " tabKey=" + c0Var.f306336f + " lastExistTime=" + c0Var.f306346p + '(' + c0Var.g() + "),lastClickWithRedDotTime=" + c0Var.f306347q + ",lastRedDotExposeTime=" + c0Var.f306348r + ",clickWithRedDot=" + c0Var.c().d() + ",clickWithoutRedDot=" + c0Var.e().d() + ",redDotExposeSeq=" + c0Var.j().d());
    }
}
