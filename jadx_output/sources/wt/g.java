package wt;

/* loaded from: classes12.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f449236d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f449237e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wt.i f449238f;

    /* renamed from: g, reason: collision with root package name */
    public int f449239g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(wt.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f449238f = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f449237e = obj;
        this.f449239g |= Integer.MIN_VALUE;
        return this.f449238f.e(null, null, this);
    }
}
