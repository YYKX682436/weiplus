package m20;

/* loaded from: classes11.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f322967d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f322968e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f322969f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f322970g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.finder_feed.flutter.EcsFinderFeedProductFlutterView f322971h;

    /* renamed from: i, reason: collision with root package name */
    public int f322972i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.feature.ecs.product.finder_feed.flutter.EcsFinderFeedProductFlutterView ecsFinderFeedProductFlutterView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f322971h = ecsFinderFeedProductFlutterView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f322970g = obj;
        this.f322972i |= Integer.MIN_VALUE;
        return this.f322971h.d(null, null, this);
    }
}
