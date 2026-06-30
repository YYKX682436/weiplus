package za4;

/* loaded from: classes4.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f471150a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f471151b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f471152c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedHashMap f471153d;

    public m1(java.util.List list, android.content.Context context, int i17, android.view.ViewGroup viewGroup) {
        this.f471150a = list;
        this.f471151b = context;
        this.f471152c = viewGroup;
    }

    public java.util.Collection a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
        java.util.LinkedHashMap linkedHashMap = this.f471153d;
        java.util.Collection values = linkedHashMap == null ? java.util.Collections.EMPTY_LIST : linkedHashMap.values();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
        return values;
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
        java.util.List list = this.f471150a;
        if (list == null || list.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
            return;
        }
        if (this.f471153d == null) {
            this.f471153d = new java.util.LinkedHashMap();
        }
        for (int i17 = 0; i17 < this.f471150a.size(); i17++) {
            ab4.d0 d0Var = (ab4.d0) this.f471150a.get(i17);
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2) this.f471153d.get(d0Var.f2817d);
            android.view.ViewGroup viewGroup = this.f471152c;
            if (a2Var != null) {
                a2Var.H(d0Var);
            } else {
                a2Var = com.tencent.mm.plugin.sns.ui.ta.a(this.f471151b, d0Var, viewGroup, 0);
                this.f471153d.put(d0Var.f2817d, a2Var);
            }
            try {
                if (viewGroup != a2Var.x().getParent()) {
                    if (viewGroup.getChildCount() > i17) {
                        viewGroup.addView(a2Var.x(), i17);
                        a2Var.g();
                    } else {
                        viewGroup.addView(a2Var.x());
                        a2Var.g();
                    }
                }
            } catch (java.lang.Exception e17) {
                java.lang.String str = d0Var.f2817d;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("CompRenderer", "component may have same id %s,%s", str, com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
    }

    public void c(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notify", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
        if (list != null && !list.equals(this.f471150a)) {
            this.f471150a = list;
            b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notify", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
    }

    public void d(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
        try {
            this.f471153d.remove(a2Var.z());
            this.f471152c.removeView(a2Var.q());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("CompRenderer", "removeView, exp" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.CompRenderer");
    }
}
