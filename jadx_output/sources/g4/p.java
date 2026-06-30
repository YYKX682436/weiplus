package g4;

/* loaded from: classes5.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268476d;

    /* renamed from: e, reason: collision with root package name */
    public int f268477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.q f268478f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g4.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268478f = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268476d = obj;
        this.f268477e |= Integer.MIN_VALUE;
        return this.f268478f.emit(null, this);
    }
}
