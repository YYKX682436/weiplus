package ik4;

/* loaded from: classes4.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f291947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ik4.p f291948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.thumbplayer.api.ITPPlayer f291949f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ik4.p pVar, com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f291948e = pVar;
        this.f291949f = iTPPlayer;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ik4.n(this.f291948e, this.f291949f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ik4.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f291947d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            ik4.m mVar = new ik4.m(this.f291948e, this.f291949f, null);
            this.f291947d = 1;
            if (kotlinx.coroutines.l.g(p0Var, mVar, this) == aVar) {
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
