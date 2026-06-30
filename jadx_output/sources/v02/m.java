package v02;

/* loaded from: classes8.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f432265d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f432266e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f432267f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v02.f0 f432268g;

    /* renamed from: h, reason: collision with root package name */
    public int f432269h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(v02.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f432268g = f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f432267f = obj;
        this.f432269h |= Integer.MIN_VALUE;
        return v02.f0.Zi(this.f432268g, null, this);
    }
}
