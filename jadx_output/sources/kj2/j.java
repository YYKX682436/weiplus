package kj2;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f308406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f308407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kj2.o f308408f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(xg2.h hVar, kotlin.coroutines.Continuation continuation, kj2.o oVar) {
        super(2, continuation);
        this.f308407e = hVar;
        this.f308408f = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kj2.j(this.f308407e, continuation, this.f308408f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kj2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f308406d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xg2.a aVar2 = (xg2.a) ((xg2.b) this.f308407e).f454381b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getMicMemberList fail, isShowing: ");
            kj2.o oVar = this.f308408f;
            sb6.append(oVar.f308425d.b());
            sb6.append(" error: ");
            sb6.append(aVar2);
            com.tencent.mars.xlog.Log.i("FinderLiveInviteVisitorMicWidget", sb6.toString());
            if (oVar.f308425d.b()) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                kj2.i iVar = new kj2.i(oVar, null);
                this.f308406d = 1;
                if (kotlinx.coroutines.l.g(g3Var, iVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
