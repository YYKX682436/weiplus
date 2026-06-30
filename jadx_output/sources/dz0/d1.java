package dz0;

/* loaded from: classes5.dex */
public final class d1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f244806d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f244807e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f244808f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f244809g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f244810h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244811i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244812m;

    /* renamed from: n, reason: collision with root package name */
    public int f244813n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f244812m = maasSdkUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f244811i = obj;
        this.f244813n |= Integer.MIN_VALUE;
        return this.f244812m.b7(this);
    }
}
