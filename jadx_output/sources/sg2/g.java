package sg2;

/* loaded from: classes13.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407896d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407897e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407898f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sg2.x f407899g;

    /* renamed from: h, reason: collision with root package name */
    public int f407900h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(sg2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407899g = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407898f = obj;
        this.f407900h |= Integer.MIN_VALUE;
        return this.f407899g.b(null, null, this);
    }
}
