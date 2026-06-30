package t34;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final t34.f f415431a = new t34.f(null);

    public t34.g a(s34.x xVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("animationInfo", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        this.f415431a.f415426e = xVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("animationInfo", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        return this;
    }

    public t34.g b(w64.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cardAnimPrepareListener", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        this.f415431a.f415427f = lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cardAnimPrepareListener", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        return this;
    }

    public t34.g c(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickActionInfo", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        this.f415431a.f415425d = adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickActionInfo", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        return this;
    }

    public t34.g d(i64.b1 b1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("snsAdStatistic", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        this.f415431a.f415424c = b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsAdStatistic", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        return this;
    }

    public t34.g e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("snsInfo", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        this.f415431a.f415423b = snsInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsInfo", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        return this;
    }

    public t34.g f(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(ya.b.SOURCE, "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        this.f415431a.f415422a = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(ya.b.SOURCE, "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        return this;
    }

    public void g(android.app.Activity activity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        t34.f fVar = this.f415431a;
        fVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$AnimEnv");
        boolean z17 = (fVar.f415423b == null || fVar.f415424c == null || fVar.f415425d == null) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$AnimEnv");
        if (!z17 || activity == null) {
            com.tencent.mars.xlog.Log.e("SnsAdAnimProxyUI", "startAnimProxyUI, param error");
            t34.f fVar2 = com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI.f162628m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
            com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI.f162628m = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
            com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI.T6(35);
        } else {
            if ((activity.getWindow().getDecorView().getSystemUiVisibility() & 8192) != 0) {
                fVar.f415428g = false;
            } else {
                fVar.f415428g = true;
            }
            com.tencent.mars.xlog.Log.i("SnsAdAnimProxyUI", "startAnim, source=" + fVar.f415422a + ", isDarkStatusBar=" + fVar.f415428g);
            t34.f fVar3 = com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI.f162628m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
            com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI.f162628m = fVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI.class);
            intent.putExtra("params_anim_env_hashcode", fVar.hashCode());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/animproxy/SnsAdAnimProxyUI$Builder", "startAnim", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/sns/ad/animproxy/SnsAdAnimProxyUI$Builder", "startAnim", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
            com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI.T6(1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
    }
}
