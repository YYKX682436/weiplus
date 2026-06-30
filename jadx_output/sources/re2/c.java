package re2;

/* loaded from: classes4.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f394367d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f394368e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f394369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ re2.f f394370g;

    /* renamed from: h, reason: collision with root package name */
    public int f394371h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(re2.f fVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f394370g = fVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f394369f = obj;
        this.f394371h |= Integer.MIN_VALUE;
        return re2.f.b(this.f394370g, null, this);
    }
}
