package zx4;

/* loaded from: classes8.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f477180d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f477181e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f477182f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f477183g;

    /* renamed from: h, reason: collision with root package name */
    public int f477184h;

    /* renamed from: i, reason: collision with root package name */
    public int f477185i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f477186m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f477187n;

    /* renamed from: o, reason: collision with root package name */
    public int f477188o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(zx4.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f477187n = l0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f477186m = obj;
        this.f477188o |= Integer.MIN_VALUE;
        return zx4.l0.a(this.f477187n, null, false, this);
    }
}
