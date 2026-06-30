package zv0;

/* loaded from: classes5.dex */
public final class w extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f476238d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f476239e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f476240f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f476241g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f476242h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f476243i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zv0.y f476244m;

    /* renamed from: n, reason: collision with root package name */
    public int f476245n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(zv0.y yVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f476244m = yVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f476243i = obj;
        this.f476245n |= Integer.MIN_VALUE;
        return this.f476244m.e(null, null, null, this);
    }
}
