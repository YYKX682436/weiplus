package mm1;

/* loaded from: classes10.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f328695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm1.b0 f328696e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(mm1.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f328696e = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm1.s(this.f328696e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm1.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f328695d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f328695d = 1;
            um1.a aVar2 = mm1.b0.f328635i;
            mm1.b0 b0Var = this.f328696e;
            b0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioRouter", "start to destroyEngine");
            pi0.l1 l1Var = b0Var.f328640f;
            b0Var.f328640f = null;
            if (l1Var == null || (obj2 = l1Var.h(b0Var.f328641g, this)) != aVar) {
                obj2 = f0Var;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
