package u1;

/* loaded from: classes14.dex */
public final class o extends u1.p0 implements u1.s1 {

    /* renamed from: h, reason: collision with root package name */
    public b1.f f423648h;

    /* renamed from: i, reason: collision with root package name */
    public final b1.b f423649i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f423650m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.a f423651n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u1.c1 layoutNodeWrapper, b1.h modifier) {
        super(layoutNodeWrapper, modifier);
        kotlin.jvm.internal.o.g(layoutNodeWrapper, "layoutNodeWrapper");
        kotlin.jvm.internal.o.g(modifier, "modifier");
        b1.h hVar = (b1.h) this.f423655e;
        this.f423648h = hVar instanceof b1.f ? (b1.f) hVar : null;
        this.f423649i = new u1.m(this, layoutNodeWrapper);
        this.f423650m = true;
        this.f423651n = new u1.n(this);
    }

    @Override // u1.p0
    public void a() {
        b1.h hVar = (b1.h) this.f423655e;
        this.f423648h = hVar instanceof b1.f ? (b1.f) hVar : null;
        this.f423650m = true;
        this.f423657g = true;
    }

    public final void c(e1.u canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        u1.c1 c1Var = this.f423654d;
        long b17 = p2.r.b(c1Var.f402052f);
        b1.f fVar = this.f423648h;
        u1.w wVar = c1Var.f423554h;
        if (fVar != null && this.f423650m) {
            u1.q0.a(wVar).getSnapshotObserver().a(this, u1.l.f423616d, this.f423651n);
        }
        wVar.getClass();
        u1.o0 sharedDrawScope = u1.q0.a(wVar).getSharedDrawScope();
        u1.o oVar = sharedDrawScope.f423653e;
        sharedDrawScope.f423653e = this;
        s1.x0 f07 = c1Var.f0();
        p2.s layoutDirection = c1Var.f0().getLayoutDirection();
        g1.c cVar = sharedDrawScope.f423652d;
        g1.a aVar = cVar.f267506d;
        p2.f fVar2 = aVar.f267500a;
        p2.s sVar = aVar.f267501b;
        e1.u uVar = aVar.f267502c;
        long j17 = aVar.f267503d;
        kotlin.jvm.internal.o.g(f07, "<set-?>");
        aVar.f267500a = f07;
        kotlin.jvm.internal.o.g(layoutDirection, "<set-?>");
        aVar.f267501b = layoutDirection;
        aVar.f267502c = canvas;
        aVar.f267503d = b17;
        canvas.c();
        ((b1.h) this.f423655e).P(sharedDrawScope);
        canvas.b();
        g1.a aVar2 = cVar.f267506d;
        aVar2.getClass();
        kotlin.jvm.internal.o.g(fVar2, "<set-?>");
        aVar2.f267500a = fVar2;
        kotlin.jvm.internal.o.g(sVar, "<set-?>");
        aVar2.f267501b = sVar;
        kotlin.jvm.internal.o.g(uVar, "<set-?>");
        aVar2.f267502c = uVar;
        aVar2.f267503d = j17;
        sharedDrawScope.f423653e = oVar;
    }

    @Override // u1.s1
    public boolean isValid() {
        return this.f423654d.p0();
    }
}
