package kw1;

/* loaded from: classes14.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312822d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f312823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kw1.k f312824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kw1.o f312825g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kw1.k kVar, kw1.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312824f = kVar;
        this.f312825g = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kw1.d dVar = new kw1.d(this.f312824f, this.f312825g, continuation);
        dVar.f312823e = obj;
        return dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kw1.d) create((mw1.b) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f312822d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mw1.c a17 = ((mw1.b) this.f312823e).a();
            if (a17 == null) {
                return null;
            }
            nw1.d dVar = this.f312824f.f312857g;
            kw1.m mVar = (kw1.m) this.f312825g;
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3 b3Var = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3) a17;
            android.util.Size drawSize = b3Var.getRenderSize();
            pw1.g a18 = pw1.g.a(mVar.f312859b, 0, 0, 0, false, b3Var.getScaleType(), 15, null);
            kotlin.jvm.internal.o.g(mVar, "<this>");
            kotlin.jvm.internal.o.g(drawSize, "drawSize");
            nw1.e eVar = new nw1.e(a18, drawSize, mVar.f312860c.f294395e, true);
            this.f312822d = 1;
            obj = dVar.c(eVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return (nw1.f) obj;
    }
}
