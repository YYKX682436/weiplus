package lx;

/* loaded from: classes8.dex */
public final class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321831d;

    public k1(lx.r1 r1Var, yz5.l lVar) {
        this.f321831d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        yz5.l lVar = this.f321831d;
        if (e17 != null) {
            e17.g(new lx.j1(e17, lVar));
        } else {
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
        }
    }
}
