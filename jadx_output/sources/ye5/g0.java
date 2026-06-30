package ye5;

/* loaded from: classes9.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f461254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f461255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a0 f461256f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b11.f f461257g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(rd5.d dVar, yb5.d dVar2, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, b11.f fVar) {
        super(0);
        this.f461254d = dVar;
        this.f461255e = dVar2;
        this.f461256f = a0Var;
        this.f461257g = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        b11.b bVar;
        rd5.d dVar = this.f461254d;
        boolean J2 = dVar.f394254d.f445300b.J2();
        yb5.d dVar2 = this.f461255e;
        if (J2) {
            b11.b bVar2 = new b11.b();
            af5.y0.b(bVar2, dVar.f394254d.f445300b);
            bVar2.f469141f = new ye5.b0(dVar2, this.f461256f, dVar);
            bVar = bVar2;
        } else if (dVar.f394254d.f445300b.isVideo()) {
            b11.d dVar3 = new b11.d();
            ze5.ia.c(dVar3, dVar.f394254d.f445300b, dVar2, dVar2.g());
            dVar3.f469081y = new ye5.c0(dVar2, dVar);
            dVar3.D = new ye5.s(dVar, dVar2);
            dVar3.E = new ye5.d0(dVar2);
            dVar3.F = new ye5.e0(dVar2);
            dVar3.G = new ye5.f0(dVar2);
            bVar = dVar3;
        } else {
            bVar = new b11.b();
        }
        bVar.Q2(this.f461257g);
        return bVar;
    }
}
