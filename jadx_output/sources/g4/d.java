package g4;

/* loaded from: classes5.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268245d;

    /* renamed from: e, reason: collision with root package name */
    public int f268246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.e f268247f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f268248g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f268249h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g4.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268247f = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268245d = obj;
        this.f268246e |= Integer.MIN_VALUE;
        return this.f268247f.emit(null, this);
    }
}
