package g80;

/* loaded from: classes12.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f269499d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f269500e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f269501f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f269502g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f269503h;

    /* renamed from: i, reason: collision with root package name */
    public long f269504i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f269505m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g80.o f269506n;

    /* renamed from: o, reason: collision with root package name */
    public int f269507o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g80.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f269506n = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f269505m = obj;
        this.f269507o |= Integer.MIN_VALUE;
        return this.f269506n.e7(null, this);
    }
}
