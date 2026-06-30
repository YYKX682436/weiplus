package g4;

/* loaded from: classes5.dex */
public final class h2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268349d;

    /* renamed from: e, reason: collision with root package name */
    public int f268350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.i2 f268351f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(g4.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268351f = i2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268349d = obj;
        this.f268350e |= Integer.MIN_VALUE;
        return this.f268351f.emit(null, this);
    }
}
