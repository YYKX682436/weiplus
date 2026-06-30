package dz0;

/* loaded from: classes5.dex */
public final class z0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f245077d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f245078e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f245079f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f245080g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f245081h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f245082i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f245083m;

    /* renamed from: n, reason: collision with root package name */
    public int f245084n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f245083m = maasSdkUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f245082i = obj;
        this.f245084n |= Integer.MIN_VALUE;
        return this.f245083m.W6(null, this);
    }
}
