package kp;

/* loaded from: classes13.dex */
public final class v extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310845e;

    /* renamed from: f, reason: collision with root package name */
    public int f310846f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kp.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310845e = i1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310844d = obj;
        this.f310846f |= Integer.MIN_VALUE;
        return this.f310845e.Ai(null, null, 0L, this);
    }
}
