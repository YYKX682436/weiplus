package ms5;

/* loaded from: classes10.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f331133d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f331134e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f331135f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f331136g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.plugin.finder.detector.api.detect.BaseEventDetector f331137h;

    /* renamed from: i, reason: collision with root package name */
    public int f331138i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.plugin.finder.detector.api.detect.BaseEventDetector baseEventDetector, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f331137h = baseEventDetector;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f331136g = obj;
        this.f331138i |= Integer.MIN_VALUE;
        return com.tencent.plugin.finder.detector.api.detect.BaseEventDetector.b(this.f331137h, null, this);
    }
}
