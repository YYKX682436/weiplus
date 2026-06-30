package sc3;

/* loaded from: classes7.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f406455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406457f;

    public i0(yz5.l lVar, sc3.k1 k1Var, java.lang.String str) {
        this.f406455d = lVar;
        this.f406456e = k1Var;
        this.f406457f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bf3.g0 g0Var = bf3.g0.f19627a;
        jc3.x xVar = this.f406456e.f406486r;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("pkgManagement");
            throw null;
        }
        this.f406455d.invoke(g0Var.c(xVar, this.f406457f));
    }
}
