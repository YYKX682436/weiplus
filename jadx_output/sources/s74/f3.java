package s74;

/* loaded from: classes4.dex */
public final class f3 {
    public android.widget.FrameLayout A;
    public float B;
    public final java.util.List C;
    public android.widget.Button D;
    public android.widget.Button E;
    public android.widget.Button F;
    public androidx.appcompat.widget.AppCompatImageView G;
    public androidx.appcompat.widget.AppCompatTextView H;
    public final java.util.List I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView f404266J;
    public android.widget.FrameLayout K;
    public android.widget.ImageView L;
    public com.google.android.flexbox.FlexboxLayout M;
    public com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout N;
    public com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout O;
    public android.view.ViewGroup P;
    public com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout Q;
    public boolean R;
    public com.tencent.mm.plugin.sns.ad.widget.living.j0 S;
    public n74.n1 T;
    public com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView U;
    public final java.util.List V;
    public int W;

    /* renamed from: a, reason: collision with root package name */
    public final int f404267a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f404268b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f404269c;

    /* renamed from: d, reason: collision with root package name */
    public final org.json.JSONArray f404270d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f404271e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f404272f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.ADXml f404273g;

    /* renamed from: h, reason: collision with root package name */
    public final i64.q f404274h;

    /* renamed from: i, reason: collision with root package name */
    public int f404275i;

    /* renamed from: j, reason: collision with root package name */
    public int f404276j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f404277k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f404278l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Float f404279m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Float f404280n;

    /* renamed from: o, reason: collision with root package name */
    public org.json.JSONObject f404281o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f404282p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f404283q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f404284r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f404285s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f404286t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f404287u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f404288v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f404289w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f404290x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewGroup f404291y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.ViewGroup f404292z;

