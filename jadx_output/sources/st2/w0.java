package st2;

/* loaded from: classes3.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412491d;

    public w0(st2.h1 h1Var) {
        this.f412491d = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        st2.h1 h1Var = this.f412491d;
        if (!h1Var.h().isShowing) {
            h1Var.W = new st2.i1();
            ut2.u3 n17 = h1Var.n();
            n17.f431118h = c01.id.c();
            n17.f431119i = c01.id.c();
        }
        h1Var.h().f();
    }
}
