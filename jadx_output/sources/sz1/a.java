package sz1;

/* loaded from: classes13.dex */
public abstract class a {
    public static java.lang.Object a(java.lang.Object obj, int i17) {
        if (obj == null || i17 >= 20) {
            return null;
        }
        int i18 = 0;
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (java.lang.Object obj2 : list) {
                    if (i18 >= 100) {
                        break;
                    }
                    java.lang.Object a17 = a(obj2, i17 + 1);
                    if (a17 != null) {
                        jSONArray.put(a17);
                        i18++;
                    }
                }
                return jSONArray;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Amoeba.DataReportUtils", "[genJSONObject] List object : " + obj + ", throw Exception : " + e17.getMessage());
            }
        } else if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                for (java.lang.Object obj3 : map.keySet()) {
                    if (i18 >= 100) {
                        break;
                    }
                    java.lang.Object obj4 = map.get(obj3);
                    if (obj4 != null && (obj3 instanceof java.lang.String) && (!(obj4 instanceof java.lang.String) || !u46.l.e((java.lang.String) obj4))) {
                        java.lang.String lowerCase = ((java.lang.String) obj3).toLowerCase(java.util.Locale.ROOT);
                        try {
                            java.lang.Object a18 = a(obj4, i17 + 1);
                            if (a18 != null) {
                                jSONObject.put(lowerCase, a18);
                                i18++;
                            }
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.e("Amoeba.DataReportUtils", "[genJSONObject] jm object : " + obj + ", throw Exception : " + e18.getMessage());
                        }
                    }
                }
                return jSONObject;
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("Amoeba.DataReportUtils", "[genJSONObject] Map object : " + obj + ", throw Exception : " + e19.getMessage());
            }
        } else if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            try {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                for (java.lang.Object obj5 : set) {
                    if (i18 >= 100) {
                        break;
                    }
                    java.lang.Object a19 = a(obj5, i17 + 1);
                    if (a19 != null) {
                        jSONArray2.put(a19);
                        i18++;
                    }
                }
                return jSONArray2;
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("Amoeba.DataReportUtils", "[genJSONObject] Set object : " + obj + ", throw Exception : " + e27.getMessage());
            }
        } else {
            if (obj instanceof java.lang.String) {
                java.lang.String str = (java.lang.String) obj;
                try {
                    if (str.contains(",")) {
                        str.contains("|");
                        return str.replace(",", "|");
                    }
                } catch (java.lang.Exception e28) {
                    com.tencent.mars.xlog.Log.e("Amoeba.DataReportUtils", "[genJSONObject] String object : " + obj + ", throw Exception : " + e28.getMessage());
                }
                return str;
            }
            if ((obj instanceof java.lang.Number) || (obj instanceof java.lang.Boolean)) {
                return obj;
            }
            com.tencent.mars.xlog.Log.e("Amoeba.DataReportUtils", "[genJSONObject] object type is error : " + obj);
        }
        return null;
    }

    public static android.view.Window b(java.lang.Object obj) {
        android.app.Activity activity;
        android.view.Window window;
        if (obj == null || !(obj instanceof android.app.Activity)) {
            return null;
        }
        android.app.Activity activity2 = (android.app.Activity) obj;
        return (!(activity2 instanceof com.tencent.mm.ui.vas.VASActivity) || (activity = ((com.tencent.mm.ui.vas.VASActivity) activity2)._activity) == null || (window = activity.getWindow()) == null) ? activity2.getWindow() : window;
    }

    public static hz1.a c(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof hz1.a) {
            return (hz1.a) obj;
        }
        if (!n(obj) || !(obj instanceof android.view.View)) {
            if (m(obj)) {
                return new hz1.a(obj);
            }
            return null;
        }
        android.content.Context g17 = g((android.view.View) obj);
        if (g17 != null) {
            return new hz1.a(g17);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    public static int d() {
        if (!gm0.j1.a()) {
            return 0;
        }
        boolean b17 = j65.e.b();
        boolean z17 = b17;
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            z17 = (b17 ? 1 : 0) | 2;
        }
        boolean z18 = z17;
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).G8() == 2) {
            z18 = (z17 ? 1 : 0) | 4;
        }
        boolean z19 = z18;
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).G8() == 0) {
            z19 = (z18 ? 1 : 0) | '\b';
        }
        boolean z27 = z19;
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).G8() == 1) {
            z27 = (z19 ? 1 : 0) | 16;
        }
        boolean z28 = z27;
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).h4() == 2) {
            z28 = (z27 ? 1 : 0) | ' ';
        }
        boolean z29 = z28;
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).h4() == 0) {
            z29 = (z28 ? 1 : 0) | '@';
        }
        boolean z37 = z29;
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).h4() == 1) {
            z37 = (z29 ? 1 : 0) | 128;
        }
        boolean z38 = z37;
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).hd() == 2) {
            z38 = (z37 ? 1 : 0) | 256;
        }
        boolean z39 = z38;
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).hd() == 0) {
            z39 = (z38 ? 1 : 0) | 512;
        }
        boolean z47 = z39;
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).hd() == 1) {
            z47 = (z39 ? 1 : 0) | 1024;
        }
        boolean z48 = z47;
        if (j65.e.e()) {
            z48 = (z47 ? 1 : 0) | 2048;
        }
        boolean z49 = z48;
        if (j65.e.g()) {
            z49 = (z48 ? 1 : 0) | 4096;
        }
        ?? r07 = z49;
        if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi()) {
            r07 = (z49 ? 1 : 0) | 8192;
        }
        if (!((c01.z1.h() & 32768) == 32768)) {
            r07 = (r07 == true ? 1 : 0) | 16384;
        }
        int i17 = r07;
        if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Ri()) {
            i17 = (r07 == true ? 1 : 0) | 32768;
        }
        int i18 = i17;
        if (com.tencent.mm.ui.bk.Q()) {
            i18 = (i17 == true ? 1 : 0) | 65536;
        }
        int i19 = i18;
        if (com.tencent.mm.ui.bk.v0()) {
            i19 = (i18 == true ? 1 : 0) | 131072;
        }
        int i27 = i19;
        if (!c01.z1.x()) {
            i27 = (i19 == true ? 1 : 0) | 262144;
        }
        int i28 = i27;
        return c01.z1.x() ? i28 | 524288 : i28;
    }

    public static int e(android.content.Context context) {
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(context)) {
            return -1;
        }
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
            return 1;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is2G(context)) {
            return 2;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is3G(context)) {
            return 3;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
            return 4;
        }
        return com.tencent.mars.comm.NetStatusUtil.is5G(context) ? 5 : 0;
    }

    public static java.lang.String f(java.lang.StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
        for (java.lang.StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb6.append(stackTraceElement.toString());
            sb6.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
        }
        return sb6.toString();
    }

    public static android.content.Context g(android.view.View view) {
        java.lang.ref.WeakReference weakReference;
        if (view == null) {
            return null;
        }
        android.content.Context context = null;
        for (int i17 = 0; i17 < 100; i17++) {
            android.content.Context context2 = view.getContext();
            if (context2 != null && (context2 instanceof android.app.Activity)) {
                context = context2;
            }
            vy1.c l17 = uy1.a.l(view, false);
            view = (l17 == null || (weakReference = l17.f441447e) == null) ? null : (android.view.View) weakReference.get();
            if (view == null) {
                break;
            }
        }
        return context;
    }

    public static android.view.View h(java.lang.Object obj) {
        android.view.Window window;
        android.view.Window b17;
        java.lang.ref.WeakReference weakReference;
        android.view.Window b18;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof android.view.View)) {
            if (obj instanceof android.app.Activity) {
                android.view.Window b19 = b(obj);
                if (b19 != null) {
                    return b19.getDecorView();
                }
            } else if (obj instanceof androidx.fragment.app.Fragment) {
                android.content.Context context = ((androidx.fragment.app.Fragment) obj).getContext();
                if (context != null && (context instanceof android.app.Activity) && (b17 = b(context)) != null) {
                    return b17.getDecorView();
                }
            } else if ((obj instanceof android.app.Dialog) && (window = ((android.app.Dialog) obj).getWindow()) != null) {
                return window.getDecorView();
            }
            return null;
        }
        android.view.View view = (android.view.View) obj;
        android.view.View view2 = view;
        for (int i17 = 0; i17 < 100; i17++) {
            android.content.Context g17 = g(view2);
            if (g17 != null && (g17 instanceof android.app.Activity) && (b18 = b(g17)) != null) {
                return b18.getDecorView();
            }
            vy1.c l17 = uy1.a.l(view, false);
            java.lang.Object obj2 = (l17 == null || (weakReference = l17.f441447e) == null) ? null : (android.view.View) weakReference.get();
            if (obj2 == null) {
                obj2 = view.getParent();
            }
            if (obj2 == null || !(obj2 instanceof android.view.View)) {
                break;
            }
            view2 = (android.view.View) obj2;
        }
        return view2;
    }

    public static boolean i(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof com.tencent.mm.network.v0;
    }

    public static boolean j() {
        if (z65.c.a()) {
            return true;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return false;
    }

    public static boolean k(java.lang.String str) {
        return u46.l.c(str, "FinderHomeAffinityUI") || u46.l.c(str, "FinderHomeUI") || u46.l.c(str, "FinderMultiTaskUI");
    }

    public static boolean l(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.tencent.mm.ui.vas.VASActivity vASActivity = null;
        if (obj instanceof android.view.View) {
            android.content.Context context = ((android.view.View) obj).getContext();
            if (context != null && (context instanceof com.tencent.mm.ui.vas.VASActivity)) {
                vASActivity = (com.tencent.mm.ui.vas.VASActivity) context;
            }
        } else if (obj instanceof com.tencent.mm.ui.vas.VASActivity) {
            vASActivity = (com.tencent.mm.ui.vas.VASActivity) obj;
        } else if (obj instanceof com.tencent.mm.ui.vas.VASCommonFragment) {
            vASActivity = ((com.tencent.mm.ui.vas.VASCommonFragment) obj).f211121p;
        }
        return vASActivity != null && lk5.s.c(vASActivity.getIntent());
    }

    public static boolean m(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return (obj instanceof android.app.Activity) || (obj instanceof androidx.fragment.app.Fragment) || (obj instanceof hz1.a);
    }

    public static boolean n(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof android.view.View;
    }
}
