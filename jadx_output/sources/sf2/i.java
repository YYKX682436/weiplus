package sf2;

/* loaded from: classes10.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407160d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407161e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.x f407163g;

    /* renamed from: h, reason: collision with root package name */
    public int f407164h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(sf2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407163g = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407162f = obj;
        this.f407164h |= Integer.MIN_VALUE;
        return this.f407163g.d7(null, null, null, this);
    }
}
