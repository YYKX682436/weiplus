package st2;

/* loaded from: classes3.dex */
public final class a2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f412214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.c2 f412215e;

    /* renamed from: f, reason: collision with root package name */
    public int f412216f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(st2.c2 c2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f412215e = c2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f412214d = obj;
        this.f412216f |= Integer.MIN_VALUE;
        return this.f412215e.i(null, null, null, false, this);
    }
}
