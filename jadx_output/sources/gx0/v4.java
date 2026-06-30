package gx0;

/* loaded from: classes5.dex */
public final class v4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f277050d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f277051e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f277052f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.x4 f277053g;

    /* renamed from: h, reason: collision with root package name */
    public int f277054h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(gx0.x4 x4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f277053g = x4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f277052f = obj;
        this.f277054h |= Integer.MIN_VALUE;
        return this.f277053g.x7(false, this);
    }
}
