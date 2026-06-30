package j0;

/* loaded from: classes14.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f296205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0.t f296206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f296207f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.p pVar, z0.t tVar, int i17) {
        super(2);
        this.f296205d = pVar;
        this.f296206e = tVar;
        this.f296207f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        int i17 = this.f296207f;
        yz5.p pVar = this.f296205d;
        if (pVar == null) {
            n0.y0 y0Var2 = (n0.y0) oVar;
            y0Var2.U(1275643833);
            j0.g.b(this.f296206e, oVar, (i17 >> 3) & 14);
            y0Var2.o(false);
        } else {
            n0.y0 y0Var3 = (n0.y0) oVar;
            y0Var3.U(1275643903);
            pVar.invoke(oVar, java.lang.Integer.valueOf((i17 >> 6) & 14));
            y0Var3.o(false);
        }
        return jz5.f0.f302826a;
    }
}
