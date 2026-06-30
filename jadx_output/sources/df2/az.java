package df2;

/* loaded from: classes3.dex */
public final class az extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f229758d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f229759e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f229760f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.lz f229761g;

    /* renamed from: h, reason: collision with root package name */
    public int f229762h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(df2.lz lzVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f229761g = lzVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f229760f = obj;
        this.f229762h |= Integer.MIN_VALUE;
        return df2.lz.Z6(this.f229761g, null, this);
    }
}
