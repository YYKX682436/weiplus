package ye5;

/* loaded from: classes9.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f461276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f461277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(rd5.d dVar, yb5.d dVar2) {
        super(0);
        this.f461276d = dVar;
        this.f461277e = dVar2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wg3.j jVar = (wg3.j) i95.n0.c(wg3.j.class);
        rd5.d dVar = this.f461276d;
        ((kc5.x) jVar).Ai(dVar.f394254d.f445300b);
        sb5.a0 a0Var = (sb5.a0) this.f461277e.f460708c.a(sb5.a0.class);
        if (a0Var != null) {
            ((com.tencent.mm.ui.chatting.component.o4) a0Var).m0(dVar.f394254d.f445300b);
        }
        return jz5.f0.f302826a;
    }
}
