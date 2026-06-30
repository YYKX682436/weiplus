package ms5;

/* loaded from: classes10.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f331139d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f331140e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f331141f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.plugin.finder.detector.api.detect.BaseEventDetector f331142g;

    /* renamed from: h, reason: collision with root package name */
    public int f331143h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.plugin.finder.detector.api.detect.BaseEventDetector baseEventDetector, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f331142g = baseEventDetector;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f331141f = obj;
        this.f331143h |= Integer.MIN_VALUE;
        return this.f331142g.n(null, null, this);
    }
}
