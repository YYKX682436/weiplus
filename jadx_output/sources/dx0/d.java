package dx0;

/* loaded from: classes5.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dx0.g f244426e;

    /* renamed from: f, reason: collision with root package name */
    public int f244427f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dx0.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f244426e = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f244425d = obj;
        this.f244427f |= Integer.MIN_VALUE;
        return dx0.g.a(this.f244426e, null, this);
    }
}
