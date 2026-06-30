package sr0;

/* loaded from: classes14.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f411404d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f411405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sr0.f f411406f;

    /* renamed from: g, reason: collision with root package name */
    public int f411407g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sr0.f fVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f411406f = fVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f411405e = obj;
        this.f411407g |= Integer.MIN_VALUE;
        return sr0.f.D(this.f411406f, this);
    }
}
