package f44;

/* loaded from: classes4.dex */
public abstract class a {
    public static java.lang.String a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return "";
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        if (parse == null || !"1".equals(parse.getQueryParameter("canPrefetch"))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return "";
        }
        java.lang.String uri = parse.buildUpon().appendQueryParameter("prefetch", "1").build().toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        return uri;
    }

    public static java.lang.String b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        try {
            java.lang.String a17 = a(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return a17;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needPrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return "";
        }
    }

    public static void c(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prefetchCheckedUrls", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            zq1.i0 i0Var = new zq1.i0();
            i0Var.f474983a = str;
            i0Var.f474985c = 181;
            arrayList.add(i0Var);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1612L, 44L, arrayList.size());
        zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
        if (m0Var != null) {
            ((yq1.x0) m0Var).h(arrayList);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prefetchCheckedUrls", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
    }

    public static java.lang.String[] d(java.util.Collection collection, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String str5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processNativeLandingH5PrefetchUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        if (a84.b0.b(collection)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processNativeLandingH5PrefetchUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.lang.String str6 = (java.lang.String) it.next();
            if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
                str6 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.b(str6, "traceid=" + str + "&aid=" + str2);
            }
            if (android.text.TextUtils.isEmpty(str3)) {
                com.tencent.mars.xlog.Log.i("SnsAd.H5PrefetchHelper", "processNativeLandingH5PrefetchUrl, use orig_UxInfo:" + str4);
                str5 = str4;
            } else {
                com.tencent.mars.xlog.Log.i("SnsAd.H5PrefetchHelper", "processNativeLandingH5PrefetchUrl, use updated_UxInfo:" + str3);
                str5 = str3;
            }
            java.lang.String b17 = b(ca4.z0.b(str6, str5));
            if (!android.text.TextUtils.isEmpty(b17)) {
                linkedList.add(b17);
            }
        }
        java.lang.String[] strArr = (java.lang.String[]) linkedList.toArray(new java.lang.String[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processNativeLandingH5PrefetchUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        return strArr;
    }

    public static java.lang.String e(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("usePrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        java.lang.String b17 = b(str);
        if (android.text.TextUtils.isEmpty(b17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("usePrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
            return str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("usePrefetch", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchHelper");
        return b17;
    }
}
