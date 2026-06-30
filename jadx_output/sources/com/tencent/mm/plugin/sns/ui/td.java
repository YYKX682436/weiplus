package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class td {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f170507a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.x f170508b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView f170509c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.g9 f170510d;

    /* renamed from: e, reason: collision with root package name */
    public final int f170511e;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f170513g;

    /* renamed from: j, reason: collision with root package name */
    public long f170516j;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.b1 f170520n;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f170514h = false;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.widget.b1 f170517k = new com.tencent.mm.plugin.sns.ui.qd(this);

    /* renamed from: l, reason: collision with root package name */
    public boolean f170518l = false;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f170519m = "";

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f170512f = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f170515i = new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor("#1a000000"));

    public td(android.content.Context context, com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView snsAdTouchProgressView, com.tencent.mm.plugin.sns.ui.g9 g9Var, int i17, android.view.View view) {
        this.f170509c = snsAdTouchProgressView;
        this.f170510d = g9Var;
        this.f170511e = i17;
        this.f170513g = view;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.x a(com.tencent.mm.plugin.sns.ui.td tdVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        com.tencent.mm.plugin.sns.storage.x xVar = tdVar.f170508b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        return xVar;
    }

    public static /* synthetic */ android.view.View b(com.tencent.mm.plugin.sns.ui.td tdVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        android.view.View view = tdVar.f170513g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        return view;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo c(com.tencent.mm.plugin.sns.ui.td tdVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = tdVar.f170507a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        return snsInfo;
    }

    public static void f(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18, int i19) {
        java.lang.String str = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAction", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", snsInfo.field_snsId + "");
            java.lang.String str2 = snsInfo.getAdInfo().uxInfo;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 != null) {
                str = str2;
            }
            jSONObject.put("uxinfo", str);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i19);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("result", i17);
            jSONObject2.put("pressTotalTime", i18);
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            ca4.m0.a("timeline_fullcard_longpress_action", jSONObject3);
            com.tencent.mars.xlog.Log.i("SnsAdPressGestureCtrl", "reportAction, content=" + jSONObject3 + ", channel=timeline_fullcard_longpress_action");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("SnsAdPressGestureCtrl", "reportAction, exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAction", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("disableLongPressGestureView", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView snsAdTouchProgressView = this.f170509c;
        if (snsAdTouchProgressView != null && snsAdTouchProgressView.getVisibility() != 8) {
            com.tencent.mars.xlog.Log.i("SnsAdPressGestureCtrl", "disableLongPressGestureView, w=" + snsAdTouchProgressView.getWidth() + ", h=" + snsAdTouchProgressView.getHeight());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
            com.tencent.mars.xlog.Log.i("SnsAdTouchProgressView", "clear");
            snsAdTouchProgressView.f170834g.removeCallbacksAndMessages(null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView");
            snsAdTouchProgressView.setVisibility(8);
            com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView.b(2, 2, this.f170507a);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("disableLongPressGestureView", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
    }

    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableLongPressGestureView", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdTouchProgressView snsAdTouchProgressView = this.f170509c;
        if (snsAdTouchProgressView != null && snsAdTouchProgressView.getVisibility() != 0) {
            com.tencent.mars.xlog.Log.i("SnsAdPressGestureCtrl", "enableLongPressGestureView, scene=" + this.f170511e);
            snsAdTouchProgressView.setVisibility(0);
            com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView.b(2, 1, this.f170507a);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableLongPressGestureView", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl");
    }
}
