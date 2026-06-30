package yf0;

/* loaded from: classes11.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f461618d;

    /* renamed from: e, reason: collision with root package name */
    public int f461619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f461620f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f461621g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlin.jvm.internal.h0 h0Var, zf0.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461620f = h0Var;
        this.f461621g = v0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf0.x(this.f461620f, this.f461621g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf0.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f461619e;
        zf0.v0 v0Var = this.f461621g;
        kotlin.jvm.internal.h0 h0Var2 = this.f461620f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f461618d = h0Var2;
            this.f461619e = 1;
            obj = v0Var.U(this);
            if (obj == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (kotlin.jvm.internal.h0) this.f461618d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        h0Var.f310123d = obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(v0Var.id());
        sb6.append(" origin upload retCode:");
        qi3.i0 i0Var = (qi3.i0) h0Var2.f310123d;
        sb6.append(i0Var != null ? new java.lang.Integer(i0Var.f363725a) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.VideoSendFSC", sb6.toString());
        return jz5.f0.f302826a;
    }
}
