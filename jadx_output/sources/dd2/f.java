package dd2;

/* loaded from: classes2.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f228961d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f228962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dd2.g f228963f;

    /* renamed from: g, reason: collision with root package name */
    public int f228964g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(dd2.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f228963f = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f228962e = obj;
        this.f228964g |= Integer.MIN_VALUE;
        return this.f228963f.a(this);
    }
}
