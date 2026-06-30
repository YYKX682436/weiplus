package kh;

/* loaded from: classes12.dex */
public final class g2 extends rh.o2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kh.h2 f307813e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(kh.h2 h2Var, kh.h2 h2Var2) {
        super(h2Var, h2Var2);
        this.f307813e = h2Var;
    }

    @Override // rh.o2
    public rh.d3 a() {
        kh.h2 h2Var = new kh.h2();
        kh.h2 h2Var2 = (kh.h2) this.f395485b;
        h2Var.f307794d = h2Var2.f307794d;
        h2Var.f307795e = h2Var2.f307795e;
        long j17 = h2Var2.f307796f;
        kh.h2 h2Var3 = this.f307813e;
        h2Var.f307796f = j17 - h2Var3.f307796f;
        rh.x2 x2Var = h2Var3.f307797g;
        kotlin.jvm.internal.o.d(x2Var);
        rh.x2 x2Var2 = h2Var2.f307797g;
        kotlin.jvm.internal.o.d(x2Var2);
        h2Var.f307797g = rh.p2.a(x2Var, x2Var2);
        rh.x2 x2Var3 = h2Var3.f307798h;
        kotlin.jvm.internal.o.d(x2Var3);
        rh.x2 x2Var4 = h2Var2.f307798h;
        kotlin.jvm.internal.o.d(x2Var4);
        h2Var.f307798h = rh.p2.a(x2Var3, x2Var4);
        return h2Var;
    }
}
