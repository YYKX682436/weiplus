package com.tencent.mm.plugin.sns.ui;

@db5.a(2304)
/* loaded from: classes4.dex */
public class SnsSingleTextViewUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {
    public static final /* synthetic */ int G = 0;
    public com.tencent.mm.plugin.sns.ui.SnsTranslateResultView B;
    public final com.tencent.mm.sdk.event.IListener C;
    public final com.tencent.mm.sdk.event.IListener D;
    public final com.tencent.mm.sdk.event.IListener E;
    public final db5.t4 F;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f167395d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f167396e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f167397f;

    /* renamed from: i, reason: collision with root package name */
    public int f167400i;

    /* renamed from: n, reason: collision with root package name */
    public int f167402n;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f167404p;

    /* renamed from: q, reason: collision with root package name */
    public bd4.f2 f167405q;

    /* renamed from: r, reason: collision with root package name */
    public float f167406r;

    /* renamed from: s, reason: collision with root package name */
    public float f167407s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f167408t;

    /* renamed from: u, reason: collision with root package name */
    public float f167409u;

    /* renamed from: v, reason: collision with root package name */
    public float f167410v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f167411w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f167412x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Runnable f167413y;

    /* renamed from: z, reason: collision with root package name */
    public ul5.j f167414z;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f167398g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f167399h = null;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f167401m = null;

    /* renamed from: o, reason: collision with root package name */
    public r45.e86 f167403o = null;
    public boolean A = false;

