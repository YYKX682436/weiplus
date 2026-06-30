package yx0;

/* loaded from: classes5.dex */
public final class u1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467675d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467676e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467677f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467678g;

    /* renamed from: h, reason: collision with root package name */
    public int f467679h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467678g = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467677f = obj;
        this.f467679h |= Integer.MIN_VALUE;
        return this.f467678g.C(null, null, this);
    }
}
