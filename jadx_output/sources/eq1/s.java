package eq1;

/* loaded from: classes.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f255858d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f255859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eq1.u f255860f;

    /* renamed from: g, reason: collision with root package name */
    public int f255861g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(eq1.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f255860f = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f255859e = obj;
        this.f255861g |= Integer.MIN_VALUE;
        java.lang.Object c17 = this.f255860f.c(this);
        return c17 == pz5.a.f359186d ? c17 : kotlin.Result.m520boximpl(c17);
    }
}
