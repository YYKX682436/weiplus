package pk2;

/* loaded from: classes3.dex */
public final class s2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(pk2.o9 o9Var) {
        super(2);
        this.f356231d = o9Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pk2.g8 g8Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        if (booleanValue) {
            pk2.o9 o9Var = this.f356231d;
            pk2.d9 d9Var = o9Var.f356082f;
            if (d9Var != null && (g8Var = d9Var.f355658a) != null) {
                if2.z.f291153a.f(((pk2.k9) g8Var).f355924a.getStore());
            }
            o9Var.j(qo0.b.f365405q4, null);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Aj(1, 0);
        }
        return jz5.f0.f302826a;
    }
}
