package ly0;

/* loaded from: classes5.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f322235d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f322236e;

    /* renamed from: f, reason: collision with root package name */
    public long f322237f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f322238g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ly0.v f322239h;

    /* renamed from: i, reason: collision with root package name */
    public int f322240i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ly0.v vVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f322239h = vVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f322238g = obj;
        this.f322240i |= Integer.MIN_VALUE;
        return this.f322239h.c(null, this);
    }
}
