package qe;

/* loaded from: classes7.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f361949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.g1 f361950e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(androidx.lifecycle.y yVar, qe.g1 g1Var) {
        super(0);
        this.f361949d = yVar;
        this.f361950e = g1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.o mo133getLifecycle = this.f361949d.mo133getLifecycle();
        final qe.g1 g1Var = this.f361950e;
        mo133getLifecycle.a(new androidx.lifecycle.x() { // from class: com.tencent.luggage.sdk.jsapi.component.network.WssNativeFixLeak$ProxyReportListener$injectAppRuntimeLifecycleOwner$1$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public final void onDestroyed() {
                qe.g1.this.f361954a = null;
            }
        });
        return jz5.f0.f302826a;
    }
}
