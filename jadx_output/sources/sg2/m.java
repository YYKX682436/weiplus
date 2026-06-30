package sg2;

/* loaded from: classes13.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407918d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sg2.x f407920f;

    /* renamed from: g, reason: collision with root package name */
    public int f407921g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(sg2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407920f = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407919e = obj;
        this.f407921g |= Integer.MIN_VALUE;
        return this.f407920f.f(null, this);
    }
}
