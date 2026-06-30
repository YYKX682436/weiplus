package g4;

/* loaded from: classes5.dex */
public final class v4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268592d;

    /* renamed from: e, reason: collision with root package name */
    public int f268593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.w4 f268594f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(g4.w4 w4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268594f = w4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268592d = obj;
        this.f268593e |= Integer.MIN_VALUE;
        return this.f268594f.a(null, this);
    }
}
