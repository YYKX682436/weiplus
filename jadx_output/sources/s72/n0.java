package s72;

/* loaded from: classes12.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f404108d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404109e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s72.p0 f404110f;

    /* renamed from: g, reason: collision with root package name */
    public int f404111g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(s72.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f404110f = p0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f404109e = obj;
        this.f404111g |= Integer.MIN_VALUE;
        return this.f404110f.W6(this);
    }
}
