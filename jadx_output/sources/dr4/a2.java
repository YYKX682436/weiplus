package dr4;

/* loaded from: classes14.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.d2 f242591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(dr4.d2 d2Var) {
        super(0);
        this.f242591d = d2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pq4.c l17 = gq4.v.Bi().l("CAMERA");
        rs0.h hVar = l17 != null ? l17.f357683d : null;
        dr4.d2 d2Var = this.f242591d;
        d2Var.f242685k = hVar;
        d2Var.f242686l = new dr4.r0(d2Var.f242688n, d2Var.f242689o, 0, 0, 0, 2, true, 24, null);
        return jz5.f0.f302826a;
    }
}
