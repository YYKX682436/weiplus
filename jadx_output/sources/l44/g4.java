package l44;

/* loaded from: classes4.dex */
public final class g4 implements w64.x {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f316145b;

    /* renamed from: c, reason: collision with root package name */
    public final int f316146c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f316147d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f316148e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f316149f;

    /* renamed from: g, reason: collision with root package name */
    public final w64.w f316150g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f316151h;

    /* renamed from: i, reason: collision with root package name */
    public final w64.u f316152i;

    public g4(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, android.view.View view, java.util.List list, java.util.List list2, w64.w wVar, com.tencent.mm.plugin.sns.ui.listener.i iVar, w64.u uVar) {
        java.lang.String snsId = snsInfo != null ? snsInfo.getSnsId() : null;
        this.f316145b = snsId == null ? "" : snsId;
        this.f316146c = i17;
        this.f316147d = view;
        this.f316148e = list;
        this.f316149f = list2;
        this.f316150g = wVar;
        this.f316151h = iVar;
        this.f316152i = uVar;
    }

    @Override // w64.x
    public w64.u a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackAnimListener", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createAdLandingPageJumpAnimInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackAnimListener", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createAdLandingPageJumpAnimInfo$1");
        return this.f316152i;
    }

    @Override // w64.x
    public java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createAdLandingPageJumpAnimInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createAdLandingPageJumpAnimInfo$1");
        return this.f316145b;
    }

    @Override // w64.x
    public android.view.View c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createAdLandingPageJumpAnimInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createAdLandingPageJumpAnimInfo$1");
        return this.f316147d;
    }

    @Override // w64.x
    public w64.w d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSeekable", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createAdLandingPageJumpAnimInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSeekable", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createAdLandingPageJumpAnimInfo$1");
        return this.f316150g;
    }

    @Override // w64.x
    public java.util.List e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHideAnimElementList", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createAdLandingPageJumpAnimInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHideAnimElementList", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createAdLandingPageJumpAnimInfo$1");
        return this.f316149f;
    }

    @Override // w64.x
    public com.tencent.mm.plugin.sns.ui.listener.i f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createAdLandingPageJumpAnimInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createAdLandingPageJumpAnimInfo$1");
        return this.f316151h;
    }

    @Override // w64.x
    public java.util.List j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElementList", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createAdLandingPageJumpAnimInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElementList", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createAdLandingPageJumpAnimInfo$1");
        return this.f316148e;
    }

    @Override // w64.x
    public int l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTransitionAnimType", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createAdLandingPageJumpAnimInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTransitionAnimType", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createAdLandingPageJumpAnimInfo$1");
        return this.f316146c;
    }
}
