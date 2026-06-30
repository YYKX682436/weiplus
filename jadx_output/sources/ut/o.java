package ut;

/* loaded from: classes12.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430689d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430690e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f430691f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f430692g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430693h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430694i;

    /* renamed from: m, reason: collision with root package name */
    public int f430695m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ut.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430694i = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430693h = obj;
        this.f430695m |= Integer.MIN_VALUE;
        return this.f430694i.U(null, null, null, this);
    }
}
