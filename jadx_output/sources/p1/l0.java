package p1;

/* loaded from: classes14.dex */
public final class l0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f350845d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1.o0 f350847f;

    /* renamed from: g, reason: collision with root package name */
    public int f350848g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(p1.o0 o0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f350847f = o0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f350846e = obj;
        this.f350848g |= Integer.MIN_VALUE;
        return this.f350847f.i(0L, null, this);
    }
}
