package tn0;

/* loaded from: classes3.dex */
public final class j0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f420686d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f420687e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f420688f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f420689g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f420690h;

    /* renamed from: i, reason: collision with root package name */
    public int f420691i;

    /* renamed from: m, reason: collision with root package name */
    public int f420692m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f420693n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420694o;

    /* renamed from: p, reason: collision with root package name */
    public int f420695p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(tn0.w0 w0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f420694o = w0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f420693n = obj;
        this.f420695p |= Integer.MIN_VALUE;
        return this.f420694o.E0(false, null, this);
    }
}
