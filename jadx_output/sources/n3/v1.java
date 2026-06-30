package n3;

/* loaded from: classes14.dex */
public final class v1 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f334423e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f334424f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f334425g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334425g = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        n3.v1 v1Var = new n3.v1(this.f334425g, continuation);
        v1Var.f334424f = obj;
        return v1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((n3.v1) create((q26.p) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3 = pz5.a.f359186d;
        int i17 = this.f334423e;
        android.view.View view = this.f334425g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            q26.p pVar = (q26.p) this.f334424f;
            this.f334424f = pVar;
            this.f334423e = 1;
            pVar.b(view, this);
            return obj3;
        }
        java.lang.Object obj4 = jz5.f0.f302826a;
        if (i17 == 1) {
            q26.p pVar2 = (q26.p) this.f334424f;
            kotlin.ResultKt.throwOnFailure(obj);
            if (view instanceof android.view.ViewGroup) {
                n3.s1 s1Var = new n3.s1((android.view.ViewGroup) view, null);
                this.f334424f = null;
                this.f334423e = 2;
                pVar2.getClass();
                q26.o oVar = new q26.o();
                oVar.f359881g = pz5.f.a(s1Var, oVar, oVar);
                q26.o oVar2 = (q26.o) pVar2;
                if (oVar.hasNext()) {
                    oVar2.f359880f = oVar;
                    oVar2.f359878d = 2;
                    oVar2.f359881g = this;
                    obj2 = pz5.a.f359186d;
                } else {
                    obj2 = obj4;
                }
                if (obj2 != pz5.a.f359186d) {
                    obj2 = obj4;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj4;
    }
}
