package vr0;

/* loaded from: classes14.dex */
public final class v extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f439520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439521e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(vr0.z zVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f439521e = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new vr0.v(this.f439521e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((vr0.v) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f439520d;
        vr0.z zVar = this.f439521e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nr0.x xVar = zVar.f411434h;
            if (xVar != null) {
                this.f439520d = 1;
                if (xVar.i(this) == aVar) {
                    return aVar;
                }
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
        nr0.x xVar2 = zVar.f411434h;
        if (xVar2 != null) {
            this.f439520d = 2;
            obj = xVar2.n(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
