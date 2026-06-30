package v65;

/* loaded from: classes8.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.LifecycleScope f433577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope) {
        super(0);
        this.f433577d = lifecycleScope;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = this.f433577d;
        if (lifecycleScope.f192351e.mo133getLifecycle().b() != androidx.lifecycle.n.DESTROYED) {
            lifecycleScope.f192351e.mo133getLifecycle().a(lifecycleScope);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.LifecycleScope", "leak this scope, because lifecycle is already destroy");
        }
        return jz5.f0.f302826a;
    }
}
