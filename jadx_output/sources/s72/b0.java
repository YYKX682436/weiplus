package s72;

/* loaded from: classes12.dex */
public final class b0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f403993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f403994e;

    /* renamed from: f, reason: collision with root package name */
    public int f403995f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(s72.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f403994e = j0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f403993d = obj;
        this.f403995f |= Integer.MIN_VALUE;
        return this.f403994e.c7(this);
    }
}
