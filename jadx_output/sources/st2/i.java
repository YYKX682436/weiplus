package st2;

/* loaded from: classes3.dex */
public final class i extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f412359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(st2.h1 h1Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f412360e = h1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new st2.i(this.f412360e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((st2.i) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f412359d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.feature.finder.live.z5 z5Var = (com.tencent.mm.feature.finder.live.z5) i95.n0.c(com.tencent.mm.feature.finder.live.z5.class);
            st2.h1 h1Var = this.f412360e;
            android.content.Context context = h1Var.f412333d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            gk2.e eVar = h1Var.f412335f;
            this.f412359d = 1;
            obj = z5Var.Ni(context, 0L, eVar, 1, true, false, this);
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
