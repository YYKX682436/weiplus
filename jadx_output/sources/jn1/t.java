package jn1;

/* loaded from: classes12.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f300522d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f300523e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f300524f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f300525g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f300526h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f300527i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f300528m;

    /* renamed from: n, reason: collision with root package name */
    public int f300529n;

    /* renamed from: o, reason: collision with root package name */
    public long f300530o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f300531p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ jn1.u f300532q;

    /* renamed from: r, reason: collision with root package name */
    public int f300533r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(jn1.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f300532q = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f300531p = obj;
        this.f300533r |= Integer.MIN_VALUE;
        return this.f300532q.i(null, null, this);
    }
}
