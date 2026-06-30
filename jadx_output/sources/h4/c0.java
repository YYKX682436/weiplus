package h4;

/* loaded from: classes14.dex */
public final class c0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f278631d;

    /* renamed from: e, reason: collision with root package name */
    public int f278632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.d0 f278633f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f278634g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(h4.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f278633f = d0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f278631d = obj;
        this.f278632e |= Integer.MIN_VALUE;
        return this.f278633f.emit(null, this);
    }
}
