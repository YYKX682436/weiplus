package m20;

/* loaded from: classes10.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f322977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f322978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.flutter.EcsFinderFeedProductFlutterView f322979f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(pi0.l1 l1Var, com.tencent.mm.feature.ecs.product.finder_feed.flutter.EcsFinderFeedProductFlutterView ecsFinderFeedProductFlutterView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f322978e = l1Var;
        this.f322979f = ecsFinderFeedProductFlutterView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new m20.h(this.f322978e, this.f322979f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((m20.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f322977d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f322977d = 1;
            if (this.f322978e.h(this.f322979f, this) == aVar) {
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
