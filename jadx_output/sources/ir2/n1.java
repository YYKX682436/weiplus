package ir2;

/* loaded from: classes2.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir2.p1 f294187d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(ir2.p1 p1Var) {
        super(0);
        this.f294187d = p1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ym5.m1 m1Var = this.f294187d.f294206a.f294098n;
        if (m1Var != null) {
            m1Var.onChanged();
        }
        return jz5.f0.f302826a;
    }
}
