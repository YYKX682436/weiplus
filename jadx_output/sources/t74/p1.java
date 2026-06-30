package t74;

/* loaded from: classes4.dex */
public final class p1 implements w64.x {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f416223b;

    /* renamed from: c, reason: collision with root package name */
    public final int f416224c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f416225d;

    public p1(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, t74.w1 w1Var) {
        java.lang.String snsId = snsInfo.getSnsId();
        this.f416223b = snsId == null ? "" : snsId;
        this.f416224c = 1;
        t74.b2 t07 = w1Var.t0();
        t07.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic$FlipCardContext");
        this.f416225d = t07.f416114h;
    }

    @Override // w64.x
    public w64.u a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackAnimListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$animInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackAnimListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$animInfo$1");
        return null;
    }

    @Override // w64.x
    public java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$animInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$animInfo$1");
        return this.f416223b;
    }

    @Override // w64.x
    public android.view.View c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$animInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$animInfo$1");
        return null;
    }

    @Override // w64.x
    public w64.w d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSeekable", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$animInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSeekable", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$animInfo$1");
        return null;
    }

    @Override // w64.x
    public java.util.List e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHideAnimElementList", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$animInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHideAnimElementList", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$animInfo$1");
        return null;
    }

    @Override // w64.x
    public com.tencent.mm.plugin.sns.ui.listener.i f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$animInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$animInfo$1");
        return this.f416225d;
    }

    @Override // w64.x
    public java.util.List j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElementList", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$animInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElementList", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$animInfo$1");
        return null;
    }

    @Override // w64.x
    public int l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTransitionAnimType", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$animInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTransitionAnimType", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$animInfo$1");
        return this.f416224c;
    }
}