    public f3(int i17, android.content.Context ctx, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, org.json.JSONArray jSONArray, kotlinx.coroutines.y0 y0Var) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        this.f404267a = i17;
        this.f404268b = ctx;
        this.f404269c = snsInfo;
        this.f404270d = jSONArray;
        this.f404271e = y0Var;
        this.f404272f = jz5.h.b(new s74.e3(this));
        com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
        kotlin.jvm.internal.o.f(adXml, "getAdXml(...)");
        this.f404273g = adXml;
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo();
        adInfo = adInfo == null ? new com.tencent.mm.plugin.sns.storage.ADInfo(null) : adInfo;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
        this.f404274h = new i64.q(adInfo, adXml, timeLine);
        this.f404282p = new java.util.LinkedHashMap();
        this.f404283q = new java.util.LinkedHashMap();
        this.f404284r = new java.util.LinkedHashMap();
        this.f404285s = new java.util.LinkedHashMap();
        this.f404286t = new java.util.ArrayList();
        this.f404287u = new java.util.ArrayList();
        this.f404288v = new java.util.ArrayList();
        this.f404289w = new java.util.ArrayList();
        this.f404290x = new java.util.ArrayList();
        this.B = -1.0f;
        this.C = new java.util.ArrayList();
        this.I = new java.util.ArrayList();
        this.V = new java.util.ArrayList();
    }

    public final s74.j3 a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findViewNodeById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        if (str == null || str.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findViewNodeById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            return null;
        }
        for (s74.j3 j3Var : ((java.util.LinkedHashMap) this.f404282p).values()) {
            if (kotlin.jvm.internal.o.b(j3Var.a(), str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findViewNodeById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                return j3Var;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findViewNodeById", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return null;
    }

    public final void b(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genAbsoluteChildren", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        s74.u3.f404562a.B(jSONObject, s74.d3.f404247d, new s74.c3(jSONObject, arrayList, this));
        if (!arrayList.isEmpty()) {
            this.f404285s.put(jSONObject, arrayList);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genAbsoluteChildren", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
    }

    public final androidx.appcompat.widget.AppCompatImageView c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionLinkDownloadLogo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        androidx.appcompat.widget.AppCompatImageView appCompatImageView = this.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionLinkDownloadLogo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return appCompatImageView;
    }

    public final androidx.appcompat.widget.AppCompatTextView d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionLinkText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = this.H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionLinkText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return appCompatTextView;
    }

    public final i64.q e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdDataModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDataModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return this.f404274h;
    }

    public final com.tencent.mm.plugin.sns.storage.ADXml f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdxml", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdxml", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return this.f404273g;
    }

    public final android.widget.Button g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickActionButton", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        android.widget.Button button = this.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickActionButton", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return button;
    }

    public final android.content.Context h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCtx", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCtx", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return this.f404268b;
    }

    public final int i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDynamicVersion", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        int i17 = this.f404276j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDynamicVersion", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return i17;
    }

    public final android.widget.ImageView j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEasyBuyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        android.widget.ImageView imageView = this.L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEasyBuyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return imageView;
    }

    public final com.google.android.flexbox.FlexboxLayout k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGridElementContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.google.android.flexbox.FlexboxLayout flexboxLayout = this.M;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGridElementContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return flexboxLayout;
    }

    public final java.lang.String l(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        java.lang.String optString = jSONObject.optString(dm.i4.COL_ID);
        if (optString == null) {
            optString = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getId", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return optString;
    }

    public final boolean m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInLargeWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        boolean z17 = this.f404277k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInLargeWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return z17;
    }

    public final android.widget.FrameLayout n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        android.widget.FrameLayout frameLayout = this.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return frameLayout;
    }

    public final android.view.ViewGroup o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElementContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        android.view.ViewGroup viewGroup = this.f404292z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElementContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return viewGroup;
    }

    public final java.util.Map p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getObj2ViewMap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        java.util.Map map = this.f404282p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getObj2ViewMap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return map;
    }

    public final com.tencent.mm.plugin.sns.storage.SnsInfo q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return this.f404269c;
    }

    public final int r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        int i17 = this.f404275i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return i17;
    }

    public final android.widget.FrameLayout s() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        android.widget.FrameLayout frameLayout = this.K;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        return frameLayout;
    }

    public final void t(androidx.appcompat.widget.AppCompatImageView appCompatImageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActionLinkDownloadLogo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        this.G = appCompatImageView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActionLinkDownloadLogo", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
    }

    public final void u(androidx.appcompat.widget.AppCompatTextView appCompatTextView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActionLinkText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        this.H = appCompatTextView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActionLinkText", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
    }

    public final void v(s74.j3 j3Var) {
        android.widget.ImageView.ScaleType scaleType;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        if (j3Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
        org.json.JSONObject jSONObject = j3Var.f404368c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
        if (jSONObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
        java.lang.String str = j3Var.f404370e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$ViewNode");
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("DynamicView.Factory", "updateViewNode, viewType empty, id=" + j3Var.a());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            return;
        }
        com.tencent.mars.xlog.Log.i("DynamicView.Factory", "updateViewNode, id=" + j3Var.a());
        if (jSONObject.has("alpha")) {
            android.view.View c17 = j3Var.c();
            float optDouble = (float) jSONObject.optDouble("alpha");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(optDouble));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$DynamicViewContext", "updateViewNode", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$ViewNode;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            c17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(c17, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$DynamicViewContext", "updateViewNode", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$ViewNode;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        java.lang.String optString = jSONObject.optString("display");
        if (kotlin.jvm.internal.o.b(optString, "flex")) {
            android.view.View c18 = j3Var.c();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c18, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$DynamicViewContext", "updateViewNode", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$ViewNode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c18, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$DynamicViewContext", "updateViewNode", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$ViewNode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (kotlin.jvm.internal.o.b(optString, com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE)) {
            android.view.View c19 = j3Var.c();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(c19, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$DynamicViewContext", "updateViewNode", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$ViewNode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(c19, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$DynamicViewContext", "updateViewNode", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$ViewNode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        s74.u3 u3Var = s74.u3.f404562a;
        u3Var.m(this, jSONObject, this.f404268b, j3Var.c());
        if (kotlin.jvm.internal.o.b(str, "image")) {
            if (j3Var.c() instanceof androidx.appcompat.widget.AppCompatImageView) {
                java.lang.String optString2 = jSONObject.optString("object-fit");
                if (optString2 != null) {
                    int hashCode = optString2.hashCode();
                    if (hashCode != 3143043) {
                        if (hashCode != 94852023) {
                            if (hashCode == 951526612 && optString2.equals("contain")) {
                                scaleType = android.widget.ImageView.ScaleType.FIT_CENTER;
                                android.widget.ImageView.ScaleType scaleType2 = scaleType;
                                android.content.Context context = this.f404268b;
                                android.view.View c27 = j3Var.c();
                                kotlin.jvm.internal.o.e(c27, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
                                u3Var.a(this, context, jSONObject, (androidx.appcompat.widget.AppCompatImageView) c27, scaleType2);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
                            }
                        } else if (optString2.equals("cover")) {
                            scaleType = android.widget.ImageView.ScaleType.CENTER_CROP;
                            android.widget.ImageView.ScaleType scaleType22 = scaleType;
                            android.content.Context context2 = this.f404268b;
                            android.view.View c272 = j3Var.c();
                            kotlin.jvm.internal.o.e(c272, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
                            u3Var.a(this, context2, jSONObject, (androidx.appcompat.widget.AppCompatImageView) c272, scaleType22);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
                        }
                    } else if (optString2.equals("fill")) {
                        scaleType = android.widget.ImageView.ScaleType.FIT_XY;
                        android.widget.ImageView.ScaleType scaleType222 = scaleType;
                        android.content.Context context22 = this.f404268b;
                        android.view.View c2722 = j3Var.c();
                        kotlin.jvm.internal.o.e(c2722, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
                        u3Var.a(this, context22, jSONObject, (androidx.appcompat.widget.AppCompatImageView) c2722, scaleType222);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
                    }
                }
                scaleType = android.widget.ImageView.ScaleType.CENTER_CROP;
                android.widget.ImageView.ScaleType scaleType2222 = scaleType;
                android.content.Context context222 = this.f404268b;
                android.view.View c27222 = j3Var.c();
                kotlin.jvm.internal.o.e(c27222, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
                u3Var.a(this, context222, jSONObject, (androidx.appcompat.widget.AppCompatImageView) c27222, scaleType2222);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            }
        } else if (kotlin.jvm.internal.o.b(str, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT)) {
            android.view.View c28 = j3Var.c();
            android.widget.TextView textView = c28 instanceof android.widget.TextView ? (android.widget.TextView) c28 : null;
            if (textView != null) {
                textView.setText(com.tencent.mm.smiley.x1.Di().Ri(u3Var.x(jSONObject, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, this.f404274h), true));
                textView.setTextColor(s74.q4.f404513a.r(jSONObject, u3Var.y(jSONObject, -16777216)));
            }
        } else {
            com.tencent.mars.xlog.Log.e("DynamicView.Factory", "updateViewNode, unknown viewType=" + str + ", id=" + j3Var.a());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateViewNode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
    }
}
