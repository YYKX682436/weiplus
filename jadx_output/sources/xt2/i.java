package xt2;

/* loaded from: classes2.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f456783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vl2.h f456784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f456785f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(vl2.h hVar, com.tencent.mm.view.MMPAGView mMPAGView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f456784e = hVar;
        this.f456785f = mMPAGView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.i(this.f456784e, this.f456785f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f456783d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vl2.s sVar = vl2.s.f437868a;
            this.f456783d = 1;
            if (sVar.d(this.f456784e, this.f456785f, this) == aVar) {
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
