package jq5;

/* loaded from: classes5.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f301263d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f301264e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f301265f;

    /* renamed from: g, reason: collision with root package name */
    public int f301266g;

    /* renamed from: h, reason: collision with root package name */
    public int f301267h;

    /* renamed from: i, reason: collision with root package name */
    public int f301268i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f301269m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ jq5.l f301270n;

    /* renamed from: o, reason: collision with root package name */
    public int f301271o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(jq5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f301270n = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f301269m = obj;
        this.f301271o |= Integer.MIN_VALUE;
        return this.f301270n.g(null, this);
    }
}
