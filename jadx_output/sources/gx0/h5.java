package gx0;

/* loaded from: classes5.dex */
public final class h5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276492d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276493e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f276494f;

    /* renamed from: g, reason: collision with root package name */
    public int f276495g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276496h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276497i;

    /* renamed from: m, reason: collision with root package name */
    public int f276498m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276497i = w8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276496h = obj;
        this.f276498m |= Integer.MIN_VALUE;
        return gx0.w8.c7(this.f276497i, this);
    }
}
