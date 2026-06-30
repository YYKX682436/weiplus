package sc2;

/* loaded from: classes2.dex */
public final class v7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f406316e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(in5.s0 s0Var, int i17) {
        super(1);
        this.f406315d = s0Var;
        this.f406316e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ad2.h observer = (ad2.h) obj;
        kotlin.jvm.internal.o.g(observer, "observer");
        xc2.p0 p0Var = observer.f3147h;
        android.view.View view = observer.f3143d;
        if (p0Var != null && view != null) {
            in5.s0 holder = this.f406315d;
            kotlin.jvm.internal.o.g(holder, "holder");
            xc2.z2 z2Var = observer.f3151o;
            if (z2Var != null) {
                z2Var.b(holder, this.f406316e);
            }
        }
        return jz5.f0.f302826a;
    }
}
