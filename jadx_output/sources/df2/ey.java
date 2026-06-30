package df2;

/* loaded from: classes10.dex */
public final class ey extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230089d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f230090e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f230091f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230092g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ df2.wy f230093h;

    /* renamed from: i, reason: collision with root package name */
    public int f230094i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(df2.wy wyVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f230093h = wyVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f230092g = obj;
        this.f230094i |= Integer.MIN_VALUE;
        return df2.wy.a7(this.f230093h, null, 0L, this);
    }
}
