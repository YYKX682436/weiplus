package vp4;

/* loaded from: classes10.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp4.b0 f439083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(vp4.b0 b0Var) {
        super(1);
        this.f439083d = b0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        vp4.b0 b0Var = this.f439083d;
        yz5.p pVar = b0Var.f439010j;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(intValue), b0Var.f439011k);
        }
        return jz5.f0.f302826a;
    }
}
