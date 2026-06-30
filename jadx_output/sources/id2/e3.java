package id2;

/* loaded from: classes3.dex */
public final class e3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f290548d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f290549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290550f;

    /* renamed from: g, reason: collision with root package name */
    public int f290551g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(id2.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f290550f = u3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f290549e = obj;
        this.f290551g |= Integer.MIN_VALUE;
        return id2.u3.P6(this.f290550f, null, this);
    }
}
