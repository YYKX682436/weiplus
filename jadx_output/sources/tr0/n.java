package tr0;

/* loaded from: classes14.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f421328d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f421329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tr0.t f421330f;

    /* renamed from: g, reason: collision with root package name */
    public int f421331g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(tr0.t tVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f421330f = tVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f421329e = obj;
        this.f421331g |= Integer.MIN_VALUE;
        return this.f421330f.p(this);
    }
}
