package dz0;

/* loaded from: classes5.dex */
public final class l0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f244918d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f244919e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f244920f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f244921g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f244922h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f244923i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244924m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244925n;

    /* renamed from: o, reason: collision with root package name */
    public int f244926o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f244925n = maasSdkUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f244924m = obj;
        this.f244926o |= Integer.MIN_VALUE;
        return this.f244925n.S6(null, null, null, this);
    }
}
