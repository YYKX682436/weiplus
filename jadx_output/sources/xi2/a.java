package xi2;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f454717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xi2.d f454718e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xi2.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f454718e = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xi2.a(this.f454718e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xi2.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f454717d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vl2.s sVar = vl2.s.f437868a;
            vl2.h hVar = vl2.h.f437831s;
            com.tencent.mm.view.MMPAGView mMPAGView = this.f454718e.f454721a;
            this.f454717d = 1;
            if (sVar.d(hVar, mMPAGView, this) == aVar) {
                return aVar;
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
