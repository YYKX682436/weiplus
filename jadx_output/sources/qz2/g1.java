package qz2;

/* loaded from: classes9.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qz2.j1 f367865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f367866e;

    public g1(qz2.j1 j1Var, com.tencent.mm.modelbase.m1 m1Var) {
        this.f367865d = j1Var;
        this.f367866e = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = ((oz2.a) ((d50.l) this.f367866e)).f350239f;
        kotlin.jvm.internal.o.f(str, "getChallenge(...)");
        this.f367865d.P6(new qz2.s0(str));
    }
}
