package hr3;

/* loaded from: classes5.dex */
public final class me extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f283803d;

    /* renamed from: e, reason: collision with root package name */
    public int f283804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f283805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.dz3 f283807h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(kotlin.jvm.internal.h0 h0Var, hr3.pf pfVar, r45.dz3 dz3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f283805f = h0Var;
        this.f283806g = pfVar;
        this.f283807h = dz3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr3.me(this.f283805f, this.f283806g, this.f283807h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr3.me) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        java.util.LinkedList linkedList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f283804e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            hr3.ag agVar = hr3.ag.f283404a;
            java.lang.String a17 = en1.a.a();
            this.f283806g.getClass();
            r45.dz3 dz3Var = this.f283807h;
            r45.v60 v60Var = (dz3Var == null || (linkedList = dz3Var.f372869e) == null) ? null : (r45.v60) kz5.n0.Z(linkedList);
            kotlin.jvm.internal.h0 h0Var2 = this.f283805f;
            this.f283803d = h0Var2;
            this.f283804e = 1;
            obj = agVar.c(a17, v60Var, this);
            if (obj == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (kotlin.jvm.internal.h0) this.f283803d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        h0Var.f310123d = obj;
        return jz5.f0.f302826a;
    }
}
