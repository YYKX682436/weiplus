package kd2;

/* loaded from: classes10.dex */
public final class r0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f306818d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f306819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kd2.p1 f306820f;

    /* renamed from: g, reason: collision with root package name */
    public int f306821g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(kd2.p1 p1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f306820f = p1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f306819e = obj;
        this.f306821g |= Integer.MIN_VALUE;
        return this.f306820f.x0(false, false, false, null, false, this);
    }
}
