package v02;

/* loaded from: classes8.dex */
public final class d0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f432242d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f432243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v02.f0 f432244f;

    /* renamed from: g, reason: collision with root package name */
    public int f432245g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(v02.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f432244f = f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f432243e = obj;
        this.f432245g |= Integer.MIN_VALUE;
        return v02.f0.fj(this.f432244f, null, this);
    }
}
