package g4;

/* loaded from: classes5.dex */
public final class b0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268206d;

    /* renamed from: e, reason: collision with root package name */
    public int f268207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.c0 f268208f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g4.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268208f = c0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268206d = obj;
        this.f268207e |= Integer.MIN_VALUE;
        return this.f268208f.emit(null, this);
    }
}
