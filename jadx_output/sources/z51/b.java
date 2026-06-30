package z51;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f470171d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f470172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z51.c f470173f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z51.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f470173f = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        z51.b bVar = new z51.b(this.f470173f, continuation);
        bVar.f470172e = obj;
        return bVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((z51.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f470171d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f470172e;
            qp.b bVar = qp.b.f365674a;
            z51.c cVar = this.f470173f;
            a61.c cVar2 = cVar.f470174f;
            if (cVar2 == null) {
                kotlin.jvm.internal.o.o("sourceConfig");
                throw null;
            }
            java.lang.Long l17 = cVar2.f1722d;
            kotlin.jvm.internal.o.f(l17, "getMediaId(...)");
            long longValue = l17.longValue();
            a61.c cVar3 = cVar.f470174f;
            if (cVar3 == null) {
                kotlin.jvm.internal.o.o("sourceConfig");
                throw null;
            }
            java.lang.String str = cVar3.f1721c;
            kotlin.jvm.internal.o.f(str, "getVideoPath(...)");
            a61.c cVar4 = cVar.f470174f;
            if (cVar4 == null) {
                kotlin.jvm.internal.o.o("sourceConfig");
                throw null;
            }
            java.lang.String str2 = cVar4.f1719a;
            kotlin.jvm.internal.o.f(str2, "getThumbPath(...)");
            aq.u0 b17 = bVar.b(longValue, str, str2, 0L);
            if (!kotlinx.coroutines.z0.h(y0Var)) {
                cVar.g("prepared get data finish but job is cancel");
                return f0Var;
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            z51.a aVar2 = new z51.a(cVar, b17, null);
            this.f470171d = 1;
            if (kotlinx.coroutines.l.g(g3Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
