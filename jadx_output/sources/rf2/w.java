package rf2;

/* loaded from: classes10.dex */
public final class w extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f394925d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f394926e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f394927f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f394928g;

    /* renamed from: h, reason: collision with root package name */
    public int f394929h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(rf2.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f394928g = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f394927f = obj;
        this.f394929h |= Integer.MIN_VALUE;
        return rf2.v0.a(this.f394928g, null, this);
    }
}
