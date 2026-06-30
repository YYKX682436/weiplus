package g4;

/* loaded from: classes5.dex */
public final class r3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268536d;

    /* renamed from: e, reason: collision with root package name */
    public int f268537e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f268538f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g4.s3 f268539g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(g4.s3 s3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268539g = s3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268536d = obj;
        this.f268537e |= Integer.MIN_VALUE;
        return this.f268539g.emit(null, this);
    }
}
