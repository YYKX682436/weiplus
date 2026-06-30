package x03;

/* loaded from: classes15.dex */
public final class n implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f451076d;

    public n(x03.i0 i0Var) {
        this.f451076d = i0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        ((ku5.t0) ku5.t0.f312615d).B(new x03.m(this.f451076d));
        x03.f b17 = x03.x0.f451161d.a().f451164b.b(this.f451076d.f451050g);
        return !kotlin.jvm.internal.o.b(java.lang.Long.valueOf(b17.f451012a), java.lang.Long.valueOf(b17.f451014c));
    }
}
