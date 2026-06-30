package qy1;

/* loaded from: classes13.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f367751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qy1.b0 f367752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f367753f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qy1.i f367754g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(qy1.b0 b0Var, com.tencent.mm.modelbase.m1 m1Var, qy1.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367752e = b0Var;
        this.f367753f = m1Var;
        this.f367754g = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qy1.t(this.f367752e, this.f367753f, this.f367754g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy1.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f367751d;
        qy1.b0 b0Var = this.f367752e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f367751d = 1;
            if (qy1.b0.a(b0Var, this.f367753f, this) == aVar) {
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
        qy1.i iVar = this.f367754g;
        int i18 = iVar.f367732a;
        qy1.m mVar = b0Var.f367713l;
        this.f367751d = 2;
        if (mVar.a(iVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
