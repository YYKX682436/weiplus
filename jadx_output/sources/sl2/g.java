package sl2;

/* loaded from: classes10.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f409245d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f409246e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f409247f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f409248g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sl2.h f409249h;

    /* renamed from: i, reason: collision with root package name */
    public int f409250i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(sl2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f409249h = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f409248g = obj;
        this.f409250i |= Integer.MIN_VALUE;
        return this.f409249h.a(null, null, this);
    }
}
