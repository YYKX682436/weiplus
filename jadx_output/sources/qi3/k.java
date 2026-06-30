package qi3;

/* loaded from: classes12.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f363733d;

    /* renamed from: e, reason: collision with root package name */
    public int f363734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qi3.n f363735f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f363736g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f363737h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363738i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(qi3.n nVar, long j17, java.lang.Long l17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363735f = nVar;
        this.f363736g = j17;
        this.f363737h = l17;
        this.f363738i = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qi3.k(this.f363735f, this.f363736g, this.f363737h, this.f363738i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qi3.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        long j17 = this.f363736g;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f363734e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                qi3.n nVar = this.f363735f;
                java.lang.String str2 = nVar.f363750c;
                if (str2 == null) {
                    str2 = nVar.f363749b;
                }
                com.tencent.mm.modelbase.i b17 = qi3.m.f363747a.a(nVar, 1, new qi3.j(str2, this.f363736g, this.f363737h, this.f363738i)).b();
                this.f363733d = str2;
                this.f363734e = 1;
                obj = rm0.h.b(b17, this);
                if (obj == aVar) {
                    return aVar;
                }
                str = str2;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) this.f363733d;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
            pt0.e0 e0Var = pt0.f0.f358209b1;
            com.tencent.mm.storage.f9 k17 = e0Var.k(str, j17);
            if (k17 != null) {
                k17.setMsgId(j17);
                k17.r1(fVar.b() ? 2 : 5);
                if (fVar.b()) {
                    r45.rr rrVar = (r45.rr) fVar.f70618d;
                    k17.o1(rrVar != null ? rrVar.f385130d : 0L);
                }
            } else {
                k17 = null;
            }
            if (k17 != null) {
                e0Var.s(str, j17, k17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BypSendHelper", e17, "sendBypTextMessage", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
