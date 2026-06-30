package p12;

/* loaded from: classes10.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f351028d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f351029e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f351030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p12.w f351031g;

    /* renamed from: h, reason: collision with root package name */
    public int f351032h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p12.w wVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f351031g = wVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f351030f = obj;
        this.f351032h |= Integer.MIN_VALUE;
        return this.f351031g.e(null, this);
    }
}
