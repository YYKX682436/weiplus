package kq;

/* loaded from: classes12.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311204d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f311205e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f311206f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f311207g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f311208h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kq.n f311209i;

    /* renamed from: m, reason: collision with root package name */
    public int f311210m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kq.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f311209i = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f311208h = obj;
        this.f311210m |= Integer.MIN_VALUE;
        return this.f311209i.A(null, this);
    }
}
