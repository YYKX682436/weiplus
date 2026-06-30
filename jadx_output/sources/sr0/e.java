package sr0;

/* loaded from: classes14.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f411426d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f411427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sr0.f f411428f;

    /* renamed from: g, reason: collision with root package name */
    public int f411429g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(sr0.f fVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f411428f = fVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f411427e = obj;
        this.f411429g |= Integer.MIN_VALUE;
        return sr0.f.H(this.f411428f, this);
    }
}
