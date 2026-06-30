package g0;

/* loaded from: classes14.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f267342d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f267343e;

    /* renamed from: f, reason: collision with root package name */
    public int f267344f;

    /* renamed from: g, reason: collision with root package name */
    public int f267345g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f267346h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g0.h f267347i;

    /* renamed from: m, reason: collision with root package name */
    public int f267348m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g0.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f267347i = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f267346h = obj;
        this.f267348m |= Integer.MIN_VALUE;
        return this.f267347i.a(null, this);
    }
}
