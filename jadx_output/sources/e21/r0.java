package e21;

/* loaded from: classes11.dex */
public final class r0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f246573d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f246574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e21.z0 f246575f;

    /* renamed from: g, reason: collision with root package name */
    public int f246576g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(e21.z0 z0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f246575f = z0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f246574e = obj;
        this.f246576g |= Integer.MIN_VALUE;
        return e21.z0.b(this.f246575f, this);
    }
}
