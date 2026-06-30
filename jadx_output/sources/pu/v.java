package pu;

/* loaded from: classes5.dex */
public final class v extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358389d;

    /* renamed from: e, reason: collision with root package name */
    public int f358390e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pu.f0 f358392g;

    /* renamed from: h, reason: collision with root package name */
    public int f358393h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(pu.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f358392g = f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f358391f = obj;
        this.f358393h |= Integer.MIN_VALUE;
        return this.f358392g.T6(null, this);
    }
}
