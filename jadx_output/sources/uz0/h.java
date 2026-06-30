package uz0;

/* loaded from: classes14.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f432116d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f432117e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f432118f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f432119g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f432120h;

    /* renamed from: i, reason: collision with root package name */
    public int f432121i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f432122m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ uz0.n f432123n;

    /* renamed from: o, reason: collision with root package name */
    public int f432124o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(uz0.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f432123n = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f432122m = obj;
        this.f432124o |= Integer.MIN_VALUE;
        return this.f432123n.d(null, null, 0, 0.0f, false, this);
    }
}
