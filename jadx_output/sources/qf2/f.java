package qf2;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f362357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.l f362358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f362359f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f362360g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362361h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f362362i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f362363m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f362364n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j17, qf2.l lVar, int i17, int i18, java.lang.String str, int i19, int i27, int i28) {
        super(0);
        this.f362357d = j17;
        this.f362358e = lVar;
        this.f362359f = i17;
        this.f362360g = i18;
        this.f362361h = str;
        this.f362362i = i19;
        this.f362363m = i27;
        this.f362364n = i28;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qf2.l lVar = this.f362358e;
        long j17 = lVar.f362457o;
        long j18 = this.f362357d;
        int i17 = this.f362360g;
        int i18 = this.f362359f;
        if (j18 != j17) {
            com.tencent.mars.xlog.Log.i("AnchorMicCloudController", "onBaseMicModeChange set mic setting fail but seq outdated, drop. seq:" + j18 + " latest:" + lVar.f362457o + " errType:" + i18 + " errCode:" + i17);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBaseMicModeChange set mic setting fail, errType:");
            sb6.append(i18);
            sb6.append(" errCode:");
            sb6.append(i17);
            sb6.append(" errMsg:");
            sb6.append(this.f362361h);
            sb6.append(" retryCount:");
            int i19 = this.f362362i;
            sb6.append(i19);
            sb6.append(" seq:");
            sb6.append(j18);
            com.tencent.mars.xlog.Log.w("AnchorMicCloudController", sb6.toString());
            long j19 = this.f362357d;
            int i27 = this.f362363m;
            int i28 = this.f362364n;
            if (i19 >= 3) {
                com.tencent.mars.xlog.Log.w("AnchorMicCloudController", "onBaseMicModeChange set mic setting reach max retry, give up. newMode:" + i27 + " micLayoutBaseMode:" + i28 + " seq:" + j19);
                if (j19 == lVar.f362457o) {
                    lVar.f362456n = null;
                }
            } else {
                int i29 = i19 + 1;
                long j27 = 1000 << i19;
                com.tencent.mars.xlog.Log.i("AnchorMicCloudController", "onBaseMicModeChange schedule retry, nextRetryCount:" + i29 + " delayMs:" + j27 + " newMode:" + i27 + " micLayoutBaseMode:" + i28 + " seq:" + j19);
                lVar.f362456n = com.tencent.mm.plugin.finder.live.util.y.d(lVar, null, null, new qf2.k(j27, lVar, j19, i27, i28, i29, null), 3, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
