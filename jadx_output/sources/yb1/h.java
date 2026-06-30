package yb1;

/* loaded from: classes7.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f460653d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f460654e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f460655f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb1.o f460656g;

    /* renamed from: h, reason: collision with root package name */
    public int f460657h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yb1.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f460656g = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f460655f = obj;
        this.f460657h |= Integer.MIN_VALUE;
        return this.f460656g.c(null, this);
    }
}
