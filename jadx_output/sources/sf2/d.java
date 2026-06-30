package sf2;

/* loaded from: classes10.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407089d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407090e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407091f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.x f407092g;

    /* renamed from: h, reason: collision with root package name */
    public int f407093h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(sf2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407092g = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407091f = obj;
        this.f407093h |= Integer.MIN_VALUE;
        return this.f407092g.b7(null, this);
    }
}
