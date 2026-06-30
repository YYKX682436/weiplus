package sf2;

/* loaded from: classes10.dex */
public final class m2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407213d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407214e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407215f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f407216g;

    /* renamed from: h, reason: collision with root package name */
    public int f407217h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(sf2.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407216g = d3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407215f = obj;
        this.f407217h |= Integer.MIN_VALUE;
        return this.f407216g.k7(0, 0, false, this);
    }
}
