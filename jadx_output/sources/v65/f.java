package v65;

/* loaded from: classes16.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f433562d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f433563e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f433564f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f433565g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v65.h f433566h;

    /* renamed from: i, reason: collision with root package name */
    public int f433567i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v65.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f433566h = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f433565g = obj;
        this.f433567i |= Integer.MIN_VALUE;
        return this.f433566h.d(null, this);
    }
}
