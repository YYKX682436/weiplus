package df2;

/* loaded from: classes10.dex */
public final class o9 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230938d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f230939e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f230940f;

    /* renamed from: g, reason: collision with root package name */
    public int f230941g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230942h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ df2.t9 f230943i;

    /* renamed from: m, reason: collision with root package name */
    public int f230944m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(df2.t9 t9Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f230943i = t9Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f230942h = obj;
        this.f230944m |= Integer.MIN_VALUE;
        return this.f230943i.G6(null, this);
    }
}
