package gw0;

/* loaded from: classes5.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276137d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276138e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f276139f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f276140g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276141h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gw0.e f276142i;

    /* renamed from: m, reason: collision with root package name */
    public int f276143m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gw0.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276142i = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276141h = obj;
        this.f276143m |= Integer.MIN_VALUE;
        return this.f276142i.d(null, null, null, this);
    }
}
