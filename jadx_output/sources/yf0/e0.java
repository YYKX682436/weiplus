package yf0;

/* loaded from: classes5.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f461545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf0.k0 f461546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f461547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msg.MsgIdTalker f461548g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(yf0.k0 k0Var, zf0.v0 v0Var, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461546e = k0Var;
        this.f461547f = v0Var;
        this.f461548g = msgIdTalker;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf0.e0(this.f461546e, this.f461547f, this.f461548g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf0.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f461545d;
        yf0.k0 k0Var = this.f461546e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f461545d = 1;
            obj = yf0.k0.U6(k0Var, this.f461547f, null, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        kotlinx.coroutines.r2 b17 = v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) k0Var.f461582m).getValue(), null, new yf0.d0(this.f461546e, this.f461547f, ((java.lang.Number) lVar.f302833d).intValue(), ((java.lang.Number) lVar.f302834e).intValue(), this.f461548g, null), 1, null);
        this.f461545d = 2;
        if (b17.C(this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
