package g4;

/* loaded from: classes5.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268423d;

    /* renamed from: e, reason: collision with root package name */
    public int f268424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.n f268425f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g4.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268425f = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268423d = obj;
        this.f268424e |= Integer.MIN_VALUE;
        return this.f268425f.emit(null, this);
    }
}
