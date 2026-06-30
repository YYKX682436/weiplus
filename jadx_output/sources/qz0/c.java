package qz0;

/* loaded from: classes.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f367813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ my0.h f367814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.test.TemplateTestUI f367815f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(my0.h hVar, com.tencent.mm.mj_template.test.TemplateTestUI templateTestUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367814e = hVar;
        this.f367815f = templateTestUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qz0.c(this.f367814e, this.f367815f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qz0.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f367813d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f367813d = 1;
            obj = this.f367814e.c(null, this);
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
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        qz0.b bVar = new qz0.b(this.f367815f, (my0.g) obj, null);
        this.f367813d = 2;
        if (kotlinx.coroutines.l.g(g3Var, bVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
