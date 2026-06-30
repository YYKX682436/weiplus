package k84;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f305110a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f305111b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f305112c;

    public m(boolean z17, boolean z18, boolean z19) {
        this.f305110a = z17;
        this.f305111b = z18;
        this.f305112c = z19;
    }

    public final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isContinuousClickAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$LikeState");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContinuousClickAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$LikeState");
        return this.f305112c;
    }

    public final boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLikeClickAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$LikeState");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLikeClickAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$LikeState");
        return this.f305111b;
    }
}
