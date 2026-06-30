package s72;

/* loaded from: classes12.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f404073d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f404075f;

    /* renamed from: g, reason: collision with root package name */
    public int f404076g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(s72.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f404075f = j0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f404074e = obj;
        this.f404076g |= Integer.MIN_VALUE;
        return this.f404075f.V6(this);
    }
}
