package qz2;

/* loaded from: classes9.dex */
public final class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qz2.i2 f367861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f367862e;

    public f2(qz2.i2 i2Var, com.tencent.mm.modelbase.m1 m1Var) {
        this.f367861d = i2Var;
        this.f367862e = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = ((oz2.a) ((d50.l) this.f367862e)).f350239f;
        kotlin.jvm.internal.o.f(str, "getChallenge(...)");
        this.f367861d.P6(new qz2.s1(str));
    }
}
