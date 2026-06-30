package tr0;

/* loaded from: classes14.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f421324d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f421325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tr0.t f421326f;

    /* renamed from: g, reason: collision with root package name */
    public int f421327g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(tr0.t tVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f421326f = tVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f421325e = obj;
        this.f421327g |= Integer.MIN_VALUE;
        return this.f421326f.q(this);
    }
}
