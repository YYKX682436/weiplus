package fl2;

/* loaded from: classes10.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f263908d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f263909e;

    /* renamed from: f, reason: collision with root package name */
    public int f263910f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f263911g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fl2.e f263912h;

    /* renamed from: i, reason: collision with root package name */
    public int f263913i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fl2.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f263912h = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f263911g = obj;
        this.f263913i |= Integer.MIN_VALUE;
        return fl2.e.a(this.f263912h, 0, this);
    }
}