    public SnsSingleTextViewUI() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.C = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTranslateStartEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.1
            {
                this.__eventId = 1200144606;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsTranslateStartEvent snsTranslateStartEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$1");
                com.tencent.mm.autogen.events.SnsTranslateStartEvent snsTranslateStartEvent2 = snsTranslateStartEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$1");
                if (snsTranslateStartEvent2 instanceof com.tencent.mm.autogen.events.SnsTranslateStartEvent) {
                    com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.this;
                    if (com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.U6(snsSingleTextViewUI) != null && com.tencent.mm.sdk.platformtools.t8.D0(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.V6(snsSingleTextViewUI), snsTranslateStartEvent2.f54849g.f6711b)) {
                        com.tencent.mm.plugin.sns.model.s6.a(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.V6(snsSingleTextViewUI), 8);
                        com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.Z6(snsSingleTextViewUI).setVisibility(0);
                        com.tencent.mm.plugin.sns.ui.SnsTranslateResultView Z6 = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.Z6(snsSingleTextViewUI);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                        int i17 = snsSingleTextViewUI.f167400i;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                        Z6.k(i17);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                        snsSingleTextViewUI.A = false;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$1");
                return false;
            }
        };
        this.D = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTranslateFinishEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.2
            {
                this.__eventId = 2139223297;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsTranslateFinishEvent snsTranslateFinishEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$2");
                com.tencent.mm.autogen.events.SnsTranslateFinishEvent snsTranslateFinishEvent2 = snsTranslateFinishEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$2");
                if (snsTranslateFinishEvent2 instanceof com.tencent.mm.autogen.events.SnsTranslateFinishEvent) {
                    com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.this;
                    if (com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.U6(snsSingleTextViewUI) != null && com.tencent.mm.sdk.platformtools.t8.D0(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.V6(snsSingleTextViewUI), snsTranslateFinishEvent2.f54847g.f6506b)) {
                        com.tencent.mm.plugin.sns.model.s6.a(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.V6(snsSingleTextViewUI), 8);
                        am.dx dxVar = snsTranslateFinishEvent2.f54847g;
                        java.lang.String str = dxVar.f6507c;
                        java.lang.String str2 = dxVar.f6508d;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                            com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.Z6(snsSingleTextViewUI).setVisibility(8);
                            com.tencent.mm.plugin.sns.model.s6.k(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.V6(snsSingleTextViewUI), 8);
                        } else {
                            com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.Z6(snsSingleTextViewUI).setVisibility(0);
                            com.tencent.mm.plugin.sns.ui.SnsTranslateResultView Z6 = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.Z6(snsSingleTextViewUI);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                            int i17 = snsSingleTextViewUI.f167400i;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                            Z6.e(null, i17, str, str2, true);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                            snsSingleTextViewUI.A = true;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$2");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$2");
                return false;
            }
        };
        this.E = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsUnTranslateEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.3
            {
                this.__eventId = -868441523;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsUnTranslateEvent snsUnTranslateEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$3");
                com.tencent.mm.autogen.events.SnsUnTranslateEvent snsUnTranslateEvent2 = snsUnTranslateEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$3");
                if (snsUnTranslateEvent2 instanceof com.tencent.mm.autogen.events.SnsUnTranslateEvent) {
                    com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.this;
                    if (com.tencent.mm.sdk.platformtools.t8.D0(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.V6(snsSingleTextViewUI), snsUnTranslateEvent2.f54850g.f6797b)) {
                        com.tencent.mm.plugin.sns.model.s6.k(snsUnTranslateEvent2.f54850g.f6797b, 8);
                        com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.Z6(snsSingleTextViewUI).setVisibility(8);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                        snsSingleTextViewUI.A = false;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$3");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$3");
                return false;
            }
        };
        this.F = new com.tencent.mm.plugin.sns.ui.oq(this);
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo U6(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = snsSingleTextViewUI.f167404p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        return snsInfo;
    }

    public static /* synthetic */ java.lang.String V6(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        java.lang.String str = snsSingleTextViewUI.f167399h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        return str;
    }

    public static /* synthetic */ android.widget.TextView W6(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        android.widget.TextView textView = snsSingleTextViewUI.f167395d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        return textView;
    }

    public static /* synthetic */ java.lang.String X6(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        java.lang.String str = snsSingleTextViewUI.f167397f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        return str;
    }

    public static /* synthetic */ r45.e86 Y6(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        r45.e86 e86Var = snsSingleTextViewUI.f167403o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        return e86Var;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTranslateResultView Z6(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        com.tencent.mm.plugin.sns.ui.SnsTranslateResultView snsTranslateResultView = snsSingleTextViewUI.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        return snsTranslateResultView;
    }

    public final void a7() {
        android.widget.TextView textView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancelTextSelectionScrollEnd", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        java.lang.Runnable runnable = this.f167413y;
        if (runnable != null && (textView = this.f167395d) != null) {
            textView.removeCallbacks(runnable);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelTextSelectionScrollEnd", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
    }

    public final boolean b7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValidComment", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        r45.e86 e86Var = this.f167403o;
        boolean z17 = false;
        if (e86Var != null && ((e86Var.f373132m != 0 || e86Var.f373137r != 0) && !com.tencent.mm.sdk.platformtools.t8.K0(e86Var.f373130h))) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValidComment", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        return z17;
    }

    public final void c7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyTextSelectionScrollStart", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        bd4.f2 f2Var = this.f167405q;
        if (f2Var != null) {
            f2Var.v();
        }
        com.tencent.mm.plugin.sns.ui.SnsTranslateResultView snsTranslateResultView = this.B;
        if (snsTranslateResultView != null) {
            snsTranslateResultView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onListViewScrollStart", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
            bd4.f2 f2Var2 = snsTranslateResultView.f167472f;
            if (f2Var2 != null) {
                f2Var2.v();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onListViewScrollStart", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyTextSelectionScrollStart", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
    }

    public final void d7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scheduleTextSelectionScrollEnd", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        if (this.f167413y == null) {
            this.f167413y = new com.tencent.mm.plugin.sns.ui.nq(this);
        }
        a7();
        this.f167395d.postDelayed(this.f167413y, 200L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scheduleTextSelectionScrollEnd", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        if (this.f167405q != null || this.B != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f167406r = motionEvent.getRawX();
                this.f167407s = motionEvent.getRawY();
                this.f167408t = false;
                bd4.f2 f2Var = this.f167405q;
                if (f2Var != null) {
                    f2Var.o(motionEvent);
                }
                com.tencent.mm.plugin.sns.ui.SnsTranslateResultView snsTranslateResultView = this.B;
                if (snsTranslateResultView != null) {
                    snsTranslateResultView.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleGlobalEventDown", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
                    bd4.f2 f2Var2 = snsTranslateResultView.f167472f;
                    if (f2Var2 != null) {
                        f2Var2.o(motionEvent);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleGlobalEventDown", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
                }
            } else if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.f167408t = false;
                    }
                } else if (!this.f167408t) {
                    float rawX = motionEvent.getRawX() - this.f167406r;
                    float rawY = motionEvent.getRawY() - this.f167407s;
                    if ((rawX * rawX) + (rawY * rawY) > 400.0f) {
                        this.f167408t = true;
                    }
                }
            } else if (!this.f167408t) {
                bd4.f2 f2Var3 = this.f167405q;
                if (f2Var3 != null) {
                    f2Var3.n(motionEvent, false);
                }
                com.tencent.mm.plugin.sns.ui.SnsTranslateResultView snsTranslateResultView2 = this.B;
                if (snsTranslateResultView2 != null) {
                    snsTranslateResultView2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleGlobalClick", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
                    bd4.f2 f2Var4 = snsTranslateResultView2.f167472f;
                    if (f2Var4 != null) {
                        f2Var4.n(motionEvent, false);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleGlobalClick", "com.tencent.mm.plugin.sns.ui.SnsTranslateResultView");
                }
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        return dispatchTouchEvent;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        return com.tencent.mm.R.layout.ctn;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        android.os.Bundle bundle2;
        com.tencent.mm.plugin.sns.model.r6 f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.j9b);
        setBackBtn(new com.tencent.mm.plugin.sns.ui.jq(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerReporterData", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        o04.g gVar = new o04.g(1);
        ((md0.e) eVar).getClass();
        t04.a aVar = (t04.a) pf5.z.f353948a.a(this).a(t04.a.class);
        if (aVar != null) {
            aVar.S6(gVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerReporterData", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        this.f167396e = getIntent().getStringExtra("sns_text_show");
        java.lang.String stringExtra = getIntent().getStringExtra("sns_local_id");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f167397f = stringExtra;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        this.f167401m = getIntent().getByteArrayExtra("sns_comment_buf");
        this.f167402n = getIntent().getIntExtra("sns_content_source", 0);
        byte[] bArr = this.f167401m;
        if (bArr != null && bArr.length > 0) {
            r45.e86 e86Var = new r45.e86();
            this.f167403o = e86Var;
            try {
                e86Var.parseFrom(this.f167401m);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                r45.e86 e86Var2 = this.f167403o;
                int i18 = e86Var2.f373132m;
                sb6.append(i18 != 0 ? i18 : e86Var2.f373137r);
                sb6.append("");
                this.f167398g = sb6.toString();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsSingleTextViewUI", e17, "initCommentInfo error.", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSingleTextViewUI", "oncreate localId:%s", this.f167397f);
        this.f167404p = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f167397f);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f167396e)) {
            this.f167396e = "";
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nbx);
        this.f167395d = textView;
        textView.setText(this.f167396e, android.widget.TextView.BufferType.SPANNABLE);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView2 = this.f167395d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSpanExtra", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        if (this.f167404p == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSpanExtra", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            bundle2 = null;
        } else {
            android.os.Bundle bundle3 = new android.os.Bundle();
            java.lang.String str = this.f167404p.getUserName() + "#" + ca4.z0.t0(this.f167404p.field_snsId);
            r45.e86 e86Var3 = this.f167403o;
            if (e86Var3 != null) {
                i17 = ca4.z0.n0(e86Var3) ? 5 : 4;
                str = str + "#" + this.f167403o.f373126d + "#" + this.f167403o.f373132m;
            } else {
                i17 = 3;
            }
            bundle3.putInt("ShareScene", i17);
            bundle3.putString("ShareSceneId", str);
            bundle3.putLong("CreateTime", this.f167403o != null ? r5.f373131i : this.f167404p.getCreateTime());
            bundle3.putInt("TimelineEnterSource", 1);
            bundle3.putInt("SnsContentType", this.f167404p.field_type);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSpanExtra", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            bundle2 = bundle3;
        }
        ((ke0.e) xVar).getClass();
        com.tencent.mm.pluginsdk.ui.span.c0.o(textView2, 2, 2, bundle2, null, true, true);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(this.f167395d.getText());
        com.tencent.mm.plugin.sns.ui.widget.q2.l(getContext(), this.f167404p, this.f167403o, spannableStringBuilder, com.tencent.mm.plugin.sns.ui.widget.t2.b().booleanValue(), 1, null);
        this.f167395d.setText(spannableStringBuilder);
        if (xa4.g.x(this.f167404p)) {
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(this.f167395d.getText());
            java.lang.CharSequence text = this.f167395d.getText();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
            ca4.f1.f39897a.i(text, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStyleAndReplaceClickSpanColor", "com.tencent.mm.plugin.sns.data.SnsUtilExt");
            this.f167395d.setText(spannableStringBuilder2, android.widget.TextView.BufferType.SPANNABLE);
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f167404p;
        r45.e86 e86Var4 = this.f167403o;
        android.widget.TextView view = this.f167395d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSnsSingleTextViewBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        kotlin.jvm.internal.o.g(view, "view");
        r45.ek6 ek6Var = new r45.ek6();
        if (e86Var4 != null) {
            ek6Var.f373585e = ca4.z0.n0(e86Var4) ? 5 : 4;
            ek6Var.f373586f = snsInfo.getUserName() + '#' + ca4.z0.t0(snsInfo.field_snsId) + '#' + e86Var4.f373126d + '#' + e86Var4.f373132m;
            ek6Var.f373587g = (long) e86Var4.f373131i;
        } else {
            ek6Var.f373585e = 3;
            ek6Var.f373586f = snsInfo.getUserName() + '#' + ca4.z0.t0(snsInfo.field_snsId);
            ek6Var.f373587g = (long) snsInfo.getCreateTime();
        }
        ek6Var.f373588h = 1;
        ek6Var.f373589i = snsInfo.field_type;
        nd0.e eVar2 = (nd0.e) i95.n0.c(nd0.e.class);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        o04.n Bi = ((md0.e) eVar2).Bi(context, 1);
        if (Bi != null) {
            ((o04.g) Bi).b(java.lang.String.valueOf(view.hashCode()), ek6Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSnsSingleTextViewBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        boolean b17 = pc4.d.f353410a.b(this.f167404p.isAd());
        db5.t4 t4Var = this.F;
        if (b17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initTextSelectableHelper", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            bd4.f2 f2Var = new bd4.f2(this, this.f167395d, this.f167404p, this, t4Var, null);
            this.f167405q = f2Var;
            int i19 = (-getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.u_)) * 2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMenuAdjustY", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            f2Var.f19343x = i19;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMenuAdjustY", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            this.f167405q.j();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initTextSelectionScrollListener", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            android.view.View view2 = (android.view.View) this.f167395d.getParent();
            if (view2 == null || !(view2.getParent() instanceof android.widget.ScrollView)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initTextSelectionScrollListener", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            } else {
                ((android.widget.ScrollView) view2.getParent()).setOnTouchListener(new com.tencent.mm.plugin.sns.ui.lq(this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initTextSelectionScrollListener", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initTextSelectionBounceListener", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            java.lang.Object bounceView = getBounceView();
            if (bounceView == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initTextSelectionBounceListener", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            } else {
                if (this.f167414z == null) {
                    this.f167414z = new com.tencent.mm.plugin.sns.ui.kq(this);
                }
                ((com.tencent.mm.ui.widget.pulldown.NestedBounceView) bounceView).c(this.f167414z);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initTextSelectionBounceListener", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initTextSelectableHelper", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        } else {
            this.f167395d.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0());
            new com.tencent.mm.ui.tools.s6(this).c(this.f167395d, this, t4Var);
        }
        com.tencent.mm.plugin.sns.ui.SnsTranslateResultView snsTranslateResultView = (com.tencent.mm.plugin.sns.ui.SnsTranslateResultView) findViewById(com.tencent.mm.R.id.nc8);
        this.B = snsTranslateResultView;
        snsTranslateResultView.setResultTextSize(this.f167395d.getTextSize());
        this.B.setCreateContextMenuListener(this);
        this.B.setMenuItemSelectedListener(t4Var);
        if (this.f167404p != null) {
            if (b7()) {
                this.f167399h = com.tencent.mm.plugin.sns.model.s6.e(this.f167404p.getSnsId(), this.f167398g);
                this.f167400i = 2;
            } else {
                this.f167399h = this.f167404p.getSnsId();
                this.f167400i = 1;
            }
            if (com.tencent.mm.plugin.sns.model.s6.h(this.f167399h, 8) && (f17 = com.tencent.mm.plugin.sns.model.s6.f(this.f167399h)) != null && f17.f164647d) {
                this.B.setVisibility(0);
                this.B.e(null, this.f167400i, f17.f164645b, f17.f164646c, false);
                this.A = true;
            }
        }
        this.C.alive();
        this.D.alive();
        this.E.alive();
        if (com.tencent.mm.ui.b4.c(this)) {
            getController().E0(getResources().getColor(com.tencent.mm.R.color.a5r));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        if (view instanceof android.widget.TextView) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f167404p;
            int i18 = 0;
            if (snsInfo != null && !snsInfo.isNoCopy()) {
                contextMenu.add(0, 0, 0, getString(com.tencent.mm.R.string.f490359sr));
            }
            j45.l.g("favorite");
            if (!b7()) {
                contextMenu.add(0, 1, 0, getString(com.tencent.mm.R.string.c__));
            }
            contextMenu.add(0, 6, 1, getString(com.tencent.mm.R.string.f490394tr));
            if (this.A) {
                com.tencent.mm.plugin.sns.model.s6.d(contextMenu, !b7());
            } else {
                com.tencent.mm.plugin.sns.model.s6.c(contextMenu, !b7());
            }
            r45.e86 e86Var = this.f167403o;
            if (e86Var != null && com.tencent.mm.plugin.sns.ui.widget.q2.b(e86Var)) {
                contextMenu.add(0, 37, 0, getContext().getString(com.tencent.mm.R.string.oj8));
            }
            contextMenu.add(0, 12, 0, getContext().getString(com.tencent.mm.R.string.f491241cg4));
            java.lang.String charSequence = this.f167395d.getText().toString();
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f167404p;
            long j17 = snsInfo2 != null ? snsInfo2.field_snsId : 0L;
            int i19 = this.f167402n;
            if (i19 == 2) {
                i18 = 7;
            } else if (i19 == 1) {
                i17 = 6;
                tg0.v1 v1Var = (tg0.v1) i95.n0.c(tg0.v1.class);
                ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                java.lang.String l17 = o13.n.l(77);
                java.lang.String t07 = ca4.z0.t0(j17);
                long length = charSequence.length();
                ((sg0.q3) v1Var).getClass();
                su4.k3.d(1, l17, 77, 0, "", "", t07, "", 3, "", 0L, length, i17, "", "", -1, 0);
            }
            i17 = i18;
            tg0.v1 v1Var2 = (tg0.v1) i95.n0.c(tg0.v1.class);
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            java.lang.String l172 = o13.n.l(77);
            java.lang.String t072 = ca4.z0.t0(j17);
            long length2 = charSequence.length();
            ((sg0.q3) v1Var2).getClass();
            su4.k3.d(1, l172, 77, 0, "", "", t072, "", 3, "", 0L, length2, i17, "", "", -1, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ul5.j jVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
        super.onDestroy();
        this.C.dead();
        this.D.dead();
        this.E.dead();
        a7();
        java.lang.Object bounceView = getBounceView();
        if (bounceView != null && (jVar = this.f167414z) != null) {
            ((com.tencent.mm.ui.widget.pulldown.NestedBounceView) bounceView).a(jVar);
            this.f167414z = null;
        }
        this.f167412x = false;
        bd4.f2 f2Var = this.f167405q;
        if (f2Var != null) {
            f2Var.k();
            this.f167405q = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
    }
}
