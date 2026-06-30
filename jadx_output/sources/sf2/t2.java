package sf2;

/* loaded from: classes10.dex */
public final class t2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f407292e;

    /* renamed from: f, reason: collision with root package name */
    public int f407293f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(sf2.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407292e = d3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407291d = obj;
        this.f407293f |= Integer.MIN_VALUE;
        return this.f407292e.o7(0, null, false, this);
    }
}
