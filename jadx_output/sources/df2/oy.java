package df2;

/* loaded from: classes10.dex */
public final class oy extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231017d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f231018e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f231019f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.py f231020g;

    /* renamed from: h, reason: collision with root package name */
    public int f231021h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy(df2.py pyVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f231020g = pyVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f231019f = obj;
        this.f231021h |= Integer.MIN_VALUE;
        return this.f231020g.emit(null, this);
    }
}
