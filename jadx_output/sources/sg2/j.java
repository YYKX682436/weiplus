package sg2;

/* loaded from: classes13.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407905d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407906e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sg2.x f407908g;

    /* renamed from: h, reason: collision with root package name */
    public int f407909h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(sg2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407908g = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407907f = obj;
        this.f407909h |= Integer.MIN_VALUE;
        return this.f407908g.c(null, this);
    }
}
