package sc2;

/* loaded from: classes2.dex */
public final class j7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ec2.f f406000e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(in5.s0 s0Var, ec2.f fVar) {
        super(1);
        this.f405999d = s0Var;
        this.f406000e = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ad2.h observer = (ad2.h) obj;
        kotlin.jvm.internal.o.g(observer, "observer");
        xc2.p0 p0Var = observer.f3147h;
        android.view.View view = observer.f3143d;
        if (p0Var != null && view != null) {
            observer.y(this.f405999d, view, p0Var, this.f406000e);
        }
        return jz5.f0.f302826a;
    }
}
