package g4;

/* loaded from: classes5.dex */
public final class s2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268550d;

    /* renamed from: e, reason: collision with root package name */
    public int f268551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.t2 f268552f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(g4.t2 t2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268552f = t2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268550d = obj;
        this.f268551e |= Integer.MIN_VALUE;
        return this.f268552f.emit(null, this);
    }
}
