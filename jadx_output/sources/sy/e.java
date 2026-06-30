package sy;

/* loaded from: classes12.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f413800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sy.g f413801e;

    /* renamed from: f, reason: collision with root package name */
    public int f413802f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(sy.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f413801e = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f413800d = obj;
        this.f413802f |= Integer.MIN_VALUE;
        return this.f413801e.U6(null, 0L, this);
    }
}
