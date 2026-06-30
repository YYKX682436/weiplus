package ir2;

/* loaded from: classes2.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f294237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir2.a1 f294238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ir2.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294238e = a1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ir2.x0(this.f294238e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ir2.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f294237d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ir2.a1 a1Var = this.f294238e;
            ir2.a0 a0Var = a1Var.f294095h;
            if (a0Var != null) {
                ir2.w0 w0Var = new ir2.w0(a1Var, a0Var, null);
                this.f294237d = 1;
                obj = ir2.a1.N6(a1Var, w0Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("Finder.NewLoader", "refresh cost:" + ((java.lang.Number) obj).longValue());
        return jz5.f0.f302826a;
    }
}
