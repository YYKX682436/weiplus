package gb2;

/* loaded from: classes2.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f270001d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f270002e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gb2.b f270004g;

    /* renamed from: h, reason: collision with root package name */
    public int f270005h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gb2.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270004g = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f270003f = obj;
        this.f270005h |= Integer.MIN_VALUE;
        return this.f270004g.b(this);
    }
}
