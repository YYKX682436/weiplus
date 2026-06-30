package nu0;

/* loaded from: classes5.dex */
public final class f3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f339937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339938e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339938e = b4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.f3(this.f339938e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.f3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f339937d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        nu0.b4 b4Var = this.f339938e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "releaseImageSession >> release");
            nu0.q0 U6 = b4Var.U6();
            this.f339937d = 1;
            U6.getClass();
            java.lang.Object g17 = kotlinx.coroutines.l.g(U6.f340073p, new nu0.d0(U6, null), this);
            if (g17 != aVar) {
                g17 = f0Var;
            }
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        b4Var.z7(nu0.c1.f339896f);
        return f0Var;
    }
}
