package sf2;

/* loaded from: classes10.dex */
public final class v2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f407324e;

    /* renamed from: f, reason: collision with root package name */
    public int f407325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(sf2.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407324e = d3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407323d = obj;
        this.f407325f |= Integer.MIN_VALUE;
        return this.f407324e.s7(null, null, null, false, null, this);
    }
}
