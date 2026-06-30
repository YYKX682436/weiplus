package ee5;

/* loaded from: classes9.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f251844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f251845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ae5.g f251846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f251847g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(android.view.View view, ae5.g gVar, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251845e = view;
        this.f251846f = gVar;
        this.f251847g = f9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ee5.c2(this.f251845e, this.f251846f, this.f251847g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.c2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f251844d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
            android.content.Context context = this.f251845e.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String str = this.f251846f.f4401e;
            if (str == null) {
                str = "";
            }
            com.tencent.mm.storage.f9 f9Var = this.f251847g;
            bw5.x8 x8Var = bw5.x8.ECS_REQ_SCENE_SEARCH;
            this.f251844d = 1;
            if (((b00.r) z2Var).hj(context, str, f9Var, x8Var, this) == aVar) {
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
