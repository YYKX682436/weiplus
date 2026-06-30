package hr3;

/* loaded from: classes5.dex */
public final class ge extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f283588d;

    /* renamed from: e, reason: collision with root package name */
    public int f283589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f283590f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283591g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.dz3 f283592h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(kotlin.jvm.internal.h0 h0Var, hr3.pf pfVar, r45.dz3 dz3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f283590f = h0Var;
        this.f283591g = pfVar;
        this.f283592h = dz3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr3.ge(this.f283590f, this.f283591g, this.f283592h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr3.ge) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        java.util.LinkedList linkedList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f283589e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            hr3.ag agVar = hr3.ag.f283404a;
            java.lang.String a17 = en1.a.a();
            this.f283591g.getClass();
            r45.dz3 dz3Var = this.f283592h;
            r45.v60 v60Var = (dz3Var == null || (linkedList = dz3Var.f372869e) == null) ? null : (r45.v60) kz5.n0.Z(linkedList);
            kotlin.jvm.internal.h0 h0Var2 = this.f283590f;
            this.f283588d = h0Var2;
            this.f283589e = 1;
            obj = agVar.c(a17, v60Var, this);
            if (obj == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (kotlin.jvm.internal.h0) this.f283588d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        h0Var.f310123d = obj;
        return jz5.f0.f302826a;
    }
}
