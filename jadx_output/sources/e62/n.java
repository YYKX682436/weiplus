package e62;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final e62.n f249782a = new e62.n();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f249783b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f249784c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static int f249785d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static int f249786e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static int f249787f;

    /* renamed from: g, reason: collision with root package name */
    public static int f249788g;

    /* renamed from: h, reason: collision with root package name */
    public static int f249789h;

    /* renamed from: i, reason: collision with root package name */
    public static int f249790i;

    /* renamed from: j, reason: collision with root package name */
    public static int f249791j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.reflect.Field f249792k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.reflect.Method f249793l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.reflect.Method f249794m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.reflect.Field f249795n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.reflect.Field f249796o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.reflect.Field f249797p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.reflect.Method f249798q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.reflect.Field f249799r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.reflect.Field f249800s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.reflect.Field f249801t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.reflect.Field f249802u;

    static {
        try {
            java.lang.reflect.Field declaredField = zc4.b.class.getDeclaredField("info");
            f249792k = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            int i17 = xc4.p.W1;
            java.lang.reflect.Method declaredMethod = xc4.p.class.getDeclaredMethod("getSnsInfo", new java.lang.Class[0]);
            f249793l = declaredMethod;
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
            }
            java.lang.String str = com.tencent.mm.plugin.sns.storage.SnsInfo.TABLEINDEXUSERNAME;
            java.lang.reflect.Method declaredMethod2 = com.tencent.mm.plugin.sns.storage.SnsInfo.class.getDeclaredMethod("getTimeLine", new java.lang.Class[0]);
            f249794m = declaredMethod2;
            if (declaredMethod2 != null) {
                declaredMethod2.setAccessible(true);
            }
            int i18 = com.tencent.mm.protocal.protobuf.TimeLineObject.f192185d;
            java.lang.reflect.Field declaredField2 = com.tencent.mm.protocal.protobuf.TimeLineObject.class.getDeclaredField("Id");
            f249795n = declaredField2;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            java.lang.reflect.Field declaredField3 = com.tencent.mm.protocal.protobuf.TimeLineObject.class.getDeclaredField("UserName");
            f249796o = declaredField3;
            if (declaredField3 != null) {
                declaredField3.setAccessible(true);
            }
            java.lang.reflect.Field declaredField4 = com.tencent.mm.plugin.sns.storage.SnsInfo.class.getDeclaredField("adsnsinfo");
            f249797p = declaredField4;
            if (declaredField4 != null) {
                declaredField4.setAccessible(true);
            }
            java.lang.String str2 = com.tencent.mm.plugin.sns.storage.AdSnsInfo.TAG;
            java.lang.reflect.Method declaredMethod3 = com.tencent.mm.plugin.sns.storage.AdSnsInfo.class.getDeclaredMethod("getAdXml", new java.lang.Class[0]);
            f249798q = declaredMethod3;
            if (declaredMethod3 != null) {
                declaredMethod3.setAccessible(true);
            }
            java.lang.String str3 = com.tencent.mm.plugin.sns.storage.ADXml.TAG;
            java.lang.reflect.Field declaredField5 = com.tencent.mm.plugin.sns.storage.ADXml.class.getDeclaredField("adCardActionBtnInfo");
            f249799r = declaredField5;
            if (declaredField5 != null) {
                declaredField5.setAccessible(true);
            }
            java.lang.reflect.Field declaredField6 = com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo.class.getDeclaredField("finderUsername");
            f249800s = declaredField6;
            if (declaredField6 != null) {
                declaredField6.setAccessible(true);
            }
            java.lang.reflect.Field declaredField7 = com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo.class.getDeclaredField("finderLiveId");
            f249801t = declaredField7;
            if (declaredField7 != null) {
                declaredField7.setAccessible(true);
            }
            java.lang.reflect.Field declaredField8 = com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo.class.getDeclaredField("finderLiveFeedExportId");
            f249802u = declaredField8;
            if (declaredField8 == null) {
                return;
            }
            declaredField8.setAccessible(true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.SnsFeedMonitor", "SnsFeedMonitor, init-1, crash: " + e17.getMessage());
        }
    }

    public final nm5.b a(android.view.View view) {
        int[] iArr = new int[2];
        for (int i17 = 0; i17 < 2; i17++) {
            iArr[i17] = -1;
        }
        view.getLocationOnScreen(iArr);
        return nm5.j.c(java.lang.Integer.valueOf(java.lang.Math.min(iArr[1], (int) view.getY())), java.lang.Integer.valueOf(view.getHeight()));
    }

    public final void b(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        if (appCompatActivity != null) {
            android.content.res.Resources resources = appCompatActivity.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID));
            f249789h = dimensionPixelSize;
            if (dimensionPixelSize <= 0) {
                f249789h = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480394wp);
            }
        }
        android.view.Display display = null;
        if (appCompatActivity != null) {
            try {
                androidx.appcompat.app.b supportActionBar = appCompatActivity.getSupportActionBar();
                android.view.View j17 = supportActionBar != null ? supportActionBar.j() : null;
                f249790i = j17 != null ? j17.getHeight() : -1;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.SnsFeedMonitor", e17, "initBarHeight", new java.lang.Object[0]);
            }
        }
        if (appCompatActivity != null) {
            try {
                java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
                android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
                if (windowManager != null) {
                    display = windowManager.getDefaultDisplay();
                }
            } catch (java.lang.Exception unused) {
                android.view.WindowManager windowManager2 = appCompatActivity.getWindowManager();
                if (windowManager2 != null) {
                    display = windowManager2.getDefaultDisplay();
                }
            }
            if (display != null) {
                android.graphics.Point point = new android.graphics.Point();
                display.getSize(point);
                android.graphics.Point point2 = new android.graphics.Point();
                display.getRealSize(point2);
                int i17 = point.y;
                f249788g = i17;
                int i18 = point2.y;
                f249787f = i18;
                int i19 = i18 - i17;
                f249791j = i19 > 0 ? i19 : 0;
            }
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.SnsFeedMonitor", "init: mScreenRealHeight=" + f249787f + ", mScreenHeight=" + f249788g + ", mStatusBarHeight=" + f249789h + ", mActionBarHeight=" + f249790i + ", virtualKeyHeight=" + f249791j);
    }
}
