package qf2;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f362377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.l f362378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f362379f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f362380g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f362381h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j17, qf2.l lVar, int i17, int i18, int i19) {
        super(0);
        this.f362377d = j17;
        this.f362378e = lVar;
        this.f362379f = i17;
        this.f362380g = i18;
        this.f362381h = i19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qf2.l lVar = this.f362378e;
        long j17 = lVar.f362457o;
        long j18 = this.f362377d;
        int i17 = this.f362379f;
        if (j18 != j17) {
            com.tencent.mars.xlog.Log.i("AnchorMicCloudController", "onBaseMicModeChange set mic setting success but seq outdated, drop. seq:" + j18 + " latest:" + lVar.f362457o + " newMode:" + i17);
        } else {
            com.tencent.mars.xlog.Log.i("AnchorMicCloudController", "onBaseMicModeChange set mic setting success newMode:" + i17 + " micLayoutBaseMode:" + this.f362380g + " retryCount:" + this.f362381h + " seq:" + j18);
            lVar.f362456n = null;
        }
        return jz5.f0.f302826a;
    }
}
