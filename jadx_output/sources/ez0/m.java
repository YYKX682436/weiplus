package ez0;

/* loaded from: classes5.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f257824d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f257825e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f257826f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f257827g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f257828h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f257829i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f257830m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ez0.o f257831n;

    /* renamed from: o, reason: collision with root package name */
    public int f257832o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ez0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f257831n = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f257830m = obj;
        this.f257832o |= Integer.MIN_VALUE;
        return this.f257831n.f(this);
    }
}
