package nu0;

/* loaded from: classes5.dex */
public final class j2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f339984d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f339985e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f339986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339987g;

    /* renamed from: h, reason: collision with root package name */
    public int f339988h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f339987g = b4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f339986f = obj;
        this.f339988h |= Integer.MIN_VALUE;
        return nu0.b4.b7(this.f339987g, null, null, this);
    }
}
