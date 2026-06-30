package du3;

/* loaded from: classes3.dex */
public final class a2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f243506d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f243507e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f243508f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ du3.b2 f243509g;

    /* renamed from: h, reason: collision with root package name */
    public int f243510h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(du3.b2 b2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f243509g = b2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f243508f = obj;
        this.f243510h |= Integer.MIN_VALUE;
        return this.f243509g.emit(null, this);
    }
}
