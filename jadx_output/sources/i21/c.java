package i21;

/* loaded from: classes11.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f287879d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f287880e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f287881f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f287882g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i21.f f287883h;

    /* renamed from: i, reason: collision with root package name */
    public int f287884i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i21.f fVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f287883h = fVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f287882g = obj;
        this.f287884i |= Integer.MIN_VALUE;
        return i21.f.a(this.f287883h, null, null, 0, null, this);
    }
}
