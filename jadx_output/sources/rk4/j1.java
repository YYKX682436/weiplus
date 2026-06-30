package rk4;

/* loaded from: classes8.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f396739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f396740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(java.lang.Boolean bool, long j17) {
        super(0);
        this.f396739d = bool;
        this.f396740e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((ku5.t0) ku5.t0.f312615d).g(new rk4.i1(this.f396739d, this.f396740e));
        return jz5.f0.f302826a;
    }
}
