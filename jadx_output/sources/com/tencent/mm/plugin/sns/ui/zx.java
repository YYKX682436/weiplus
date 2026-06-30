package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class zx {

    /* renamed from: g, reason: collision with root package name */
    public int f171726g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ListView f171727h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.SnsCommentFooter f171728i;

    /* renamed from: a, reason: collision with root package name */
    public int f171720a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f171721b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f171722c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f171723d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f171724e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f171725f = false;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f171729j = new com.tencent.mm.plugin.sns.ui.wx(this);

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f171730k = new com.tencent.mm.plugin.sns.ui.xx(this);

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.Runnable f171731l = new com.tencent.mm.plugin.sns.ui.yx(this);

    public zx(android.widget.ListView listView, com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        this.f171727h = listView;
        this.f171728i = snsCommentFooter;
    }

    public static /* synthetic */ android.widget.ListView a(com.tencent.mm.plugin.sns.ui.zx zxVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        android.widget.ListView listView = zxVar.f171727h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        return listView;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter b(com.tencent.mm.plugin.sns.ui.zx zxVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = zxVar.f171728i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        return snsCommentFooter;
    }

    public static /* synthetic */ int c(com.tencent.mm.plugin.sns.ui.zx zxVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        int i17 = zxVar.f171724e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        return i17;
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollUp2", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        this.f171725f = true;
        this.f171726g = 20;
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(this.f171730k, 100L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollUp2", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
    }
}
