package hg2;

/* loaded from: classes3.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f281375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f281376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f281377f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z17, com.tencent.mm.plugin.finder.live.view.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f281376e = z17;
        this.f281377f = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hg2.n(this.f281376e, this.f281377f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hg2.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f281375d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.assist.z3 z3Var = com.tencent.mm.plugin.finder.assist.z3.f102747a;
            this.f281375d = 1;
            obj = z3Var.a(524288, this.f281376e, this.f281377f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
