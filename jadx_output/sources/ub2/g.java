package ub2;

/* loaded from: classes10.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f426048d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f426049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ub2.k f426050f;

    /* renamed from: g, reason: collision with root package name */
    public int f426051g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ub2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f426050f = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f426049e = obj;
        this.f426051g |= Integer.MIN_VALUE;
        return ub2.k.a(this.f426050f, 0, this);
    }
}
