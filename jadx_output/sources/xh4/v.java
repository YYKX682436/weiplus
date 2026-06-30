package xh4;

/* loaded from: classes.dex */
public final class v extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f454636d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f454637e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f454638f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f454639g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xh4.x f454640h;

    /* renamed from: i, reason: collision with root package name */
    public int f454641i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(xh4.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f454640h = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f454639g = obj;
        this.f454641i |= Integer.MIN_VALUE;
        return xh4.x.a(this.f454640h, null, this);
    }
}
