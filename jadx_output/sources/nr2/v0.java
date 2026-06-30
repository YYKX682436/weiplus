package nr2;

/* loaded from: classes2.dex */
public final class v0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f339322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr2.i1 f339323e;

    /* renamed from: f, reason: collision with root package name */
    public int f339324f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(nr2.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f339323e = i1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f339322d = obj;
        this.f339324f |= Integer.MIN_VALUE;
        java.lang.Object a17 = nr2.i1.a(this.f339323e, null, this);
        return a17 == pz5.a.f359186d ? a17 : kotlin.Result.m520boximpl(a17);
    }
}
