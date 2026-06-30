package kt1;

/* loaded from: classes4.dex */
public final class e0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311928d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f311929e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f311930f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f311931g;

    /* renamed from: h, reason: collision with root package name */
    public long f311932h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f311933i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kt1.h0 f311934m;

    /* renamed from: n, reason: collision with root package name */
    public int f311935n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(kt1.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f311934m = h0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f311933i = obj;
        this.f311935n |= Integer.MIN_VALUE;
        return this.f311934m.a(this);
    }
}
