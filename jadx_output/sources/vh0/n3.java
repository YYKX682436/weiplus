package vh0;

/* loaded from: classes8.dex */
public final class n3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f436918d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f436919e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f436920f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f436921g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vh0.p3 f436922h;

    /* renamed from: i, reason: collision with root package name */
    public int f436923i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(vh0.p3 p3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f436922h = p3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f436921g = obj;
        this.f436923i |= Integer.MIN_VALUE;
        return vh0.p3.Zi(this.f436922h, false, this);
    }
}
