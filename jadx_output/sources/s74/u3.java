package s74;

/* loaded from: classes4.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public static final s74.u3 f404562a = new s74.u3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f404563b = kz5.c1.l(new jz5.l("finder-logo", java.lang.Integer.valueOf(com.tencent.mm.R.raw.album_ad_finder_link_icon)), new jz5.l("finder-logo-dark", java.lang.Integer.valueOf(com.tencent.mm.R.raw.album_ad_finder_link_dark_icon)), new jz5.l("weapp-logo", java.lang.Integer.valueOf(com.tencent.mm.R.raw.album_ad_link_tag_weapp)), new jz5.l("weapp-logo-dark", java.lang.Integer.valueOf(com.tencent.mm.R.raw.album_ad_link_tag_weapp_dark)));

    public final boolean A(java.lang.Object obj, yz5.l childrenOf, yz5.l visit) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("traverseObjByIterable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        kotlin.jvm.internal.o.g(childrenOf, "childrenOf");
        kotlin.jvm.internal.o.g(visit, "visit");
        if (obj == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("traverseObjByIterable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return true;
        }
        if (((java.lang.Boolean) visit.invoke(obj)).booleanValue()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("traverseObjByIterable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return true;
        }
        java.lang.Iterable iterable = (java.lang.Iterable) childrenOf.invoke(obj);
        if (iterable != null) {
            for (java.lang.Object obj2 : iterable) {
                if (obj2 != null) {
                    f404562a.A(obj2, childrenOf, visit);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("traverseObjByIterable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return false;
    }

    public final void B(org.json.JSONObject jSONObject, yz5.l childrenOf, yz5.l visit) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("traverseObjByJSONArray", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        kotlin.jvm.internal.o.g(childrenOf, "childrenOf");
        kotlin.jvm.internal.o.g(visit, "visit");
        if (jSONObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("traverseObjByJSONArray", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return;
        }
        if (((java.lang.Boolean) visit.invoke(jSONObject)).booleanValue()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("traverseObjByJSONArray", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return;
        }
        org.json.JSONArray jSONArray = (org.json.JSONArray) childrenOf.invoke(jSONObject);
        if (jSONArray != null) {
            c75.c.d(jSONArray, new s74.t3(childrenOf, visit));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("traverseObjByJSONArray", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x04fb, code lost:
    
        if ((r3 != null && r3.a()) == false) goto L308;
     */
    /* JADX WARN: Removed duplicated region for block: B:299:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0545 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0551 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x055d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0569 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0575 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String C(s74.f3 r20, java.lang.String r21, com.tencent.mm.plugin.sns.storage.SnsInfo r22, android.content.Context r23, int r24) {
        /*
            Method dump skipped, instructions count: 1457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.u3.C(s74.f3, java.lang.String, com.tencent.mm.plugin.sns.storage.SnsInfo, android.content.Context, int):java.lang.String");
    }

    public final void a(s74.f3 f3Var, android.content.Context context, org.json.JSONObject jSONObject, androidx.appcompat.widget.AppCompatImageView appCompatImageView, android.widget.ImageView.ScaleType scaleType) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        f3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLifecycleScope", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLifecycleScope", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        kotlinx.coroutines.y0 y0Var = f3Var.f404271e;
        if (y0Var != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new s74.k3(jSONObject, f3Var, appCompatImageView, scaleType, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r14.equals("bold") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007f, code lost:
    
        if (kotlin.jvm.internal.o.b(r14, "bold") == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.content.Context r13, org.json.JSONObject r14, android.widget.TextView r15) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.u3.b(android.content.Context, org.json.JSONObject, android.widget.TextView):boolean");
    }

    public final s74.j3 c(s74.f3 f3Var, android.content.Context context, org.json.JSONObject jSONObject, float f17, s74.g3 g3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createBulletScreenContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView adBulletScreenView = new com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView(context, null);
        c44.a.l();
        c44.a.o();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.addView(adBulletScreenView, layoutParams);
        f3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdBulletScreenView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.U = adBulletScreenView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdBulletScreenView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        c44.a.l();
        g3Var.j(-1);
        c44.a.l();
        g3Var.i(-1);
        s74.j3 j3Var = new s74.j3(frameLayout, g3Var, null, null, null, 28, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createBulletScreenContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return j3Var;
    }

    public final s74.j3 d(s74.f3 f3Var, android.content.Context context, android.graphics.drawable.StateListDrawable stateListDrawable, float f17, org.json.JSONObject jSONObject, s74.g3 g3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createComplianceContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bak, (android.view.ViewGroup) null);
        com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView complianceManagementView = inflate instanceof com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView ? (com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView) inflate : null;
        if (complianceManagementView == null) {
            com.tencent.mars.xlog.Log.e("DynamicView.Factory", "inflate com.tencent.mm.plugin.sns.R.layout.five_compliance_management error!");
            s74.j3 j3Var = new s74.j3(new android.widget.FrameLayout(context), g3Var, null, null, null, 28, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createComplianceContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return j3Var;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetForDynamicView", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
        android.view.View view = complianceManagementView.contentView;
        if (view != null) {
            view.setBackground(null);
        }
        android.view.View view2 = complianceManagementView.contentView;
        android.view.ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        android.view.View view3 = complianceManagementView.contentView;
        if (view3 != null) {
            view3.requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetForDynamicView", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
        complianceManagementView.setBackground(stateListDrawable);
        z(f3Var, complianceManagementView, f17, jSONObject);
        complianceManagementView.setPadding(g3Var.e(), g3Var.g(), g3Var.f(), g3Var.d());
        complianceManagementView.setMinimumHeight(g3Var.b());
        complianceManagementView.setMinimumWidth(g3Var.c());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComplianceView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.f404266J = complianceManagementView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComplianceView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        complianceManagementView.setVisibility(8);
        s74.j3 j3Var2 = new s74.j3(complianceManagementView, g3Var, null, null, null, 28, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createComplianceContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return j3Var2;
    }

    public final s74.j3 e(s74.f3 f3Var, org.json.JSONObject obj, android.content.Context ctx, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFlexView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        kotlin.jvm.internal.o.g(f3Var, "<this>");
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(ctx, "ctx");
        org.json.JSONObject optJSONObject = obj.optJSONObject("configs");
        if (optJSONObject == null) {
            optJSONObject = new org.json.JSONObject();
        }
        int optInt = optJSONObject.optInt("version", -1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDynamicVersion", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.f404276j = optInt;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDynamicVersion", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.f404275i = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.tencent.mars.xlog.Log.i("DynamicView.Factory", "createFlexView " + f3Var.i());
        org.json.JSONObject optJSONObject2 = obj.optJSONObject("layout");
        if (optJSONObject2 == null) {
            optJSONObject2 = new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Iterator<java.lang.String> keys = optJSONObject2.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object opt = optJSONObject2.opt(next);
            boolean z17 = opt instanceof org.json.JSONObject;
            c75.c cVar = c75.c.f39637a;
            if (z17) {
                opt = cVar.c((org.json.JSONObject) opt);
            } else if (opt instanceof org.json.JSONArray) {
                opt = cVar.b((org.json.JSONArray) opt);
            }
            jSONObject.put(next, opt);
        }
        B(jSONObject, s74.m3.f404424d, new s74.n3(f3Var));
        if (f3Var.i() >= 101) {
            f3Var.b(jSONObject);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRootObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.f404281o = jSONObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRootObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFlexViewInternal$default", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        s74.j3 f17 = f(f3Var, jSONObject, ctx, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFlexViewInternal$default", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFlexView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return f17;
    }

    public final s74.j3 f(s74.f3 f3Var, org.json.JSONObject jSONObject, android.content.Context context, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createFlexViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        s74.j3 l17 = l(f3Var, jSONObject, context);
        if (l17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFlexViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return null;
        }
        if (z17) {
            s74.q4 q4Var = s74.q4.f404513a;
            android.view.View c17 = l17.c();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSubOfMainContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            kotlin.jvm.internal.o.g(c17, "<this>");
            c17.setTag(com.tencent.mm.R.id.pv6, java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSubOfMainContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            if (f3Var.i() >= 101 && kotlin.jvm.internal.o.b(jSONObject.optString("position"), "absolute")) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainElementContainerSubAbsoluteViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                java.util.List list = f3Var.C;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainElementContainerSubAbsoluteViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                ((java.util.ArrayList) list).add(l17.c());
            }
        }
        boolean b17 = kotlin.jvm.internal.o.b(jSONObject.optString(dm.i4.COL_ID), "rootContainer");
        if (b17) {
            l17.c().setId(com.tencent.mm.R.id.d5i);
            boolean b18 = kotlin.jvm.internal.o.b(jSONObject.optString("enable-outer-area-click"), "true");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEnableOuterAreaClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            f3Var.f404278l = b18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnableOuterAreaClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            if (jSONObject.has("android-root-margin-top")) {
                java.lang.Float valueOf = java.lang.Float.valueOf(q(jSONObject, "android-root-margin-top", 10.0f, f3Var));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRootViewMarginTop", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                f3Var.f404279m = valueOf;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRootViewMarginTop", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            }
            if (jSONObject.has("android-root-margin-bottom")) {
                java.lang.Float valueOf2 = java.lang.Float.valueOf(q(jSONObject, "android-root-margin-bottom", 2.0f, f3Var));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRootViewMarginBottom", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                f3Var.f404280n = valueOf2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRootViewMarginBottom", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            }
        }
        if (jSONObject.has("children")) {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("children");
            kotlin.jvm.internal.o.d(jSONArray);
            c75.c.d(jSONArray, new s74.o3(f3Var, jSONObject, z17, context, b17, l17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createFlexViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return l17;
    }

    public final s74.j3 g(s74.f3 f3Var, android.content.Context context, org.json.JSONObject jSONObject, float f17, s74.g3 g3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createGridElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = new com.tencent.mm.plugin.sns.ui.MaskImageView(context);
        z(f3Var, maskImageView, f17, jSONObject);
        s74.j3 j3Var = new s74.j3(maskImageView, g3Var, null, null, null, 28, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createGridElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return j3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x035d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s74.g3 h(s74.f3 r34, org.json.JSONObject r35) {
        /*
            Method dump skipped, instructions count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.u3.h(s74.f3, org.json.JSONObject):s74.g3");
    }

    public final s74.j3 i(s74.f3 f3Var, android.content.Context context, org.json.JSONObject jSONObject, float f17, s74.g3 g3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createLivingStatusLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout = null;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f487976d1, (android.view.ViewGroup) null);
        android.view.ViewGroup viewGroup = inflate instanceof android.view.ViewGroup ? (android.view.ViewGroup) inflate : null;
        if (viewGroup != null) {
            c44.a.o();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, c44.b.a(21));
            layoutParams.gravity = 8388659;
            layoutParams.leftMargin = c44.b.a(6);
            layoutParams.topMargin = c44.b.a(6);
            frameLayout.addView(viewGroup, layoutParams);
        } else {
            viewGroup = null;
        }
        f3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLivingStatusLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.P = viewGroup;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLivingStatusLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f487975d0, (android.view.ViewGroup) null);
        com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout2 = inflate2 instanceof com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout ? (com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout) inflate2 : null;
        if (livingDescBarLayout2 != null) {
            c44.a.l();
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, c44.b.a(30));
            layoutParams2.gravity = 80;
            frameLayout.addView(livingDescBarLayout2, layoutParams2);
            livingDescBarLayout = livingDescBarLayout2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLivingDescBar", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.O = livingDescBarLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLivingDescBar", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        s74.j3 j3Var = new s74.j3(frameLayout, g3Var, null, null, null, 28, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createLivingStatusLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return j3Var;
    }

    public final s74.j3 j(s74.f3 f3Var, android.content.Context context, android.graphics.drawable.StateListDrawable stateListDrawable, float f17, org.json.JSONObject jSONObject, s74.g3 g3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        s74.p3 p3Var = new s74.p3(context, f3Var);
        p3Var.setBackground(stateListDrawable);
        z(f3Var, p3Var, f17, jSONObject);
        p3Var.setPadding(g3Var.e(), g3Var.g(), g3Var.f(), g3Var.d());
        p3Var.setMinimumHeight(g3Var.b());
        p3Var.setMinimumWidth(g3Var.c());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.A = p3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        float a17 = g3Var.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMainElementHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.B = a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMainElementHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        s74.j3 j3Var = new s74.j3(p3Var, g3Var, null, null, null, 28, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return j3Var;
    }

    public final s74.j3 k(s74.f3 f3Var, android.content.Context context, android.graphics.drawable.StateListDrawable stateListDrawable, float f17, org.json.JSONObject jSONObject, s74.g3 g3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSeparator", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setBackground(new android.graphics.drawable.ColorDrawable(v(jSONObject, "color", context.getResources().getColor(com.tencent.mm.R.color.a4m))));
        if (kotlin.jvm.internal.o.b(jSONObject.optString("separator-direction"), "vertical")) {
            g3Var.j(1);
        } else {
            g3Var.i(1);
        }
        frameLayout.setPadding(g3Var.e(), g3Var.g(), g3Var.f(), g3Var.d());
        s74.j3 j3Var = new s74.j3(frameLayout, g3Var, null, null, null, 28, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSeparator", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return j3Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final s74.j3 l(s74.f3 r58, org.json.JSONObject r59, android.content.Context r60) {
        /*
            Method dump skipped, instructions count: 4670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.u3.l(s74.f3, org.json.JSONObject, android.content.Context):s74.j3");
    }

    public final void m(s74.f3 f3Var, org.json.JSONObject obj, android.content.Context ctx, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doHideViewForElderMode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        kotlin.jvm.internal.o.g(f3Var, "<this>");
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(view, "view");
        if (obj.optBoolean("hide-for-elder-mode") && ca4.m0.Z(ctx)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory", "doHideViewForElderMode", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$DynamicViewContext;Lorg/json/JSONObject;Landroid/content/Context;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory", "doHideViewForElderMode", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$DynamicViewContext;Lorg/json/JSONObject;Landroid/content/Context;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doHideViewForElderMode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
    }

    public final int n(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickTransitionType", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        java.lang.Object tag = view != null ? view.getTag(com.tencent.mm.R.id.f484141pv4) : null;
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        int i17 = 0;
        if (str != null) {
            switch (str.hashCode()) {
                case -1721484885:
                    if (str.equals("baseType")) {
                        i17 = 3;
                        break;
                    }
                    break;
                case -1255672639:
                    if (str.equals("normalType")) {
                        i17 = 1;
                        break;
                    }
                    break;
                case -1038130864:
                    str.equals("undefined");
                    break;
                case 1475827516:
                    if (str.equals("ordinaryType")) {
                        i17 = 2;
                        break;
                    }
                    break;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickTransitionType", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return i17;
    }

    public final jz5.l o(s74.f3 f3Var, org.json.JSONObject jSONObject) {
        jz5.l lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCombinedElementWh", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        if (kotlin.jvm.internal.o.b(jSONObject.optString("type"), "gridElement")) {
            if (f3Var.m()) {
                lVar = new jz5.l(java.lang.Integer.valueOf(c44.b.a(130)), java.lang.Integer.valueOf(c44.b.a(130)));
            } else {
                com.tencent.mm.plugin.sns.storage.m0 m0Var = f3Var.f().adCombinedGridInfo;
                lVar = m0Var != null && m0Var.b() == 1 ? new jz5.l(java.lang.Integer.valueOf(c44.b.a(80)), java.lang.Integer.valueOf(c44.b.a(80))) : new jz5.l(java.lang.Integer.valueOf(c44.b.a(75)), java.lang.Integer.valueOf(c44.b.a(75)));
            }
        } else if (f3Var.m()) {
            lVar = new jz5.l(java.lang.Integer.valueOf(c44.b.a(396)), java.lang.Integer.valueOf(c44.b.a(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT)));
        } else {
            com.tencent.mm.plugin.sns.storage.m0 m0Var2 = f3Var.f().adCombinedGridInfo;
            lVar = m0Var2 != null && m0Var2.b() == 1 ? new jz5.l(java.lang.Integer.valueOf(c44.b.a(248)), java.lang.Integer.valueOf(c44.b.a(140))) : new jz5.l(java.lang.Integer.valueOf(c44.b.a(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR)), java.lang.Integer.valueOf(c44.b.a(132)));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCombinedElementWh", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return lVar;
    }

    public final int p() {
        android.view.Display defaultDisplay;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMultiImageWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.Object systemService = context != null ? context.getSystemService("window") : null;
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        android.graphics.Point point = new android.graphics.Point();
        point.x = displayMetrics.widthPixels;
        point.y = displayMetrics.heightPixels;
        com.tencent.mm.plugin.sns.model.l4.bk(point);
        int nj6 = com.tencent.mm.plugin.sns.model.l4.nj();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMultiImageWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return nj6;
    }

    public final float q(org.json.JSONObject jSONObject, java.lang.String key, float f17, s74.f3 dynamicCtx) {
        float floatValue;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPxFloat", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(dynamicCtx, "dynamicCtx");
        java.lang.String optString = jSONObject.optString(key);
        if (optString == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPxFloat", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return f17;
        }
        if (r26.i0.n(optString, "rem", true)) {
            java.lang.String substring = optString.substring(0, optString.length() - 3);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            java.lang.Float f18 = r26.g0.f(r26.n0.u0(substring).toString());
            floatValue = f18 != null ? f18.floatValue() : 0.0f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            f17 = (dynamicCtx.f404267a * floatValue) / 750.0f;
        } else if (r26.i0.n(optString, "px", true)) {
            java.lang.String substring2 = optString.substring(0, optString.length() - 2);
            kotlin.jvm.internal.o.f(substring2, "substring(...)");
            java.lang.Float f19 = r26.g0.f(r26.n0.u0(substring2).toString());
            floatValue = f19 != null ? f19.floatValue() : 0.0f;
            android.content.Context h17 = dynamicCtx.h();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dp2Pix", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$Companion");
            float g17 = i65.a.g(h17) * floatValue;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dp2Pix", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$Companion");
            f17 = g17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPxFloat", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return f17;
    }

    public final int r(org.json.JSONObject jSONObject, java.lang.String str, int i17, s74.f3 f3Var) {
        float floatValue;
        float g17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPxOrWrap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        java.lang.String optString = jSONObject.optString(str);
        if (optString == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPxOrWrap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return i17;
        }
        if (kotlin.jvm.internal.o.b(optString, "$calculateAdjustedGridWidth()")) {
            i17 = p();
        } else if (kotlin.jvm.internal.o.b(optString, "$calculateAdjustedGridMargin()")) {
            i17 = f3Var.f().isCombinedGridAD() ? f3Var.m() ? c44.b.a(3) : c44.b.a(4) : c44.b.a(3);
        } else {
            if (r26.i0.n(optString, "rem", true)) {
                java.lang.String substring = optString.substring(0, optString.length() - 3);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                java.lang.Float f17 = r26.g0.f(r26.n0.u0(substring).toString());
                floatValue = f17 != null ? f17.floatValue() : 0.0f;
                f3Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                g17 = (float) java.lang.Math.ceil((f3Var.f404267a * floatValue) / 750.0f);
            } else if (r26.i0.n(optString, "px", true)) {
                java.lang.String substring2 = optString.substring(0, optString.length() - 2);
                kotlin.jvm.internal.o.f(substring2, "substring(...)");
                java.lang.Float f18 = r26.g0.f(r26.n0.u0(substring2).toString());
                floatValue = f18 != null ? f18.floatValue() : 0.0f;
                android.content.Context h17 = f3Var.h();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dp2Pix", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$Companion");
                g17 = i65.a.g(h17) * floatValue;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dp2Pix", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$Companion");
            }
            i17 = (int) g17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPxOrWrap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return i17;
    }

    public final float s(int i17, android.content.Context context) {
        float f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScaleSize", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        if (i17 == 1) {
            f17 = 1.0f;
        } else if (i17 != 2) {
            f17 = i65.a.q(context);
            if (com.tencent.mm.ui.bk.M(f17, i65.a.u(context)) || com.tencent.mm.ui.bk.M(f17, i65.a.v(context))) {
                f17 = i65.a.t(context);
            }
        } else {
            f17 = i65.a.q(context);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScaleSize", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return f17;
    }

    public final boolean t(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExprDisplay", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        boolean z17 = false;
        if (r26.i0.y(str, "$getDisplayFlexOrNone('", false) && r26.i0.n(str, "')", false)) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExprDisplay", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return z17;
    }

    public final int u(org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseBackgroundColor", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        int v17 = v(jSONObject, "background-color", i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseBackgroundColor", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return v17;
    }

    public final int v(org.json.JSONObject jSONObject, java.lang.String key, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        kotlin.jvm.internal.o.g(key, "key");
        int w17 = w((com.tencent.mm.ui.bk.C() && jSONObject.has(key.concat("-dark"))) ? jSONObject.optString(key.concat("-dark")) : jSONObject.optString(key), i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseColor", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return w17;
    }

    public final int w(java.lang.String str, int i17) {
        int i18;
        java.lang.String obj;
        int parseInt;
        int parseInt2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseColorStr", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        if (str != null) {
            try {
                obj = r26.n0.u0(str).toString();
            } catch (java.lang.Throwable th6) {
                ca4.q.c("ad_dynamic_error", th6);
                com.tencent.mars.xlog.Log.w("DynamicView.Factory", "parse color from string failed, return default value!");
            }
            if (obj != null) {
                if (r26.i0.y(obj, "#", false)) {
                    i18 = android.graphics.Color.parseColor(str);
                } else {
                    if (r26.i0.y(obj, "rgba", true)) {
                        java.lang.CharSequence u07 = r26.n0.u0(obj.subSequence(4, obj.length()));
                        if (u07.length() > 2) {
                            java.util.List f07 = r26.n0.f0(u07.subSequence(1, u07.length() - 1), new java.lang.String[]{","}, false, 0, 6, null);
                            if (f07.size() == 4) {
                                parseInt = (((int) (java.lang.Float.parseFloat(r26.n0.u0((java.lang.String) f07.get(3)).toString()) * 255)) << 24) | (java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f07.get(0)).toString()) << 16) | (java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f07.get(1)).toString()) << 8);
                                parseInt2 = java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f07.get(2)).toString());
                            }
                        }
                        i18 = i17;
                    } else {
                        if (r26.i0.y(obj, "rgb", true)) {
                            java.lang.CharSequence u08 = r26.n0.u0(obj.subSequence(3, obj.length()));
                            if (u08.length() > 2) {
                                java.util.List f08 = r26.n0.f0(u08.subSequence(1, u08.length() - 1), new java.lang.String[]{","}, false, 0, 6, null);
                                if (f08.size() == 3) {
                                    parseInt = (java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f08.get(0)).toString()) << 16) | (-16777216) | (java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f08.get(1)).toString()) << 8);
                                    parseInt2 = java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f08.get(2)).toString());
                                }
                            }
                        }
                        i18 = i17;
                    }
                    i18 = parseInt2 | parseInt;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseColorStr", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
                return i18;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseColorStr", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return i17;
    }

    public final java.lang.String x(org.json.JSONObject jSONObject, java.lang.String jsonKey, i64.q adDataModel) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseStringValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        kotlin.jvm.internal.o.g(jsonKey, "jsonKey");
        kotlin.jvm.internal.o.g(adDataModel, "adDataModel");
        java.lang.String optString = jSONObject.optString(jsonKey);
        s74.q4 q4Var = s74.q4.f404513a;
        kotlin.jvm.internal.o.d(optString);
        java.lang.String w17 = q4Var.w(adDataModel, optString);
        if (w17 != null) {
            optString = w17;
        }
        if (!kotlin.jvm.internal.o.b(optString, "$getCardBottomLogoText()")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseStringValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return optString;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardBottomLogoWording", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        java.lang.String str = null;
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardBottomLogoWording", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = adDataModel.f289291e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
            int i17 = adDataModel.f289292f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
            int r17 = ca4.m0.r(snsInfo, i17, 0);
            com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = adDataModel.f289287a;
            if (aDInfo != null && aDInfo.isWeapp()) {
                str = context.getString(com.tencent.mm.R.string.j6j);
            } else if (r17 == 1) {
                str = context.getString(com.tencent.mm.R.string.j6j);
            } else if (r17 == 2) {
                str = context.getString(com.tencent.mm.R.string.m6o);
            } else if (r17 == 3) {
                str = context.getString(com.tencent.mm.R.string.clc);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardBottomLogoWording", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseStringValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return str;
    }

    public final int y(org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseTextColor", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        int v17 = v(jSONObject, "color", i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseTextColor", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return v17;
    }

    public final void z(s74.f3 f3Var, android.view.View view, float f17, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOutlineWithRadius", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        f3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResetOutlineViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        java.util.List list = f3Var.f404286t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResetOutlineViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        ((java.util.ArrayList) list).add(new s74.h3(view, f17, jSONObject));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOutlineWithRadius", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
    }
}
