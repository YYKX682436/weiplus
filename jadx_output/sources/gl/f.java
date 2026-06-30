package gl;

/* loaded from: classes14.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f272739d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f272740e;

    /* renamed from: f, reason: collision with root package name */
    public int f272741f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f272742g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gl.i f272743h;

    /* renamed from: i, reason: collision with root package name */
    public int f272744i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(gl.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f272743h = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f272742g = obj;
        this.f272744i |= Integer.MIN_VALUE;
        return this.f272743h.cj(0, null, this);
    }
}
