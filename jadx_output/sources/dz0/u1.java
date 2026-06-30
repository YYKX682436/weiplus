package dz0;

/* loaded from: classes5.dex */
public final class u1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f245023d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f245024e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f245025f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f245026g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f245027h;

    /* renamed from: i, reason: collision with root package name */
    public int f245028i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f245027h = maasSdkUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f245026g = obj;
        this.f245028i |= Integer.MIN_VALUE;
        return this.f245027h.e7(null, null, this);
    }
}
