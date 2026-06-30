package com.tencent.mm.plugin.sns.ui;

@db5.a(3)
/* loaded from: classes4.dex */
public class SnsSightPlayerUI extends com.tencent.mm.ui.MMActivity implements c01.i, com.tencent.mm.plugin.sns.model.h0 {
    public static final /* synthetic */ int Y = 0;
    public android.widget.ImageView E;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s4 f167367J;
    public android.os.Bundle K;
    public android.view.GestureDetector S;
    public android.view.VelocityTracker T;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s6 f167380s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f167381t;

    /* renamed from: x, reason: collision with root package name */
    public c01.k f167385x;

    /* renamed from: d, reason: collision with root package name */
    public final i64.c1 f167368d = new i64.c1("SnsSightPlayerUI");

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f167369e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f167370f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f167371g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f167372h = false;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.f4 f167373i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f167374m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f167375n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMPinProgressBtn f167376o = null;

    /* renamed from: p, reason: collision with root package name */
    public int f167377p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f167378q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f167379r = false;

    /* renamed from: u, reason: collision with root package name */
    public int f167382u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f167383v = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f167384w = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f167386y = false;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f167387z = null;
    public com.tencent.mm.plugin.sns.storage.ADInfo A = null;
    public r45.jj4 B = null;
    public android.widget.TextView C = null;
    public boolean D = false;
    public int F = 0;
    public int G = 0;
    public int H = 0;
    public int I = 0;
    public boolean L = false;
    public boolean M = false;
    public boolean N = false;
    public float P = 1.0f;
    public int Q = 0;
    public int R = 0;
    public boolean U = false;
    public final android.view.View.OnCreateContextMenuListener V = new com.tencent.mm.plugin.sns.ui.qp(this);
    public final db5.t4 W = new com.tencent.mm.plugin.sns.ui.rp(this);
    public int X = 0;

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.ADInfo T6(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = snsSightPlayerUI.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return aDInfo;
    }

    public static /* synthetic */ int U6(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        int i17 = snsSightPlayerUI.f167377p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return i17;
    }

    public static /* synthetic */ android.widget.TextView V6(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        android.widget.TextView textView = snsSightPlayerUI.f167374m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return textView;
    }

    public static /* synthetic */ boolean W6(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        boolean z17 = snsSightPlayerUI.L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return z17;
    }

    public static /* synthetic */ boolean X6(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        snsSightPlayerUI.N = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1302", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return z17;
    }

    public static /* synthetic */ android.view.VelocityTracker Y6(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        android.view.VelocityTracker velocityTracker = snsSightPlayerUI.T;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return velocityTracker;
    }

