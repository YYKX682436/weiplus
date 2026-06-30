package za4;

/* loaded from: classes4.dex */
public class i0 implements za4.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f471122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471123b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f471124c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za4.o0 f471125d;

    public i0(za4.o0 o0Var, long j17, java.lang.String str, int i17) {
        this.f471125d = o0Var;
        this.f471122a = j17;
        this.f471123b = str;
        this.f471124c = i17;
    }

    @Override // za4.r1
    public int a(boolean z17, java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$1");
        com.tencent.mars.xlog.Log.i("AdLandingPageResPreloader", "callback() called with: isSucc = [" + z17 + "], pageId = [" + this.f471122a + "]");
        if (z17 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
            this.f471125d.e(str, this.f471123b, this.f471124c);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader$1");
        return 0;
    }
}
