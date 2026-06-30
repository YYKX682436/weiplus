package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ra implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f170395d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f170396e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f170397f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f170398g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f170399h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.Button f170400i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.Button f170401m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f170402n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.widget.SnsRatioView f170403o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f170404p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f170405q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f170406r;

    /* renamed from: s, reason: collision with root package name */
    public final int f170407s;

    /* renamed from: t, reason: collision with root package name */
    public final int f170408t;

    /* renamed from: u, reason: collision with root package name */
    public final int f170409u;

    /* renamed from: v, reason: collision with root package name */
    public final int f170410v;

    public ra(android.content.Context context, android.view.View view, com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f170407s = android.graphics.Color.parseColor("#1A000000");
        this.f170408t = android.graphics.Color.parseColor("#FFFFFFFF");
        this.f170409u = android.graphics.Color.parseColor("#E6000000");
        this.f170410v = android.graphics.Color.parseColor("#4D000000");
        this.f170406r = iVar;
        this.f170395d = view.findViewById(com.tencent.mm.R.id.p8t);
        this.f170407s = context.getResources().getColor(com.tencent.mm.R.color.a5h);
        this.f170408t = context.getResources().getColor(com.tencent.mm.R.color.a5e);
        this.f170409u = context.getResources().getColor(com.tencent.mm.R.color.a5i);
        this.f170410v = context.getResources().getColor(com.tencent.mm.R.color.a5f);
        this.f170396e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.p_c);
        this.f170397f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.p9y);
        this.f170398g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487634p94);
        this.f170399h = view.findViewById(com.tencent.mm.R.id.p8d);
        android.widget.Button button = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.p8e);
        this.f170400i = button;
        android.widget.Button button2 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.p8f);
        this.f170401m = button2;
        this.f170402n = view.findViewById(com.tencent.mm.R.id.lig);
        com.tencent.mm.plugin.sns.ui.widget.SnsRatioView snsRatioView = (com.tencent.mm.plugin.sns.ui.widget.SnsRatioView) view.findViewById(com.tencent.mm.R.id.p_2);
        this.f170403o = snsRatioView;
        this.f170404p = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.p_e);
        this.f170405q = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.p_f);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4);
        int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
        int b19 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
        snsRatioView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
        snsRatioView.f170913o.setAntiAlias(true);
        snsRatioView.f170914p.setAntiAlias(true);
        snsRatioView.f170907f = b17;
        snsRatioView.f170910i = java.lang.Math.max(b17, b19);
        snsRatioView.f170908g = 70;
        snsRatioView.f170909h = b18;
        float f17 = b17;
        float[] fArr = snsRatioView.f170915q;
        fArr[0] = f17;
        fArr[1] = f17;
        fArr[2] = f17;
        fArr[3] = f17;
        fArr[4] = f17;
        fArr[5] = f17;
        fArr[6] = f17;
        fArr[7] = f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
    }

    public static com.tencent.mm.plugin.sns.storage.e a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdVoteInfoExtFromWebUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdVoteResultInfo", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String j17 = gm0.j1.b().j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str3 = "";
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        if (j17 == null) {
            j17 = "";
        }
        sb6.append(j17);
        if (sb6.length() > 0) {
            str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("SnsAdVote", 0).getString(sb6.toString() + "_voteRet", "");
        } else {
            com.tencent.mars.xlog.Log.e("StorageHelper", "getSnsAdVoteResultInfo, key is empty");
        }
        com.tencent.mars.xlog.Log.i("StorageHelper", "getSnsAdVoteResultInfo, ret=" + str3 + ", timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdVoteResultInfo", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        try {
            if (!android.text.TextUtils.isEmpty(str3)) {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str3);
                if (jSONArray.length() == 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdVoteInfoExtFromWebUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
                    return null;
                }
                com.tencent.mm.plugin.sns.storage.e eVar = new com.tencent.mm.plugin.sns.storage.e();
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                    com.tencent.mm.plugin.sns.storage.f fVar = new com.tencent.mm.plugin.sns.storage.f();
                    fVar.f165973a = jSONObject.optString(dm.i4.COL_ID);
                    fVar.f165974b = jSONObject.optInt("scoring");
                    jSONObject.optInt("friends");
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray("friendsList");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                            fVar.f165975c.add(optJSONArray.getString(i18));
                        }
                    }
                    eVar.f165966a.add(fVar);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdVoteInfoExtFromWebUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
                return eVar;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsAdCardVoteCtrl", "getAdVoteInfoExtFromWebUpdate, exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdVoteInfoExtFromWebUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
        return null;
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideVoteInfoView", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
        if (this.f170395d.getVisibility() != 8) {
            android.view.View view = this.f170395d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "hideVoteInfoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "hideVoteInfoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideVoteInfoView", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
    }

    public void c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.Object obj) {
        java.lang.String str;
        int i17;
        android.widget.Button button = this.f170401m;
        android.widget.Button button2 = this.f170400i;
        android.widget.TextView textView = this.f170405q;
        android.widget.TextView textView2 = this.f170404p;
        com.tencent.mm.plugin.sns.ui.widget.SnsRatioView snsRatioView = this.f170403o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
        try {
            button2.setTag(obj);
            button.setTag(obj);
            com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
            com.tencent.mm.plugin.sns.storage.s sVar = snsInfo.getAdXml().adVoteInfo;
            java.lang.String uxinfo = snsInfo.getUxinfo();
            java.lang.String str2 = sVar.f166123a;
            int b17 = com.tencent.mm.plugin.sns.storage.w2.b(str2, uxinfo);
            str = "refreshUI";
            boolean z17 = b17 > 0;
            try {
                com.tencent.mm.plugin.sns.storage.e a17 = a(str2, uxinfo);
                if (a17 == null) {
                    com.tencent.mars.xlog.Log.i("SnsAdCardVoteCtrl", "fillVoteInfoView, web voteResult == null, snsId=" + snsInfo.getSnsId());
                    a17 = snsInfo.getAdInfo().adVoteInfoExt;
                } else {
                    com.tencent.mars.xlog.Log.i("SnsAdCardVoteCtrl", "fillVoteInfoView, web voteResult != null, snsId=" + snsInfo.getSnsId());
                }
                boolean isEmpty = android.text.TextUtils.isEmpty(adXml.adCardDesc);
                android.widget.TextView textView3 = this.f170398g;
                if (isEmpty) {
                    textView3.setVisibility(8);
                } else {
                    textView3.setText(adXml.adCardDesc);
                    textView3.setVisibility(0);
                }
                boolean isEmpty2 = android.text.TextUtils.isEmpty(sVar.f166124b);
                android.widget.TextView textView4 = this.f170397f;
                if (isEmpty2) {
                    textView4.setVisibility(8);
                } else {
                    textView4.setText(sVar.f166124b);
                    textView4.setVisibility(0);
                }
                boolean isEmpty3 = android.text.TextUtils.isEmpty(adXml.adCardTitle);
                android.widget.TextView textView5 = this.f170396e;
                if (isEmpty3) {
                    textView5.setVisibility(8);
                    textView4.setVisibility(8);
                } else {
                    textView5.setText(adXml.adCardTitle);
                    textView5.setVisibility(0);
                }
                java.util.ArrayList arrayList = sVar.f166125c;
                java.lang.String str3 = ((com.tencent.mm.plugin.sns.storage.t) arrayList.get(0)).f166139f;
                java.lang.String str4 = ((com.tencent.mm.plugin.sns.storage.t) arrayList.get(1)).f166139f;
                java.lang.String a18 = sVar.a(0);
                java.lang.String a19 = sVar.a(1);
                if (z17) {
                    a17.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLeftRatio", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
                    com.tencent.mm.plugin.sns.storage.f a27 = a17.a(str3);
                    com.tencent.mm.plugin.sns.storage.f a28 = a17.a(str4);
                    int i18 = a27 == null ? 0 : a27.f165974b;
                    int i19 = (a28 == null ? 0 : a28.f165974b) + i18;
                    if (i19 > 0) {
                        i17 = (i18 * 100) / i19;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLeftRatio", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLeftRatio", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
                        i17 = 50;
                    }
                    int i27 = 100 - i17;
                    android.view.View view = this.f170399h;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "refreshUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "refreshUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view2 = this.f170402n;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "refreshUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "refreshUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    snsRatioView.a(i17, i27);
                    textView2.setText(a18 + " " + i17 + "%");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(i27);
                    sb6.append("% ");
                    sb6.append(a19);
                    textView.setText(sb6.toString());
                    android.graphics.Paint paint = snsRatioView.f170914p;
                    android.graphics.Paint paint2 = snsRatioView.f170913o;
                    int i28 = this.f170409u;
                    int i29 = this.f170410v;
                    int i37 = this.f170407s;
                    int i38 = this.f170408t;
                    if (b17 == 1) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBgColor", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
                        paint2.setColor(i37);
                        paint.setColor(i38);
                        snsRatioView.invalidate();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBgColor", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
                        textView2.setTextColor(i28);
                        textView.setTextColor(i29);
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBgColor", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
                        paint2.setColor(i38);
                        paint.setColor(i37);
                        snsRatioView.invalidate();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBgColor", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
                        textView2.setTextColor(i29);
                        textView.setTextColor(i28);
                    }
                } else {
                    android.view.View view3 = this.f170399h;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "refreshUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "refreshUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view4 = this.f170402n;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "refreshUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "refreshUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    button2.setText(a18);
                    button.setText(a19);
                }
            } catch (java.lang.Exception e17) {
                e = e17;
                com.tencent.mars.xlog.Log.e("SnsAdCardVoteCtrl", "fillVoteInfoView, exp:" + android.util.Log.getStackTraceString(e));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            str = "refreshUI";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showVoteInfoView", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
        if (this.f170395d.getVisibility() != 0) {
            android.view.View view = this.f170395d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "showVoteInfoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "showVoteInfoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showVoteInfoView", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.Button button = this.f170400i;
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f170406r;
        if (view == button) {
            iVar.R.onClick(view);
        } else if (view == this.f170401m) {
            iVar.S.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
    }
}
