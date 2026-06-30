package com.tencent.mm.plugin.sns.ui;

@db5.a(672)
@ul5.d(0)
/* loaded from: classes4.dex */
public class SnsAdNativeLandingPagesUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.sns.ui.nd {

    /* renamed from: q3 */
    public static final java.util.List f166692q3 = java.util.Collections.synchronizedList(new java.util.ArrayList());
    public boolean A;
    public boolean A1;
    public final o54.f A2;
    public n54.f B;
    public int B1;
    public java.lang.String B2;
    public java.lang.String C;
    public java.lang.String C1;
    public java.lang.String C2;
    public java.lang.String D;
    public java.lang.String D1;
    public a54.e D2;
    public java.lang.String E;
    public java.lang.String E1;
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e5 E2;
    public java.lang.String F;
    public java.lang.String F1;
    public final androidx.lifecycle.j0 F2;
    public java.lang.String G;
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager G1;
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d2 G2;
    public java.lang.String H;
    public ab4.z0 H1;
    public final androidx.lifecycle.j0 H2;
    public int I;
    public int I1;
    public boolean I2;

    /* renamed from: J */
    public int f166693J;
    public int J1;
    public java.lang.String J2;
    public java.lang.String K;
    public final com.tencent.mm.sdk.platformtools.n3 K1;
    public boolean K2;
    public java.lang.String L;
    public android.widget.FrameLayout L1;
    public boolean L2;
    public java.lang.String M;
    public android.view.View M1;
    public java.lang.String M2;
    public java.lang.String N;
    public android.view.View N1;
    public java.lang.String N2;
    public boolean O1;
    public boolean O2;
    public java.lang.String P;
    public int P1;
    public android.widget.FrameLayout P2;
    public java.lang.String Q;
    public int Q1;
    public android.widget.FrameLayout Q2;
    public boolean R;
    public com.tencent.mm.plugin.sns.storage.SnsInfo R1;
    public android.widget.FrameLayout R2;
    public long S;
    public java.util.Map S1;
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 S2;
    public long T;
    public java.util.List T1;
    public android.widget.ImageView T2;
    public long U;
    public vb4.f U1;
    public boolean U2;
    public java.lang.String V;
    public vb4.i V1;
    public final android.content.BroadcastReceiver V2;
    public java.lang.String W;
    public volatile boolean W1;
    public final android.content.BroadcastReceiver W2;
    public java.lang.String X;
    public boolean X1;
    public java.lang.String X2;
    public int Y;
    public ab4.n0 Y1;
    public final gb4.p Y2;
    public java.lang.String Z;
    public final java.util.Map Z1;
    public final androidx.viewpager.widget.ViewPager.OnPageChangeListener Z2;

    /* renamed from: a2 */
    public q54.a f166694a2;

    /* renamed from: a3 */
    public final com.tencent.mm.plugin.sns.model.t f166695a3;

    /* renamed from: b2 */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y f166696b2;

    /* renamed from: b3 */
    public final com.tencent.mm.sdk.event.IListener f166697b3;

    /* renamed from: c2 */
    public boolean f166698c2;

    /* renamed from: c3 */
    public final com.tencent.mm.sdk.event.IListener f166699c3;

    /* renamed from: d */
    public final java.lang.String f166700d;

    /* renamed from: d2 */
    public boolean f166701d2;

    /* renamed from: d3 */
    public boolean f166702d3;

    /* renamed from: e */
    public final java.lang.String f166703e;

    /* renamed from: e2 */
    public boolean f166704e2;

    /* renamed from: e3 */
    public final java.lang.Runnable f166705e3;

    /* renamed from: f */
    public final java.lang.String f166706f;

    /* renamed from: f2 */
    public boolean f166707f2;

    /* renamed from: f3 */
    public boolean f166708f3;

    /* renamed from: g */
    public java.util.LinkedList f166709g;

    /* renamed from: g2 */
    public final java.util.Collection f166710g2;

    /* renamed from: g3 */
    public final java.util.Map f166711g3;

    /* renamed from: h */
    public ab4.j0 f166712h;

    /* renamed from: h2 */
    public java.lang.String f166713h2;

    /* renamed from: h3 */
    public boolean f166714h3;

    /* renamed from: i */
    public android.widget.ImageView f166715i;

    /* renamed from: i2 */
    public java.lang.String f166716i2;

    /* renamed from: i3 */
    public final com.tencent.mm.ui.widget.snackbar.g f166717i3;

    /* renamed from: j2 */
    public volatile boolean f166718j2;

    /* renamed from: j3 */
    public final com.tencent.mm.ui.q0 f166719j3;

    /* renamed from: k2 */
    public volatile boolean f166720k2;

    /* renamed from: k3 */
    public final android.content.BroadcastReceiver f166721k3;

    /* renamed from: l1 */
    public int f166722l1;

    /* renamed from: l2 */
    public volatile boolean f166723l2;

    /* renamed from: l3 */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k2 f166724l3;

    /* renamed from: m */
    public android.widget.ImageView f166725m;

    /* renamed from: m2 */
    public volatile boolean f166726m2;

    /* renamed from: m3 */
    public com.tencent.mm.ui.widget.dialog.u3 f166727m3;

    /* renamed from: n */
    public android.widget.ImageView f166728n;

    /* renamed from: n2 */
    public final com.tencent.mm.sdk.platformtools.n3 f166729n2;

    /* renamed from: n3 */
    public com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper f166730n3;

    /* renamed from: o */
    public android.widget.TextView f166731o;

    /* renamed from: o2 */
    public java.lang.String f166732o2;

    /* renamed from: o3 */
    public final android.view.View.OnClickListener f166733o3;

    /* renamed from: p */
    public int f166734p;

    /* renamed from: p0 */
    public java.lang.String f166735p0;

    /* renamed from: p1 */
    public boolean f166736p1;

    /* renamed from: p2 */
    public com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper f166737p2;

    /* renamed from: p3 */
    public final android.view.View.OnClickListener f166738p3;

    /* renamed from: q */
    public int f166739q;

    /* renamed from: q2 */
    public com.tencent.mm.ui.widget.dialog.k0 f166740q2;

    /* renamed from: r */
    public int f166741r;

    /* renamed from: r2 */
    public boolean f166742r2;

    /* renamed from: s */
    public int f166743s;

    /* renamed from: s2 */
    public boolean f166744s2;

    /* renamed from: t */
    public android.widget.ImageView f166745t;

    /* renamed from: t2 */
    public com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 f166746t2;

    /* renamed from: u */
    public android.os.Bundle f166747u;

    /* renamed from: u2 */
    public boolean f166748u2;

    /* renamed from: v */
    public boolean f166749v;

    /* renamed from: v2 */
    public long f166750v2;

    /* renamed from: w */
    public boolean f166751w;

    /* renamed from: w2 */
    public boolean f166752w2;

    /* renamed from: x */
    public boolean f166753x;

    /* renamed from: x0 */
    public final java.util.Map f166754x0;

    /* renamed from: x1 */
    public java.lang.String f166755x1;

    /* renamed from: x2 */
    public com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper f166756x2;

    /* renamed from: y */
    public boolean f166757y;

    /* renamed from: y0 */
    public final za4.g1 f166758y0;

    /* renamed from: y1 */
    public java.lang.String f166759y1;

    /* renamed from: y2 */
    public boolean f166760y2;

    /* renamed from: z */
    public int f166761z;

    /* renamed from: z1 */
    public int f166762z1;

