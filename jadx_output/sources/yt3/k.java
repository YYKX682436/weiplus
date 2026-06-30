package yt3;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f465509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ju3.d0 d0Var) {
        super(1);
        this.f465509d = d0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ju3.d0 d0Var = this.f465509d;
        if (booleanValue) {
            ju3.d0.k(d0Var, ju3.c0.F, null, 2, null);
        } else {
            ju3.d0.k(d0Var, ju3.c0.W, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
