package vr0;

/* loaded from: classes14.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f439484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439485e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(vr0.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f439485e = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vr0.l(this.f439485e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vr0.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f439484d;
        vr0.z zVar = this.f439485e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nr0.x xVar = zVar.f411434h;
            if (xVar != null) {
                this.f439484d = 1;
                obj = xVar.k(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            zVar.E = new vr0.k(zVar, null);
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        zVar.E = new vr0.k(zVar, null);
        return jz5.f0.f302826a;
    }
}
