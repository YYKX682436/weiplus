package v65;

/* loaded from: classes11.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.LifecycleScope f433578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope) {
        super(0);
        this.f433578d = lifecycleScope;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f433578d.f192352f <= 1) {
            return new kotlinx.coroutines.g2(((ku5.t0) ku5.t0.f312615d).p(this.f433578d.f192350d));
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = this.f433578d;
        java.lang.String str = lifecycleScope.f192350d;
        int i17 = lifecycleScope.f192352f;
        return new kotlinx.coroutines.g2(((ku5.t0) u0Var).o(str, i17, i17, new java.util.concurrent.LinkedBlockingQueue()));
    }
}
