package zr0;

/* loaded from: classes14.dex */
public final class k extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr0.p f475148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ is0.c f475149e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(zr0.p pVar, is0.c cVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f475148d = pVar;
        this.f475149e = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new zr0.k(this.f475148d, this.f475149e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zr0.k kVar = (zr0.k) create((kotlin.coroutines.Continuation) obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        os0.a aVar2 = this.f475148d.f475168h;
        if (aVar2 != null) {
            is0.c cVar = this.f475149e;
            aVar2.w(cVar.f294400m, cVar.f294401n);
        }
        zr0.p pVar = this.f475148d;
        os0.a aVar3 = pVar.f475168h;
        if (aVar3 != null) {
            aVar3.u(pVar.f475165e.f456177c.f456173a, this.f475148d.f475165e.f456177c.f456174b);
        }
        zr0.p pVar2 = this.f475148d;
        os0.a aVar4 = pVar2.f475168h;
        if (aVar4 != null) {
            ((os0.c) aVar4).H = this.f475149e.f294395e;
        }
        if (aVar4 != null) {
            aVar4.f348005n = pVar2.f475165e.f456178d;
        }
        zr0.p pVar3 = this.f475148d;
        os0.a aVar5 = pVar3.f475168h;
        if (aVar5 != null) {
            aVar5.f348007p = pVar3.f475165e.f456179e;
        }
        os0.a aVar6 = this.f475148d.f475168h;
        if (aVar6 != null) {
            aVar6.o();
        }
        return jz5.f0.f302826a;
    }
}
