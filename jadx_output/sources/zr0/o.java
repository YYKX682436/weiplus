package zr0;

/* loaded from: classes14.dex */
public final class o extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr0.p f475160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f475161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f475162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f475163g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(zr0.p pVar, byte[] bArr, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f475160d = pVar;
        this.f475161e = bArr;
        this.f475162f = i17;
        this.f475163g = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new zr0.o(this.f475160d, this.f475161e, this.f475162f, this.f475163g, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zr0.o oVar = (zr0.o) create((kotlin.coroutines.Continuation) obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        oVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        os0.f fVar = this.f475160d.f475167g;
        if (fVar != null) {
            fVar.q(this.f475161e);
        }
        os0.f fVar2 = this.f475160d.f475167g;
        if (fVar2 != null) {
            fVar2.w(this.f475162f, this.f475163g);
        }
        zr0.p pVar = this.f475160d;
        os0.f fVar3 = pVar.f475167g;
        if (fVar3 != null) {
            fVar3.u(pVar.f475165e.f456177c.f456173a, this.f475160d.f475165e.f456177c.f456174b);
        }
        zr0.p pVar2 = this.f475160d;
        os0.f fVar4 = pVar2.f475167g;
        if (fVar4 != null) {
            fVar4.f348005n = pVar2.f475165e.f456178d;
        }
        zr0.p pVar3 = this.f475160d;
        os0.f fVar5 = pVar3.f475167g;
        if (fVar5 != null) {
            fVar5.f348007p = pVar3.f475165e.f456179e;
        }
        os0.f fVar6 = this.f475160d.f475167g;
        if (fVar6 != null) {
            fVar6.o();
        }
        return jz5.f0.f302826a;
    }
}
