package zn1;

/* loaded from: classes11.dex */
public final class d0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f474426d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f474427e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f474428f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f474429g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zn1.i0 f474430h;

    /* renamed from: i, reason: collision with root package name */
    public int f474431i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(zn1.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f474430h = i0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f474429g = obj;
        this.f474431i |= Integer.MIN_VALUE;
        return this.f474430h.d(null, this);
    }
}
