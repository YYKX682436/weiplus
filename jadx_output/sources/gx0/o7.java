package gx0;

/* loaded from: classes5.dex */
public final class o7 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276791e;

    /* renamed from: f, reason: collision with root package name */
    public int f276792f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276791e = w8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276790d = obj;
        this.f276792f |= Integer.MIN_VALUE;
        return this.f276791e.F7(this);
    }
}
