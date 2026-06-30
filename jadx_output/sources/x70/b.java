package x70;

/* loaded from: classes12.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f452399d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f452400e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f452401f;

    /* renamed from: g, reason: collision with root package name */
    public long f452402g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f452403h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x70.g f452404i;

    /* renamed from: m, reason: collision with root package name */
    public int f452405m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x70.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f452404i = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f452403h = obj;
        this.f452405m |= Integer.MIN_VALUE;
        return this.f452404i.T6(null, this);
    }
}
