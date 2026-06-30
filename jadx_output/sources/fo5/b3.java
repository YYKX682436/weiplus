package fo5;

/* loaded from: classes14.dex */
public final class b3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er4.r f264959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f264960e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(er4.r rVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264959d = rVar;
        this.f264960e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.b3(this.f264959d, this.f264960e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fo5.b3 b3Var = (fo5.b3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.f264959d != null) {
            fo5.a aVar2 = fo5.f3.f264986c;
            if (aVar2 != null) {
                fo5.r0 r0Var = (fo5.r0) aVar2;
                r0Var.I = null;
                r0Var.f265082J = false;
                lo5.h.b(r0Var.f265095n, false, 1, null);
            }
        } else {
            fo5.a aVar3 = fo5.f3.f264986c;
            if (aVar3 != null) {
                fo5.r0 r0Var2 = (fo5.r0) aVar3;
                r0Var2.I = null;
                r0Var2.f265082J = false;
                lo5.h.b(r0Var2.f265095n, false, 1, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
