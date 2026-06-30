package g4;

/* loaded from: classes5.dex */
public final class z1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268648d;

    /* renamed from: e, reason: collision with root package name */
    public int f268649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.a2 f268650f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(g4.a2 a2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268650f = a2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268648d = obj;
        this.f268649e |= Integer.MIN_VALUE;
        return this.f268650f.emit(null, this);
    }
}
