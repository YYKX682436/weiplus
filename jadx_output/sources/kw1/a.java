package kw1;

/* loaded from: classes14.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f312808d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f312809e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f312810f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kw1.k f312811g;

    /* renamed from: h, reason: collision with root package name */
    public int f312812h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kw1.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f312811g = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f312810f = obj;
        this.f312812h |= Integer.MIN_VALUE;
        return this.f312811g.c(null, this);
    }
}
