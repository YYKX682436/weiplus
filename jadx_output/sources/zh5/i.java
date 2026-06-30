package zh5;

/* loaded from: classes12.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f473029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh5.k f473030e;

    /* renamed from: f, reason: collision with root package name */
    public int f473031f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(zh5.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f473030e = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f473029d = obj;
        this.f473031f |= Integer.MIN_VALUE;
        return this.f473030e.b(null, this);
    }
}
