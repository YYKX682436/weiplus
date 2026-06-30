package n44;

/* loaded from: classes15.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f335072a;

    /* renamed from: b, reason: collision with root package name */
    public final i64.z f335073b;

    /* renamed from: c, reason: collision with root package name */
    public final y54.b f335074c;

    /* renamed from: f, reason: collision with root package name */
    public int f335077f;

    /* renamed from: h, reason: collision with root package name */
    public n44.u f335079h;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f335075d = jz5.h.b(new n44.y(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f335076e = jz5.h.b(new n44.x(this));

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f335078g = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f335080i = new java.util.LinkedList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedList f335081j = new java.util.LinkedList();

    public z(android.widget.FrameLayout frameLayout, i64.z zVar, y54.b bVar) {
        this.f335072a = frameLayout;
        this.f335073b = zVar;
        this.f335074c = bVar;
    }

    public final void a(int i17, int i18, java.util.LinkedList linkedList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateSizeData", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
        i64.z zVar = this.f335073b;
        java.util.LinkedList f17 = zVar != null ? zVar.f() : null;
        if (f17 == null || f17.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateSizeData", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
            return;
        }
        int size = f17.size();
        for (int i19 = 0; i19 < size; i19++) {
            java.lang.Object obj = f17.get(i19);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            y54.c cVar = new y54.c(0, 0, 0, 0, 15, null);
            n44.a0 a0Var = n44.m0.f334982s;
            r45.lj4 lj4Var = ((r45.jj4) obj).f377865p;
            a0Var.a(lj4Var.f379520d, lj4Var.f379521e, i17, i18, true, cVar);
            linkedList.add(cVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateSizeData", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
    }

    public final void b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doExposureCount", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
        java.util.HashMap hashMap = this.f335078g;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i17));
        if ((num == null) || (num != null && num.intValue() == 0)) {
            hashMap.put(java.lang.Integer.valueOf(i17), 1);
        } else {
            hashMap.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(num.intValue() + 1));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doExposureCount", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
    }

    public final android.view.ViewGroup c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentViewGroup", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
        n44.u uVar = this.f335079h;
        android.view.View e17 = uVar != null ? uVar.e(this.f335077f) : null;
        android.view.ViewGroup viewGroup = e17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) e17 : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentViewGroup", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
        return viewGroup;
    }

    public final com.tencent.mm.ui.base.MMPageControlView d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageControlView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
        com.tencent.mm.ui.base.MMPageControlView mMPageControlView = (com.tencent.mm.ui.base.MMPageControlView) ((jz5.n) this.f335076e).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageControlView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
        return mMPageControlView;
    }

    public final com.tencent.mm.ui.base.MMViewPager e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewPager", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
        com.tencent.mm.ui.base.MMViewPager mMViewPager = (com.tencent.mm.ui.base.MMViewPager) ((jz5.n) this.f335075d).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewPager", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
        return mMViewPager;
    }
}
