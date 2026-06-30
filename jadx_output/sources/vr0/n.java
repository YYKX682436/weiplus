package vr0;

/* loaded from: classes10.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f439489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439490e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(vr0.z zVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f439490e = zVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vr0.n(this.f439490e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vr0.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f439489d;
        vr0.z zVar = this.f439490e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yz5.l lVar = zVar.E;
            if (lVar != null) {
                this.f439489d = 1;
                if (lVar.invoke(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        zVar.E = null;
        return jz5.f0.f302826a;
    }
}
