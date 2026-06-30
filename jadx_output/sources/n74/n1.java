package n74;

/* loaded from: classes4.dex */
public class n1 implements com.tencent.mm.plugin.sns.ad.widget.living.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout f335400a;

    /* renamed from: b, reason: collision with root package name */
    public s34.u0 f335401b;

    public n1(com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout) {
        this.f335400a = livingDescBarLayout;
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        s34.u0 u0Var = this.f335401b;
        if (u0Var == null) {
            com.tencent.mars.xlog.Log.e("SnsAdRollHelper", "checkLoadImage, adRollInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout = this.f335400a;
        if (livingDescBarLayout == null) {
            com.tencent.mars.xlog.Log.e("SnsAdRollHelper", "checkLoadImage, rollingBar is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return;
        }
        java.lang.String str = u0Var.iconUrl;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDefaultIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
            android.widget.ImageView imageView = livingDescBarLayout.f163663d;
            if (imageView != null) {
                imageView.setImageResource(com.tencent.mm.R.raw.ad_living_description_icon);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDefaultIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
            com.tencent.mars.xlog.Log.i("SnsAdRollHelper", "checkLoadImage, iconUrl is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return;
        }
        if (!str.equals((java.lang.String) livingDescBarLayout.getTag(com.tencent.mm.R.id.n1z))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            } else {
                java.lang.String l17 = za4.t0.l("adId_mm", str);
                if (com.tencent.mm.sdk.platformtools.t8.K0(l17) || !com.tencent.mm.vfs.w6.j(l17)) {
                    livingDescBarLayout.setTag(com.tencent.mm.R.id.n1z, str);
                    livingDescBarLayout.hashCode();
                    a84.m.d(str, new n74.k1(this, new java.lang.ref.WeakReference(livingDescBarLayout), str));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
                } else {
                    c(l17, livingDescBarLayout);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
    }

    @Override // com.tencent.mm.plugin.sns.ad.widget.living.g0
    public java.lang.String b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdRollInfoTextList", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        s34.u0 u0Var = this.f335401b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (u0Var != null) {
            arrayList.addAll(u0Var.f402785a);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdRollInfoTextList", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        if (i17 < 0 || i17 >= arrayList.size()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return "";
        }
        java.lang.String str = (java.lang.String) arrayList.get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        return str;
    }

    public final void c(java.lang.String str, com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("SnsAdRollHelper", "setImageBitmapAsync, path is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        } else if (livingDescBarLayout == null) {
            com.tencent.mars.xlog.Log.e("SnsAdRollHelper", "setImageBitmapAsync, bar is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        } else {
            ((ku5.t0) ku5.t0.f312615d).g(new n74.m1(this, str, livingDescBarLayout));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        }
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRollingBarAdapter", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout = this.f335400a;
        if (livingDescBarLayout == null) {
            com.tencent.mars.xlog.Log.e("SnsAdRollHelper", "setRollingBarAdapter, rollingBar is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRollingBarAdapter", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return;
        }
        if (!livingDescBarLayout.a()) {
            com.tencent.mars.xlog.Log.i("SnsAdRollHelper", "setRollingBarAdapter, rollingBar adapter is not empty");
            livingDescBarLayout.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRollingBarAdapter", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        } else if (getCount() == 0) {
            com.tencent.mars.xlog.Log.i("SnsAdRollHelper", "setRollingBarAdapter, adRollInfoTextList size is 0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRollingBarAdapter", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        } else {
            livingDescBarLayout.setSlideAdapter(this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRollingBarAdapter", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        }
    }

    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRollingBarStatus", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout = this.f335400a;
        if (livingDescBarLayout == null) {
            com.tencent.mars.xlog.Log.e("SnsAdRollHelper", "setRollingBarStatus, rollingBar is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRollingBarStatus", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return;
        }
        if (getCount() == 0) {
            com.tencent.mars.xlog.Log.i("SnsAdRollHelper", "setRollingBarStatus, adRollInfoTextList size is 0");
            livingDescBarLayout.setVisibility(4);
            livingDescBarLayout.c();
        } else {
            livingDescBarLayout.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRollingBarStatus", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
    }

    @Override // com.tencent.mm.plugin.sns.ad.widget.living.g0
    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdRollInfoTextList", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        s34.u0 u0Var = this.f335401b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (u0Var != null) {
            arrayList.addAll(u0Var.f402785a);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdRollInfoTextList", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        if (a84.b0.b(arrayList)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            return 0;
        }
        int size = arrayList.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        return size;
    }
}
