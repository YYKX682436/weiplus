package yk2;

/* loaded from: classes3.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f462796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yk2.l f462797e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yk2.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f462797e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yk2.k(this.f462797e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yk2.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f462796d;
        yk2.l lVar = this.f462797e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ld2.i iVar = ld2.i.f318103a;
            android.content.Context context = lVar.f462791d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            dk2.ef efVar = dk2.ef.f233372a;
            gk2.e eVar = dk2.ef.I;
            this.f462796d = 1;
            if (iVar.c(context, eVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        java.lang.String b17 = lVar.b();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(b17, b52.b.b(), "person_page_recent_viewed", "");
        return jz5.f0.f302826a;
    }
}
