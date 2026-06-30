package g4;

/* loaded from: classes5.dex */
public final class u1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268579d;

    /* renamed from: e, reason: collision with root package name */
    public int f268580e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.x1 f268581f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f268582g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f268583h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(g4.x1 x1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268581f = x1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268579d = obj;
        this.f268580e |= Integer.MIN_VALUE;
        return this.f268581f.a(null, this);
    }
}
