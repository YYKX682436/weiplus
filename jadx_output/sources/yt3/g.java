package yt3;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.i f465453d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yt3.i iVar) {
        super(1);
        this.f465453d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yt3.i iVar = this.f465453d;
        if (booleanValue) {
            ju3.d0.k(iVar.f465332d, ju3.c0.E, null, 2, null);
            hk0.u0 u0Var = iVar.f465488h;
            if (u0Var != null) {
                u0Var.d7(2, null);
            }
        } else {
            ju3.d0.k(iVar.f465332d, ju3.c0.W, null, 2, null);
            hk0.u0 u0Var2 = iVar.f465488h;
            if (u0Var2 != null) {
                u0Var2.d7(2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
