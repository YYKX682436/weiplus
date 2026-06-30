package qw1;

/* loaded from: classes14.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f367099d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f367100e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f367101f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f367102g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f367103h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f367104i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f367105m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ qw1.j f367106n;

    /* renamed from: o, reason: collision with root package name */
    public int f367107o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(qw1.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f367106n = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f367105m = obj;
        this.f367107o |= Integer.MIN_VALUE;
        return this.f367106n.c(null, this);
    }
}
