package df2;

/* loaded from: classes3.dex */
public final class a1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f229653d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f229654e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f229655f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.d1 f229656g;

    /* renamed from: h, reason: collision with root package name */
    public int f229657h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(df2.d1 d1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f229656g = d1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f229655f = obj;
        this.f229657h |= Integer.MIN_VALUE;
        return this.f229656g.c7(null, 0, 0L, this);
    }
}
