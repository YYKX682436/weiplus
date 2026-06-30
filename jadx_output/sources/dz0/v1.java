package dz0;

/* loaded from: classes5.dex */
public final class v1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f245039d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f245040e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f245041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f245042g;

    /* renamed from: h, reason: collision with root package name */
    public int f245043h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f245042g = maasSdkUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f245041f = obj;
        this.f245043h |= Integer.MIN_VALUE;
        return this.f245042g.f7(this);
    }
}
