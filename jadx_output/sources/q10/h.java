package q10;

/* loaded from: classes.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f359509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359511f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f359512g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, java.lang.String str2, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f359510e = str;
        this.f359511f = str2;
        this.f359512g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new q10.h(this.f359510e, this.f359511f, this.f359512g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((q10.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f359509d;
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MBProfileUtil", "uploadAndUpdateClipboard: upload cancelled or failed: " + th6.getClass().getSimpleName() + " - " + th6.getMessage());
            str = "";
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            q10.k kVar = q10.k.f359520a;
            java.lang.String str2 = this.f359510e;
            java.lang.String str3 = this.f359511f;
            this.f359509d = 1;
            obj = q10.k.b(kVar, str2, str3, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        str = (java.lang.String) obj;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        q10.g gVar = new q10.g(str, this.f359512g, null);
        this.f359509d = 2;
        if (kotlinx.coroutines.l.g(g3Var, gVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
