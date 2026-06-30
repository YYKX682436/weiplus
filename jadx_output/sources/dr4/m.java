package dr4;

/* loaded from: classes14.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.o f242664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ is0.c f242665e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(dr4.o oVar, is0.c cVar) {
        super(0);
        this.f242664d = oVar;
        this.f242665e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dr4.o oVar = this.f242664d;
        dr4.r1 r1Var = oVar.f242686l;
        is0.c texture = this.f242665e;
        if (r1Var != null) {
            kotlin.jvm.internal.o.g(texture, "texture");
            r1Var.D = texture;
            r1Var.C = texture.f294395e;
            dr4.r1 r1Var2 = oVar.f242686l;
            if (r1Var2 != null) {
                r1Var2.w(oVar.f242689o, oVar.f242688n);
            }
        } else {
            oVar.f242687m = texture;
        }
        return jz5.f0.f302826a;
    }
}
