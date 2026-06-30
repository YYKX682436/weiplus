package zn1;

/* loaded from: classes11.dex */
public final class e0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public boolean f474433d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f474434e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f474435f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f474436g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f474437h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zn1.i0 f474438i;

    /* renamed from: m, reason: collision with root package name */
    public int f474439m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(zn1.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f474438i = i0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f474437h = obj;
        this.f474439m |= Integer.MIN_VALUE;
        return this.f474438i.f(false, this);
    }
}
