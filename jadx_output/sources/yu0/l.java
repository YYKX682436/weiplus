package yu0;

/* loaded from: classes5.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f465804d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f465805e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f465806f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f465807g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yu0.m f465808h;

    /* renamed from: i, reason: collision with root package name */
    public int f465809i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yu0.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f465808h = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f465807g = obj;
        this.f465809i |= Integer.MIN_VALUE;
        return yu0.m.a(this.f465808h, null, this);
    }
}
