package p1;

/* loaded from: classes14.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1.o0 f350857e;

    /* renamed from: f, reason: collision with root package name */
    public int f350858f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p1.o0 o0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f350857e = o0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f350856d = obj;
        this.f350858f |= Integer.MIN_VALUE;
        return this.f350857e.j(0L, null, this);
    }
}
