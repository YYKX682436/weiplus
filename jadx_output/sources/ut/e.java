package ut;

/* loaded from: classes12.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430609d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ut.f f430611f;

    /* renamed from: g, reason: collision with root package name */
    public int f430612g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ut.f fVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430611f = fVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430610e = obj;
        this.f430612g |= Integer.MIN_VALUE;
        return this.f430611f.T6(null, this);
    }
}
