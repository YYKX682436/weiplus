package gq5;

/* loaded from: classes5.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f274647d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f274648e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f274649f;

    /* renamed from: g, reason: collision with root package name */
    public int f274650g;

    /* renamed from: h, reason: collision with root package name */
    public int f274651h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f274652i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ gq5.o f274653m;

    /* renamed from: n, reason: collision with root package name */
    public int f274654n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(gq5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f274653m = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f274652i = obj;
        this.f274654n |= Integer.MIN_VALUE;
        return gq5.o.b7(this.f274653m, this);
    }
}
