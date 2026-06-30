package su0;

/* loaded from: classes5.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f412630d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f412631e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f412632f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f412633g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f412634h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ su0.j f412635i;

    /* renamed from: m, reason: collision with root package name */
    public int f412636m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(su0.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f412635i = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f412634h = obj;
        this.f412636m |= Integer.MIN_VALUE;
        return this.f412635i.b(null, null, this);
    }
}
