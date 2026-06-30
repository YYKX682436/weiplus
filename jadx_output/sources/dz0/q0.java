package dz0;

/* loaded from: classes5.dex */
public final class q0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f244980d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f244981e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f244982f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f244983g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f244984h;

    /* renamed from: i, reason: collision with root package name */
    public float f244985i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244986m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244987n;

    /* renamed from: o, reason: collision with root package name */
    public int f244988o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f244987n = maasSdkUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f244986m = obj;
        this.f244988o |= Integer.MIN_VALUE;
        return this.f244987n.T6(null, null, 0.0f, this);
    }
}
