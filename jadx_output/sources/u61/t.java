package u61;

/* loaded from: classes4.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f424931d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f424932e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f424933f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f424934g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u61.u f424935h;

    /* renamed from: i, reason: collision with root package name */
    public int f424936i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u61.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f424935h = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f424934g = obj;
        this.f424936i |= Integer.MIN_VALUE;
        return this.f424935h.Bi(null, null, this);
    }
}
