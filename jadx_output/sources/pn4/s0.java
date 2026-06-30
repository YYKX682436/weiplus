package pn4;

/* loaded from: classes14.dex */
public final class s0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f357218d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn4.t0 f357220f;

    /* renamed from: g, reason: collision with root package name */
    public int f357221g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(pn4.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357220f = t0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357219e = obj;
        this.f357221g |= Integer.MIN_VALUE;
        return this.f357220f.c(null, 0, 0, this);
    }
}
