package k84;

/* loaded from: classes4.dex */
public final class o3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f305162d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f305163e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f305164f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f305165g;

    /* renamed from: h, reason: collision with root package name */
    public long f305166h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f305167i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305168m;

    /* renamed from: n, reason: collision with root package name */
    public int f305169n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(k84.d4 d4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f305168m = d4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$1");
        this.f305167i = obj;
        this.f305169n |= Integer.MIN_VALUE;
        java.lang.Object z17 = k84.d4.z(this.f305168m, null, null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$1");
        return z17;
    }
}
