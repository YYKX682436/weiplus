package rx3;

/* loaded from: classes10.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f401037d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f401038e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f401039f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f401040g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rx3.s f401041h;

    /* renamed from: i, reason: collision with root package name */
    public int f401042i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(rx3.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f401041h = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f401040g = obj;
        this.f401042i |= Integer.MIN_VALUE;
        return this.f401041h.c(null, this);
    }
}
