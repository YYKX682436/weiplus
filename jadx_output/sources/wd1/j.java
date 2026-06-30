package wd1;

/* loaded from: classes7.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f444810d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f444811e;

    /* renamed from: f, reason: collision with root package name */
    public int f444812f;

    /* renamed from: g, reason: collision with root package name */
    public int f444813g;

    /* renamed from: h, reason: collision with root package name */
    public int f444814h;

    /* renamed from: i, reason: collision with root package name */
    public int f444815i;

    /* renamed from: m, reason: collision with root package name */
    public int f444816m;

    /* renamed from: n, reason: collision with root package name */
    public int f444817n;

    /* renamed from: o, reason: collision with root package name */
    public long f444818o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f444819p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ wd1.k f444820q;

    /* renamed from: r, reason: collision with root package name */
    public int f444821r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wd1.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f444820q = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f444819p = obj;
        this.f444821r |= Integer.MIN_VALUE;
        return this.f444820q.b(0, 0, 0, 0, 0, 0, 0L, this);
    }
}
