package lu3;

/* loaded from: classes10.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f321407d;

    /* renamed from: e, reason: collision with root package name */
    public int f321408e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f321409f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f321410g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ lu3.m f321411h;

    /* renamed from: i, reason: collision with root package name */
    public int f321412i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(lu3.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f321411h = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f321410g = obj;
        this.f321412i |= Integer.MIN_VALUE;
        return this.f321411h.i(0, false, this);
    }
}
