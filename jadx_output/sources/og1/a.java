package og1;

/* loaded from: classes7.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f345120d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f345121e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f345122f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f345123g;

    /* renamed from: h, reason: collision with root package name */
    public long f345124h;

    /* renamed from: i, reason: collision with root package name */
    public long f345125i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f345126m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ og1.c f345127n;

    /* renamed from: o, reason: collision with root package name */
    public int f345128o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(og1.c cVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f345127n = cVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f345126m = obj;
        this.f345128o |= Integer.MIN_VALUE;
        return og1.c.h(this.f345127n, this);
    }
}
