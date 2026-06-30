package xk2;

/* loaded from: classes10.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f455008d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f455009e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f455010f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f455011g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xk2.c f455012h;

    /* renamed from: i, reason: collision with root package name */
    public int f455013i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xk2.c cVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f455012h = cVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f455011g = obj;
        this.f455013i |= Integer.MIN_VALUE;
        return this.f455012h.a(null, this);
    }
}
