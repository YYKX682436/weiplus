package z51;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z51.c f470169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aq.u0 f470170e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z51.c cVar, aq.u0 u0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f470169d = cVar;
        this.f470170e = u0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new z51.a(this.f470169d, this.f470170e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        z51.a aVar = (z51.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        z51.c cVar = this.f470169d;
        aq.u0 u0Var = this.f470170e;
        cVar.f470177i = u0Var;
        if (u0Var.f12975a.f12960a) {
            cVar.f470176h = true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get videoData success mediaId: ");
            a61.c cVar2 = cVar.f470174f;
            if (cVar2 == null) {
                kotlin.jvm.internal.o.o("sourceConfig");
                throw null;
            }
            sb6.append(cVar2.f1722d);
            cVar.f(sb6.toString());
        } else {
            cVar.f470176h = false;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("get videoData mediaIdL ");
            a61.c cVar3 = cVar.f470174f;
            if (cVar3 == null) {
                kotlin.jvm.internal.o.o("sourceConfig");
                throw null;
            }
            sb7.append(cVar3.f1722d);
            sb7.append(" error code: ");
            sb7.append(u0Var.f12975a.f12961b);
            cVar.e(sb7.toString());
        }
        return jz5.f0.f302826a;
    }
}
