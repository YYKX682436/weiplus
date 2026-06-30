package df2;

/* loaded from: classes3.dex */
public final class l6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230641d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f230642e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f230643f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f230644g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230645h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ df2.t6 f230646i;

    /* renamed from: m, reason: collision with root package name */
    public int f230647m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(df2.t6 t6Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f230646i = t6Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f230645h = obj;
        this.f230647m |= Integer.MIN_VALUE;
        return df2.t6.a7(this.f230646i, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, null, this);
    }
}
