package tn0;

/* loaded from: classes3.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420738d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(tn0.w0 w0Var) {
        super(0);
        this.f420738d = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tn0.w0 w0Var = this.f420738d;
        ts0.r rVar = w0Var.f420775v;
        if (rVar != null) {
            ((ts0.b) rVar).H();
        }
        ts0.r rVar2 = w0Var.f420775v;
        if (rVar2 != null) {
            rVar2.release();
        }
        return jz5.f0.f302826a;
    }
}