    /* renamed from: z2 */
    public java.lang.String f166763z2;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$6 */
    /* loaded from: classes4.dex */
    public class AnonymousClass6 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OpenSnsAdFloatPageEvent> {
        public AnonymousClass6(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 509324304;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.OpenSnsAdFloatPageEvent openSnsAdFloatPageEvent) {
            java.lang.String str;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$6");
            com.tencent.mm.autogen.events.OpenSnsAdFloatPageEvent openSnsAdFloatPageEvent2 = openSnsAdFloatPageEvent;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$6");
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.this;
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment z76 = snsAdNativeLandingPagesUI.z7();
            z76.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            za4.g0 g0Var = z76.B;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            if (g0Var.f471084d != null) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment z77 = snsAdNativeLandingPagesUI.z7();
                z77.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                za4.g0 g0Var2 = z77.B;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                if (g0Var2.f471084d.containsKey(openSnsAdFloatPageEvent2.f54600g.f8024a)) {
                    java.util.Map Y6 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Y6(snsAdNativeLandingPagesUI);
                    am.tn tnVar = openSnsAdFloatPageEvent2.f54600g;
                    if (!((java.util.HashMap) Y6).containsKey(tnVar.f8024a)) {
                        snsAdNativeLandingPagesUI.z7().onPause();
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("sns_landing_pages_xml", com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.X6(snsAdNativeLandingPagesUI));
                        bundle.putString("sns_float_component_id", tnVar.f8024a);
                        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment z78 = snsAdNativeLandingPagesUI.z7();
                        z78.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                        za4.g0 g0Var3 = z78.B;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                        bundle.putInt("sns_landing_page_index", g0Var3.f471086f);
                        bundle.putString("sns_landing_page_snsId", snsAdNativeLandingPagesUI.P);
                        bundle.putString("sns_landing_pages_rawSnsId", snsAdNativeLandingPagesUI.Q);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        java.lang.String str2 = snsAdNativeLandingPagesUI.V;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        bundle.putString("sns_landing_pages_ux_info", str2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        java.lang.String str3 = snsAdNativeLandingPagesUI.f166755x1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        bundle.putString("sns_landing_pages_aid", str3);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        int i17 = snsAdNativeLandingPagesUI.B1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        bundle.putInt("sns_landing_pages_biz_id", i17);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        java.lang.String str4 = snsAdNativeLandingPagesUI.f166759y1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        bundle.putString("sns_landing_pages_traceid", str4);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        int i18 = snsAdNativeLandingPagesUI.I;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        bundle.putInt("sns_landig_pages_from_source", i18);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        java.lang.String str5 = snsAdNativeLandingPagesUI.D;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        bundle.putString("sns_landing_pages_xml_prefix", str5);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        boolean z17 = snsAdNativeLandingPagesUI.R;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        bundle.putBoolean("sns_landing_is_native_sight_ad", z17);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        java.lang.String str6 = snsAdNativeLandingPagesUI.f166735p0;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        bundle.putString("sns_landing_pages_canvas_ext", str6);
                        com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView = new com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView(snsAdNativeLandingPagesUI);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                        str = "callback";
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                        java.lang.String string = bundle.getString("sns_landing_pages_xml");
                        snsAdLandingPageFloatView.f170800d = bundle.getString("sns_float_component_id");
                        int i19 = bundle.getInt("sns_landing_page_index", -1);
                        java.lang.String string2 = bundle.getString("sns_landing_pages_ux_info");
                        java.lang.String string3 = bundle.getString("sns_landing_pages_aid");
                        java.lang.String string4 = bundle.getString("sns_landing_pages_traceid");
                        snsAdLandingPageFloatView.f170801e = bundle.getString("sns_landing_pages_canvas_ext");
                        if (com.tencent.mm.sdk.platformtools.t8.N0(string, snsAdLandingPageFloatView.f170800d) || i19 == -1) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdLandingPageFloatView", "invalid landing float page data!");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                        } else {
                            java.lang.String string5 = bundle.getString("sns_landing_pages_xml_prefix");
                            if (string5 == null) {
                                string5 = dm.n.COL_ADXML;
                            }
                            java.util.LinkedList linkedList = new za4.x0(string, string5).f471214a;
                            if (linkedList != null && linkedList.size() > i19) {
                                za4.g0 g0Var4 = (za4.g0) linkedList.get(i19);
                                za4.g0 g0Var5 = new za4.g0();
                                snsAdLandingPageFloatView.f170803g = g0Var5;
                                g0Var5.f471081a = g0Var4.f471081a;
                                java.util.Map map = g0Var4.f471084d;
                                ab4.d0 d0Var = (ab4.d0) ((java.util.LinkedHashMap) map).get(snsAdLandingPageFloatView.f170800d);
                                if (za4.z0.r(d0Var.f2827q)) {
                                    ab4.b0 b0Var = (ab4.b0) d0Var;
                                    snsAdLandingPageFloatView.f170802f = b0Var;
                                    snsAdLandingPageFloatView.f170803g.f471083c.add(b0Var);
                                    snsAdLandingPageFloatView.f170803g.f471084d.putAll(map);
                                }
                                za4.g0 g0Var6 = snsAdLandingPageFloatView.f170803g;
                                g0Var6.f471086f = 0;
                                g0Var6.f471085e = true;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdLandingPageFloatView", "[reportInfo] aid %s,traceId %s,uxInfo %s,adCanvasExtXml %s", string3, string4, string2, snsAdLandingPageFloatView.f170801e);
                            snsAdLandingPageFloatView.f();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                        snsAdLandingPageFloatView.setBackgroundColor(snsAdNativeLandingPagesUI.getResources().getColor(com.tencent.mm.R.color.a4y));
                        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.b7(snsAdNativeLandingPagesUI).addView(snsAdLandingPageFloatView, new android.widget.FrameLayout.LayoutParams(-1, -1));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playEnterAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                        if (!snsAdLandingPageFloatView.f170807n) {
                            snsAdLandingPageFloatView.f170810q.start();
                            snsAdLandingPageFloatView.f170807n = true;
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playEnterAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                        snsAdNativeLandingPagesUI.z7().A0();
                        if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI) != null && !com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI).X()) {
                            snsAdNativeLandingPagesUI.G7(false, 0L);
                        }
                        ((java.util.HashMap) com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Y6(snsAdNativeLandingPagesUI)).put(tnVar.f8024a, snsAdLandingPageFloatView);
                        java.lang.String str7 = str;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str7, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$6");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str7, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$6");
                        return false;
                    }
                }
            }
            str = "callback";
            java.lang.String str72 = str;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str72, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$6");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str72, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$6");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$7 */
    /* loaded from: classes4.dex */
    public class AnonymousClass7 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdFloatPageLifecycleEvent> {
        public AnonymousClass7(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 1959790896;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.SnsAdFloatPageLifecycleEvent snsAdFloatPageLifecycleEvent) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$7");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$7");
            am.zu zuVar = snsAdFloatPageLifecycleEvent.f54791g;
            java.lang.String str = zuVar.f8607a;
            if (zuVar.f8608b == 123 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.this;
                if (((java.util.HashMap) com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Y6(snsAdNativeLandingPagesUI)).containsKey(str)) {
                    com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.b7(snsAdNativeLandingPagesUI).removeView((android.view.View) ((java.util.HashMap) com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Y6(snsAdNativeLandingPagesUI)).get(str));
                    snsAdNativeLandingPagesUI.onResume();
                    snsAdNativeLandingPagesUI.z7().onResume();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$7");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$7");
            return false;
        }
    }

    public SnsAdNativeLandingPagesUI() {
        java.lang.String D7 = D7();
        this.f166700d = D7;
        this.f166703e = D7 + ".launch";
        this.f166706f = D7 + ".uxInfo";
        this.f166709g = new java.util.LinkedList();
        this.f166734p = 0;
        this.f166739q = 0;
        this.f166741r = 0;
        this.f166743s = 0;
        this.f166749v = false;
        this.f166751w = false;
        this.f166753x = false;
        this.f166757y = false;
        this.f166761z = 0;
        this.A = false;
        this.R = false;
        this.T = 0L;
        this.U = 0L;
        this.f166754x0 = new java.util.HashMap();
        this.f166758y0 = new za4.g1();
        this.f166736p1 = false;
        this.f166762z1 = 0;
        this.A1 = false;
        this.K1 = new com.tencent.mm.sdk.platformtools.n3();
        this.O1 = false;
        this.Z1 = new java.util.HashMap();
        this.f166698c2 = false;
        this.f166701d2 = false;
        this.f166704e2 = false;
        this.f166707f2 = false;
        this.f166710g2 = new java.util.HashSet();
        this.f166718j2 = false;
        this.f166720k2 = false;
        this.f166723l2 = false;
        this.f166726m2 = false;
        this.f166729n2 = new com.tencent.mm.sdk.platformtools.n3();
        this.f166732o2 = "";
        this.f166742r2 = false;
        this.f166744s2 = false;
        this.f166748u2 = false;
        this.f166763z2 = "";
        this.A2 = new o54.f();
        this.B2 = "";
        this.C2 = "";
        this.F2 = new androidx.lifecycle.j0(0);
        this.H2 = new androidx.lifecycle.j0();
        this.I2 = false;
        this.J2 = "";
        this.K2 = false;
        this.L2 = false;
        this.M2 = "";
        this.N2 = "";
        this.O2 = false;
        this.T2 = null;
        this.U2 = false;
        new java.util.HashSet();
        this.V2 = new com.tencent.mm.plugin.sns.ui.nb(this);
        this.W2 = new com.tencent.mm.plugin.sns.ui.ac(this);
        this.X2 = "";
        this.Y2 = new com.tencent.mm.plugin.sns.ui.lc(this);
        this.Z2 = new com.tencent.mm.plugin.sns.ui.mc(this);
        this.f166695a3 = new com.tencent.mm.plugin.sns.ui.pc(this);
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f166697b3 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OpenSnsAdFloatPageEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.6
            public AnonymousClass6(androidx.lifecycle.y a0Var2) {
                super(a0Var2);
                this.__eventId = 509324304;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OpenSnsAdFloatPageEvent openSnsAdFloatPageEvent) {
                java.lang.String str;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$6");
                com.tencent.mm.autogen.events.OpenSnsAdFloatPageEvent openSnsAdFloatPageEvent2 = openSnsAdFloatPageEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$6");
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.this;
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment z76 = snsAdNativeLandingPagesUI.z7();
                z76.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                za4.g0 g0Var = z76.B;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                if (g0Var.f471084d != null) {
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment z77 = snsAdNativeLandingPagesUI.z7();
                    z77.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                    za4.g0 g0Var2 = z77.B;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                    if (g0Var2.f471084d.containsKey(openSnsAdFloatPageEvent2.f54600g.f8024a)) {
                        java.util.Map Y6 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Y6(snsAdNativeLandingPagesUI);
                        am.tn tnVar = openSnsAdFloatPageEvent2.f54600g;
                        if (!((java.util.HashMap) Y6).containsKey(tnVar.f8024a)) {
                            snsAdNativeLandingPagesUI.z7().onPause();
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString("sns_landing_pages_xml", com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.X6(snsAdNativeLandingPagesUI));
                            bundle.putString("sns_float_component_id", tnVar.f8024a);
                            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment z78 = snsAdNativeLandingPagesUI.z7();
                            z78.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                            za4.g0 g0Var3 = z78.B;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                            bundle.putInt("sns_landing_page_index", g0Var3.f471086f);
                            bundle.putString("sns_landing_page_snsId", snsAdNativeLandingPagesUI.P);
                            bundle.putString("sns_landing_pages_rawSnsId", snsAdNativeLandingPagesUI.Q);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            java.lang.String str2 = snsAdNativeLandingPagesUI.V;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            bundle.putString("sns_landing_pages_ux_info", str2);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            java.lang.String str3 = snsAdNativeLandingPagesUI.f166755x1;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            bundle.putString("sns_landing_pages_aid", str3);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            int i17 = snsAdNativeLandingPagesUI.B1;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            bundle.putInt("sns_landing_pages_biz_id", i17);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            java.lang.String str4 = snsAdNativeLandingPagesUI.f166759y1;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            bundle.putString("sns_landing_pages_traceid", str4);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            int i18 = snsAdNativeLandingPagesUI.I;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            bundle.putInt("sns_landig_pages_from_source", i18);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            java.lang.String str5 = snsAdNativeLandingPagesUI.D;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            bundle.putString("sns_landing_pages_xml_prefix", str5);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            boolean z17 = snsAdNativeLandingPagesUI.R;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            bundle.putBoolean("sns_landing_is_native_sight_ad", z17);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            java.lang.String str6 = snsAdNativeLandingPagesUI.f166735p0;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            bundle.putString("sns_landing_pages_canvas_ext", str6);
                            com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView = new com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView(snsAdNativeLandingPagesUI);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                            str = "callback";
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                            java.lang.String string = bundle.getString("sns_landing_pages_xml");
                            snsAdLandingPageFloatView.f170800d = bundle.getString("sns_float_component_id");
                            int i19 = bundle.getInt("sns_landing_page_index", -1);
                            java.lang.String string2 = bundle.getString("sns_landing_pages_ux_info");
                            java.lang.String string3 = bundle.getString("sns_landing_pages_aid");
                            java.lang.String string4 = bundle.getString("sns_landing_pages_traceid");
                            snsAdLandingPageFloatView.f170801e = bundle.getString("sns_landing_pages_canvas_ext");
                            if (com.tencent.mm.sdk.platformtools.t8.N0(string, snsAdLandingPageFloatView.f170800d) || i19 == -1) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdLandingPageFloatView", "invalid landing float page data!");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                            } else {
                                java.lang.String string5 = bundle.getString("sns_landing_pages_xml_prefix");
                                if (string5 == null) {
                                    string5 = dm.n.COL_ADXML;
                                }
                                java.util.LinkedList linkedList = new za4.x0(string, string5).f471214a;
                                if (linkedList != null && linkedList.size() > i19) {
                                    za4.g0 g0Var4 = (za4.g0) linkedList.get(i19);
                                    za4.g0 g0Var5 = new za4.g0();
                                    snsAdLandingPageFloatView.f170803g = g0Var5;
                                    g0Var5.f471081a = g0Var4.f471081a;
                                    java.util.Map map = g0Var4.f471084d;
                                    ab4.d0 d0Var = (ab4.d0) ((java.util.LinkedHashMap) map).get(snsAdLandingPageFloatView.f170800d);
                                    if (za4.z0.r(d0Var.f2827q)) {
                                        ab4.b0 b0Var = (ab4.b0) d0Var;
                                        snsAdLandingPageFloatView.f170802f = b0Var;
                                        snsAdLandingPageFloatView.f170803g.f471083c.add(b0Var);
                                        snsAdLandingPageFloatView.f170803g.f471084d.putAll(map);
                                    }
                                    za4.g0 g0Var6 = snsAdLandingPageFloatView.f170803g;
                                    g0Var6.f471086f = 0;
                                    g0Var6.f471085e = true;
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdLandingPageFloatView", "[reportInfo] aid %s,traceId %s,uxInfo %s,adCanvasExtXml %s", string3, string4, string2, snsAdLandingPageFloatView.f170801e);
                                snsAdLandingPageFloatView.f();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                            snsAdLandingPageFloatView.setBackgroundColor(snsAdNativeLandingPagesUI.getResources().getColor(com.tencent.mm.R.color.a4y));
                            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.b7(snsAdNativeLandingPagesUI).addView(snsAdLandingPageFloatView, new android.widget.FrameLayout.LayoutParams(-1, -1));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playEnterAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                            if (!snsAdLandingPageFloatView.f170807n) {
                                snsAdLandingPageFloatView.f170810q.start();
                                snsAdLandingPageFloatView.f170807n = true;
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playEnterAnimation", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
                            snsAdNativeLandingPagesUI.z7().A0();
                            if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI) != null && !com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI).X()) {
                                snsAdNativeLandingPagesUI.G7(false, 0L);
                            }
                            ((java.util.HashMap) com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Y6(snsAdNativeLandingPagesUI)).put(tnVar.f8024a, snsAdLandingPageFloatView);
                            java.lang.String str72 = str;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str72, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$6");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str72, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$6");
                            return false;
                        }
                    }
                }
                str = "callback";
                java.lang.String str722 = str;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str722, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$6");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str722, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$6");
                return false;
            }
        };
        this.f166699c3 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdFloatPageLifecycleEvent>(a0Var2) { // from class: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.7
            public AnonymousClass7(androidx.lifecycle.y a0Var2) {
                super(a0Var2);
                this.__eventId = 1959790896;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsAdFloatPageLifecycleEvent snsAdFloatPageLifecycleEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$7");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$7");
                am.zu zuVar = snsAdFloatPageLifecycleEvent.f54791g;
                java.lang.String str = zuVar.f8607a;
                if (zuVar.f8608b == 123 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.this;
                    if (((java.util.HashMap) com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Y6(snsAdNativeLandingPagesUI)).containsKey(str)) {
                        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.b7(snsAdNativeLandingPagesUI).removeView((android.view.View) ((java.util.HashMap) com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Y6(snsAdNativeLandingPagesUI)).get(str));
                        snsAdNativeLandingPagesUI.onResume();
                        snsAdNativeLandingPagesUI.z7().onResume();
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$7");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$7");
                return false;
            }
        };
        this.f166702d3 = false;
        this.f166705e3 = new com.tencent.mm.plugin.sns.ui.kb(this);
        this.f166708f3 = false;
        this.f166711g3 = new java.util.HashMap();
        this.f166714h3 = false;
        this.f166717i3 = new com.tencent.mm.plugin.sns.ui.zb(this);
        this.f166719j3 = new com.tencent.mm.plugin.sns.ui.dc(this);
        this.f166721k3 = new com.tencent.mm.plugin.sns.ui.fc(this);
        this.f166724l3 = null;
        this.f166727m3 = null;
        this.f166733o3 = new com.tencent.mm.plugin.sns.ui.ic(this);
        this.f166738p3 = new com.tencent.mm.plugin.sns.ui.jc(this);
    }

    public static boolean Q7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFromShare", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z17 = i17 == 3 || i17 == 5 || i17 == 4;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdNativeLandingPagesUI", "isFromShare, source=" + i17 + ", ret=" + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFromShare", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z17;
    }

    public static boolean R7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFromTimeLine", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z17 = true;
        if (i17 != 1 && i17 != 2 && i17 != 16) {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdNativeLandingPagesUI", "isFromTimeLine, source=" + i17 + ", ret=" + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFromTimeLine", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z17;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager T6(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager adlandingDummyViewPager = snsAdNativeLandingPagesUI.G1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return adlandingDummyViewPager;
    }

    public static /* synthetic */ android.view.View U6(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        android.view.View view = snsAdNativeLandingPagesUI.N1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return view;
    }

    public static /* synthetic */ boolean V6(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z17 = snsAdNativeLandingPagesUI.f166751w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z17;
    }

    public static /* synthetic */ android.widget.ImageView W6(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        android.widget.ImageView imageView = snsAdNativeLandingPagesUI.f166728n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return imageView;
    }

    public static /* synthetic */ java.lang.String X6(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String str = snsAdNativeLandingPagesUI.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return str;
    }

    public static boolean X7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNeedUpdateUxinfo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z17 = Q7(i17) || l64.a.c(i17) || i17 == 33;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedUpdateUxinfo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z17;
    }

    public static /* synthetic */ java.util.Map Y6(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.util.Map map = snsAdNativeLandingPagesUI.Z1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return map;
    }

    public static boolean Y7() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isReqDynamicCanvasXml", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_native_landing_page_share_do_request_page, 0);
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdNativeLandingPagesUI", "isReqDynamicCanvasXml value is " + i17);
            } catch (java.lang.Throwable unused) {
            }
        } catch (java.lang.Throwable unused2) {
            i17 = 0;
        }
        boolean z17 = i17 > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isReqDynamicCanvasXml", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z17;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y Z6(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar = snsAdNativeLandingPagesUI.f166696b2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return yVar;
    }

    public static /* synthetic */ int a7(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        int i17 = snsAdNativeLandingPagesUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return i17;
    }

    public static /* synthetic */ android.widget.FrameLayout b7(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        android.widget.FrameLayout frameLayout = snsAdNativeLandingPagesUI.L1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return frameLayout;
    }

    public static /* synthetic */ int c7(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        int i17 = snsAdNativeLandingPagesUI.Q1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return i17;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 d7(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = snsAdNativeLandingPagesUI.f166746t2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return i0Var;
    }

    public static /* synthetic */ boolean e7(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z17 = snsAdNativeLandingPagesUI.f166753x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z17;
    }

    public static /* synthetic */ n54.f f7(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        n54.f fVar = snsAdNativeLandingPagesUI.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return fVar;
    }

    public static void n7(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doExposureReport", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("viewid", str);
            jSONObject.put("commInfo", str2);
            jSONObject.put("uxinfo", str3);
            jSONObject.put("exposureType", i17);
            ca4.m0.a("rewarded_canvas_exposure", jSONObject.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdNativeLandingPagesUI", "doCanvasExposureReport exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doExposureReport", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ab4.n0 A7() {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.A7():ab4.n0");
    }

    public final com.tencent.mm.plugin.sns.ui.tc B7() {
        int adVoteIndex;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOptionalShareContent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.storage.ADXml aDXml = new com.tencent.mm.plugin.sns.storage.ADXml(this.C);
        if (!aDXml.hasVoteInfo() || (adVoteIndex = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getAdVoteIndex(aDXml.adVoteInfo.f166123a, this.V, this.X)) <= 0 || adVoteIndex > aDXml.adVoteInfo.f166125c.size()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOptionalShareContent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.t tVar = (com.tencent.mm.plugin.sns.storage.t) aDXml.adVoteInfo.f166125c.get(adVoteIndex - 1);
        com.tencent.mm.plugin.sns.ui.tc tcVar = new com.tencent.mm.plugin.sns.ui.tc(this, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(tVar.f166135b)) {
            tcVar.f170504a = this.L;
        } else {
            tcVar.f170504a = tVar.f166135b;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(tVar.f166136c)) {
            tcVar.f170505b = this.M;
        } else {
            tcVar.f170505b = tVar.f166136c;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(tVar.f166137d)) {
            tcVar.f170506c = this.K;
        } else {
            tcVar.f170506c = tVar.f166137d;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOptionalShareContent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return tcVar;
    }

    public final java.lang.String C7(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPrivilegeShareThumbUrl", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String str2 = (java.lang.String) this.S1.get("." + this.D + ".adCanvasInfo.shareThumbUrl");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPrivilegeShareThumbUrl", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPrivilegeShareThumbUrl", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return str2;
    }

    public java.lang.String D7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return "MicroMsg.SnsAdNativeLandingPagesUI";
    }

    public boolean E7() {
        java.lang.String str = this.f166700d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasNextPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            gb4.r rVar = (gb4.r) this.G1.getAdapter();
            int currentItem = this.G1.getCurrentItem();
            com.tencent.mars.xlog.Log.i(str, "hasNextPage, curPage=" + currentItem + ", pageCount=" + rVar.getCount());
            boolean z17 = currentItem < rVar.getCount() - 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasNextPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return z17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, "hasNextPage exp:" + e17.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasNextPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return true;
        }
    }

    public final boolean F7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasShowFloatView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        int childCount = this.L1.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            if (this.L1.getChildAt(i17) instanceof com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasShowFloatView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasShowFloatView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return false;
    }

    public void G7(boolean z17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideFloatBarView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar = this.f166696b2;
        if (yVar != null) {
            yVar.V(z17, j17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideFloatBarView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final void H7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideMoreOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f166740q2;
            if (k0Var != null && k0Var.i()) {
                this.f166740q2.u();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f166700d, "hideMoreOptionMenu exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideMoreOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(68:53|(1:302)(2:63|(1:65)(66:251|(2:253|(84:255|(1:257)|258|(1:260)|261|(1:263)|264|(1:266)|267|(1:269)|270|(1:272)|273|274|275|(1:279)|280|(1:284)|285|(1:289)|290|291|(2:293|(61:295|296|76|(2:78|(1:80)(57:81|82|(2:86|(4:87|(1:89)|90|(1:107)(7:92|(1:94)|95|(1:97)|98|(2:102|103)|104)))(0)|108|(1:110)|111|(1:113)|114|(1:116)|117|(1:119)|120|(1:122)|123|(1:125)|126|(1:128)|129|(1:131)|132|(1:134)|135|(1:137)(6:237|(1:239)|240|(1:248)(1:243)|(1:246)|247)|138|(1:140)|141|(1:143)|144|(3:146|(1:148)|149)|150|(3:152|(1:154)|155)|156|(1:158)|159|(1:161)|162|(4:164|(1:168)|169|(1:171))|172|(2:178|(18:180|181|182|183|(1:187)|189|(1:191)|192|(1:194)|195|(1:197)|198|(1:200)|201|(1:203)|204|(2:206|(2:208|(1:210)(2:211|(1:213)(2:214|(1:216)(2:217|(2:219|(2:221|(2:223|(1:225)))))))))|226)(4:228|(1:230)|231|(2:233|(1:235))))|236|181|182|183|(2:185|187)|189|(0)|192|(0)|195|(0)|198|(0)|201|(0)|204|(0)|226))|249|82|(3:84|86|(5:87|(0)|90|(0)(0)|104))(0)|108|(0)|111|(0)|114|(0)|117|(0)|120|(0)|123|(0)|126|(0)|129|(0)|132|(0)|135|(0)(0)|138|(0)|141|(0)|144|(0)|150|(0)|156|(0)|159|(0)|162|(0)|172|(4:174|176|178|(0)(0))|236|181|182|183|(0)|189|(0)|192|(0)|195|(0)|198|(0)|201|(0)|204|(0)|226))|297|296|76|(0)|249|82|(0)(0)|108|(0)|111|(0)|114|(0)|117|(0)|120|(0)|123|(0)|126|(0)|129|(0)|132|(0)|135|(0)(0)|138|(0)|141|(0)|144|(0)|150|(0)|156|(0)|159|(0)|162|(0)|172|(0)|236|181|182|183|(0)|189|(0)|192|(0)|195|(0)|198|(0)|201|(0)|204|(0)|226))|301|291|(0)|297|296|76|(0)|249|82|(0)(0)|108|(0)|111|(0)|114|(0)|117|(0)|120|(0)|123|(0)|126|(0)|129|(0)|132|(0)|135|(0)(0)|138|(0)|141|(0)|144|(0)|150|(0)|156|(0)|159|(0)|162|(0)|172|(0)|236|181|182|183|(0)|189|(0)|192|(0)|195|(0)|198|(0)|201|(0)|204|(0)|226))|66|(1:68)(1:250)|69|(1:71)|72|(1:74)|75|76|(0)|249|82|(0)(0)|108|(0)|111|(0)|114|(0)|117|(0)|120|(0)|123|(0)|126|(0)|129|(0)|132|(0)|135|(0)(0)|138|(0)|141|(0)|144|(0)|150|(0)|156|(0)|159|(0)|162|(0)|172|(0)|236|181|182|183|(0)|189|(0)|192|(0)|195|(0)|198|(0)|201|(0)|204|(0)|226) */
    /* JADX WARN: Removed duplicated region for block: B:107:0x060f A[EDGE_INSN: B:107:0x060f->B:108:0x060f BREAK  A[LOOP:0: B:87:0x059e->B:104:0x060c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0a07 A[Catch: all -> 0x0a1a, TryCatch #0 {all -> 0x0a1a, blocks: (B:183:0x0a03, B:185:0x0a07, B:187:0x0a0b), top: B:182:0x0a03 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I7() {
        /*
            Method dump skipped, instructions count: 3362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.I7():void");
    }

    public void J7() {
        java.lang.String str = "";
        java.lang.String str2 = this.f166700d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCfgBlackFixDevList", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (!android.text.TextUtils.isEmpty(this.X2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCfgBlackFixDevList", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        try {
            java.lang.String lowerCase = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_ad_landing_black_fix_device_list, "", true).toLowerCase();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (lowerCase != null) {
                str = lowerCase;
            }
            this.X2 = str;
            com.tencent.mars.xlog.Log.i(str2, "initCfgBlackFixDevList, devList=" + this.X2);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(str2, "initCfgBlackFixDevList, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCfgBlackFixDevList", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final void K7(za4.x0 x0Var) {
        f54.m mVar;
        android.widget.FrameLayout frameLayout;
        q54.a aVar;
        com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper floatJumpCompHelper;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initFloatJump", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ensureFloatCompHelperManager", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (this.f166694a2 == null) {
                this.f166694a2 = new q54.a();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ensureFloatCompHelperManager", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (x0Var != null && (mVar = x0Var.f471217d) != null && (frameLayout = this.R2) != null && (aVar = this.f166694a2) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFloatJumpCompHelper", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperManager");
                try {
                    floatJumpCompHelper = new com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper(mVar, frameLayout);
                    ((java.util.concurrent.ConcurrentHashMap) aVar.f360202a).put(java.lang.Integer.valueOf(mVar.f2827q), floatJumpCompHelper);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFloatJumpCompHelper", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperManager");
                } catch (java.lang.Throwable unused) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFloatJumpCompHelper", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperManager");
                    floatJumpCompHelper = null;
                }
                if (floatJumpCompHelper != null) {
                    this.f166730n3 = floatJumpCompHelper;
                    mo133getLifecycle().a(floatJumpCompHelper);
                    ab4.u uVar = x0Var.f471217d.I;
                    if (uVar != null) {
                        java.lang.String str = uVar.G;
                        if (!android.text.TextUtils.isEmpty(str)) {
                            ((java.util.HashSet) this.f166710g2).add(str);
                        }
                    }
                }
            }
        } catch (java.lang.Throwable unused2) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initFloatJump", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final void L7(za4.x0 x0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initFloatLinearLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
        if (x0Var.f471219f == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initFloatLinearLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) this.S1.get("." + this.D + ".adCanvasInfo.sizeType"), 0);
        int D12 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) this.S1.get("." + this.D + ".adCanvasInfo.basicRootFontSize"), 0);
        int D13 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) this.S1.get("." + this.D + ".adCanvasInfo.basicWidth"), 0);
        if (D12 == 0 && D1 == 1) {
            D12 = 10;
        }
        int i17 = D12;
        if (D13 == 0 && D1 == 1) {
            D13 = 750;
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e5 e5Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e5(this, x0Var.f471219f, this.R2, D1, D13, i17, this.F2);
        this.E2 = e5Var;
        e5Var.P();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initFloatLinearLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0008, B:5:0x0011, B:6:0x0018, B:8:0x001f, B:10:0x0029, B:13:0x003e, B:21:0x006f, B:27:0x0034, B:29:0x0038, B:26:0x002d), top: B:2:0x0008, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M7(za4.x0 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "initFloatPageView"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "ensureFloatCompHelperManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)     // Catch: java.lang.Throwable -> L72
            q54.a r3 = r7.f166694a2     // Catch: java.lang.Throwable -> L72
            if (r3 != 0) goto L18
            q54.a r3 = new q54.a     // Catch: java.lang.Throwable -> L72
            r3.<init>()     // Catch: java.lang.Throwable -> L72
            r7.f166694a2 = r3     // Catch: java.lang.Throwable -> L72
        L18:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)     // Catch: java.lang.Throwable -> L72
            q54.a r2 = r7.f166694a2     // Catch: java.lang.Throwable -> L72
            if (r2 == 0) goto L72
            java.lang.String r3 = "createFloatPageViewHelper"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)     // Catch: java.lang.Throwable -> L72
            r5 = 0
            if (r8 != 0) goto L2d
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)     // Catch: java.lang.Throwable -> L72
            goto L3b
        L2d:
            q54.b r6 = new q54.b     // Catch: java.lang.Throwable -> L38
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L38
            r2.f360203b = r6     // Catch: java.lang.Throwable -> L38
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)     // Catch: java.lang.Throwable -> L72
            goto L3c
        L38:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)     // Catch: java.lang.Throwable -> L72
        L3b:
            r6 = r5
        L3c:
            if (r6 == 0) goto L72
            android.widget.FrameLayout r8 = r7.R2     // Catch: java.lang.Throwable -> L72
            r6.a(r8, r5)     // Catch: java.lang.Throwable -> L72
            java.lang.String r8 = "showFloatPageViewIfAttached"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r2)     // Catch: java.lang.Throwable -> L72
            com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView r3 = r6.f360206c     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L67
            java.lang.String r4 = "playEnterAnimation"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)     // Catch: java.lang.Throwable -> L6f
            boolean r6 = r3.f170807n     // Catch: java.lang.Throwable -> L6f
            if (r6 != 0) goto L63
            android.animation.AnimatorSet r6 = r3.f170810q     // Catch: java.lang.Throwable -> L6f
            r6.start()     // Catch: java.lang.Throwable -> L6f
            r6 = 1
            r3.f170807n = r6     // Catch: java.lang.Throwable -> L6f
        L63:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)     // Catch: java.lang.Throwable -> L6f
            goto L6f
        L67:
            java.lang.String r3 = "SnsAd.FloatPageHelper"
            java.lang.String r4 = "the float view is null, is it attached??"
            com.tencent.mars.xlog.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L6f
        L6f:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r2)     // Catch: java.lang.Throwable -> L72
        L72:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.M7(za4.x0):void");
    }

    public final void N7(za4.x0 x0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initGlobalBackgroundView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (x0Var == null || (android.text.TextUtils.isEmpty(x0Var.f471223j) && x0Var.f471225l == 0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initGlobalBackgroundView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        this.T2.setVisibility(0);
        this.T2.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        int i17 = x0Var.f471224k;
        if (i17 == 1) {
            this.T2.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        } else if (i17 == 2) {
            this.T2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        this.T2.setBackgroundColor(x0Var.f471225l);
        com.tencent.mars.xlog.Log.i(this.f166700d, "initGlobalBackgroundView, scaleMode=" + x0Var.f471224k + ", defColor=" + x0Var.f471225l + ", url=" + x0Var.f471223j);
        a84.z.f(x0Var.f471223j, this.T2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initGlobalBackgroundView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x035b, code lost:
    
        if (r0 == false) goto L377;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O7() {
        /*
            Method dump skipped, instructions count: 2752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.O7():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P7(za4.x0 x0Var) {
        int i17;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initToolBarVoiceBtn", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        f54.a aVar = x0Var.f471220g;
        if (aVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initToolBarVoiceBtn", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        this.G2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d2(this, aVar, null, this.R);
        android.graphics.drawable.Drawable drawable = this.f166725m.getDrawable();
        java.lang.String str = this.f166700d;
        if (drawable != null) {
            i17 = drawable.getIntrinsicWidth();
            i18 = drawable.getIntrinsicHeight();
        } else {
            com.tencent.mars.xlog.Log.e(str, "initToolBarVoiceBtn() get drawable wh error!");
            i17 = 102;
            i18 = 102;
        }
        com.tencent.mars.xlog.Log.i(str, "initToolBarVoiceBtn() moreBtnHeight = " + i18 + " , moreBtnWidth = " + i17);
        final android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.n5_);
        imageView.setVisibility(0);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
            layoutParams.height = i18;
            layoutParams.width = i17;
            ((android.widget.FrameLayout.LayoutParams) layoutParams).rightMargin = i17 + i65.a.b(getContext(), 12);
        }
        final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d2 d2Var = this.G2;
        d2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        d2Var.A = new c01.k();
        final android.content.Context context = d2Var.f165138s;
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        } else {
            if (d2Var.R()) {
                imageView.setImageDrawable(i65.a.i(context, com.tencent.mm.R.raw.icon_volume_on));
            } else {
                imageView.setImageDrawable(i65.a.i(context, com.tencent.mm.R.raw.icon_volume_off));
            }
            imageView.setOnClickListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b2(d2Var, imageView, context));
            java.lang.String a17 = n01.c.a("sns_ad_landing_page_ui", dl3.h.a());
            kotlin.jvm.internal.o.f(a17, "createAudioPlayer(...)");
            d2Var.f165142w = a17;
            java.lang.String str2 = "snsvoice  create mBgmVoiceAudioPlayerId = [" + d2Var.f165142w + ']';
            java.lang.String str3 = d2Var.H;
            com.tencent.mars.xlog.Log.i(str3, str2);
            if (d2Var.R()) {
                n01.b bVar = new n01.b();
                bVar.f333836a = d2Var.f165142w;
                try {
                    f54.a aVar2 = d2Var.f165139t;
                    java.lang.String str4 = aVar2 != null ? aVar2.F : null;
                    if (str4 == null) {
                        str4 = "";
                    }
                    bVar.f333837b = str4;
                    bVar.f333843h = false;
                    bVar.f333842g = true;
                    n01.c.g(bVar);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e(str3, "snsvoice initToolBarVoiceBtn() called", e17);
                }
            } else {
                d2Var.f165145z = true;
            }
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AudioPlayerEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AudioPlayerEvent>(yVar) { // from class: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2
                {
                    this.__eventId = 1218151603;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent) {
                    java.lang.String str5;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2");
                    com.tencent.mm.autogen.events.AudioPlayerEvent event = audioPlayerEvent;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2");
                    kotlin.jvm.internal.o.g(event, "event");
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d2 d2Var2 = d2Var;
                    am.g0 g0Var = event.f53990g;
                    if (g0Var != null) {
                        try {
                            str5 = g0Var.f6718c;
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.e(d2Var2.S(), "voice event error", th6);
                        }
                        if (str5 != null) {
                            if (kotlin.jvm.internal.o.b(str5, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d2.P(d2Var2))) {
                                com.tencent.mars.xlog.Log.i(d2Var2.S(), "mAudioPlayerEventListener  event = [" + g0Var.f6716a + ']');
                                int i19 = g0Var.f6716a;
                                if (i19 != 4) {
                                    if (i19 == 5) {
                                        com.tencent.mars.xlog.Log.i(d2Var2.S(), "completed");
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlayCompletedCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                        int i27 = d2Var2.D;
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlayCompletedCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayCompletedCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                        d2Var2.D = i27 + 1;
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayCompletedCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                        try {
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdLandingPageComponetInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLandingPageComponetInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                            f54.a aVar3 = d2Var2.f165139t;
                                            java.lang.String str6 = aVar3 != null ? aVar3.F : null;
                                            if (str6 == null) {
                                                str6 = "";
                                            }
                                            n01.b bVar2 = new n01.b();
                                            bVar2.f333836a = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d2.P(d2Var2);
                                            bVar2.f333837b = str6;
                                            bVar2.f333843h = false;
                                            bVar2.f333842g = true;
                                            n01.c.g(bVar2);
                                        } catch (java.lang.Exception e18) {
                                            com.tencent.mars.xlog.Log.e(d2Var2.S(), "snsvoice initToolBarVoiceBtn() called", e18);
                                        }
                                    } else if (i19 == 7) {
                                        com.tencent.mars.xlog.Log.i(d2Var2.S(), "snsvoice onPrepared() called with: id = [" + g0Var.f6718c + ']');
                                        d2Var2.S();
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isPrepareEnd$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                        boolean z17 = d2Var2.f165144y;
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isPrepareEnd$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                        if (z17) {
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2");
                                        } else {
                                            int i28 = (int) g0Var.f6717b;
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMusicDuration$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                            d2Var2.F = i28;
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMusicDuration$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                            try {
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPrepareEnd$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                                d2Var2.f165144y = true;
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPrepareEnd$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isFrontBgmPlaying$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                                boolean z18 = d2Var2.f165143x;
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isFrontBgmPlaying$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                                if (z18) {
                                                    c01.k O = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d2.O(d2Var2);
                                                    if (O != null) {
                                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAudioRespond$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                                        c01.i iVar = d2Var2.G;
                                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAudioRespond$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                                        O.c(iVar);
                                                    }
                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResumePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                                    d2Var2.f165141v.b();
                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResumePlay", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlayCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                                    int i29 = d2Var2.C;
                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlayCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                                    d2Var2.C = i29 + 1;
                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayCount$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                                } else {
                                                    c01.k O2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d2.O(d2Var2);
                                                    if (O2 != null) {
                                                        O2.a();
                                                    }
                                                    n01.c.e(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d2.P(d2Var2));
                                                }
                                            } catch (java.lang.Exception e19) {
                                                com.tencent.mars.xlog.Log.e(d2Var2.S(), "snsvoice onPrepared() error", e19);
                                            }
                                        }
                                    }
                                    com.tencent.mars.xlog.Log.e(d2Var2.S(), "voice event error", th6);
                                } else {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPrepareEnd$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                    d2Var2.f165144y = false;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPrepareEnd$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setFrontBgmPlaying$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                    d2Var2.f165143x = false;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setFrontBgmPlaying$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setShouldPrepare$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                    d2Var2.f165145z = true;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setShouldPrepare$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
                                    imageView.setImageDrawable(i65.a.i(context, com.tencent.mm.R.raw.icon_volume_off));
                                    com.tencent.mars.xlog.Log.e(d2Var2.S(), "snsvoice onError() called with: code = [" + g0Var.f6721f + "], msg = [" + g0Var.f6722g + ']');
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2");
                            } else {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2");
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2");
                            return false;
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent$initComp$2");
                    return false;
                }
            };
            d2Var.B = iListener;
            iListener.alive();
            if (d2Var.R()) {
                d2Var.f165143x = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBgmVoiceComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initToolBarVoiceBtn", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public boolean S7() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHalfEggCardCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f166746t2;
        if (i0Var != null) {
            i0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHalfEggCardCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            boolean z18 = i0Var.U;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHalfEggCardCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            if (z18) {
                z17 = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHalfEggCardCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return z17;
            }
        }
        z17 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHalfEggCardCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z17;
    }

    public boolean T7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHalfModeFloatLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e5 e5Var = this.E2;
        if (e5Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
            if (e5Var.f165164t != null) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e5 e5Var2 = this.E2;
                e5Var2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                boolean z17 = e5Var2.f165164t.f2826p == 2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHalfModeFloatLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return z17;
            }
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar = this.f166696b2;
        if (yVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHalfModeFloatLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return false;
        }
        boolean Y = yVar.Y();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHalfModeFloatLayout", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return Y;
    }

    public boolean U7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isKeyboardShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z17 = this.f166701d2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isKeyboardShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z17;
    }

    public boolean V7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isMMLandingPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMMLandingPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return false;
    }

    public boolean W7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isNeedAlphaBackground", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        android.content.Intent intent = getIntent();
        java.lang.String str = this.f166700d;
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("sns_landing_pages_is_from_jspi", false);
            int intExtra = intent.getIntExtra("sns_landig_pages_from_source", 0);
            boolean z17 = intExtra == 24;
            boolean booleanExtra2 = intent.getBooleanExtra("sns_landing_pages_need_alpha_bkg", false);
            boolean booleanExtra3 = intent.getBooleanExtra("sns_landing_page_open_from_half_screen_mode", false);
            com.tencent.mars.xlog.Log.i(str, "isNeedAlphaBackground, isFromJsapi=" + booleanExtra + ", openSource=" + intExtra + ", isFromLivingRoom=" + z17 + ", isNeedAlphaAnim=" + booleanExtra2 + ", isOpenFromHalfScreenMode=" + booleanExtra3);
            if ((booleanExtra || z17 || booleanExtra3) && !booleanExtra2) {
                com.tencent.mars.xlog.Log.i(str, "isNeedAlphaBackground, false");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedAlphaBackground", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return false;
            }
        }
        com.tencent.mars.xlog.Log.i(str, "isNeedAlphaBackground, true");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isNeedAlphaBackground", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return true;
    }

    public void Z7() {
        java.lang.String str = this.f166700d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpNextPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            boolean E7 = E7();
            com.tencent.mars.xlog.Log.i(str, "jumpNextPage, hasNextPage=" + E7);
            if (E7) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager adlandingDummyViewPager = this.G1;
                adlandingDummyViewPager.A(adlandingDummyViewPager.getCurrentItem() + 1, true);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, "jumpNextPage exp:" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpNextPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final void a8() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadFirstPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        o8();
        gb4.r rVar = (gb4.r) this.G1.getAdapter();
        if (rVar == null) {
            rVar = new gb4.r(getSupportFragmentManager(), new java.util.ArrayList());
            this.G1.setAdapter(rVar);
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) x7();
        if (arrayList.size() > 0) {
            za4.g0 g0Var = (za4.g0) arrayList.get(0);
            com.tencent.mars.xlog.Log.i(this.f166700d, "loadFirstPage load id %s", java.lang.Integer.valueOf(g0Var.f471086f));
            java.util.HashMap hashMap = (java.util.HashMap) this.f166711g3;
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment) hashMap.get(java.lang.Integer.valueOf(g0Var.f471086f));
            if (contentFragment == null) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE_INFO, g0Var);
                hashMap2.put("pageCount", java.lang.Integer.valueOf(arrayList.size()));
                hashMap2.put("viewPager", this.G1);
                hashMap2.put("pageDownIconInfo", this.H1);
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                hashMap2.put("is_first_show_page", bool);
                if (arrayList.size() == 1) {
                    hashMap2.put("is_last_shown_page", bool);
                }
                hashMap2.put("needEnterAnimation", java.lang.Boolean.valueOf(this.f166749v));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canShowDownArrow", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                boolean z17 = (this.I1 & 8) == 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowDownArrow", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                hashMap2.put("needDirectionAnimation", java.lang.Boolean.valueOf(z17));
                hashMap2.put("groupListCompShowIndex", java.lang.Integer.valueOf(this.f166762z1));
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                contentFragment2.E = hashMap2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                gb4.p pVar = this.Y2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLifecycleLsn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                contentFragment2.A = pVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLifecycleLsn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                hashMap.put(java.lang.Integer.valueOf(g0Var.f471086f), contentFragment2);
                contentFragment = contentFragment2;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                if (contentFragment.B != g0Var) {
                    contentFragment.B = g0Var;
                    contentFragment.p0(g0Var);
                    contentFragment.w0();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            }
            rVar.b(contentFragment, 0);
            rVar.notifyDataSetChanged();
            this.G1.setOffscreenPageLimit(arrayList.size());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadFirstPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void b8() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadLandingPages", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        o8();
        gb4.r rVar = (gb4.r) this.G1.getAdapter();
        if (rVar == null) {
            rVar = new gb4.r(getSupportFragmentManager(), new java.util.ArrayList());
            this.G1.setAdapter(rVar);
        }
        java.util.List x76 = x7();
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) x76;
            if (i17 >= arrayList.size()) {
                rVar.notifyDataSetChanged();
                this.G1.setOffscreenPageLimit(arrayList.size());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadLandingPages", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return;
            }
            za4.g0 g0Var = (za4.g0) this.f166709g.get(i17);
            com.tencent.mars.xlog.Log.i(this.f166700d, "loadLandingPages load id %s", java.lang.Integer.valueOf(g0Var.f471086f));
            java.util.HashMap hashMap = (java.util.HashMap) this.f166711g3;
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment) hashMap.get(java.lang.Integer.valueOf(g0Var.f471086f));
            if (contentFragment == null) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE_INFO, g0Var);
                hashMap2.put("pageCount", java.lang.Integer.valueOf(arrayList.size()));
                hashMap2.put("viewPager", this.G1);
                hashMap2.put("pageDownIconInfo", this.H1);
                hashMap2.put("is_first_show_page", java.lang.Boolean.valueOf(i17 == 0));
                hashMap2.put("is_last_shown_page", java.lang.Boolean.valueOf(i17 == arrayList.size() - 1));
                hashMap2.put("needEnterAnimation", java.lang.Boolean.valueOf(this.f166749v));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canShowDownArrow", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                boolean z17 = (this.I1 & 8) == 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowDownArrow", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                hashMap2.put("needDirectionAnimation", java.lang.Boolean.valueOf(z17));
                hashMap2.put("groupListCompShowIndex", java.lang.Integer.valueOf(i17 == 0 ? this.f166762z1 : 0));
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                contentFragment2.E = hashMap2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                if (i17 == 0) {
                    gb4.p pVar = this.Y2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLifecycleLsn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                    contentFragment2.A = pVar;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLifecycleLsn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                }
                hashMap.put(java.lang.Integer.valueOf(g0Var.f471086f), contentFragment2);
                contentFragment = contentFragment2;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                if (contentFragment.B != g0Var) {
                    contentFragment.B = g0Var;
                    contentFragment.p0(g0Var);
                    contentFragment.w0();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            }
            rVar.b(contentFragment, i17);
            i17++;
        }
    }

    public void c8() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMoreBtnClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (this.f166725m.getVisibility() != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMoreBtnClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        H7();
        f8();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 1, false);
        this.f166740q2 = k0Var;
        k0Var.f211872n = new com.tencent.mm.plugin.sns.ui.ib(this);
        k0Var.X1 = true;
        k0Var.f211881s = new com.tencent.mm.plugin.sns.ui.jb(this);
        hideVKB();
        this.f166740q2.v();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMoreBtnClick", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertActivityFromTranslucent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (W7()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertActivityFromTranslucent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertActivityFromTranslucent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return true;
    }

    public void d8(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openUxCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_landig_pages_from_source", i18);
        int i19 = this.f166693J;
        if (i19 == 0) {
            i19 = this.I;
        }
        intent.putExtra("sns_landig_pages_origin_from_source", i19);
        intent.putExtra("sns_landing_pages_canvasid", str);
        intent.putExtra("sns_landing_pages_canvas_ext", str2);
        intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
        intent.putExtra("sns_landing_pages_no_store", i17);
        android.app.Activity activity = (android.app.Activity) context;
        java.lang.String stringExtra = activity.getIntent().getStringExtra("sns_landing_pages_sessionId");
        java.lang.String stringExtra2 = activity.getIntent().getStringExtra("sns_landing_pages_ad_buffer");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis() / 1000);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, valueOf);
                jSONObject.put("cid", "");
                jSONObject.put("adBuffer", com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2) ? "" : stringExtra2);
                jSONObject.put("preSessionId", stringExtra);
            } catch (java.lang.Exception unused) {
            }
            intent.putExtra("sns_landing_pages_search_extra", jSONObject.toString());
            intent.putExtra("sns_landing_pages_sessionId", valueOf);
            intent.putExtra("sns_landing_pages_ad_buffer", stringExtra2);
        }
        j45.l.j(context, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openUxCanvas", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void e8() {
        java.util.Map map;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pageLoaded", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        this.F2.setValue(2);
        java.util.LinkedList linkedList = this.f166709g;
        if (linkedList == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pageLoaded", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            map = this.f166711g3;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(((za4.g0) it.next()).f471086f));
            if (contentFragment != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMainPageLoaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toggleFloatBarView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI u07 = contentFragment.u0();
                if (u07 != null) {
                    u07.u8(0L);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toggleFloatBarView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMainPageLoaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            }
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment2 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(((za4.g0) this.f166709g.getFirst()).f471086f));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPageArrowViewAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar = this.f166696b2;
        if (yVar != null) {
            z17 = yVar.Z();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            z17 = false;
        }
        if (!z17) {
            contentFragment2.z0();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPageArrowViewAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pageLoaded", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final void f8() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshAuthStatus", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("sns_ad_landing_page_key");
        if (M != null) {
            this.K2 = M.getBoolean("canAutoFillData", false);
            this.L2 = M.getBoolean("canRequestLBS", false);
            com.tencent.mars.xlog.Log.i(this.f166700d, "mmkv read canAutoFillData = " + this.K2 + " canRequestLBS =" + this.L2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshAuthStatus", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        super.finish();
        if (l64.a.c(this.I)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1667, 15);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final boolean g7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canShowRightBarTitle", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z17 = (com.tencent.mm.sdk.platformtools.t8.K0(this.F) || com.tencent.mm.sdk.platformtools.t8.K0(this.G)) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowRightBarTitle", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z17;
    }

    public final void g8() {
        int i17;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z18 = true;
        if (this.B1 == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canShowMaskBg", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            boolean z19 = this.J1 == 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowMaskBg", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (!z19) {
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.G1.getLayoutParams();
                layoutParams.setMargins(0, 0, 0, com.tencent.mm.ui.bl.c(this));
                this.G1.setLayoutParams(layoutParams);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canShowMaskBg", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z27 = this.J1 == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowMaskBg", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (z27) {
            i17 = com.tencent.mm.R.color.a4r;
        } else {
            android.content.res.Resources resources = getResources();
            i17 = com.tencent.mm.R.color.a4q;
            int color = resources.getColor(com.tencent.mm.R.color.a4q);
            java.util.LinkedList linkedList = this.f166709g;
            if (linkedList != null && linkedList.size() > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(((za4.g0) this.f166709g.getFirst()).f471081a)) {
                color = ca4.n0.e(((za4.g0) this.f166709g.getFirst()).f471081a, 0);
            }
            this.M1.setBackgroundColor(color);
        }
        android.graphics.drawable.Drawable drawable = this.f166715i.getDrawable();
        if (drawable != null) {
            f3.b.g(drawable, b3.l.getColor(this, i17));
            this.f166715i.setImageDrawable(drawable);
        }
        android.graphics.drawable.Drawable drawable2 = this.f166725m.getDrawable();
        if (drawable2 != null) {
            f3.b.g(drawable2, b3.l.getColor(this, i17));
            this.f166725m.setImageDrawable(drawable2);
        }
        if (g7() && !h7() && this.B1 == 2) {
            this.f166725m.setVisibility(8);
            this.f166731o.setVisibility(0);
            this.f166731o.setText(this.F);
            this.f166731o.setOnClickListener(new com.tencent.mm.plugin.sns.ui.gb(this));
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canShowMenuBtn", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            int i18 = this.I1;
            if (i18 != 0) {
                if ((i18 & 4) != 0 && (i18 & 2) != 0 && (!h7() || this.B1 != 2)) {
                    int i19 = this.I1;
                    if ((i19 & 1) != 0 && (i19 & 32) != 0) {
                        z17 = false;
                        if (!z17 && !this.L2 && !this.K2) {
                            z18 = false;
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowMenuBtn", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    }
                }
                z17 = true;
                if (!z17) {
                    z18 = false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowMenuBtn", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowMenuBtn", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            }
            java.lang.String str = this.f166700d;
            if (z18) {
                com.tencent.mars.xlog.Log.i(str, "canShowMenuBtn=true, disableShareBitSet=" + this.I1);
                this.f166725m.setOnClickListener(new com.tencent.mm.plugin.sns.ui.hb(this));
            } else {
                com.tencent.mars.xlog.Log.i(str, "canShowMenuBtn=false, disableShareBitSet=" + this.I1);
                this.f166725m.setVisibility(8);
                try {
                    if (this.G2 != null) {
                        android.view.ViewGroup.LayoutParams layoutParams2 = ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.n5_)).getLayoutParams();
                        if (layoutParams2 instanceof android.widget.FrameLayout.LayoutParams) {
                            ((android.widget.FrameLayout.LayoutParams) layoutParams2).rightMargin = i65.a.b(getContext(), 8);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e(str, "refreshView voiceBtn error!", e17);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return com.tencent.mm.R.layout.f489495cq5;
    }

    public final boolean h7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canShowRightBarTitleInActionSheet", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z17 = (this.I1 & 16) == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canShowRightBarTitleInActionSheet", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return z17;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:1|(4:3|(1:5)(1:12)|6|(2:8|9)(1:11))|13|(2:16|14)|17|18|(2:20|(3:22|(1:24)|25))|26|(1:28)|29|(1:31)|32|(6:34|35|36|37|38|(1:40))|43|(1:45)|46|(1:48)(1:117)|49|(4:108|109|(1:111)(1:114)|112)|51|(4:54|(1:68)(3:56|57|(3:62|63|64))|65|52)|69|70|(2:103|104)|72|73|74|(11:95|96|77|(1:79)|80|81|82|(1:84)(2:89|(1:91)(1:92))|85|86|87)|76|77|(0)|80|81|82|(0)(0)|85|86|87) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x042c, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x042d, code lost:
    
        com.tencent.mars.xlog.Log.e(r14.f166700d, "report exp=" + r2.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2023, 12);
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0381 A[Catch: all -> 0x042c, TryCatch #4 {all -> 0x042c, blocks: (B:82:0x037c, B:84:0x0381, B:85:0x0405, B:89:0x03a2, B:91:0x03b0, B:92:0x03cf), top: B:81:0x037c }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03a2 A[Catch: all -> 0x042c, TryCatch #4 {all -> 0x042c, blocks: (B:82:0x037c, B:84:0x0381, B:85:0x0405, B:89:0x03a2, B:91:0x03b0, B:92:0x03cf), top: B:81:0x037c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h8() {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.h8():void");
    }

    public final void i7() {
        android.view.ViewStub viewStub;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkInflateFloatBottomContainer", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (this.P2 == null && (viewStub = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.g8u)) != null) {
            this.P2 = (android.widget.FrameLayout) viewStub.inflate();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkInflateFloatBottomContainer", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final void i8() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportEnter", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (this.f166722l1 != 2) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[7];
            za4.g1 g1Var = this.f166758y0;
            objArr[0] = ca4.z0.t0(ca4.z0.F0(g1Var.f471090a));
            java.lang.String str = this.V;
            if (str == null) {
                str = "";
            }
            objArr[1] = str;
            objArr[2] = java.lang.Integer.valueOf(g1Var.f471092c);
            objArr[3] = java.lang.Integer.valueOf(g1Var.f471094e);
            objArr[4] = java.lang.Long.valueOf(this.U);
            objArr[5] = java.lang.Integer.valueOf(this.f166693J);
            objArr[6] = g1Var.f471108s;
            g0Var.d(14655, objArr);
        }
        if (l64.a.c(this.I)) {
            if (this.f166747u == null) {
                l64.a.d(this.f166763z2, 8);
            } else {
                com.tencent.mars.xlog.Log.e(this.f166700d, "OpenSdkAdHelper, skip adOpenSucc report, for re open");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportEnter", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        super.initView();
        this.L1 = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.m7g);
        this.N1 = findViewById(com.tencent.mm.R.id.cgz);
        this.G1 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager) findViewById(com.tencent.mm.R.id.oxo);
        this.R2 = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.p2a);
        this.M1 = findViewById(com.tencent.mm.R.id.jgd);
        this.T2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.r0y);
        java.lang.String str = this.f166700d;
        com.tencent.mars.xlog.Log.i(str, "before, assistActivity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustLayoutForCutOut", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z18 = false;
        if (com.tencent.mm.ui.bk.u(getContext(), false)) {
            int p17 = com.tencent.mm.ui.bk.p(this);
            if (this.f166753x) {
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.gw6);
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) findViewById.getLayoutParams();
                layoutParams.topMargin = p17;
                findViewById.setLayoutParams(layoutParams);
                com.tencent.mars.xlog.Log.i(str, "adjustLayoutForCutOut, container top margin is " + p17 + ", screenHeight is " + this.Q1);
            } else if (this.U2) {
                android.view.ViewGroup.LayoutParams layoutParams2 = this.M1.getLayoutParams();
                layoutParams2.height += p17;
                this.M1.setPadding(0, p17, 0, 0);
                this.M1.setBackgroundResource(com.tencent.mm.R.raw.sns_ad_native_landing_page_navigation_fullscreen);
                com.tencent.mars.xlog.Log.i(str, "adjustLayoutForCutOut, menuContainer height is " + layoutParams2.height + ", cutH is " + p17 + ", screenHeight is " + this.Q1);
            } else {
                android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) this.L1.getLayoutParams();
                layoutParams3.height = this.Q1 - p17;
                layoutParams3.topMargin = p17;
                this.L1.setLayoutParams(layoutParams3);
                com.tencent.mars.xlog.Log.i(str, "adjustLayoutForCutOut, root height is " + layoutParams3.height + ", root top margin is " + p17 + ", screenHeight is " + this.Q1);
                this.H2.setValue(java.lang.Integer.valueOf(layoutParams3.height));
                getController().p0(getResources().getColor(com.tencent.mm.R.color.f478586bk));
            }
            if (this.f166753x || !this.U2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fixContentHeight", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                this.L1.addOnLayoutChangeListener(new com.tencent.mm.plugin.sns.ui.pb(this, p17));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixContentHeight", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            }
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.sns.ui.mb(this), 1500L);
        } else {
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.sns.ui.ob(this), 1500L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustLayoutForCutOut", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        this.f166745t = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ght);
        this.f166728n = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483044v3);
        this.f166715i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.n4m);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486998n51);
        android.widget.ImageView imageView = this.f166715i;
        android.view.View.OnClickListener onClickListener = this.f166733o3;
        imageView.setOnClickListener(onClickListener);
        textView.setOnClickListener(this.f166738p3);
        boolean c17 = l64.a.c(this.I);
        if (c17 && this.f166707f2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1667, 19);
        }
        com.tencent.mars.xlog.Log.i(str, "isFromOpenSdk=" + c17 + ", forbidBackToBizApp=" + this.f166707f2);
        if (c17 && !this.f166707f2) {
            textView.setVisibility(0);
            this.f166715i.setVisibility(8);
            this.f166742r2 = true;
            this.f166749v = false;
            java.lang.String str2 = this.f166763z2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackViewText", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper");
            java.lang.String a17 = l64.a.a(str2);
            com.tencent.mars.xlog.Log.i("LandingPageOpenSdkBackHelper", "initBackLayout, extra=" + str2);
            if (android.text.TextUtils.isEmpty(a17)) {
                com.tencent.mars.xlog.Log.e("LandingPageOpenSdkBackHelper", "appId is empty");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackViewText", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper");
            } else {
                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getOpenSdkAppInfo(a17, new v54.b(new java.lang.ref.WeakReference(textView), getString(com.tencent.mm.R.string.j6c)));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackViewText", "com.tencent.mm.plugin.sns.ad.landingpage.opensdk.LandingPageOpenSdkBackHelper");
            }
        } else if (!this.f166753x) {
            textView.setVisibility(8);
            this.f166715i.setVisibility(0);
        } else if (this.I == 24 || this.f166693J == 24) {
            ((android.view.ViewStub) findViewById(com.tencent.mm.R.id.gwo)).inflate().setOnClickListener(onClickListener);
            android.view.View view = this.M1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.gwf);
            imageView2.setImageResource(com.tencent.mm.R.drawable.bur);
            imageView2.setOnClickListener(onClickListener);
            android.view.View view2 = this.M1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f166725m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f486999n52);
        this.f166731o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487000n53);
        if (this.f166753x) {
            this.f166749v = false;
        }
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f166746t2;
        if (i0Var != null) {
            i0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initBeforeAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            boolean z19 = i0Var.f163115o;
            java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = i0Var.f163101a;
            if (z19 || i0Var.I) {
                android.view.View view3 = i0Var.f163116p;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (i0Var.f163125y) {
                    z17 = true;
                    i0Var.S(true);
                } else {
                    android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(i0Var.f163117q, "alpha", 0.0f, 0.2f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                    android.view.View view4 = i0Var.f163118r;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(valueOf);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    i0Var.f163120t.setAlpha(0.0f);
                    i0Var.S(i0Var.G);
                    z17 = true;
                }
                ca4.m0.l(snsAdNativeLandingPagesUI);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initBeforeAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                z18 = z17;
            } else {
                if (i0Var.f163104d) {
                    android.view.View view5 = i0Var.f163116p;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (!i0Var.f163125y) {
                        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(i0Var.f163117q, "alpha", 0.0f, 0.2f);
                        ofFloat2.setDuration(200L);
                        ofFloat2.start();
                        android.view.View view6 = i0Var.f163118r;
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        arrayList6.add(valueOf);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view6.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
                        yj0.a.f(view6, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                    ca4.m0.l(snsAdNativeLandingPagesUI);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initBeforeAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                } else if (i0Var.f163110j) {
                    android.view.View view7 = i0Var.f163116p;
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (!i0Var.f163125y) {
                        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(i0Var.f163117q, "alpha", 0.0f, 0.2f);
                        ofFloat3.setDuration(200L);
                        ofFloat3.start();
                        android.view.View view8 = i0Var.f163118r;
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        arrayList8.add(valueOf);
                        java.util.Collections.reverse(arrayList8);
                        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view8.setAlpha(((java.lang.Float) arrayList8.get(0)).floatValue());
                        yj0.a.f(view8, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                    ca4.m0.l(snsAdNativeLandingPagesUI);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initBeforeAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                } else if (i0Var.f163111k) {
                    android.view.View view9 = i0Var.f163116p;
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                    arrayList9.add(8);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(i0Var.f163117q, "alpha", 0.0f, 0.2f);
                    ofFloat4.setDuration(200L);
                    ofFloat4.start();
                    android.view.View view10 = i0Var.f163118r;
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    arrayList10.add(valueOf);
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view10.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                    yj0.a.f(view10, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    ca4.m0.l(snsAdNativeLandingPagesUI);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initBeforeAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                } else if (i0Var.f163113m) {
                    com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "initBeforeAnimation, longpressAnim");
                    android.view.View view11 = i0Var.f163116p;
                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                    arrayList11.add(8);
                    java.util.Collections.reverse(arrayList11);
                    yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                    yj0.a.f(view11, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view12 = i0Var.f163117q;
                    java.util.ArrayList arrayList12 = new java.util.ArrayList();
                    arrayList12.add(8);
                    java.util.Collections.reverse(arrayList12);
                    yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                    yj0.a.f(view12, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view13 = i0Var.f163118r;
                    java.util.ArrayList arrayList13 = new java.util.ArrayList();
                    arrayList13.add(valueOf);
                    java.util.Collections.reverse(arrayList13);
                    yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view13.setAlpha(((java.lang.Float) arrayList13.get(0)).floatValue());
                    yj0.a.f(view13, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "initBeforeAnimation", "()Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    ca4.m0.l(snsAdNativeLandingPagesUI);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initBeforeAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initBeforeAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                }
                z18 = true;
            }
            if (z18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return;
            }
        }
        if (this.f166749v) {
            this.L1.setAlpha(0.0f);
            this.f166745t.setAlpha(0.0f);
            ca4.m0.l(this);
        } else if (this.f166753x) {
            this.f166745t.setAlpha(0.0f);
            ca4.m0.l(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final void j7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkUpdateUxinfo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean X7 = X7(this.I);
        java.lang.String str = this.f166700d;
        if (!X7 || android.text.TextUtils.isEmpty(this.V)) {
            com.tencent.mars.xlog.Log.i(str, "checkUpdateUxinfo, no need, uxInfo=" + this.V);
        } else {
            com.tencent.mars.xlog.Log.i(str, "doUpdateUxInfoScene, uxInfo=" + this.V + ", source=" + this.I);
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().doUpdateUxInfoScene(this.V, this.I, new com.tencent.mm.plugin.sns.ui.db(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkPreloadScanRes", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            try {
                com.tencent.mars.xlog.Log.i(str, "checkPreloadScanRes, uxinfo=" + this.V);
                l44.o5.b(com.tencent.mm.plugin.sns.storage.h.a(this.S1, ".adxml.adScanInfo"), this.V);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(str, "checkPreloadScanRes exp=" + e17.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPreloadScanRes", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUpdateUxinfo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final void j8() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportOriginalExposure", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mars.xlog.Log.i(this.f166700d, "reportOriginalExposure viewId = " + this.f166713h2 + ", commInfo = " + this.f166716i2 + ", uxInfo = " + this.V + ", exposureType = 0");
        this.f166720k2 = true;
        n7(this.f166713h2, this.f166716i2, this.V, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportOriginalExposure", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final void k7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeCurPageVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        for (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var : z7().r0()) {
            if (a2Var instanceof ab4.b) {
                ((ab4.b) a2Var).P();
                a2Var.B();
            } else if (a2Var instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent) {
                ((com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent) a2Var).Z();
            } else if (a2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a) {
                l7((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a) a2Var, 0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeCurPageVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final void k8() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportValidExposure", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mars.xlog.Log.i(this.f166700d, "reportValidExposure viewId = " + this.f166713h2 + ", commInfo = " + this.f166716i2 + ", uxInfo = " + this.V + ", exposureType = 1");
        this.f166723l2 = true;
        n7(this.f166713h2, this.f166716i2, this.V, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportValidExposure", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void l7(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a aVar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeCurPageVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (!com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper.u()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeCurPageVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        if (i17 > 100) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeCurPageVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        if (aVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeCurPageVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        java.util.List<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2> O = aVar.O();
        if (a84.b0.b(O)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeCurPageVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        for (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var : O) {
            if (a2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a) {
                i17++;
                l7((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a) a2Var, i17);
            } else if (a2Var instanceof ab4.b) {
                ((ab4.b) a2Var).P();
                a2Var.B();
            } else if (a2Var instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent) {
                ((com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent) a2Var).Z();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeCurPageVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void l8() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            com.tencent.mars.xlog.Log.i(this.f166700d, "runExitAnimation, hash=" + hashCode());
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f166746t2;
            if (i0Var != null) {
                i0Var.H();
            }
            this.F2.setValue(3);
            for (com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView : ((java.util.HashMap) this.Z1).values()) {
                snsAdLandingPageFloatView.g();
                snsAdLandingPageFloatView.setVisibility(8);
            }
            hideVKB();
            H7();
            r7();
            h8();
            this.f166736p1 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f166700d, e17, "play exit animation error", new java.lang.Object[0]);
            finish();
        }
        if (this.f166753x) {
            k7();
            t7();
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar = this.f166696b2;
            if (yVar == null || !yVar.X()) {
                G7(false, 0L);
            } else {
                this.f166696b2.S();
            }
            n54.f fVar = this.B;
            if (fVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runExitAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
                fVar.f335129b.d();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnim", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
            } else {
                com.tencent.mars.xlog.Log.e(this.f166700d, "AdHalfScreenLandingPageHelper==null");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        android.view.View view = this.M1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI", "runExitAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI", "runExitAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var2 = this.f166746t2;
        if (i0Var2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowSimpleShakeAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            boolean z17 = i0Var2.f163111k;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowSimpleShakeAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            if (z17 && Q7(this.I)) {
                this.f166749v = false;
            }
        }
        if (!this.f166749v) {
            finish();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        if (this.W1) {
            com.tencent.mars.xlog.Log.i(this.f166700d, "is playing animation");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f166700d, "run exit animation, %s", java.lang.Boolean.valueOf(this.f166749v));
        this.W1 = true;
        if (getF65848t()) {
            getSwipeBackLayout().setEnableGesture(false);
        }
        k7();
        t7();
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var3 = this.f166746t2;
        if (i0Var3 != null && i0Var3.I(new com.tencent.mm.plugin.sns.ui.tb(this))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        } else {
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.sns.ui.ub(this), 30L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
    }

    public final void m7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doBackToThirdApp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String a17 = l64.a.a(this.f166763z2);
        com.tencent.mars.xlog.Log.i(this.f166700d, "doBackToThirdApp, appId=" + a17);
        if (!android.text.TextUtils.isEmpty(a17)) {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().launchBackApp(a17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBackToThirdApp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void m8() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mars.xlog.Log.i(this.f166700d, "setFullScreen");
        if (this.f166753x) {
            n54.f.d(this);
        } else if (this.U2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFullScreenIncludeCutOut", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            com.tencent.mars.xlog.Log.i("LandingPageUtil", "setFullScreenIncludeCutOut");
            getWindow().getDecorView().setSystemUiVisibility((getWindow().getDecorView().getSystemUiVisibility() & 8192) != 0 ? 13826 : 5634);
            getWindow().setStatusBarColor(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFullScreenIncludeCutOut", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFullScreenExcludeCutOut", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            boolean u17 = com.tencent.mm.ui.bk.u(this, false);
            com.tencent.mars.xlog.Log.i("LandingPageUtil", "setFullScreenExcludeCutout, hasCut=" + u17);
            getWindow().getDecorView().setSystemUiVisibility((!u17 ? 1542 : 514) | 4096);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFullScreenExcludeCutOut", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final void n8(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shareGiveHbCardInternal", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String u76 = u7(new com.tencent.mm.plugin.sns.ui.z7(str, str2, false, false));
        if (!android.text.TextUtils.isEmpty(str3)) {
            u76 = u76.replace("<adCanvasInfo>", "<adCanvasInfo>" + str3);
        }
        java.lang.String str7 = u76;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doTransimtForHBCard", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        za4.g1 g1Var = this.f166758y0;
        g1Var.f471100k++;
        java.lang.String v76 = v7();
        java.lang.String b17 = ca4.z0.b(this.N, this.V);
        if (!b17.contains("isInteractiveCanvas") && (this.f166752w2 || str7.contains("isInteractiveCanvas"))) {
            b17 = ca4.z0.d(b17, "isInteractiveCanvas", "1");
        }
        java.lang.String str8 = b17;
        com.tencent.mars.xlog.Log.i(this.f166700d, "doTransimtForHBCard, shareUrl=" + str8);
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance();
        java.lang.String str9 = this.V;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str10 = str9 == null ? "" : str9;
        java.lang.String str11 = g1Var.f471108s;
        adLandingPagesProxy.doTransimt(this, str7, str4, str6, str5, str8, v76, str10, str11 == null ? "" : str11);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doTransimtForHBCard", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareGiveHbCardInternal", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final void o7(yz5.l lVar) {
        za4.a aVar;
        long F0;
        java.lang.String openForAd;
        java.lang.String str = this.f166700d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doRequestDynamicCanvasXmlAndTransmit", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            aVar = new za4.a();
            aVar.f471056d = true;
            F0 = ca4.z0.F0(this.C2);
            com.tencent.mars.xlog.Log.i(str, "doRequestDynamicCanvasXml, pageId is " + this.C2 + ", pageIdParam is " + F0 + ", source is " + this.I + ", uxInfo is " + this.V + ", canvasDynamicInfo is " + this.M2 + ", adCanvasParams is " + aVar);
            openForAd = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().openForAd(F0, 0, 0, 0, this.I, this.V, this.M2, aVar);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(str, "doRequestDynamicCanvasXml, exp is " + th6);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(openForAd)) {
            p8(getString(com.tencent.mm.R.string.j7w));
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().requestAdCanvasXmlFromNet(F0, 0, 0, this.I, this.V, this.M2, aVar, new com.tencent.mm.plugin.sns.ui.xb(this, F0, lVar));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doRequestDynamicCanvasXmlAndTransmit", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        } else {
            com.tencent.mars.xlog.Log.i(str, "doRequestDynamicCanvasXml, canvasPageXml is existed");
            if (lVar != null) {
                lVar.invoke(openForAd);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doRequestDynamicCanvasXmlAndTransmit", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
    }

    public final void o8() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showDownloadAppLawInfoView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        android.widget.FrameLayout frameLayout = this.Q2;
        if (frameLayout == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showDownloadAppLawInfoView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        if (this.S2 == null) {
            frameLayout.setVisibility(8);
        } else if (frameLayout.getChildCount() == 0) {
            com.tencent.mars.xlog.Log.i(this.f166700d, "showDownloadAppLawInfoView, show downloadAppLawComp");
            this.Q2.addView(this.S2.x());
            this.Q2.setVisibility(0);
            this.S2.K();
            this.S2.J();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showDownloadAppLawInfoView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x010d, code lost:
    
        r9 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7) r9;
        r0 = r4.getIntExtra("KStreamVideoPlayCount", 0);
        r5 = r4.getIntExtra("KStreamVideoPlayCompleteCount", 0);
        r8 = r4.getIntExtra("KStreamVideoTotalPlayTimeInMs", 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("increaseStreamVideoPlayStatistics", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        r9.I += r0;
        r9.f165810J += r5;
        r9.K += r8;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("increaseStreamVideoPlayStatistics", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
     */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r33, int r34, android.content.Intent r35) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        super.onAttachedToWindow();
        t7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String str = this.f166700d;
        com.tencent.mars.xlog.Log.i(str, "onBackPressed");
        if (this.f166753x) {
            ((j40.p) ((zy2.r7) i95.n0.c(zy2.r7.class))).getClass();
            if (((com.tencent.mm.plugin.finder.viewmodel.component.di) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.di.class)).onBackPressed()) {
                com.tencent.mars.xlog.Log.i(str, "onBackPressed, checkHideH5Dialog true");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return;
            }
        }
        a54.e eVar = this.D2;
        eVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        android.view.View view = eVar.f1594b;
        boolean z17 = view != null && view.getVisibility() == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        if (z17) {
            a54.e eVar2 = this.D2;
            eVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
            ((ku5.t0) ku5.t0.f312615d).B(new a54.d(eVar2));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        if (this.f166760y2) {
            s7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        l8();
        if (l64.a.c(this.I) && !this.f166707f2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1667, 14);
            m7();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        super.onCreate(bundle);
        com.tencent.mm.sdk.platformtools.o4.M("SnsMMKV").G("SnsMMKVSnsUI", true);
        this.I = getIntent().getIntExtra("sns_landig_pages_from_source", 0);
        this.f166693J = getIntent().getIntExtra("sns_landig_pages_origin_from_source", 0);
        o54.f fVar = this.A2;
        boolean z17 = bundle != null;
        int i18 = this.I;
        boolean V7 = V7();
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        fVar.f343147m = z17;
        fVar.f343136b = java.lang.System.currentTimeMillis();
        fVar.f343143i = V7;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(ya.b.SOURCE, "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        fVar.f343145k = i18;
        int i19 = o54.g.f343148a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSourceForReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        if (i18 != 1) {
            if (i18 != 2) {
                if (i18 == 3) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceForReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                    i17 = 8;
                } else if (i18 != 4) {
                    if (i18 != 5) {
                        if (i18 != 13) {
                            if (i18 == 16) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceForReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i17 = 9;
                            } else if (i18 == 24) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceForReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i17 = 17;
                            } else if (i18 != 33) {
                                switch (i18) {
                                    case 27:
                                        break;
                                    case 28:
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceForReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                        i17 = 11;
                                        break;
                                    case 29:
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceForReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                        i17 = 13;
                                        break;
                                    case 30:
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceForReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                        i17 = 18;
                                        break;
                                    case 31:
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceForReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                        i17 = 20;
                                        break;
                                    default:
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceForReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                        i17 = 14;
                                        break;
                                }
                            } else {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceForReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                                i17 = 16;
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceForReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                        i17 = 12;
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceForReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
                        i17 = 7;
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceForReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
            i17 = 10;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSourceForReport", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
            i17 = 6;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper");
        o54.g.a(1673L, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(ya.b.SOURCE, "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        boolean z18 = fVar.f343147m;
        int i27 = fVar.f343145k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportOnCreateIdkey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        com.tencent.mars.xlog.Log.i("AdLandingPageStaticHelper", "reportOnCreateIdkey, isRestart=" + z18 + ", source=" + i27 + ", isMM=" + V7);
        if (V7) {
            str = "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper";
            o54.g.a(1673L, 34L);
        } else {
            str = "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper";
            o54.g.a(1673L, 21L);
        }
        if (z18) {
            o54.g.a(1673L, 24L);
            if (i27 == 29) {
                o54.g.a(1673L, 27L);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportOnCreateIdkey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showDebugProcessTip", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (V7() && ca4.m0.c0() && bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ad.RepairerConfigAdLandingPageProcessTip()) == 1) {
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "adLandingPage run in MM", 0).show();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showDebugProcessTip", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mars.xlog.Log.i(this.f166700d, "onCreate, source=" + this.I + ", originScene=" + this.f166693J + ", savedInstanceState=" + bundle + ", hash=" + hashCode());
        this.f166746t2 = new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0(this);
        this.D2 = new a54.e(this);
        f8();
        this.S = java.lang.System.currentTimeMillis();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.U = currentTimeMillis;
        this.f166758y0.f471109t = currentTimeMillis;
        boolean booleanExtra = getIntent().getBooleanExtra("sns_landing_page_half_screen_mode", false);
        this.f166753x = booleanExtra;
        if (!booleanExtra && ca4.m0.c0()) {
            this.f166753x = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ad.RepairerConfigAdLandingPageHalfScreen()) == 1;
            com.tencent.mars.xlog.Log.i(this.f166700d, "debugEnv, isHalfScreenMode=" + this.f166753x);
        }
        this.A = getIntent().getBooleanExtra("sns_landing_page_open_from_half_screen_mode", false);
        this.f166761z = getIntent().getIntExtra("sns_landing_page_half_screen_height", 0);
        boolean booleanExtra2 = getIntent().getBooleanExtra("sns_landing_page_half_screen_forbid_slide_top", false);
        this.f166757y = booleanExtra2;
        if (this.f166753x && !booleanExtra2 && ca4.m0.c0()) {
            this.f166757y = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ad.RepairerConfigHalfScreenForbidFullScreen()) == 1;
            com.tencent.mars.xlog.Log.i(this.f166700d, "debugEnv, isHalfScreenForbidSlideToTop=" + this.f166757y);
        }
        if (this.f166753x) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1673, 19);
        }
        this.f166747u = bundle;
        this.mController.J();
        long longExtra = getIntent().getLongExtra("sns_landing_page_start_time", 0L);
        getIntent().putExtra("sns_landing_page_start_time", 0L);
        o54.f fVar2 = this.A2;
        fVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        fVar2.f343135a = longExtra;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        getWindow().addFlags(128);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetExposureParam", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        this.f166718j2 = false;
        this.f166720k2 = false;
        this.f166723l2 = false;
        this.f166726m2 = false;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f166729n2;
        if (n3Var != null) {
            n3Var.removeCallbacks(this.f166705e3);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetExposureParam", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        O7();
        initView();
        if (com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().isConnected()) {
            com.tencent.mars.xlog.Log.i(this.f166700d, "isConnected==true");
            I7();
        } else {
            o54.f fVar3 = this.A2;
            fVar3.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ipcStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
            fVar3.f343139e = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ipcStart", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
            com.tencent.mars.xlog.Log.i(this.f166700d, "isConnected==false");
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().connect(new com.tencent.mm.plugin.sns.ui.rc(this));
        }
        this.f166699c3.alive();
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(this.f166721k3, new android.content.IntentFilter("android.intent.action.SCREEN_ON"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f166700d, "registerReceiver, exp=" + e17.toString());
        }
        o54.f fVar4 = this.A2;
        fVar4.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        fVar4.f343137c = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportEnterNetWorkType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        ((ku5.t0) ku5.t0.f312615d).g(new o54.e(fVar4));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportEnterNetWorkType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateEnd", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        o54.f fVar5 = this.A2;
        java.lang.String str2 = this.Q;
        fVar5.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        fVar5.f343144j = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        java.lang.String str3 = this.Q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recordSnsStart", str);
        o54.g.f343148a++;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordSnsStart", str);
        } else {
            java.util.HashMap hashMap = o54.g.f343149b;
            if (hashMap.containsKey(str3)) {
                java.lang.Integer num = (java.lang.Integer) hashMap.get(str3);
                if (num != null) {
                    hashMap.put(str3, java.lang.Integer.valueOf(num.intValue() + 1));
                }
            } else {
                hashMap.put(str3, 1);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordSnsStart", str);
        }
        o54.p pVar = o54.p.f343160a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        ((ku5.t0) ku5.t0.f312615d).g(o54.o.f343159d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportUI", "com.tencent.mm.plugin.sns.ad.utils.UIInfoReporter");
        try {
            a84.w0.f2371a.a(this);
        } catch (java.lang.Throwable th6) {
            ca4.q.c("UIInfoReporterError", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportUI", "com.tencent.mm.plugin.sns.ad.utils.UIInfoReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String str = "SnsAdNativeLadingPagesUI onDestroy, isConnected=" + this.O1 + ", bHandleExit=" + this.f166736p1 + ", hash=" + hashCode();
        java.lang.String str2 = this.f166700d;
        com.tencent.mars.xlog.Log.i(str2, str);
        com.tencent.mm.sdk.platformtools.o4.M("SnsMMKV").G("SnsMMKVSnsUI", false);
        o54.f fVar = this.A2;
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        boolean z17 = fVar.f343147m;
        int i17 = fVar.f343145k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportOnDestroyIdkey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        com.tencent.mars.xlog.Log.i("AdLandingPageStaticHelper", "reportOnDestroyIdkey, isRestart=" + z17 + ", source=" + i17);
        o54.g.a(1673L, 22L);
        if (z17) {
            o54.g.a(1673L, 25L);
        }
        if (i17 == 29) {
            o54.g.a(1667L, 11L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportOnDestroyIdkey", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        getWindow().clearFlags(128);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f166729n2;
        if (n3Var != null) {
            n3Var.removeCallbacks(this.f166705e3);
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar = this.f166696b2;
        if (yVar != null) {
            yVar.L();
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = this.S2;
        if (a2Var != null) {
            a2Var.L();
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e5 e5Var = this.E2;
        if (e5Var != null) {
            e5Var.L();
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d2 d2Var = this.G2;
        if (d2Var != null) {
            d2Var.L();
        }
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f166746t2;
        jz5.f0 f0Var = null;
        if (i0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            try {
                com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "onDestroy");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindMemCache", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                a84.z.f2379a = null;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindMemCache", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                i0Var.S.removeCallbacksAndMessages(null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopListenEncoreEvent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                i0Var.R.dead();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopListenEncoreEvent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b0 b0Var = i0Var.f163107g;
                if (b0Var != null) {
                    b0Var.i0(false);
                }
                com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView gLTwistRoateCardsView = i0Var.f163103c;
                if (gLTwistRoateCardsView != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
                    gLTwistRoateCardsView.G.quitSafely();
                    gLTwistRoateCardsView.F.removeCallbacksAndMessages(null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
                }
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.q3 q3Var = i0Var.C;
                if (q3Var != null) {
                    q3Var.T();
                }
                if (i0Var.f163124x) {
                    p44.b0.l(null);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdLandingPageEggCardHelper", "onDestroy, exp=" + th6.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        }
        java.util.HashMap hashMap = (java.util.HashMap) this.Z1;
        for (com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView : hashMap.values()) {
            snsAdLandingPageFloatView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            if (snsAdLandingPageFloatView.f170802f != null && !snsAdLandingPageFloatView.f170808o) {
                snsAdLandingPageFloatView.f170808o = true;
                snsAdLandingPageFloatView.f170804h.L();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            snsAdLandingPageFloatView.setVisibility(8);
        }
        if (this.O1) {
            com.tencent.mars.xlog.Log.i(str2, "the SnsAdNativeLadingPagesUI is destroy, bHandleExit=" + this.f166736p1);
            if (!this.f166736p1) {
                r7();
                h8();
            }
        } else {
            com.tencent.mars.xlog.Log.e(str2, "onDestroy, isConnected=false");
        }
        s54.c a17 = s54.c.a();
        a17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        di3.d dVar = a17.f403184f;
        if (dVar != null) {
            dVar.disable();
            a17.f403184f.f232689g = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        ((java.util.HashMap) a17.f403182d).clear();
        a17.f403184f = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        hashMap.clear();
        gb4.r rVar = (gb4.r) this.G1.getAdapter();
        if (rVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
            rVar.f270079i.clear();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
        }
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(this.f166721k3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str2, "unregisterReceiver, exp=" + e17.toString());
        }
        this.f166699c3.dead();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishDestroyEvent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            com.tencent.mm.autogen.events.SnsAdNativePageLifecycleEvent snsAdNativePageLifecycleEvent = new com.tencent.mm.autogen.events.SnsAdNativePageLifecycleEvent();
            snsAdNativePageLifecycleEvent.f54796g.f6611a = 5;
            snsAdNativePageLifecycleEvent.e();
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishDestroyEvent", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().clearCallback();
        if (this.f166753x && !this.A) {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().setHalfScreenLandingPageShow(false);
        }
        java.util.Map map = e64.p.f249838a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        try {
            e64.e eVar = (e64.e) e64.p.f249838a.remove(java.lang.Integer.valueOf(hashCode()));
            if (eVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
                e64.h hVar = eVar.f249822b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
                if (hVar != null) {
                    hVar.destroy();
                }
                h64.a a18 = eVar.a();
                if (a18 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear$plugin_sns_release", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
                    ((java.util.LinkedHashMap) a18.f279309b).clear();
                    ((java.util.LinkedHashMap) a18.f279308a).clear();
                    ((java.util.LinkedHashMap) a18.f279310c).clear();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear$plugin_sns_release", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
                }
                com.tencent.mars.xlog.Log.i("SnsAdMB", "the biz is destroying");
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i("SnsAdMB", "the magic brush data is null, need not destroy");
            }
            e64.p.f249839b.remove(java.lang.Integer.valueOf(hashCode()));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("SnsAdMB", "there is an exception in destroy: " + e18.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroy", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onKeyboardStateChanged() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onKeyboardStateChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        super.onKeyboardStateChanged();
        com.tencent.mars.xlog.Log.i(this.f166700d, "onKeyboardStateChanged, state=" + keyboardState());
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager adlandingDummyViewPager = this.G1;
        if (adlandingDummyViewPager != null) {
            adlandingDummyViewPager.postDelayed(new com.tencent.mm.plugin.sns.ui.ec(this), 500L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyboardStateChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        super.onPause();
        java.lang.String str = "onPause, hash=" + hashCode();
        java.lang.String str2 = this.f166700d;
        com.tencent.mars.xlog.Log.i(str2, str);
        this.X1 = true;
        if (this.f166753x && !isFinishing() && !S7()) {
            this.f166708f3 = true;
            com.tencent.mars.xlog.Log.i(str2, "notifyFinderVideoPlayStateToChange, play=false");
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().notifyFinderVideoPlayStateToChange(false);
        }
        if (this.O1) {
            this.T += java.lang.System.currentTimeMillis() - this.S;
        }
        if (F7()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseFloatView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            java.util.Iterator it = ((java.util.HashMap) this.Z1).values().iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView) it.next()).g();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseFloatView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager adlandingDummyViewPager = this.G1;
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener = this.Z2;
        adlandingDummyViewPager.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removePageChangeListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager");
        ((java.util.HashSet) adlandingDummyViewPager.G1).remove(onPageChangeListener);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removePageChangeListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager");
        if (!this.f166760y2) {
            b4.d.a(this).d(this.V2);
        }
        b4.d.a(this).d(this.W2);
        if (!this.f166760y2) {
            this.f166697b3.dead();
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k2 k2Var = this.f166724l3;
        if (k2Var != null) {
            k2Var.a();
        }
        if (!this.f166760y2 && (yVar = this.f166696b2) != null && yVar.Z()) {
            this.f166696b2.M();
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e5 e5Var = this.E2;
        if (e5Var != null) {
            e5Var.M();
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d2 d2Var = this.G2;
        if (d2Var != null) {
            d2Var.M();
        }
        if (this.f166760y2 && (adLandingGeneralVideoWrapper = this.f166756x2) != null && adLandingGeneralVideoWrapper.p()) {
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper2 = this.f166756x2;
            adLandingGeneralVideoWrapper2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("disappearFullScreenFloatBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q0 q0Var = adLandingGeneralVideoWrapper2.f162997J;
            if (q0Var != null) {
                q0Var.M();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("disappearFullScreenFloatBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        }
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f166746t2;
        if (i0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopListenEncoreEvent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            i0Var.R.dead();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopListenEncoreEvent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView snsAdLandingPageFloatView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String str = "onResume, hash=" + hashCode();
        java.lang.String str2 = this.f166700d;
        com.tencent.mars.xlog.Log.i(str2, str);
        super.onResume();
        o54.f fVar = this.A2;
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        if (fVar.f343138d == 0) {
            fVar.f343138d = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
        if (this.f166742r2 && getF65848t()) {
            getSwipeBackLayout().setEnableGesture(false);
        }
        m8();
        if (F7()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopFloatView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            int childCount = this.L1.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopFloatView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    snsAdLandingPageFloatView = null;
                    break;
                } else {
                    android.view.View childAt = this.L1.getChildAt(childCount);
                    if (childAt instanceof com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView) {
                        snsAdLandingPageFloatView = (com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView) childAt;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopFloatView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        break;
                    }
                }
            }
            snsAdLandingPageFloatView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            if (snsAdLandingPageFloatView.f170803g != null) {
                snsAdLandingPageFloatView.f170804h.K();
                snsAdLandingPageFloatView.post(new com.tencent.mm.plugin.sns.ui.widget.p0(snsAdLandingPageFloatView));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        this.X1 = false;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager adlandingDummyViewPager = this.G1;
        androidx.viewpager.widget.ViewPager.OnPageChangeListener onPageChangeListener = this.Z2;
        adlandingDummyViewPager.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addOnPageChangeListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager");
        ((java.util.HashSet) adlandingDummyViewPager.G1).add(onPageChangeListener);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addOnPageChangeListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager");
        if (!this.f166760y2) {
            b4.d.a(this).b(this.V2, new android.content.IntentFilter("com.tencent.mm.adlanding.video_progressbar_change"));
        }
        b4.d.a(this).b(this.W2, new android.content.IntentFilter("com.tencent.mm.adlanding.set_uioption"));
        if (this.O1) {
            this.S = java.lang.System.currentTimeMillis();
        }
        if (!this.f166760y2) {
            this.f166697b3.alive();
        }
        if (this.A1) {
            s8(false);
        }
        if (!this.f166760y2 && (yVar = this.f166696b2) != null && yVar.Z()) {
            this.f166696b2.K();
        }
        if (this.f166760y2 && (adLandingGeneralVideoWrapper = this.f166756x2) != null && adLandingGeneralVideoWrapper.p()) {
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper2 = this.f166756x2;
            adLandingGeneralVideoWrapper2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appearFullScreenFloatBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q0 q0Var = adLandingGeneralVideoWrapper2.f162997J;
            if (q0Var != null) {
                q0Var.K();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appearFullScreenFloatBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e5 e5Var = this.E2;
        if (e5Var != null) {
            e5Var.K();
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d2 d2Var = this.G2;
        if (d2Var != null) {
            d2Var.K();
        }
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f166746t2;
        if (i0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startListenEncoreEvent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
            if (i0Var.f163110j || i0Var.f163104d) {
                i0Var.R.alive();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListenEncoreEvent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        }
        if (this.f166708f3) {
            this.f166708f3 = false;
            com.tencent.mars.xlog.Log.i(str2, "notifyFinderVideoPlayStateToChange, play=true");
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().notifyFinderVideoPlayStateToChange(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        super.onStart();
        this.f166718j2 = true;
        if (this.O1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("validExposureOneMoreCheck", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            try {
                if (!com.tencent.mm.sdk.platformtools.t8.N0(this.f166713h2, this.f166716i2) && !this.f166723l2) {
                    if (this.f166726m2) {
                        com.tencent.mars.xlog.Log.i(this.f166700d, "execute mValidExposure onStart immediately");
                        k8();
                    } else if (this.f166729n2 != null) {
                        com.tencent.mars.xlog.Log.i(this.f166700d, "execute mValidExposureRunnable onStart");
                        this.f166729n2.removeCallbacks(this.f166705e3);
                        this.f166729n2.postDelayed(this.f166705e3, 1000L);
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e(this.f166700d, th6.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("validExposureOneMoreCheck", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        super.onStop();
        com.tencent.mars.xlog.Log.i(this.f166700d, "onStop, hash=" + hashCode());
        this.f166718j2 = false;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f166729n2;
        if (n3Var != null) {
            n3Var.removeCallbacks(this.f166705e3);
        }
        if (this.f166753x && !isFinishing() && S7()) {
            this.f166708f3 = true;
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().notifyFinderVideoPlayStateToChange(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSwipeBack", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        za4.g1 g1Var = this.f166758y0;
        g1Var.f471093d = 2;
        g1Var.f471096g++;
        super.onSwipeBack();
        try {
            hideVKB();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f166700d, "onSwipeBack hideVKB exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSwipeBack", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        super.onWindowFocusChanged(z17);
        java.lang.String str = this.f166700d;
        com.tencent.mars.xlog.Log.i(str, "hasFocus = " + z17);
        if (z17) {
            try {
                t7();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e(str, "hasFocus=" + z17 + ", exp=" + th6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final void p7(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doShareToChatInternal", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String u76 = u7(new com.tencent.mm.plugin.sns.ui.z7(str, str2, true, false));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doTransimt", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String str3 = this.f166700d;
        com.tencent.mars.xlog.Log.i(str3, "doTransimt snsAdNativeLadingPagesUI");
        za4.g1 g1Var = this.f166758y0;
        g1Var.f471100k++;
        java.lang.String v76 = v7();
        com.tencent.mm.plugin.sns.ui.tc B7 = B7();
        java.lang.String b17 = ca4.z0.b(this.N, this.V);
        if (!b17.contains("isInteractiveCanvas") && (this.f166752w2 || u76.contains("isInteractiveCanvas"))) {
            b17 = ca4.z0.d(b17, "isInteractiveCanvas", "1");
        }
        java.lang.String str4 = b17;
        com.tencent.mars.xlog.Log.i(str3, "doTransimt, shareUrl=" + str4);
        if (B7 != null) {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance();
            java.lang.String str5 = B7.f170504a;
            java.lang.String C7 = C7(B7.f170506c);
            java.lang.String str6 = B7.f170505b;
            java.lang.String str7 = this.V;
            java.lang.String str8 = str7 == null ? "" : str7;
            java.lang.String str9 = g1Var.f471108s;
            adLandingPagesProxy.doTransimt(this, u76, str5, C7, str6, str4, v76, str8, str9 == null ? "" : str9);
        } else {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy2 = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance();
            java.lang.String str10 = this.L;
            java.lang.String C72 = C7(this.K);
            java.lang.String str11 = this.M;
            java.lang.String str12 = this.V;
            if (str12 == null) {
                str12 = "";
            }
            java.lang.String str13 = g1Var.f471108s;
            adLandingPagesProxy2.doTransimt(this, u76, str10, C72, str11, str4, v76, str12, str13 == null ? "" : str13);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doTransimt", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doShareToChatInternal", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void p8(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        a54.e eVar = this.D2;
        eVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        ((ku5.t0) ku5.t0.f312615d).B(new a54.c(eVar, str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final void q7(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doShareToTimelineInternal", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String u76 = u7(new com.tencent.mm.plugin.sns.ui.z7(str, str2, true, false));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doShareToTimeline", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String str3 = this.f166700d;
        com.tencent.mars.xlog.Log.i(str3, "doShareToTimeline snsAdNativeLadingPagesUI");
        this.f166758y0.f471099j++;
        java.lang.String str4 = this.N;
        com.tencent.mm.plugin.sns.ui.tc B7 = B7();
        if (str4 == null || str4.length() == 0) {
            com.tencent.mars.xlog.Log.e(str3, "doTimeline fail, link is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doShareToTimeline", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        } else {
            java.lang.String b17 = ca4.z0.b(this.N, this.V);
            if (!b17.contains("isInteractiveCanvas") && (this.f166752w2 || u76.contains("isInteractiveCanvas"))) {
                b17 = ca4.z0.d(b17, "isInteractiveCanvas", "1");
            }
            com.tencent.mars.xlog.Log.i(str3, "doShareToTimeline, shareUrl=" + b17);
            int i17 = this.f166741r;
            com.tencent.mars.xlog.Log.i(str3, "doTimeline, init intent");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Ksnsupload_width", i17);
            intent.putExtra("Ksnsupload_height", i17);
            intent.putExtra("Ksnsupload_link", b17);
            if (B7 != null) {
                intent.putExtra("Ksnsupload_title", B7.f170504a);
                intent.putExtra("Ksnsupload_imgurl", C7(B7.f170506c));
            } else {
                intent.putExtra("Ksnsupload_title", this.L);
                intent.putExtra("Ksnsupload_imgurl", C7(this.K));
            }
            intent.putExtra("Ksnsupload_canvas_info", u76);
            intent.putExtra("Ksnsupload_contentattribute", 0);
            intent.putExtra("Ksnsupload_source", 1);
            intent.putExtra("Ksnsupload_type", 1);
            java.lang.String v76 = v7();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(v76)) {
                intent.putExtra("key_snsad_statextstr", v76);
            }
            com.tencent.mars.xlog.Log.i(str3, "doTimeline, start activity");
            intent.putExtra("need_result", true);
            int i18 = this.I;
            java.lang.String str5 = "sns_";
            if (i18 == 1 || i18 == 2 || i18 == 3 || i18 == 4 || i18 == 9 || i18 == 10 || i18 == 11) {
                str5 = "sns_" + this.P;
            } else if (i18 == 5 || i18 == 6) {
                str5 = "msg_" + getIntent().getExtras().getLong("msg_id", -2147483648L);
            } else if (i18 == 7) {
                str5 = "fav_" + getIntent().getExtras().getString("sns_landing_favid");
            }
            java.lang.String a17 = c01.n2.a(str5);
            c01.n2.d().c(a17, true).i("prePublishId", str5);
            intent.putExtra("reportSessionId", a17);
            intent.putExtra("KSnsIsUploadAdLandingPage", true);
            j45.l.o(getContext(), "sns", ".ui.SnsUploadUI", intent, 2001, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doShareToTimeline", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doShareToTimelineInternal", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void q8() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("signFirstSightVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.util.List w76 = w7();
        if (w76 != null && w76.size() > 0) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) w76.get(0);
            boolean z17 = a2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7;
            java.lang.String str = this.f166700d;
            if (z17) {
                ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7) a2Var).I1 = true;
                com.tencent.mars.xlog.Log.i(str, "snsId = " + this.P + ", adSightVideoSeekTime = " + this.f166750v2 + ", isFirstSightVideoComp = true");
            } else if (a2Var instanceof com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1) {
                ((com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f1) a2Var).M = true;
                com.tencent.mars.xlog.Log.i(str, "snsId = " + this.P + ", adVideoSeekTime = " + this.f166750v2 + ", isFirstVideoComp = true");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("signFirstSightVideoComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void r7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endCompExposure", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        gb4.r rVar = (gb4.r) this.G1.getAdapter();
        if (rVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endCompExposure", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllFragment", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllFragment", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
        java.util.Iterator it = rVar.f270079i.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment) ((androidx.fragment.app.Fragment) it.next());
            contentFragment.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            if (contentFragment.f165739f != null && contentFragment.getUserVisibleHint()) {
                contentFragment.f165739f.b();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar = this.f166696b2;
        if (yVar != null) {
            yVar.M();
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e5 e5Var = this.E2;
        if (e5Var != null) {
            e5Var.M();
        }
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d2 d2Var = this.G2;
        if (d2Var != null) {
            d2Var.M();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endCompExposure", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final void r8() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startExposureCalculate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.N0(this.f166713h2, this.f166716i2)) {
                if (!this.f166720k2) {
                    j8();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1673, 30);
                }
                if (!this.f166723l2 && this.f166729n2 != null) {
                    com.tencent.mars.xlog.Log.i(this.f166700d, "execute mValidExposureRunnable onCreate");
                    this.f166729n2.removeCallbacks(this.f166705e3);
                    this.f166729n2.postDelayed(this.f166705e3, 1000L);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(this.f166700d, th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startExposureCalculate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void s7() {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exitFullScreenVideo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        this.f166760y2 = false;
        s54.c a17 = s54.c.a();
        a17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        di3.d dVar = a17.f403184f;
        if (dVar != null) {
            dVar.disable();
            a17.f403184f.f232689g = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper = this.f166756x2;
        if (adLandingGeneralVideoWrapper != null) {
            adLandingGeneralVideoWrapper.A();
            this.f166756x2.setFullScreen(this.f166760y2);
            com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper adLandingGeneralVideoWrapper2 = this.f166756x2;
            adLandingGeneralVideoWrapper2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeFullScreenFloatBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q0 q0Var = adLandingGeneralVideoWrapper2.f162997J;
            if (q0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeFromParent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                android.view.ViewGroup viewGroup = q0Var.f165422x;
                if (viewGroup != null) {
                    viewGroup.removeView(q0Var.f165419u);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeFromParent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFullScreenFloatBarComp");
                adLandingGeneralVideoWrapper2.f162997J.L();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeFullScreenFloatBar", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdLandingGeneralVideoWrapper");
            android.view.ViewGroup videoCompContainer = this.f166756x2.getVideoCompContainer();
            com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar toolBar = this.f166756x2.getToolBar();
            toolBar.a(false);
            this.f166756x2.setAnimImmediately(true);
            this.f166756x2.w(0);
            this.f166756x2.g(false);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.f166756x2.getParent();
            this.L1.removeView(viewGroup2);
            viewGroup2.removeView(this.f166756x2);
            viewGroup2.removeView(toolBar);
            if (!this.f166742r2) {
                getSwipeBackLayout().setEnableGesture(true);
            }
            videoCompContainer.addView(this.f166756x2);
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            videoCompContainer.addView(toolBar, layoutParams);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("landingPagesFullScreenResume", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            b4.d.a(this).b(this.V2, new android.content.IntentFilter("com.tencent.mm.adlanding.video_progressbar_change"));
            this.f166697b3.alive();
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y yVar = this.f166696b2;
            if (yVar != null && yVar.Z()) {
                this.f166696b2.K();
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e5 e5Var = this.E2;
            if (e5Var != null) {
                e5Var.K();
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.d2 d2Var = this.G2;
            if (d2Var != null) {
                d2Var.K();
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment z76 = z7();
            z76.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fragmentFullScreenResume", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            z76.f165755y = false;
            z76.f165741h = true;
            gb4.q qVar = z76.C;
            if (qVar != null && (view = qVar.f270071a) != null) {
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) view.getParent();
                while (viewGroup3 != null && viewGroup3.getId() != com.tencent.mm.R.id.m7g) {
                    viewGroup3 = (android.view.ViewGroup) viewGroup3.getParent();
                }
                if (viewGroup3 instanceof android.widget.FrameLayout) {
                    int childCount = viewGroup3.getChildCount();
                    for (int i17 = 0; i17 < childCount; i17++) {
                        if (viewGroup3.getChildAt(i17) instanceof com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView) {
                            z76.f165741h = false;
                        }
                    }
                }
            }
            z76.f165739f.c(z76.f165741h);
            if (z76.f165739f != null && z76.getUserVisibleHint()) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.e0 e0Var = z76.f165739f;
                za4.g0 g0Var = z76.B;
                java.lang.String str = z76.f165756z;
                e0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyOtherChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                if (e0Var.f165646d) {
                    androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = e0Var.f165644b;
                    if (linearLayoutManager != null) {
                        int w17 = linearLayoutManager.w();
                        int y17 = linearLayoutManager.y();
                        if (w17 == y17 && w17 == -1) {
                            com.tencent.mars.xlog.Log.i("RecyclerViewExposureMgr", "no exposuring child");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyOtherChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startOtherItemsExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                            while (w17 <= y17) {
                                if (!((ab4.d0) g0Var.f471083c.get(w17)).f2817d.equals(str)) {
                                    java.util.HashMap hashMap = (java.util.HashMap) e0Var.f165643a;
                                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a0 a0Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a0) hashMap.get(java.lang.Integer.valueOf(w17));
                                    if (a0Var == null) {
                                        a0Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.a0(e0Var, null);
                                        hashMap.put(java.lang.Integer.valueOf(w17), a0Var);
                                    }
                                    gb4.b bVar = (gb4.b) e0Var.f165645c;
                                    if (bVar.J(w17)) {
                                        if (!a0Var.f165631a) {
                                            bVar.y(w17, e0Var);
                                            a0Var.a();
                                        } else if (bVar.I(w17)) {
                                            bVar.K(w17);
                                        }
                                    }
                                }
                                w17++;
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startOtherItemsExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyOtherChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyOtherChildrenAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fragmentFullScreenResume", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("landingPagesFullScreenResume", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exitFullScreenVideo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public void s8(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("syncDynamicPageData", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.model.t tVar = this.f166695a3;
        if (z17 && this.B1 == 1) {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().doDynamicUpdateScene(this.C1, this.D1, this.E1, tVar);
        }
        if (this.B1 == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(this.F1)) {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().doSearchDynamicUpdateScene(this.F1, tVar);
        }
        this.A1 = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("syncDynamicPageData", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[Catch: all -> 0x009e, TryCatch #0 {all -> 0x009e, blocks: (B:3:0x000b, B:5:0x001f, B:9:0x002c, B:11:0x0034, B:13:0x003a, B:17:0x004a, B:19:0x0055, B:21:0x005b, B:24:0x0067, B:28:0x0071, B:29:0x0074), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t7() {
        /*
            r11 = this;
            java.lang.String r0 = r11.f166700d
            java.lang.String r1 = "fixActivityTranslucent, device="
            java.lang.String r2 = "fixActivityTranslucent"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            android.content.Context r4 = r11.getApplicationContext()     // Catch: java.lang.Throwable -> L9e
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L9e
            int r4 = r4.targetSdkVersion     // Catch: java.lang.Throwable -> L9e
            r5 = 29
            boolean r6 = fp.h.c(r5)     // Catch: java.lang.Throwable -> L9e
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L2b
            r6 = 30
            boolean r6 = fp.h.c(r6)     // Catch: java.lang.Throwable -> L9e
            if (r6 != 0) goto L29
            if (r4 < r5) goto L2b
        L29:
            r5 = r8
            goto L2c
        L2b:
            r5 = r7
        L2c:
            java.lang.String r6 = wo.w0.m()     // Catch: java.lang.Throwable -> L9e
            boolean r9 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> L9e
            if (r5 != 0) goto L48
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L9e
            if (r9 != 0) goto L48
            java.lang.String r9 = "huawei nxt-al10|mix 2s|sm-g9350"
            java.lang.String r10 = r6.toLowerCase()     // Catch: java.lang.Throwable -> L9e
            boolean r9 = r9.contains(r10)     // Catch: java.lang.Throwable -> L9e
            if (r9 == 0) goto L48
            r5 = r8
        L48:
            if (r5 != 0) goto L66
            r11.J7()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r9 = r11.X2     // Catch: java.lang.Throwable -> L9e
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L9e
            if (r10 != 0) goto L66
            boolean r10 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L9e
            if (r10 != 0) goto L66
            java.lang.String r10 = r6.toLowerCase()     // Catch: java.lang.Throwable -> L9e
            boolean r9 = r9.contains(r10)     // Catch: java.lang.Throwable -> L9e
            if (r9 == 0) goto L66
            goto L67
        L66:
            r8 = r5
        L67:
            boolean r5 = r11.W7()     // Catch: java.lang.Throwable -> L9e
            if (r5 != 0) goto L6e
            goto L6f
        L6e:
            r7 = r8
        L6f:
            if (r7 == 0) goto L74
            ca4.m0.l(r11)     // Catch: java.lang.Throwable -> L9e
        L74:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L9e
            r5.append(r6)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = ", api="
            r5.append(r1)     // Catch: java.lang.Throwable -> L9e
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L9e
            r5.append(r1)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = ", targetSdkVer="
            r5.append(r1)     // Catch: java.lang.Throwable -> L9e
            r5.append(r4)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = ", needFix="
            r5.append(r1)     // Catch: java.lang.Throwable -> L9e
            r5.append(r7)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L9e
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Throwable -> L9e
            goto Lb4
        L9e:
            r1 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "fixActivityTranslucent exp="
            r4.<init>(r5)
            java.lang.String r1 = r1.toString()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.mars.xlog.Log.e(r0, r1)
        Lb4:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.t7():void");
    }

    public void t8() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toggleFloatBarView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        u8(300L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toggleFloatBarView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final java.lang.String u7(com.tencent.mm.plugin.sns.ui.z7 z7Var) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genForwardXml", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String str3 = this.f166700d;
        if (z7Var != null) {
            java.lang.String str4 = z7Var.f171680b;
            java.lang.String str5 = z7Var.f171679a;
            if (str5 != null) {
                try {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                        str = str5;
                    } else {
                        str = a84.o0.g(str4, str5);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                            com.tencent.mars.xlog.Log.e(str3, "replaceAdCanvasInfo but forwardXml return null");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genForwardXml", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            return str5;
                        }
                    }
                    java.lang.String replaceAll = str.replaceAll("(?s)<adDynamicFeedInfo[^>]*>.*?</adDynamicFeedInfo>", "").replaceAll("(?s)<adCanvasInfoLeft[^>]*>.*?</adCanvasInfoLeft>", "").replaceAll("(?s)<adCanvasInfoRight[^>]*>.*?</adCanvasInfoRight>", "");
                    if (replaceAll.contains("<adFullCardGestureCanvasInfo>")) {
                        replaceAll = replaceAll.replaceAll("(?s)<adFullCardGestureCanvasInfo[^>]*>.*?</adFullCardGestureCanvasInfo>", "");
                    }
                    if (z7Var.f171681c && replaceAll.contains("<shareAdCanvasInfo>")) {
                        replaceAll = replaceAll.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replace("shareAdCanvasInfo", "adCanvasInfo");
                    }
                    if (replaceAll.contains("<giveHBCardInfo>")) {
                        replaceAll = replaceAll.replaceAll("(?s)<giveHBCardInfo[^>]*>.*?</giveHBCardInfo>", "");
                    }
                    if (this.f166752w2 && !replaceAll.contains("isInteractiveCanvas")) {
                        replaceAll = replaceAll.replace("<adCanvasInfo>", "<adCanvasInfo><isInteractiveCanvas>1</isInteractiveCanvas>");
                    }
                    if (!z7Var.f171682d) {
                        replaceAll = v8(replaceAll, ".adxml.canvasShareInfo");
                    }
                    java.lang.String str6 = "null";
                    if (str5 == null) {
                        str2 = "null";
                    } else {
                        str2 = "" + str5.length();
                    }
                    if (str4 != null) {
                        str6 = "" + str4.length();
                    }
                    com.tencent.mars.xlog.Log.i(str3, "before transmitXml, landingPagesXml length is " + str2 + ", dynamicXml length is " + str6 + ", forwardXml length is " + replaceAll.length());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genForwardXml", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    return replaceAll;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(str3, th6, "genForwardXml, error ", new java.lang.Object[0]);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genForwardXml", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    return str5;
                }
            }
        }
        com.tencent.mars.xlog.Log.e(str3, "genForwardXml, processForwardParams == null! " + z7Var);
        java.lang.String str7 = this.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genForwardXml", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return str7;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:22|(2:24|(1:26)(1:161))(1:162)|27|(1:160)(1:31)|32|(2:33|34)|(19:133|(4:135|136|(3:151|152|(2:154|(1:156)))|(2:141|(2:144|145)))(1:157)|150|45|46|47|(14:50|(1:129)(1:54)|55|56|57|58|(10:62|(12:64|65|66|67|(5:70|(1:120)(1:73)|(1:75)|76|(2:78|79)(2:80|(2:82|83)(1:(2:85|86)(1:(1:(1:(2:100|(2:102|103)(4:104|(2:106|(2:108|(2:112|(1:114)))(2:115|(1:117)))|118|119))(2:98|99))(2:93|94))(2:89|90)))))|121|122|(0)|120|(0)|76|(0)(0))|126|121|122|(0)|120|(0)|76|(0)(0))|127|122|(0)|120|(0)|76|(0)(0))|131|56|57|58|(10:62|(0)|126|121|122|(0)|120|(0)|76|(0)(0))|127|122|(0)|120|(0)|76|(0)(0))(2:42|43)|44|45|46|47|(15:50|(0)|129|55|56|57|58|(0)|127|122|(0)|120|(0)|76|(0)(0))|131|56|57|58|(0)|127|122|(0)|120|(0)|76|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0178 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a5 A[Catch: Exception -> 0x01d5, TRY_LEAVE, TryCatch #3 {Exception -> 0x01d5, blocks: (B:58:0x0194, B:62:0x019f, B:64:0x01a5), top: B:57:0x0194 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u8(long r19) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.u8(long):void");
    }

    public final java.lang.String v7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genStatExtString", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        r45.td6 td6Var = new r45.td6();
        r45.ud6 ud6Var = new r45.ud6();
        td6Var.f386329d = ud6Var;
        za4.g1 g1Var = this.f166758y0;
        ud6Var.f387269f = g1Var.f471091b;
        ud6Var.f387268e = g1Var.f471090a;
        ud6Var.f387267d = this.Y;
        try {
            java.lang.String encodeToString = android.util.Base64.encodeToString(td6Var.toByteArray(), 2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genStatExtString", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return encodeToString;
        } catch (java.lang.Exception unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genStatExtString", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String v8(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.v8(java.lang.String, java.lang.String):java.lang.String");
    }

    public java.util.List w7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        this.T1 = new java.util.ArrayList();
        gb4.r rVar = (gb4.r) this.G1.getAdapter();
        if (rVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllFragment", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllFragment", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragmentAdapter");
            for (androidx.fragment.app.Fragment fragment : rVar.f270079i) {
                ((java.util.ArrayList) this.T1).addAll(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment) fragment).r0());
            }
        }
        za4.z0.e(this.T1);
        java.util.List list = this.T1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return list;
    }

    public void w8(ab4.d0 d0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18, boolean z19) {
        y9.i iVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryRespondToBottomList", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (this.f166724l3 != null && !z19) {
            com.tencent.mars.xlog.Log.w(this.f166700d, "bottom sheet appear several times");
            this.f166724l3.a();
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f166727m3;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f166727m3 = null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryRespondToBottomList", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return;
        }
        com.tencent.mm.plugin.sns.ui.gc gcVar = new com.tencent.mm.plugin.sns.ui.gc(this, z19);
        if (!z19) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a17 = com.tencent.mm.plugin.sns.ui.ta.a(getContext(), d0Var, new android.widget.LinearLayout(getContext()), !com.tencent.mm.sdk.platformtools.t8.K0(d0Var.f2828r) ? android.graphics.Color.parseColor(d0Var.f2828r) : -1);
            this.f166724l3 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k2(getContext(), a17, str, str2, str3, z17, z18);
            android.view.View x17 = a17.x();
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k2 k2Var = this.f166724l3;
            com.tencent.mm.plugin.sns.ui.hc hcVar = new com.tencent.mm.plugin.sns.ui.hc(this, x17);
            k2Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCloseDialogCallBack", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
            k2Var.f165315d = hcVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCloseDialogCallBack", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k2 k2Var2 = this.f166724l3;
            k2Var2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
            android.view.View view = k2Var2.f165314c;
            if (view == null || (iVar = k2Var2.f165313b) == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
            } else {
                iVar.getWindow().setFlags(8, 8);
                iVar.getWindow().addFlags(131200);
                if (k2Var2.f165315d != null) {
                    iVar.setOnDismissListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h2(k2Var2));
                    iVar.setOnCancelListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2(k2Var2));
                }
                iVar.setContentView(view);
                com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) view.getParent()).C(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.c(k2Var2.f165312a)[1]);
                iVar.show();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryShow", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().doFavOfficialItemScene(str, gcVar);
            if (z19) {
                this.f166727m3 = db5.e1.Q(this, null, getString(com.tencent.mm.R.string.jcd), true, false, null);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryRespondToBottomList", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
    }

    public final java.util.List x7() {
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        int i17;
        java.util.Collection collection;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllShowPageInfo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = this.f166709g.iterator();
        while (it6.hasNext()) {
            za4.g0 g0Var = (za4.g0) it6.next();
            if (g0Var.f471085e) {
                arrayList2.add(g0Var);
            }
        }
        java.lang.String str = this.f166700d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preProcessAllComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        try {
            arrayList = new java.util.ArrayList();
            it = arrayList2.iterator();
            i17 = 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, "giveIdxForApkBtnInfo, exp=" + e17.toString());
        }
        while (true) {
            boolean hasNext = it.hasNext();
            collection = this.f166710g2;
            if (!hasNext) {
                break;
            }
            java.util.Iterator it7 = ((za4.g0) it.next()).f471083c.iterator();
            while (it7.hasNext()) {
                ab4.d0 d0Var = (ab4.d0) it7.next();
                if (d0Var instanceof ab4.c) {
                    ((ab4.c) d0Var).V1 = i17;
                    i17++;
                }
                if (d0Var instanceof ab4.u) {
                    java.lang.String str2 = ((ab4.u) d0Var).G;
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        ((java.util.HashSet) collection).add(str2);
                    }
                }
                if (d0Var instanceof ab4.t) {
                    java.lang.String str3 = ((ab4.t) d0Var).F;
                    if (!android.text.TextUtils.isEmpty(str3)) {
                        ((java.util.HashSet) collection).add(str3);
                    }
                }
                try {
                    if (d0Var instanceof f54.v) {
                        java.util.Iterator it8 = ((java.util.ArrayList) ((f54.v) d0Var).c()).iterator();
                        while (it8.hasNext()) {
                            ab4.d0 b17 = ((f54.r) it8.next()).b();
                            if (b17 instanceof ab4.u) {
                                java.lang.String str4 = ((ab4.u) b17).G;
                                if (!android.text.TextUtils.isEmpty(str4)) {
                                    ((java.util.HashSet) collection).add(str4);
                                    com.tencent.mars.xlog.Log.i(str, "preload halfEggCard H5Btn");
                                }
                            }
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e(str, "preload halfEggCard H5Btn exp=" + th6.toString());
                }
                java.util.List list = f166692q3;
                if (!list.contains(d0Var)) {
                    list.add(d0Var);
                    za4.o0.n(this.P, this.I, d0Var);
                }
                if (!this.f166714h3) {
                    l44.z3.f(d0Var, arrayList);
                }
            }
            com.tencent.mars.xlog.Log.e(str, "giveIdxForApkBtnInfo, exp=" + e17.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preProcessAllComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllShowPageInfo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            return arrayList2;
        }
        if (!this.f166714h3) {
            this.f166714h3 = true;
            if (!arrayList.isEmpty()) {
                boolean z17 = this.f166748u2;
                java.util.HashSet hashSet = l44.z3.f316436a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkPreloadWeAppEnvForNativeLandingPage", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
                ((ku5.t0) ku5.t0.f312615d).g(new l44.x3(arrayList, z17));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPreloadWeAppEnvForNativeLandingPage", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppPreloader");
            }
        }
        if (!a84.b0.b(collection)) {
            java.lang.String[] d17 = f44.a.d(collection, this.f166759y1, this.f166755x1, this.W, this.V);
            if (!a84.b0.d(d17)) {
                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().prefetchH5Url(android.text.TextUtils.isEmpty(this.P) ? this.Q : this.P, d17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preProcessAllComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllShowPageInfo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return arrayList2;
    }

    public final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i8 y7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurPageSphereImageComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        for (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var : z7().r0()) {
            if (a2Var instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i8) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i8 i8Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i8) a2Var;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurPageSphereImageComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                return i8Var;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurPageSphereImageComp", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return null;
    }

    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment z7() {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment contentFragment;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (this.f166709g.size() > 0) {
            contentFragment = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment) ((java.util.HashMap) this.f166711g3).get(java.lang.Integer.valueOf(((za4.g0) this.f166709g.get(this.G1.getCurrentItem())).f471086f));
        } else {
            contentFragment = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPage", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        return contentFragment;
    }
}
