package x03;

/* loaded from: classes15.dex */
public final class k0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.u0 f451063d;

    public k0(x03.u0 u0Var) {
        this.f451063d = u0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        ((ku5.t0) ku5.t0.f312615d).B(new x03.j0(this.f451063d));
        x03.f b17 = x03.x0.f451161d.a().f451164b.b(this.f451063d.f451140h);
        return !kotlin.jvm.internal.o.b(java.lang.Long.valueOf(b17.f451012a), java.lang.Long.valueOf(b17.f451014c));
    }
}
