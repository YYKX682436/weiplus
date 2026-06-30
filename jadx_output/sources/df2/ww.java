package df2;

/* loaded from: classes3.dex */
public final class ww extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231725d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f231726e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f231727f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.xw f231728g;

    /* renamed from: h, reason: collision with root package name */
    public int f231729h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(df2.xw xwVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f231728g = xwVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f231727f = obj;
        this.f231729h |= Integer.MIN_VALUE;
        return df2.xw.b7(this.f231728g, null, this);
    }
}
