package f0;

/* loaded from: classes14.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f258230d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(f0.r1 r1Var) {
        super(0);
        this.f258230d = r1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int d17 = (this.f258230d.d() / 90) * 90;
        return e06.p.m(java.lang.Math.max(d17 + org.chromium.net.NetError.ERR_CERT_COMMON_NAME_INVALID, 0), d17 + 90 + 200);
    }
}
