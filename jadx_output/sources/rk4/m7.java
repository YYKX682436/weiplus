package rk4;

/* loaded from: classes10.dex */
public final class m7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f396852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(rk4.k8 k8Var) {
        super(0);
        this.f396852d = k8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rk4.k5.e("delayReleaseManager doReleaseCallback", "MicroMsg.TingRouter");
        rk4.k8 k8Var = this.f396852d;
        kotlinx.coroutines.l.d(k8Var, null, null, new rk4.l7(k8Var, null), 3, null);
        return jz5.f0.f302826a;
    }
}
