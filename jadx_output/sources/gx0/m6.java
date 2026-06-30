package gx0;

/* loaded from: classes5.dex */
public final class m6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276701d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276702e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f276703f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f276704g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f276705h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f276706i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f276707m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f276708n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276709o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276710p;

    /* renamed from: q, reason: collision with root package name */
    public int f276711q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276710p = w8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276709o = obj;
        this.f276711q |= Integer.MIN_VALUE;
        return gx0.w8.h7(this.f276710p, null, null, null, null, null, null, null, false, this);
    }
}
