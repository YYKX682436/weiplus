package gx0;

/* loaded from: classes5.dex */
public final class f8 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276408d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276409e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f276410f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f276411g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f276412h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276413i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276414m;

    /* renamed from: n, reason: collision with root package name */
    public int f276415n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276414m = w8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276413i = obj;
        this.f276415n |= Integer.MIN_VALUE;
        return gx0.w8.n7(this.f276414m, null, null, null, null, this);
    }
}
