package yx0;

/* loaded from: classes5.dex */
public final class u4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467683d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467684e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467686g;

    /* renamed from: h, reason: collision with root package name */
    public int f467687h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467686g = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467685f = obj;
        this.f467687h |= Integer.MIN_VALUE;
        return yx0.b8.k(this.f467686g, null, null, this);
    }
}
