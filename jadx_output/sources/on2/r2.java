package on2;

/* loaded from: classes3.dex */
public final class r2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f347001d;

    /* renamed from: e, reason: collision with root package name */
    public int f347002e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f347003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ on2.z2 f347004g;

    /* renamed from: h, reason: collision with root package name */
    public int f347005h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(on2.z2 z2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f347004g = z2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f347003f = obj;
        this.f347005h |= Integer.MIN_VALUE;
        return this.f347004g.Y6(0, this);
    }
}
