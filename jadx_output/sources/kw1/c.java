package kw1;

/* loaded from: classes14.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mw1.b f312819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kw1.k f312820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rw1.c f312821g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(mw1.b bVar, kw1.k kVar, rw1.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f312819e = bVar;
        this.f312820f = kVar;
        this.f312821g = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kw1.c(this.f312819e, this.f312820f, this.f312821g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kw1.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f312818d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mw1.c a17 = this.f312819e.a();
            if (a17 == null) {
                return null;
            }
            pw1.d dVar = this.f312820f.f312856f;
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3 b3Var = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b3) a17;
            android.util.Size drawSize = b3Var.getRenderSize();
            int scaleType = b3Var.getScaleType();
            rw1.c cVar = this.f312821g;
            kotlin.jvm.internal.o.g(cVar, "<this>");
            kotlin.jvm.internal.o.g(drawSize, "drawSize");
            pw1.e eVar = new pw1.e(pw1.g.a(cVar.f400587b, 0, 0, 0, false, scaleType, 15, null), drawSize, cVar.f400588c);
            this.f312818d = 1;
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
        return (pw1.f) obj;
    }
}
