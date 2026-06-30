package yf0;

/* loaded from: classes5.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f461525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf0.k0 f461526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f461527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f461528g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f461529h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msg.MsgIdTalker f461530i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(yf0.k0 k0Var, zf0.v0 v0Var, int i17, int i18, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461526e = k0Var;
        this.f461527f = v0Var;
        this.f461528g = i17;
        this.f461529h = i18;
        this.f461530i = msgIdTalker;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf0.d0(this.f461526e, this.f461527f, this.f461528g, this.f461529h, this.f461530i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf0.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f461525d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yf0.k0 k0Var = this.f461526e;
            zf0.v0 v0Var = this.f461527f;
            int i18 = this.f461528g;
            int i19 = this.f461529h;
            yf0.c0 c0Var = new yf0.c0(this.f461530i, v0Var);
            this.f461525d = 1;
            if (yf0.k0.T6(k0Var, v0Var, i18, i19, c0Var, this) == aVar) {
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
