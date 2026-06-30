package wt;

/* loaded from: classes12.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f449227d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f449228e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f449229f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f449230g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f449231h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f449232i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f449233m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ wt.i f449234n;

    /* renamed from: o, reason: collision with root package name */
    public int f449235o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(wt.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f449234n = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f449233m = obj;
        this.f449235o |= Integer.MIN_VALUE;
        return this.f449234n.d(null, null, null, this);
    }
}
