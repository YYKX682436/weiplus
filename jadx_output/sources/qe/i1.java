package qe;

/* loaded from: classes7.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f361963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.j1 f361964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(androidx.lifecycle.y yVar, qe.j1 j1Var) {
        super(0);
        this.f361963d = yVar;
        this.f361964e = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.o mo133getLifecycle = this.f361963d.mo133getLifecycle();
        final qe.j1 j1Var = this.f361964e;
        mo133getLifecycle.a(new androidx.lifecycle.x() { // from class: com.tencent.luggage.sdk.jsapi.component.network.WssNativeFixLeak$ProxySocketListener$injectAppRuntimeLifecycleOwner$1$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public final void onDestroyed() {
                qe.j1.this.f361969a = null;
            }
        });
        return jz5.f0.f302826a;
    }
}
