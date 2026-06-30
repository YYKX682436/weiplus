package l44;

/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f316079a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f316080b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f316081c;

    public d0(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, boolean z17) {
        this.f316079a = i17;
        this.f316080b = snsInfo;
        this.f316081c = z17;
    }

    public final com.tencent.mm.plugin.sns.storage.SnsInfo a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$AdNotifyPlayFlowModel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper$AdNotifyPlayFlowModel");
        return this.f316080b;
    }
}
