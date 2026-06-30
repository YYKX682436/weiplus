package g6;

/* loaded from: classes14.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f269020d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f269021e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f269022f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f269023g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f269024h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g6.c f269025i;

    /* renamed from: m, reason: collision with root package name */
    public int f269026m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g6.c cVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f269025i = cVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f269024h = obj;
        this.f269026m |= Integer.MIN_VALUE;
        return this.f269025i.a(null, null, this);
    }
}
