package k84;

/* loaded from: classes4.dex */
public final class c0 implements w64.x {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f304960b;

    /* renamed from: c, reason: collision with root package name */
    public final int f304961c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f304962d;

    public c0(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, k84.q1 q1Var) {
        java.lang.String snsId = snsInfo.getSnsId();
        this.f304960b = snsId == null ? "" : snsId;
        this.f304961c = 1;
        q1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
        this.f304962d = q1Var.f305198s;
    }

    @Override // w64.x
    public w64.u a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackAnimListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackAnimListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$1");
        return null;
    }

    @Override // w64.x
    public java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$1");
        return this.f304960b;
    }

    @Override // w64.x
    public android.view.View c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$1");
        return null;
    }

    @Override // w64.x
    public w64.w d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSeekable", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSeekable", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$1");
        return null;
    }

    @Override // w64.x
    public java.util.List e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHideAnimElementList", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHideAnimElementList", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$1");
        return null;
    }

    @Override // w64.x
    public com.tencent.mm.plugin.sns.ui.listener.i f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$1");
        return this.f304962d;
    }

    @Override // w64.x
    public java.util.List j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElementList", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElementList", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$1");
        return null;
    }

    @Override // w64.x
    public int l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTransitionAnimType", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTransitionAnimType", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$1");
        return this.f304961c;
    }
}
