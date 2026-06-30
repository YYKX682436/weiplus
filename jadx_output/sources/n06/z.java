package n06;

/* loaded from: classes15.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n06.b0 f334017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(n06.b0 b0Var) {
        super(1);
        this.f334017d = b0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        o06.d dVar = (o06.d) obj;
        if (dVar.j() == o06.c.DECLARATION) {
            n06.e eVar = this.f334017d.f333941b;
            o06.m e17 = dVar.e();
            kotlin.jvm.internal.o.e(e17, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            eVar.getClass();
            n06.d dVar2 = n06.d.f333953a;
            if (n06.d.f333963k.containsKey(r16.i.g((o06.g) e17))) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
