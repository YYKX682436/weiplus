package dz0;

/* loaded from: classes5.dex */
public final class z1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f245085d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f245086e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f245087f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f245088g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f245089h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f245090i;

    /* renamed from: m, reason: collision with root package name */
    public int f245091m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f245090i = maasSdkUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f245089h = obj;
        this.f245091m |= Integer.MIN_VALUE;
        return this.f245090i.g7(null, false, this);
    }
}
