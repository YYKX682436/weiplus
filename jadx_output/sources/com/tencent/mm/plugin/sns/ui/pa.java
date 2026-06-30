package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class pa implements android.view.View.OnClickListener, com.tencent.mm.plugin.sns.ui.w4 {
    public int A;
    public final w64.k B;

    /* renamed from: d, reason: collision with root package name */
    public final int f170189d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f170190e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f170191f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.RoundedCornerFrameLayout f170192g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f170193h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f170194i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f170195m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f170196n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f170197o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f170198p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f170199q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f170200r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f170201s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo f170202t;

    /* renamed from: u, reason: collision with root package name */
    public final w64.l f170203u;

    /* renamed from: v, reason: collision with root package name */
    public final w64.n f170204v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.na f170205w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f170206x;

    /* renamed from: y, reason: collision with root package name */
    public int f170207y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.ad.v0 f170208z;

    /* JADX WARN: Multi-variable type inference failed */
    public pa(android.content.Context context, android.view.View view, int i17, i64.b1 b1Var, w64.l lVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f170206x = arrayList;
        this.f170207y = 0;
        this.A = 0;
        com.tencent.mm.plugin.sns.ui.r9 r9Var = new com.tencent.mm.plugin.sns.ui.r9(this);
        this.B = r9Var;
        java.util.Objects.toString(context);
        java.util.Objects.toString(b1Var);
        this.f170190e = context;
        this.f170189d = i17;
        this.f170203u = lVar;
        this.f170191f = view;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f482453ey);
        this.f170200r = findViewById;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "<init>", "(Landroid/content/Context;Landroid/view/View;ILcom/tencent/mm/plugin/sns/ad/model/SnsAdStatistic;Lcom/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler$CardAnimPrepareListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "<init>", "(Landroid/content/Context;Landroid/view/View;ILcom/tencent/mm/plugin/sns/ad/model/SnsAdStatistic;Lcom/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler$CardAnimPrepareListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f482452ex);
        this.f170199q = findViewById2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "<init>", "(Landroid/content/Context;Landroid/view/View;ILcom/tencent/mm/plugin/sns/ad/model/SnsAdStatistic;Lcom/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler$CardAnimPrepareListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "<init>", "(Landroid/content/Context;Landroid/view/View;ILcom/tencent/mm/plugin/sns/ad/model/SnsAdStatistic;Lcom/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler$CardAnimPrepareListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.f482451ew);
        this.f170198p = findViewById3;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "<init>", "(Landroid/content/Context;Landroid/view/View;ILcom/tencent/mm/plugin/sns/ad/model/SnsAdStatistic;Lcom/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler$CardAnimPrepareListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "<init>", "(Landroid/content/Context;Landroid/view/View;ILcom/tencent/mm/plugin/sns/ad/model/SnsAdStatistic;Lcom/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler$CardAnimPrepareListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f170197o = view.findViewById(com.tencent.mm.R.id.jdk);
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) findViewById3.findViewById(com.tencent.mm.R.id.f482470fe);
        this.f170192g = roundedCornerFrameLayout;
        this.f170193h = (android.widget.ImageView) findViewById3.findViewById(com.tencent.mm.R.id.f482469fd);
        this.f170194i = (android.widget.TextView) findViewById3.findViewById(com.tencent.mm.R.id.f482503gb);
        this.f170195m = (android.widget.TextView) findViewById3.findViewById(com.tencent.mm.R.id.f482464f8);
        android.widget.Button button = (android.widget.Button) findViewById3.findViewById(com.tencent.mm.R.id.f482445es);
        this.f170196n = button;
        button.setOnClickListener(this);
        roundedCornerFrameLayout.setRadius(i65.a.b(context, 4));
        this.f170204v = new w64.n(context, i17, b1Var, r9Var, new com.tencent.mm.plugin.sns.ui.s9(this));
        findViewById.findViewById(com.tencent.mm.R.id.f482445es).setOnClickListener(new com.tencent.mm.plugin.sns.ui.t9(this, this.f170196n));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initComponents", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        arrayList.add(new com.tencent.mm.plugin.sns.ui.u9(this, "baseActionView", yVar, view));
        arrayList.add(new com.tencent.mm.plugin.sns.ui.v9(this, "sellingPointView", yVar, view));
        com.tencent.mm.plugin.sns.ui.w9 w9Var = new com.tencent.mm.plugin.sns.ui.w9(this, "singleActionButton", yVar, view);
        arrayList.add(w9Var);
        arrayList.add(new com.tencent.mm.plugin.sns.ui.y9(this, "actionButtonAnim", yVar, view));
        com.tencent.mm.plugin.sns.ui.aa aaVar = new com.tencent.mm.plugin.sns.ui.aa(this, view, view.getContext(), "adMultiProductComponent", yVar, view, w9Var);
        this.f170208z = aaVar;
        arrayList.add(aaVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initComponents", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    public static void c(com.tencent.mm.plugin.sns.ui.pa paVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        android.content.Context context = paVar.f170190e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateActionBtn", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        try {
            paVar.f170196n.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478724ff));
            paVar.f170196n.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.b1f));
            paVar.f170196n.setEnabled(true);
            paVar.v(true);
            paVar.x();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdCardActionBtnCtrl", th6.toString());
        }
        paVar.y(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateActionBtn", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    public static /* synthetic */ android.content.Context d(com.tencent.mm.plugin.sns.ui.pa paVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        android.content.Context context = paVar.f170190e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return context;
    }

    public static /* synthetic */ android.view.View e(com.tencent.mm.plugin.sns.ui.pa paVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        android.view.View view = paVar.f170191f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return view;
    }

    public static int f(com.tencent.mm.plugin.sns.ui.pa paVar, int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        paVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectColor", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        if (com.tencent.mm.ui.bk.C() && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            i17 = a84.c0.a(str, i17);
        } else if (!com.tencent.mm.ui.bk.C() && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            i17 = a84.c0.a(str2, i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectColor", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return i17;
    }

    public static /* synthetic */ android.view.View g(com.tencent.mm.plugin.sns.ui.pa paVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        android.view.View view = paVar.f170200r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return view;
    }

    public static /* synthetic */ android.view.View h(com.tencent.mm.plugin.sns.ui.pa paVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        android.view.View view = paVar.f170198p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return view;
    }

    public static /* synthetic */ android.widget.Button i(com.tencent.mm.plugin.sns.ui.pa paVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        android.widget.Button button = paVar.f170196n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return button;
    }

    public static /* synthetic */ android.widget.Button j(com.tencent.mm.plugin.sns.ui.pa paVar, android.widget.Button button) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        paVar.f170196n = button;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return button;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo k(com.tencent.mm.plugin.sns.ui.pa paVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo adCardActionBtnInfo = paVar.f170202t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return adCardActionBtnInfo;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo l(com.tencent.mm.plugin.sns.ui.pa paVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = paVar.f170201s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return snsInfo;
    }

    public static android.graphics.drawable.ShapeDrawable p(android.content.Context context, int i17, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShapeDrawable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(new float[]{f17, f17, f17, f17, f17, f17, f17, f17}, null, null));
        shapeDrawable.getPaint().setColor(i17);
        shapeDrawable.getPaint().setStrokeWidth(0.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShapeDrawable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return shapeDrawable;
    }

    public static void u(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", ca4.z0.t0(snsInfo.field_snsId));
            jSONObject.put("uxinfo", snsInfo.getUxinfo());
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("switchCount", i18);
            jSONObject.put("extInfo", jSONObject2);
            ca4.m0.a("timeline_sellingpoint_report", jSONObject.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdCardActionBtnCtrl", "reportChangeCount, exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    public static boolean w(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldUseSellingAnim", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        boolean z17 = false;
        if (snsInfo == null || snsInfo.getAdXml() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldUseSellingAnim", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            return false;
        }
        if (snsInfo.getAdXml().adSellingPointInfo != null && !ca4.m0.Z(context)) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldUseSellingAnim", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return z17;
    }

    public void A(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateAddFinderBtnText", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        if (i17 == 0) {
            this.f170196n.setText(this.f170202t.btnTitle);
        } else {
            this.f170196n.setText(this.f170202t.clickActionInfo.f162588j0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAddFinderBtnText", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    public void B(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateButtonState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        try {
            if (this.f170196n != null) {
                boolean o17 = o();
                this.f170196n.setEnabled(z17);
                v(z17);
                if (!q()) {
                    android.content.Context context = this.f170190e;
                    if (z17) {
                        this.f170196n.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478724ff));
                    } else {
                        this.f170196n.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
                    }
                } else if (o17 != z17) {
                    x();
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateButtonState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    public final void C(java.lang.String str) {
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateNewOrderUI", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo adCardActionBtnInfo = this.f170202t;
        if (adCardActionBtnInfo != null && (adClickActionInfo = adCardActionBtnInfo.clickActionInfo) != null && adClickActionInfo.f162594m0 != null) {
            if ("0".equals(str)) {
                this.f170196n.setText(this.f170202t.btnTitle);
                B(true);
            } else if ("1".equals(str)) {
                this.f170196n.setText(this.f170202t.clickActionInfo.f162594m0.f402554i);
                B(true);
                v(false);
                if (q()) {
                    x();
                } else {
                    this.f170196n.setTextColor(this.f170190e.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
                }
            } else if ("1000".equals(str)) {
                this.f170196n.setText(this.f170202t.clickActionInfo.f162594m0.f402560o);
                B(false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateNewOrderUI", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    @Override // com.tencent.mm.plugin.sns.ui.w4
    public void a(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateButtonState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        try {
            android.widget.Button button = this.f170196n;
            if (button != null) {
                button.setEnabled(z17);
                boolean o17 = o();
                v(z18);
                if (!q()) {
                    android.content.Context context = this.f170190e;
                    if (z18) {
                        this.f170196n.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478724ff));
                    } else {
                        this.f170196n.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
                    }
                } else if (o17 != z18) {
                    x();
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateButtonState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    @Override // com.tencent.mm.plugin.sns.ui.w4
    public void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateButtonText", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        try {
            android.widget.Button button = this.f170196n;
            if (button != null) {
                button.setText(str);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateButtonText", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    public void m(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdCardActionBtnCtrl", "fillSnsInfo, snsInfo==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        } else {
            this.f170201s = snsInfo;
            this.f170202t = snsInfo.getAdXml().adCardActionBtnInfo;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        }
    }

    public final android.graphics.drawable.StateListDrawable n(float f17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genButtonBgDrawable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        int[] iArr = {android.R.attr.state_pressed};
        int c17 = e3.b.c(i17, -16777216, 0.125f);
        android.content.Context context = this.f170190e;
        stateListDrawable.addState(iArr, p(context, c17, f17));
        stateListDrawable.addState(new int[0], p(context, i17, f17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genButtonBgDrawable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return stateListDrawable;
    }

    public final boolean o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionButtonColorEnable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        android.widget.Button button = this.f170196n;
        if (button == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionButtonColorEnable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            return false;
        }
        java.lang.Object tag = button.getTag();
        if (!(tag instanceof java.lang.Boolean)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionButtonColorEnable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            return true;
        }
        boolean booleanValue = ((java.lang.Boolean) tag).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionButtonColorEnable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return booleanValue;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f170204v.k(view);
        try {
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = this.f170201s.getTimeLine();
            if ((com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f170201s) && timeLine.ContentObj.f369837e == 15) || timeLine.ContentObj.f369837e == 5) {
                com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent snsAdLivingStreamJumpEvent = new com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent();
                snsAdLivingStreamJumpEvent.f54794g.f6405a = ca4.z0.T(this.f170201s);
                snsAdLivingStreamJumpEvent.e();
            }
        } catch (java.lang.Throwable unused) {
        }
        if (w(this.f170201s, this.f170190e)) {
            int i17 = this.f170189d == 0 ? 1 : 2;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f170201s;
            u(snsInfo, i17, com.tencent.mm.plugin.sns.ui.oa.a(i17, snsInfo != null ? snsInfo.field_snsId : 0L));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r5.f170202t.btnColor) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q() {
        /*
            r5 = this;
            java.lang.String r0 = "hasSetTextColorsWithConfigInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 0
            boolean r3 = com.tencent.mm.ui.bk.C()     // Catch: java.lang.IllegalArgumentException -> L2d
            r4 = 1
            if (r3 == 0) goto L1c
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r3 = r5.f170202t     // Catch: java.lang.IllegalArgumentException -> L2d
            java.lang.String r3 = r3.btnDarkColor     // Catch: java.lang.IllegalArgumentException -> L2d
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r3)     // Catch: java.lang.IllegalArgumentException -> L2d
            if (r3 != 0) goto L1c
        L1a:
            r2 = r4
            goto L35
        L1c:
            boolean r3 = com.tencent.mm.ui.bk.C()     // Catch: java.lang.IllegalArgumentException -> L2d
            if (r3 != 0) goto L35
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r3 = r5.f170202t     // Catch: java.lang.IllegalArgumentException -> L2d
            java.lang.String r3 = r3.btnColor     // Catch: java.lang.IllegalArgumentException -> L2d
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r3)     // Catch: java.lang.IllegalArgumentException -> L2d
            if (r3 != 0) goto L35
            goto L1a
        L2d:
            java.lang.String r3 = "MicroMsg.SnsAdCardActionBtnCtrl"
            java.lang.String r4 = "parse color error!"
            com.tencent.mars.xlog.Log.e(r3, r4)
        L35:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.pa.q():boolean");
    }

    public void r(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNormalViewAnim", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        this.f170192g.setAlpha(f17);
        this.f170194i.setAlpha(f17);
        this.f170195m.setAlpha(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNormalViewAnim", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    public void s(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSellPointViewAnim", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        android.view.View view = this.f170199q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "onSellPointViewAnim", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "onSellPointViewAnim", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSellPointViewAnim", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    public final void t(java.lang.String str, java.lang.String str2, android.widget.TextView textView, android.widget.TextView textView2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshTitleAndDesc", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        if (android.text.TextUtils.isEmpty(str)) {
            if (android.text.TextUtils.isEmpty(str2)) {
                textView.setVisibility(8);
            } else {
                com.tencent.mm.smiley.x1 Di = com.tencent.mm.smiley.x1.Di();
                textView.getContext();
                textView.setText(Di.Ri(str2, true));
                textView.setVisibility(0);
                textView.setTypeface(android.graphics.Typeface.defaultFromStyle(0));
            }
            textView2.setVisibility(8);
        } else {
            com.tencent.mm.smiley.x1 Di2 = com.tencent.mm.smiley.x1.Di();
            textView.getContext();
            textView.setText(Di2.Ri(str, true));
            textView.setVisibility(0);
            textView.setTypeface(android.graphics.Typeface.defaultFromStyle(1));
            if (android.text.TextUtils.isEmpty(str2)) {
                textView2.setVisibility(8);
            } else {
                com.tencent.mm.smiley.x1 Di3 = com.tencent.mm.smiley.x1.Di();
                textView2.getContext();
                textView2.setText(Di3.Ri(str2, true));
                textView2.setVisibility(0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshTitleAndDesc", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    public final void v(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActionButtonColorEnable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        android.widget.Button button = this.f170196n;
        if (button == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActionButtonColorEnable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        } else {
            button.setTag(java.lang.Boolean.valueOf(z17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActionButtonColorEnable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:2|3)|(9:40|(2:44|(1:46))|47|11|12|13|(2:29|(1:38)(3:33|(1:35)(1:37)|36))(4:17|(1:19)(1:28)|20|21)|22|23)(2:7|(1:9))|10|11|12|13|(1:15)|29|(1:31)|38|22|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        r5 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair x() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.pa.x():android.util.Pair");
    }

    public final void y(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateActionBtnText", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        int i17 = this.f170202t.clickActionInfo.f162571b;
        boolean z17 = false;
        if (i17 == 2) {
            if (android.text.TextUtils.isEmpty(this.f170196n.getText().toString())) {
                this.f170196n.setText(this.f170202t.btnTitle);
            }
            android.widget.Button button = this.f170196n;
            com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo adCardActionBtnInfo = this.f170202t;
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = adCardActionBtnInfo.clickActionInfo;
            new com.tencent.mm.plugin.sns.ui.ea(button, adClickActionInfo.B, adClickActionInfo.A, adCardActionBtnInfo.btnTitle).execute(new java.lang.Void[0]);
        } else if (i17 == 6) {
            try {
                java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(t07)) {
                    if ("1".equals(com.tencent.mm.plugin.sns.storage.w2.a(t07))) {
                        if (!q()) {
                            this.f170196n.setTextColor(-7829368);
                        }
                        this.f170196n.setText(this.f170202t.clickActionInfo.f162599p);
                        this.f170196n.setEnabled(false);
                        v(false);
                        x();
                    } else {
                        this.f170196n.setText(this.f170202t.btnTitle);
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdCardActionBtnCtrl", th6.toString());
            }
        } else if (i17 == 7) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.ui.ca(this));
        } else if (i17 == 13) {
            z();
        } else if (i17 == 16) {
            java.lang.String d17 = l44.d.d(ca4.z0.t0(this.f170201s.field_snsId), this.f170202t.clickActionInfo.f162594m0);
            C(d17);
            if (this.f170202t.clickActionInfo.f162594m0 != null && !"1000".equals(d17)) {
                l44.d.c(ca4.z0.t0(this.f170201s.field_snsId), this.f170201s.getUxinfo(), this.f170202t.clickActionInfo.f162594m0.f402546a, new com.tencent.mm.plugin.sns.ui.da(this));
            }
        } else {
            java.lang.CharSequence text = this.f170196n.getText();
            if (text == null || android.text.TextUtils.isEmpty(text.toString())) {
                this.f170196n.setText(this.f170202t.btnTitle);
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                if (snsInfo == null || snsInfo.getAdXml() == null || snsInfo.getAdXml().adLiveInfo == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    z17 = true;
                }
                if (!z17) {
                    this.f170196n.setText(this.f170202t.btnTitle);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateActionBtnText", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    public final void z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateAddFinderBtnInfo", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        A(this.A);
        ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Ui(this.f170202t.clickActionInfo.finderUsername, new com.tencent.mm.plugin.sns.ui.q9(this), 4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateAddFinderBtnInfo", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }
}
