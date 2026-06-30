package u1;

/* loaded from: classes14.dex */
public final class m implements b1.b {

    /* renamed from: a, reason: collision with root package name */
    public final p2.f f423620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1.o f423621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u1.c1 f423622c;

    public m(u1.o oVar, u1.c1 c1Var) {
        this.f423621b = oVar;
        this.f423622c = c1Var;
        this.f423620a = oVar.f423654d.f423554h.f423698v;
    }

    @Override // b1.b
    public long a() {
        return p2.r.b(this.f423622c.f402052f);
    }

    @Override // b1.b
    public p2.f getDensity() {
        return this.f423620a;
    }

    @Override // b1.b
    public p2.s getLayoutDirection() {
        return this.f423621b.f423654d.f423554h.f423700x;
    }
}
