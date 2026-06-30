package pu;

/* loaded from: classes12.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358347d;

    /* renamed from: e, reason: collision with root package name */
    public int f358348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qi3.c f358349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f358350g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(qi3.c cVar, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358349f = cVar;
        this.f358350g = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pu.n0(this.f358349f, this.f358350g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pu.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f358348e;
        kotlin.jvm.internal.h0 h0Var2 = this.f358350g;
        qi3.c cVar = this.f358349f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cVar.t();
            this.f358347d = h0Var2;
            this.f358348e = 1;
            obj = cVar.y(this);
            if (obj == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (kotlin.jvm.internal.h0) this.f358347d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        h0Var.f310123d = obj;
        cVar.f1();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(cVar.id());
        sb6.append(" upload retCode:");
        qi3.i0 i0Var = (qi3.i0) h0Var2.f310123d;
        sb6.append(i0Var != null ? new java.lang.Integer(i0Var.f363725a) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceMsgAsyncSendFSC", sb6.toString());
        return jz5.f0.f302826a;
    }
}
