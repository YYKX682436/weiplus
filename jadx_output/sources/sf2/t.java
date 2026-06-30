package sf2;

/* loaded from: classes10.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407279d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407280e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.x f407282g;

    /* renamed from: h, reason: collision with root package name */
    public int f407283h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(sf2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407282g = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407281f = obj;
        this.f407283h |= Integer.MIN_VALUE;
        return this.f407282g.p7(null, null, this);
    }
}
