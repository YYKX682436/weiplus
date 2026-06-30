package pn4;

/* loaded from: classes14.dex */
public final class c0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357053d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357054e;

    /* renamed from: f, reason: collision with root package name */
    public int f357055f;

    /* renamed from: g, reason: collision with root package name */
    public int f357056g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f357057h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357058i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pn4.e0 f357059m;

    /* renamed from: n, reason: collision with root package name */
    public int f357060n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(pn4.e0 e0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357059m = e0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357058i = obj;
        this.f357060n |= Integer.MIN_VALUE;
        return this.f357059m.a(null, 0, 0, false, this);
    }
}
