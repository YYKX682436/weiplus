package d54;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBSclView f226548s;

    /* renamed from: t, reason: collision with root package name */
    public final f54.a0 f226549t;

    /* renamed from: u, reason: collision with root package name */
    public hq0.e0 f226550u;

    /* renamed from: v, reason: collision with root package name */
    public e64.h f226551v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f226552w;

    public a(android.content.Context context, f54.a0 a0Var, android.view.ViewGroup viewGroup) {
        super(context, a0Var, viewGroup);
        this.f226552w = true;
        this.f226549t = a0Var;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean C(org.json.JSONArray jSONArray) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        try {
            f54.a0 a0Var = this.f226549t;
            if (a0Var != null) {
                android.content.Context context = this.f165049d;
                if (context instanceof android.app.Activity) {
                    android.app.Activity activity = (android.app.Activity) context;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    if (!D(jSONObject)) {
                        com.tencent.mars.xlog.Log.w("AdLandingMBComponent", "magic brush component doesn't allow to report 13387");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
                        return false;
                    }
                    java.util.List<org.json.JSONObject> a17 = e64.p.a(activity, a0Var.f2817d);
                    if (a84.b0.b(a17)) {
                        com.tencent.mars.xlog.Log.e("AdLandingMBComponent", "there is no children in magic brush !!");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
                        return false;
                    }
                    for (org.json.JSONObject jSONObject2 : a17) {
                        if (jSONObject2.has("cid")) {
                            if (!jSONObject2.has(dm.n.COL_EXPOSURECOUNT)) {
                                jSONObject2.put(dm.n.COL_EXPOSURECOUNT, r());
                            }
                            if (!jSONObject2.has("stayTime")) {
                                jSONObject2.put("stayTime", w());
                            }
                            jSONArray.put(jSONObject2);
                        } else {
                            com.tencent.mars.xlog.Log.w("AdLandingMBComponent", "there is one data without id, are you sure?");
                        }
                    }
                    jSONArray.put(jSONObject);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1997, 3);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
                    return true;
                }
            }
            com.tencent.mars.xlog.Log.e("AdLandingMBComponent", "the mb info is null in setComponentKVReportData, or activity is null, are you sure?");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1997, 4);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AdLandingMBComponent", "there is a wrong in setComponentKVReportData, exception: " + e17.getMessage());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1997, 4);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        super.K();
        com.tencent.mars.xlog.Log.i("AdLandingMBComponent", "viewWillAppear is called");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        super.M();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    public final void O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindMagicSclView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        f54.a0 a0Var = this.f226549t;
        if (a0Var == null || android.text.TextUtils.isEmpty(a0Var.F) || android.text.TextUtils.isEmpty(a0Var.G)) {
            com.tencent.mars.xlog.Log.e("AdLandingMBComponent", "the magic node info is null, or necessity is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindMagicSclView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return;
        }
        if (this.f226548s != null && this.f226550u != null && this.f226552w && this.f226551v != null) {
            com.tencent.mars.xlog.Log.i("AdLandingMBComponent", "rebind scl view again");
            this.f226552w = false;
            this.f226548s.a(this.f226550u);
            e64.h hVar = this.f226551v;
            java.lang.String data = a0Var.G;
            java.lang.String str = a0Var.F;
            hVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendDataChangeEvent", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            kotlin.jvm.internal.o.g(data, "data");
            hq0.e0 e0Var = hVar.A;
            jz5.f0 f0Var = null;
            if (e0Var != null) {
                if (str == null || r26.n0.N(str)) {
                    e0Var.a(data, null);
                } else {
                    hq0.e0.b(e0Var, data, str, null, 4, null);
                }
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w("SnsAdMB", "the frameSetRoot is null, please create frame-set-root and bound it by one frame-set");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendDataChangeEvent", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindMagicSclView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        f54.a0 a0Var = this.f226549t;
        if (a0Var != null && a0Var.H == 1) {
            a0Var.f2823m = this.f165058p;
            a0Var.f2824n = this.f165059q;
        }
        super.g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        f54.a0 a0Var;
        e64.h hVar;
        hq0.e0 e0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        android.content.Context context = this.f165049d;
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("AdLandingMBComponent", "the context is not activity, is the component right?");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return;
        }
        if (this.f165056n == null || (a0Var = this.f226549t) == null || android.text.TextUtils.isEmpty(a0Var.F)) {
            com.tencent.mars.xlog.Log.e("AdLandingMBComponent", "the magic info is null, or the frame set name is empty!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return;
        }
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBSclView adLandingMBSclView = (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBSclView) this.f165056n.findViewById(com.tencent.mm.R.id.maf);
        this.f226548s = adLandingMBSclView;
        if (adLandingMBSclView == null) {
            com.tencent.mars.xlog.Log.e("AdLandingMBComponent", "the magic view is null, are you sure???");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return;
        }
        if (!e64.q.a()) {
            com.tencent.mars.xlog.Log.w("AdLandingMBComponent", "the mb is not supported, hide the magic scl view");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return;
        }
        android.view.View view = this.f165056n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/mb/AdLandingMBComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/mb/AdLandingMBComponent", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f226548s.setUnbindFrameSetOnDetach(false);
        this.f226548s.addOnAttachStateChangeListener(this);
        this.f226548s.e(a0Var.F);
        android.app.Activity activity = (android.app.Activity) context;
        java.util.Map map = e64.p.f249838a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        if (activity == null) {
            com.tencent.mars.xlog.Log.w("SnsAdMB", "activity is null, are you sure??");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
            hVar = null;
        } else {
            try {
                int hashCode = activity.hashCode();
                java.util.Map map2 = e64.p.f249838a;
                e64.e eVar = (e64.e) ((java.util.LinkedHashMap) map2).get(java.lang.Integer.valueOf(hashCode));
                if (eVar == null) {
                    com.tencent.mars.xlog.Log.i("SnsAdMB", "new magic brush manager data.");
                    e64.e eVar2 = new e64.e(hashCode, null, null, 6, null);
                    map2.put(java.lang.Integer.valueOf(hashCode), eVar2);
                    eVar = eVar2;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
                hVar = eVar.f249822b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
                if (hVar == null) {
                    com.tencent.mars.xlog.Log.i("SnsAdMB", "new magic brush biz created!");
                    hVar = new e64.h(activity);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
                    eVar.f249822b = hVar;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData");
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) e64.p.f249839b).get(java.lang.Integer.valueOf(hashCode));
                    hVar.N1(weakReference != null ? (android.widget.FrameLayout) weakReference.get() : null);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("SnsAdMB", "there is an exception in destroy: " + e17.getMessage());
                hVar = null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareBiz", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        }
        this.f226551v = hVar;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.e("AdLandingMBComponent", "the biz is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOrCreateFrameSetRoot", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        java.lang.ref.Reference reference = hVar.f249828z;
        if (reference.get() == null) {
            com.tencent.mars.xlog.Log.e("SnsAdMB", "the activity is null, Please check it");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOrCreateFrameSetRoot", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            e0Var = null;
        } else {
            hq0.e0 e0Var2 = hVar.A;
            if (e0Var2 == null) {
                android.app.Activity activity2 = (android.app.Activity) reference.get();
                e0Var = activity2 != null ? hq0.i0.K0(hVar, hVar, activity2, "MagicAdLandPage", "frames", "", false, 32, null) : null;
                hVar.A = e0Var;
            } else {
                e0Var = e0Var2;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOrCreateFrameSetRoot", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        }
        this.f226550u = e0Var;
        if (e0Var == null) {
            com.tencent.mars.xlog.Log.e("AdLandingMBComponent", "the frameSetRoot is null, is biz prepared???");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        } else {
            this.f226548s.c(e0Var);
            O();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewAttachedToWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        O();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewAttachedToWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        this.f226552w = view == this.f226548s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.mb.AdLandingMBComponent");
        return com.tencent.mm.R.layout.cpr;
    }
}
