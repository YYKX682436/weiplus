package zf0;

/* loaded from: classes12.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f472530d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f472531e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f472532f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f472533g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f472534h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f472535i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472536m;

    /* renamed from: n, reason: collision with root package name */
    public int f472537n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(zf0.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f472536m = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f472535i = obj;
        this.f472537n |= Integer.MIN_VALUE;
        return this.f472536m.D(null, this);
    }
}
