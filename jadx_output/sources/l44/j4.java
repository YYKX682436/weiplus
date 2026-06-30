package l44;

/* loaded from: classes4.dex */
public final class j4 implements w64.x {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f316203b;

    /* renamed from: c, reason: collision with root package name */
    public final int f316204c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f316205d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f316206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u74.d f316207f;

    public j4(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, u74.d dVar, com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f316207f = dVar;
        java.lang.String snsId = snsInfo != null ? snsInfo.getSnsId() : null;
        this.f316203b = snsId == null ? "" : snsId;
        this.f316204c = 3;
        this.f316205d = dVar.f425165z;
        this.f316206e = iVar;
    }

    @Override // w64.x
    public w64.u a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackAnimListener", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1");
        l44.h4 h4Var = new l44.h4(this.f316207f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackAnimListener", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1");
        return h4Var;
    }

    @Override // w64.x
    public java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1");
        return this.f316203b;
    }

    @Override // w64.x
    public android.view.View c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1");
        return this.f316205d;
    }

    @Override // w64.x
    public w64.w d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSeekable", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1");
        l44.i4 i4Var = new l44.i4(this.f316207f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSeekable", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1");
        return i4Var;
    }

    @Override // w64.x
    public java.util.List e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHideAnimElementList", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        u74.d dVar = this.f316207f;
        arrayList.add(dVar.f425142c);
        arrayList.add(dVar.f425145f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHideAnimElementList", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1");
        return arrayList;
    }

    @Override // w64.x
    public com.tencent.mm.plugin.sns.ui.listener.i f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimelineClickListener", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1");
        return this.f316206e;
    }

    @Override // w64.x
    public java.util.List j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElementList", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElementList", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1");
        return null;
    }

    @Override // w64.x
    public int l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTransitionAnimType", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTransitionAnimType", "com.tencent.mm.plugin.sns.ad.helper.ClickActionHelper$createFullCardAdLandingPageJumpAnimInfo$1");
        return this.f316204c;
    }
}
