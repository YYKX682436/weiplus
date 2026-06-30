package l20;

/* loaded from: classes9.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f315181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.flutter.EcsFinderFeedProductFlutterView f315182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f315183f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.EcsProductContainerView f315184g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.feature.ecs.product.finder_feed.flutter.EcsFinderFeedProductFlutterView ecsFinderFeedProductFlutterView, androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.feature.ecs.product.finder_feed.EcsProductContainerView ecsProductContainerView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f315182e = ecsFinderFeedProductFlutterView;
        this.f315183f = appCompatActivity;
        this.f315184g = ecsProductContainerView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new l20.n0(this.f315182e, this.f315183f, this.f315184g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((l20.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.feature.ecs.product.finder_feed.EcsProductContainerView ecsProductContainerView = this.f315184g;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f315183f;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f315181d;
        com.tencent.mm.feature.ecs.product.finder_feed.flutter.EcsFinderFeedProductFlutterView ecsFinderFeedProductFlutterView = this.f315182e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.lifecycle.o mo133getLifecycle = appCompatActivity.mo133getLifecycle();
                kotlin.jvm.internal.o.f(mo133getLifecycle, "getLifecycle(...)");
                this.f315181d = 1;
                if (ecsFinderFeedProductFlutterView.d(mo133getLifecycle, appCompatActivity, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.tencent.mars.xlog.Log.i("EcsProductContainerView", "Flutter View initialized successfully");
            if (ecsProductContainerView.get_naviHeight() > 0) {
                ecsFinderFeedProductFlutterView.setNaviHeight(ecsProductContainerView.get_naviHeight());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("EcsProductContainerView", "Flutter View initialization failed: " + e17.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
