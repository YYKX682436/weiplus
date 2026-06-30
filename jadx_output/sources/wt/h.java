package wt;

/* loaded from: classes12.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f449240d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f449241e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f449242f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wt.i f449243g;

    /* renamed from: h, reason: collision with root package name */
    public int f449244h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(wt.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f449243g = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f449242f = obj;
        this.f449244h |= Integer.MIN_VALUE;
        return this.f449243g.f(null, null, this);
    }
}
