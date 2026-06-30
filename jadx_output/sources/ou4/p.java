package ou4;

/* loaded from: classes8.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f349005d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f349006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ou4.s f349007f;

    /* renamed from: g, reason: collision with root package name */
    public int f349008g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ou4.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f349007f = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f349006e = obj;
        this.f349008g |= Integer.MIN_VALUE;
        return this.f349007f.c(null, null, this);
    }
}
