package ep1;

/* loaded from: classes14.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f255599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ep1.k f255600e;

    /* renamed from: f, reason: collision with root package name */
    public int f255601f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ep1.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f255600e = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f255599d = obj;
        this.f255601f |= Integer.MIN_VALUE;
        ep1.k.a(this.f255600e, null, null, this);
        return jz5.f0.f302826a;
    }
}
