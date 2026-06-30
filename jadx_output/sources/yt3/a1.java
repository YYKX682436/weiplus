package yt3;

/* loaded from: classes5.dex */
public final class a1 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f465338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yt3.c1 f465339e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(yt3.c1 c1Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f465339e = c1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new yt3.a1(this.f465339e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((yt3.a1) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f465338d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yz5.l lVar = this.f465339e.f465380g;
            this.f465338d = 1;
            obj = lVar.invoke(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.l lVar2 = (jz5.l) obj;
        return new dw3.m0((java.util.List) lVar2.f302833d, (java.util.List) lVar2.f302834e);
    }
}
