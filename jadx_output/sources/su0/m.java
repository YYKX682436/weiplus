package su0;

/* loaded from: classes5.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f412665d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f412666e;

    /* renamed from: f, reason: collision with root package name */
    public long f412667f;

    /* renamed from: g, reason: collision with root package name */
    public float f412668g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f412669h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ su0.r f412670i;

    /* renamed from: m, reason: collision with root package name */
    public int f412671m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(su0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f412670i = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f412669h = obj;
        this.f412671m |= Integer.MIN_VALUE;
        return this.f412670i.c(null, null, 0L, 0.0f, this);
    }
}
