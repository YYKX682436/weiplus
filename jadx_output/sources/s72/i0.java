package s72;

/* loaded from: classes12.dex */
public final class i0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f404062d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404063e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f404064f;

    /* renamed from: g, reason: collision with root package name */
    public int f404065g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(s72.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f404064f = j0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f404063e = obj;
        this.f404065g |= Integer.MIN_VALUE;
        return this.f404064f.g7(0, 0, this);
    }
}
