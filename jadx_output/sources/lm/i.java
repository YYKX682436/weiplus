package lm;

/* loaded from: classes12.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f319307d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f319308e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f319309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lm.r f319310g;

    /* renamed from: h, reason: collision with root package name */
    public int f319311h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(lm.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f319310g = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f319309f = obj;
        this.f319311h |= Integer.MIN_VALUE;
        return this.f319310g.Zi(null, 0L, null, this);
    }
}
