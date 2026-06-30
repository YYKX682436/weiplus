package gc0;

/* loaded from: classes5.dex */
public final class w0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f270332d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f270333e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f270334f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f270335g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270336h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gc0.y0 f270337i;

    /* renamed from: m, reason: collision with root package name */
    public int f270338m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(gc0.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270337i = y0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f270336h = obj;
        this.f270338m |= Integer.MIN_VALUE;
        return this.f270337i.b(null, false, false, this);
    }
}
