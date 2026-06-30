package rr3;

/* loaded from: classes4.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f399173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym3.c f399174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rr3.c f399175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f399176g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ym3.c cVar, rr3.c cVar2, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f399174e = cVar;
        this.f399175f = cVar2;
        this.f399176g = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rr3.b(this.f399174e, this.f399175f, this.f399176g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rr3.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f399173d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ym3.c cVar = this.f399174e;
            ym3.d dVar = new ym3.d(cVar);
            int i18 = cVar.f463144b;
            rr3.c cVar2 = this.f399175f;
            cVar2.f399179e = i18 == 0 ? (int) (java.lang.System.currentTimeMillis() / 1000) : cVar2.f399179e;
            java.lang.String str = cVar2.f399178d;
            int i19 = cVar2.f399179e;
            r45.o14 o14Var = new r45.o14();
            o14Var.f381819d = str;
            o14Var.f381820e = i19;
            o14Var.f381821f = 10;
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = o14Var;
            lVar.f70665b = new r45.p14();
            lVar.f70666c = "/cgi-bin/mmbiz-bin/jsapi-getbizuseuserinforecordlist";
            lVar.f70667d = 1850;
            kotlinx.coroutines.flow.j a17 = o01.d.f341891a.a(lVar.a());
            rr3.a aVar2 = new rr3.a(dVar, cVar2, this.f399176g);
            this.f399173d = 1;
            if (((kotlinx.coroutines.flow.r) a17).a(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
