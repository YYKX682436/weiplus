package nu0;

/* loaded from: classes5.dex */
public final class j0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f339977d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f339978e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f339979f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f339980g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f339981h;

    /* renamed from: i, reason: collision with root package name */
    public int f339982i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(nu0.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f339981h = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f339980g = obj;
        this.f339982i |= Integer.MIN_VALUE;
        return this.f339981h.h7(null, null, this);
    }
}
