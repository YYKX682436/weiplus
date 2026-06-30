package yq3;

/* loaded from: classes11.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f464520d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f464521e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f464522f;

    /* renamed from: g, reason: collision with root package name */
    public long f464523g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f464524h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yq3.v f464525i;

    /* renamed from: m, reason: collision with root package name */
    public int f464526m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(yq3.v vVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f464525i = vVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f464524h = obj;
        this.f464526m |= Integer.MIN_VALUE;
        return this.f464525i.r(null, this);
    }
}
