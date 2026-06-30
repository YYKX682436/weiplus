package u20;

/* loaded from: classes9.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f423896d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f423897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u20.m f423898f;

    /* renamed from: g, reason: collision with root package name */
    public int f423899g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(u20.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f423898f = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f423897e = obj;
        this.f423899g |= Integer.MIN_VALUE;
        return u20.m.e(this.f423898f, null, null, this);
    }
}
