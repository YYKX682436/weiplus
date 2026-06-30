package dk2;

/* loaded from: classes3.dex */
public final class qc extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f233964d;

    /* renamed from: e, reason: collision with root package name */
    public int f233965e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f233966f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.rc f233967g;

    /* renamed from: h, reason: collision with root package name */
    public int f233968h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc(dk2.rc rcVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f233967g = rcVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f233966f = obj;
        this.f233968h |= Integer.MIN_VALUE;
        return dk2.rc.a(this.f233967g, null, this);
    }
}
