package x65;

/* loaded from: classes12.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f452335d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f452336e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f452337f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f452338g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x65.l f452339h;

    /* renamed from: i, reason: collision with root package name */
    public int f452340i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x65.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f452339h = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f452338g = obj;
        this.f452340i |= Integer.MIN_VALUE;
        return x65.l.d(this.f452339h, null, this);
    }
}