    public static /* synthetic */ android.widget.TextView Z6(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        android.widget.TextView textView = snsSightPlayerUI.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return textView;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo a7(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = snsSightPlayerUI.f167387z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return snsInfo;
    }

    public static /* synthetic */ r45.jj4 b7(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        r45.jj4 jj4Var = snsSightPlayerUI.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return jj4Var;
    }

    public static /* synthetic */ java.lang.String c7(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        java.lang.String str = snsSightPlayerUI.f167370f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return str;
    }

    public static /* synthetic */ java.lang.String d7(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        java.lang.String str = snsSightPlayerUI.f167371g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return str;
    }

    public static /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.f4 e7(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = snsSightPlayerUI.f167373i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return f4Var;
    }

    @Override // c01.i
    public void P0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    @Override // c01.i
    public void U5() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lossTransient", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lossTransient", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    @Override // c01.i
    public void V3() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gain", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gain", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    public final void f7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSightPlayerUI", "snsSightplayui pauseplay");
        this.f167373i.pause();
        this.f167373i.onDetach();
        this.f167385x.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        if (!this.U) {
            super.finish();
            this.U = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    @Override // c01.i
    public void g3() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loss", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loss", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    public final void g7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        if (!this.f167372h) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            return;
        }
        if (this.f167373i.isPlaying()) {
            if (this.f167378q == 0) {
                this.f167378q = this.f167373i.getDuration();
            }
            int i18 = this.f167378q;
            i64.c1 c1Var = this.f167368d;
            c1Var.e(i18);
            j64.b bVar = c1Var.f289121i;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            bVar.f297915g = android.os.SystemClock.elapsedRealtime();
            j64.b bVar2 = c1Var.f289121i;
            bVar2.f297914f = i17 == 2 ? 2 : 1;
            bVar2.f297913e = 2;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSightPlayerUI", "duration " + this.f167378q + " orient " + c1Var.f289121i.f297914f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return 7;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        return com.tencent.mm.R.layout.ctj;
    }

    public void h7() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        int width = this.f167381t.getWidth();
        int height = this.f167381t.getHeight();
        int i18 = this.H;
        if (i18 != 0 && (i17 = this.I) != 0) {
            height = (int) ((width / i18) * i17);
        }
        com.tencent.mm.ui.tools.s4 s4Var = this.f167367J;
        s4Var.f210699f = width;
        s4Var.f210700g = height;
        s4Var.e(this.G, this.F, i18, this.I);
        if (this.P != 1.0d) {
            int j17 = com.tencent.mm.ui.bk.j(getContext());
            this.f167367J.f210707n = 1.0f / this.P;
            if (this.Q != 0 || this.R != 0) {
                int width2 = ((int) ((this.f167381t.getWidth() / 2) * (1.0f - this.P))) + this.Q;
                int height2 = (int) ((((this.f167381t.getHeight() + j17) / 2) - ((height / 2) * this.P)) + this.R);
                com.tencent.mm.ui.tools.s4 s4Var2 = this.f167367J;
                s4Var2.f210708o = width2;
                s4Var2.f210709p = height2;
            }
        }
        this.f167367J.d(this.f167381t, this.E, false, new com.tencent.mm.plugin.sns.ui.pp(this), null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    public final void i7(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        this.f167373i.start();
        this.f167378q = this.f167373i.getDuration();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSightPlayerUI", "startplay get duration " + this.f167378q);
        this.f167385x.c(this);
        if (z17) {
            i64.c1 c1Var = this.f167368d;
            c1Var.f289121i.f297914f = getResources().getConfiguration().orientation == 2 ? 2 : 1;
            j64.b bVar = c1Var.f289121i;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            bVar.f297915g = android.os.SystemClock.elapsedRealtime();
            c1Var.f289121i.f297913e = 2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    public final void j7(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVideoView", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        if (this.f167383v == 0 || this.f167382u == 0) {
            android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            this.f167383v = displayMetrics.heightPixels;
            this.f167382u = displayMetrics.widthPixels;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f167381t.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f167375n.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        if (i17 == 1) {
            int i18 = this.f167382u;
            layoutParams3.width = i18;
            layoutParams3.height = (int) (((i18 * 1.0d) * 240.0d) / 320.0d);
            layoutParams2.addRule(12, 0);
            layoutParams2.addRule(1, 0);
            layoutParams2.addRule(11, -1);
            layoutParams2.addRule(3, this.f167381t.getId());
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.f487334ob5);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI", "updateVideoView", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI", "updateVideoView", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            int i19 = this.f167382u;
            layoutParams3.height = i19;
            layoutParams3.width = (int) (((i19 * 1.0d) * 320.0d) / 240.0d);
            layoutParams2.addRule(11, 0);
            layoutParams2.addRule(3, 0);
            layoutParams2.addRule(12, -1);
            layoutParams2.addRule(1, this.f167381t.getId());
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f487334ob5);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI", "updateVideoView", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI", "updateVideoView", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSightPlayerUI", "orientation " + i17 + " " + layoutParams3.width + " " + layoutParams3.height);
        ((android.view.View) this.f167373i).setLayoutParams(layoutParams3);
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f167373i;
        if (f4Var instanceof com.tencent.mm.plugin.sight.decode.model.a) {
            ((com.tencent.mm.plugin.sight.decode.model.a) f4Var).e(layoutParams3.width, layoutParams3.height);
        }
        layoutParams.height = layoutParams3.height;
        layoutParams.width = layoutParams3.width;
        this.f167374m.setLayoutParams(layoutParams2);
        this.f167381t.setLayoutParams(layoutParams);
        ((android.view.View) this.f167373i).requestLayout();
        if (!z17) {
            g7(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVideoView", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.plugin.sns.storage.SnsInfo k17;
        java.lang.String str5 = "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        if (4097 == i17) {
            if (-1 != i18) {
                str = "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI";
                if (this.f167372h) {
                    ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(this.f167377p, 5, this.f167387z.field_snsId, 13, 0));
                }
                super.onActivityResult(i17, i18, intent);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", str);
            }
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            java.util.Iterator it = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")).iterator();
            while (it.hasNext()) {
                java.lang.String str6 = (java.lang.String) it.next();
                if (this.f167377p == 0 && (k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f167371g)) != null) {
                    if (com.tencent.mm.storage.z3.R4(str6)) {
                        com.tencent.mm.autogen.events.SnsForwardFeedToChatRoomForDataReportEvent snsForwardFeedToChatRoomForDataReportEvent = new com.tencent.mm.autogen.events.SnsForwardFeedToChatRoomForDataReportEvent();
                        java.lang.String T = ca4.z0.T(k17);
                        am.tv tvVar = snsForwardFeedToChatRoomForDataReportEvent.f54811g;
                        tvVar.f8037a = T;
                        k17.getLocalid();
                        tvVar.getClass();
                        snsForwardFeedToChatRoomForDataReportEvent.e();
                    } else {
                        com.tencent.mm.autogen.events.SnsForwardFeedToSingleChatForDataReportEvent snsForwardFeedToSingleChatForDataReportEvent = new com.tencent.mm.autogen.events.SnsForwardFeedToSingleChatForDataReportEvent();
                        java.lang.String T2 = ca4.z0.T(k17);
                        am.uv uvVar = snsForwardFeedToSingleChatForDataReportEvent.f54812g;
                        uvVar.f8139a = T2;
                        k17.getLocalid();
                        uvVar.getClass();
                        snsForwardFeedToSingleChatForDataReportEvent.e();
                    }
                }
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = this.f167387z.getTimeLine();
                if (this.f167372h) {
                    com.tencent.mm.plugin.sns.storage.ADXml adXml = this.f167387z.getAdXml();
                    r45.uf6 uf6Var = new r45.uf6();
                    r45.jj4 jj4Var = this.B;
                    uf6Var.f387334e = jj4Var.A;
                    uf6Var.f387333d = jj4Var.f377875x;
                    if (timeLine.ContentObj.f369837e == 15) {
                        uf6Var.f387339m = this.A.uxInfo;
                        uf6Var.f387340n = timeLine.Id;
                    } else {
                        r45.tf6 tf6Var = timeLine.streamvideo;
                        uf6Var.f387339m = tf6Var.f386385m;
                        uf6Var.f387340n = tf6Var.f386386n;
                    }
                    uf6Var.f387337h = com.tencent.mm.sdk.platformtools.t8.K0(jj4Var.C) ? timeLine.ContentDesc : this.B.C;
                    uf6Var.f387338i = com.tencent.mm.sdk.platformtools.t8.K0(this.B.B) ? this.B.f377860i : this.B.B;
                    if (adXml != null && adXml.attachShareLinkIsHidden == 0) {
                        uf6Var.f387336g = adXml.attachShareLinkUrl;
                        uf6Var.f387335f = adXml.attachShareLinkWording;
                    }
                    if (adXml != null) {
                        uf6Var.f387336g = adXml.adActionLink;
                    }
                    int S = ca4.z0.S(this.f167369e);
                    java.lang.String str7 = this.f167369e;
                    java.lang.String str8 = this.f167370f;
                    r45.jj4 jj4Var2 = this.B;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsSightPlayerUI", "send adsight to %s, videopath %s, thumbpath %s url: %s time: %d streamvideothumburl %s, duration: %s", str6, str7, str8, jj4Var2.f377875x, java.lang.Integer.valueOf(jj4Var2.A), uf6Var.f387338i, java.lang.Integer.valueOf(S));
                    str2 = stringExtra2;
                    str3 = str5;
                    ((dk5.s5) tg3.t1.a()).ij(this, str6, this.f167369e, this.f167370f, 43, S, uf6Var, false, false, timeLine.statExtStr, null, null);
                    str4 = str6;
                } else {
                    str2 = stringExtra2;
                    str3 = str5;
                    int S2 = ca4.z0.S(this.f167369e);
                    str4 = str6;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsSightPlayerUI", "send sight to %s, videopath %s, thumbpath %s, duration: %s", str4, this.f167369e, this.f167370f, java.lang.Integer.valueOf(S2));
                    ((dk5.s5) tg3.t1.a()).nj(this, str4, this.f167369e, this.f167370f, 43, S2, false, false, timeLine.statExtStr, null);
                }
                java.lang.String str9 = str2;
                if (str9 != null) {
                    ((dk5.s5) tg3.t1.a()).Ui(str9, str4);
                }
                com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.fw6), null, this, null, null);
                if (this.f167372h) {
                    ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(this.f167377p, 5, this.f167387z.field_snsId, 12, 0));
                    boolean R4 = com.tencent.mm.storage.z3.R4(str4);
                    i64.s1.d(i64.q1.Sight, R4 ? i64.p1.Chatroom : i64.p1.Chat, i64.r1.Full, R4 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str4) : 0, this.f167387z, this.f167377p);
                }
                stringExtra2 = str9;
                str5 = str3;
            }
        }
        str = str5;
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", str);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        h7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        super.onConfigurationChanged(configuration);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSightPlayerUI", "onConfigurationChanged " + configuration.orientation + " " + this.X);
        int i17 = this.X;
        int i18 = configuration.orientation;
        if (i17 == i18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            return;
        }
        j7(i18, false);
        this.X = configuration.orientation;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.storage.ADInfo aDInfo;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        getIntent().setExtrasClassLoader(getClass().getClassLoader());
        this.f167377p = getIntent().getIntExtra("intent_from_scene", -1);
        java.lang.System.currentTimeMillis();
        super.onCreate(bundle);
        hideTitleView();
        com.tencent.mm.plugin.sns.model.l4.Cj().c(this);
        getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.f478712f3));
        if (fp.h.c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        this.K = bundle;
        this.f167385x = new c01.k();
        this.f167369e = getIntent().getStringExtra("intent_videopath");
        this.f167370f = getIntent().getStringExtra("intent_thumbpath");
        this.f167371g = getIntent().getStringExtra("intent_localid");
        this.f167372h = getIntent().getBooleanExtra("intent_isad", false);
        this.f167387z = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f167371g);
        if (this.f167372h) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSightPath", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f167387z;
            if (snsInfo == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSightPath", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
                z17 = false;
            } else {
                this.B = (r45.jj4) snsInfo.getTimeLine().ContentObj.f369840h.get(0);
                com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), this.B.f377855d);
                ca4.z0.I(this.B);
                ca4.z0.U(this.B);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSightPath", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
                z17 = true;
            }
            if (!z17) {
                finish();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
                return;
            }
        }
        if (com.tencent.mm.booter.b.c() != null) {
            ((com.tencent.mm.booter.b) com.tencent.mm.booter.b.c()).a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f167387z;
        if (snsInfo2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            aDInfo = null;
        } else if (this.f167377p == 2) {
            aDInfo = snsInfo2.getAtAdInfo();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        } else {
            aDInfo = snsInfo2.getAdInfo();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        }
        this.A = aDInfo;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        i64.c1 c1Var = this.f167368d;
        c1Var.f289116d = elapsedRealtime;
        ((android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.chq)).setOnTouchListener(new com.tencent.mm.plugin.sns.ui.sp(this));
        fp.k.b();
        this.f167367J = new com.tencent.mm.ui.tools.s4(getContext());
        this.E = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ght);
        this.f167374m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487334ob5);
        this.f167376o = (com.tencent.mm.ui.widget.MMPinProgressBtn) findViewById(com.tencent.mm.R.id.mwj);
        this.f167381t = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.oy7);
        com.tencent.mm.pluginsdk.ui.tools.f4 a17 = com.tencent.mm.pluginsdk.ui.tools.n8.a(getContext());
        this.f167373i = a17;
        if (a17 instanceof com.tencent.mm.pluginsdk.ui.tools.VideoSightView) {
            ((com.tencent.mm.pluginsdk.ui.tools.VideoSightView) a17).setIsAdVideo(this.f167372h);
        }
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mva);
        this.C = textView;
        textView.setTextColor(android.graphics.Color.parseColor("#888888"));
        this.f167381t.addView((android.view.View) this.f167373i, 0, layoutParams);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o7o);
        this.f167375n = textView2;
        textView2.setText("");
        if (!this.f167372h) {
            this.f167375n.setVisibility(8);
        }
        if (this.f167372h) {
            r45.jj4 jj4Var = this.B;
            if (jj4Var == null) {
                this.C.setVisibility(8);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(jj4Var.f377875x)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsSightPlayerUI", "onCreate: there is no attachurl, show more info btn");
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = this.f167387z.getTimeLine();
                com.tencent.mm.plugin.sns.storage.ADXml adXml = this.f167387z.getAdXml();
                java.lang.String str = adXml.attachShareLinkWording;
                java.lang.String str2 = adXml.attachShareLinkUrl;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    this.C.setVisibility(8);
                } else {
                    this.C.setVisibility(0);
                    this.C.setText(str);
                    this.C.setOnClickListener(new com.tencent.mm.plugin.sns.ui.up(this, timeLine, str2));
                }
            } else {
                java.lang.String string = getResources().getString(com.tencent.mm.R.string.j8h);
                if (this.B.A / 60 > 0) {
                    string = string + getResources().getString(com.tencent.mm.R.string.j8j, java.lang.Integer.valueOf(this.B.A / 60));
                }
                if (this.B.A % 60 > 0) {
                    string = string + getResources().getString(com.tencent.mm.R.string.j8k, java.lang.Integer.valueOf(this.B.A % 60));
                }
                this.C.setText(string + getResources().getString(com.tencent.mm.R.string.j8i));
                this.C.setVisibility(0);
                this.C.setOnClickListener(new com.tencent.mm.plugin.sns.ui.vp(this));
            }
            com.tencent.mm.pluginsdk.ui.tools.v7.a(this.C, (com.tencent.mm.pluginsdk.ui.tools.VideoSightView) this.f167373i);
        } else {
            this.C.setVisibility(8);
        }
        this.f167373i.setVideoCallback(new com.tencent.mm.plugin.sns.ui.yp(this));
        findViewById(com.tencent.mm.R.id.oy7).setOnClickListener(new com.tencent.mm.plugin.sns.ui.zp(this));
        ((android.view.View) this.f167373i).setOnClickListener(new com.tencent.mm.plugin.sns.ui.aq(this));
        this.S = new android.view.GestureDetector(getContext(), new com.tencent.mm.plugin.sns.ui.bq(this));
        ((android.view.View) this.f167373i).setOnTouchListener(new com.tencent.mm.plugin.sns.ui.cq(this));
        if (com.tencent.mm.vfs.w6.j(this.f167369e)) {
            if (this.f167369e != null) {
                this.f167373i.stop();
                this.f167373i.setVideoPath(this.f167369e);
            }
            this.f167376o.setVisibility(8);
            c1Var.f289114b = 1;
        } else {
            com.tencent.mm.plugin.sns.model.l4.Cj().d(this.B, 6, null, com.tencent.mm.storage.s7.f195307k);
            this.f167376o.setVisibility(0);
            this.f167376o.a();
            c1Var.f289114b = 0;
        }
        java.lang.System.currentTimeMillis();
        com.tencent.mm.autogen.events.UIStatusChangedEvent uIStatusChangedEvent = new com.tencent.mm.autogen.events.UIStatusChangedEvent();
        uIStatusChangedEvent.f54907g.f7378a = 1;
        uIStatusChangedEvent.e();
        if (this.f167380s == null) {
            this.f167380s = new com.tencent.mm.ui.tools.s6(getContext());
        }
        this.f167380s.c((android.view.View) this.f167373i, this.V, this.W);
        ((android.view.View) this.f167373i).post(new com.tencent.mm.plugin.sns.ui.dq(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        if (this.f167372h) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f167387z;
            java.lang.String str = snsInfo2 == null ? "" : this.A.viewId;
            if (snsInfo2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            } else {
                i64.c1 c1Var = this.f167368d;
                java.lang.String d17 = c1Var.d();
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = this.f167387z;
                int adRecSrc = snsInfo3 == null ? 0 : snsInfo3.getAdRecSrc();
                int i17 = c1Var.f289115c;
                long j17 = i17 - c1Var.f289117e;
                if (j17 < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsSightPlayerUI", "reportVideo minus staytime found! totaltime[%d], offscreenTime[%ld]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(c1Var.f289117e));
                    j17 = c1Var.f289115c;
                }
                int i18 = (int) j17;
                com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = this.A;
                java.lang.String str2 = aDInfo != null ? aDInfo.waidPkg : "";
                i64.w wVar = new i64.w();
                wVar.f289349l = this.f167387z.getAdXml().passThrough;
                gm0.j1.i();
                com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
                int i19 = this.f167377p;
                r1Var.g(new i64.m0(str, i19 == 0 ? 1 : 2, 2, c1Var.f289115c, null, null, 2, d17, -1, adRecSrc, i18, i18, 0, i19 == 2 ? this.f167387z.getAdSnsInfo().getAtFriendRemindInfoSourceInfo() : this.f167387z.getAdSnsInfo().getTimelineRemindInfoSourceInfo(), this.f167377p == 2 ? this.f167387z.getAdSnsInfo().getAtFriendRemindInfoSelfInfo() : this.f167387z.getAdSnsInfo().getTimelineRemindInfoSelfInfo(), str2, wVar));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        }
        if (this.f167372h && (snsInfo = this.f167387z) != null && snsInfo.isAd()) {
            i64.s1.a(i64.o1.Sight, i64.n1.LeavelFullScreen, this.f167387z, this.f167377p);
        }
        com.tencent.mm.plugin.sns.model.l4.Cj().v(this);
        if (m21.w.f(getIntent()) != null && this.f167372h) {
            com.tencent.mm.sdk.platformtools.t8.K0(this.B.f377875x);
        }
        if (com.tencent.mm.booter.b.c() != null) {
            ((com.tencent.mm.booter.b) com.tencent.mm.booter.b.c()).b();
        }
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f167373i;
        if (f4Var != null) {
            f4Var.setVideoCallback(null);
            this.f167373i.stop();
            this.f167373i.onDetach();
        }
        com.tencent.mm.autogen.events.UIStatusChangedEvent uIStatusChangedEvent = new com.tencent.mm.autogen.events.UIStatusChangedEvent();
        am.mz mzVar = uIStatusChangedEvent.f54907g;
        mzVar.f7378a = 0;
        mzVar.f7379b = 0;
        mzVar.f7380c = 0;
        mzVar.f7381d = 0;
        uIStatusChangedEvent.e();
        this.f167385x.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        super.onPause();
        int i17 = getResources().getConfiguration().orientation;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSightPlayerUI", "onpause  " + i17);
        g7(i17);
        if (this.f167379r) {
            f7();
        } else {
            f7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closePopup", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            new com.tencent.mm.sdk.platformtools.n3().post(new com.tencent.mm.plugin.sns.ui.mp(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closePopup", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        }
        i64.c1 c1Var = this.f167368d;
        if (c1Var != null) {
            c1Var.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        super.onResume();
        if (!this.f167384w) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSightPlayerUI", "initOrientation " + getResources().getConfiguration().orientation);
            if (getResources().getConfiguration().orientation == 2) {
                j7(getResources().getConfiguration().orientation, true);
            }
            this.f167384w = true;
        }
        if (this.f167383v == 0 || this.f167382u == 0) {
            android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            this.f167383v = displayMetrics.heightPixels;
            this.f167382u = displayMetrics.widthPixels;
        }
        if (this.f167379r && com.tencent.mm.vfs.w6.j(this.f167369e)) {
            i7(false);
            this.f167379r = false;
        }
        i64.c1 c1Var = this.f167368d;
        if (c1Var != null) {
            c1Var.c();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        r45.jj4 jj4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSightPlayerUI", "onSightFinish " + str);
        if (this.f167372h && !com.tencent.mm.sdk.platformtools.t8.K0(str) && (jj4Var = this.B) != null && str.equals(jj4Var.f377855d) && com.tencent.mm.vfs.w6.j(this.f167369e)) {
            this.f167368d.f289114b = 1;
            this.f167373i.setVideoPath(this.f167369e);
            i7(true);
            com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = this.f167376o;
            if (mMPinProgressBtn != null) {
                mMPinProgressBtn.setVisibility(8);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        android.os.Bundle bundle = this.K;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        if (this.D) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        } else {
            this.D = true;
            this.F = getIntent().getIntExtra("img_gallery_top", 0);
            this.G = getIntent().getIntExtra("img_gallery_left", 0);
            this.H = getIntent().getIntExtra("img_gallery_width", 0);
            int intExtra = getIntent().getIntExtra("img_gallery_height", 0);
            this.I = intExtra;
            this.f167367J.e(this.G, this.F, this.H, intExtra);
            if (bundle == null) {
                this.f167381t.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.sns.ui.np(this));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        }
        super.onStart();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
    }
}
