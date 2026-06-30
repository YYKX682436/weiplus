package jg0;

/* loaded from: classes12.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f299543d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f299544e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f299545f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f299546g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f299547h;

    /* renamed from: i, reason: collision with root package name */
    public int f299548i;

    /* renamed from: m, reason: collision with root package name */
    public int f299549m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f299550n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299551o;

    /* renamed from: p, reason: collision with root package name */
    public int f299552p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jg0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f299551o = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f299550n = obj;
        this.f299552p |= Integer.MIN_VALUE;
        return jg0.x.w(this.f299551o, null, null, 0, 0, null, this);
    }
}
