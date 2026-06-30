package qx3;

/* loaded from: classes10.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f367343d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f367344e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f367345f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f367346g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qx3.d f367347h;

    /* renamed from: i, reason: collision with root package name */
    public int f367348i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qx3.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f367347h = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f367346g = obj;
        this.f367348i |= Integer.MIN_VALUE;
        return this.f367347h.b(null, this);
    }
}
