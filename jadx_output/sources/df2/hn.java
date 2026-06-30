package df2;

/* loaded from: classes10.dex */
public final class hn extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230339d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f230340e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f230341f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230342g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ df2.ln f230343h;

    /* renamed from: i, reason: collision with root package name */
    public int f230344i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn(df2.ln lnVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f230343h = lnVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f230342g = obj;
        this.f230344i |= Integer.MIN_VALUE;
        return this.f230343h.b7(null, null, false, false, null, this);
    }
}
