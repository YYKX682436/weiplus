package ut;

/* loaded from: classes12.dex */
public final class p0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430705d;

    /* renamed from: e, reason: collision with root package name */
    public long f430706e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430708g;

    /* renamed from: h, reason: collision with root package name */
    public int f430709h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ut.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430708g = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430707f = obj;
        this.f430709h |= Integer.MIN_VALUE;
        return this.f430708g.h0(this);
    }
}
