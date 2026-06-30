package sf2;

/* loaded from: classes10.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407218d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407219e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407220f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.x f407221g;

    /* renamed from: h, reason: collision with root package name */
    public int f407222h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(sf2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407221g = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407220f = obj;
        this.f407222h |= Integer.MIN_VALUE;
        return this.f407221g.l7(null, this);
    }
}
