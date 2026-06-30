package gg1;

/* loaded from: classes7.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f271623e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(gg1.c1 c1Var, boolean z17) {
        super(2);
        this.f271622d = c1Var;
        this.f271623e = z17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        x91.h hVar = (x91.h) obj;
        ((java.lang.Number) obj2).intValue();
        gg1.c1 c1Var = this.f271622d;
        if (hVar == null) {
            ((fg1.g) c1Var.f271536b).d(false);
            gg1.w wVar = c1Var.f271540f;
            if (wVar == null) {
                kotlin.jvm.internal.o.o("selectDeviceBottomSheet");
                throw null;
            }
            wVar.f271649v = null;
            wVar.e();
        } else {
            ((fg1.g) c1Var.f271536b).d(true);
            yz5.a aVar = c1Var.f271542h;
            if (aVar != null) {
                aVar.invoke();
            }
            gg1.k1 k1Var = c1Var.f271539e;
            k1Var.getClass();
            ((b06.b) k1Var.f271590c).a(k1Var, gg1.k1.f271587k[0], hVar);
            c1Var.f271538d = 3;
            if (this.f271623e) {
                ik1.h0.b(new gg1.q0(c1Var));
            }
        }
        return jz5.f0.f302826a;
    }
}
