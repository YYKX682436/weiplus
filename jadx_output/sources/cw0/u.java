package cw0;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.w0 f222682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f222683e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(cw0.w0 w0Var, cw0.l0 l0Var) {
        super(1);
        this.f222682d = w0Var;
        this.f222683e = l0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        this.f222682d.J();
        this.f222683e.m7(floatValue);
        return jz5.f0.f302826a;
    }
}
