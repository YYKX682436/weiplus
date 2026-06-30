package lf4;

/* loaded from: classes4.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf4.j f318391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ if4.a f318392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f318393f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(nf4.j jVar, if4.a aVar, lf4.j1 j1Var) {
        super(0);
        this.f318391d = jVar;
        this.f318392e = aVar;
        this.f318393f = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nf4.j jVar = this.f318391d;
        if ((jVar == null || jVar.z0()) ? false : true) {
            gf4.l.f271354d.n(false, false);
        }
        if4.a aVar = this.f318392e;
        aVar.f291237e = false;
        java.util.Iterator it = aVar.f291242j.iterator();
        while (it.hasNext()) {
            ((gf4.a) it.next()).f271335f = false;
        }
        ((sf4.a1) this.f318393f.f318419f).d();
        return jz5.f0.f302826a;
    }
}
