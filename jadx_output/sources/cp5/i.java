package cp5;

/* loaded from: classes14.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f221154d;

    /* renamed from: e, reason: collision with root package name */
    public int f221155e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f221156f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cp5.j f221157g;

    /* renamed from: h, reason: collision with root package name */
    public int f221158h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(cp5.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f221157g = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f221156f = obj;
        this.f221158h |= Integer.MIN_VALUE;
        return this.f221157g.a(0, this);
    }
}
