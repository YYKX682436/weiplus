package te2;

/* loaded from: classes3.dex */
public final class o1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f418267d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f418268e;

    /* renamed from: f, reason: collision with root package name */
    public int f418269f;

    /* renamed from: g, reason: collision with root package name */
    public int f418270g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f418271h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f418272i;

    /* renamed from: m, reason: collision with root package name */
    public int f418273m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(te2.p1 p1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f418272i = p1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f418271h = obj;
        this.f418273m |= Integer.MIN_VALUE;
        return this.f418272i.z(0, null, null, 0, this);
    }
}
