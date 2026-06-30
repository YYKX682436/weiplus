package g4;

/* loaded from: classes5.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268449d;

    /* renamed from: e, reason: collision with root package name */
    public int f268450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.o0 f268451f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f268452g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f268453h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(g4.o0 o0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268451f = o0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268449d = obj;
        this.f268450e |= Integer.MIN_VALUE;
        return this.f268451f.emit(null, this);
    }
}
