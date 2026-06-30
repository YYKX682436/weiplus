package mx0;

/* loaded from: classes5.dex */
public final class e0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f331926d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f331927e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f331928f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f331929g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f331930h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f331931i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f331932m;

    /* renamed from: n, reason: collision with root package name */
    public int f331933n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(mx0.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f331932m = e1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f331931i = obj;
        this.f331933n |= Integer.MIN_VALUE;
        return mx0.e1.a(this.f331932m, null, null, null, null, this);
    }
}
