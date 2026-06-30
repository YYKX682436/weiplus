package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public abstract class bl {

    /* renamed from: a, reason: collision with root package name */
    public static int f198004a;

    public static int a(android.content.Context context) {
        android.app.ActionBar actionBar;
        int height;
        int i17 = 0;
        if (!com.tencent.mm.ui.b4.c(context)) {
            if (context == null) {
                com.tencent.mm.ui.yk.f("WeUIToolHelper", "[getActionBarHeight] context is null!", new java.lang.Object[0]);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479622ax);
            if (context instanceof androidx.appcompat.app.AppCompatActivity) {
                androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
                if (appCompatActivity.getSupportActionBar() != null) {
                    i17 = appCompatActivity.getSupportActionBar().l();
                }
            } else if (context instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) context;
                if (activity.getActionBar() != null) {
                    i17 = activity.getActionBar().getHeight();
                }
            }
            if (i17 <= 0) {
                i17 = dimensionPixelSize;
            }
            com.tencent.mm.ui.yk.c("WeUIToolHelper", "[getActionBarHeight] real:%s defaultVal:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(dimensionPixelSize));
            return i17;
        }
        kotlin.jvm.internal.o.g(context, "<this>");
        android.content.res.Resources resources = context.getResources();
        int dimensionPixelSize2 = resources != null ? resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479622ax) : 0;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            androidx.appcompat.app.b supportActionBar = ((androidx.appcompat.app.AppCompatActivity) context).getSupportActionBar();
            if (supportActionBar != null) {
                height = supportActionBar.l();
            }
            height = dimensionPixelSize2;
        } else {
            if ((context instanceof android.app.Activity) && (actionBar = ((android.app.Activity) context).getActionBar()) != null) {
                height = actionBar.getHeight();
            }
            height = dimensionPixelSize2;
        }
        if (height <= 0) {
            height = dimensionPixelSize2;
        }
        com.tencent.mm.ui.yk.c("MicroMsg.WeUIToolHelper", "getActionBarHeight, actionBarHeight: " + height + ", defaultVal: " + dimensionPixelSize2, new java.lang.Object[0]);
        return height;
    }

    public static android.graphics.Point b(android.content.Context context) {
        android.graphics.Rect rect;
        android.graphics.Point point = new android.graphics.Point();
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
        android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            try {
                rect = windowManager.getCurrentWindowMetrics().getBounds();
            } catch (java.lang.RuntimeException e17) {
                com.tencent.mm.ui.yk.d("WeUIToolHelper", e17, "getDisplayRealSize RuntimeException", new java.lang.Object[0]);
                rect = null;
            }
            if (rect != null) {
                point.x = rect.width();
                point.y = rect.height();
            } else {
                defaultDisplay.getRealSize(point);
            }
        } else {
            defaultDisplay.getRealSize(point);
        }
        return point;
    }

    public static int c(android.content.Context context) {
        if (com.tencent.mm.ui.b4.c(context)) {
            return com.tencent.mm.ui.cl.b(context);
        }
        if (!f(context)) {
            return 0;
        }
        int identifier = android.content.res.Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID);
        int dimensionPixelSize = identifier > 0 ? android.content.res.Resources.getSystem().getDimensionPixelSize(identifier) : 0;
        int g17 = g(context);
        return (g17 == 0 || g17 >= dimensionPixelSize) ? dimensionPixelSize : g17;
    }

    public static int d(android.app.Activity activity) {
        try {
            int height = activity.getWindow().getDecorView().getHeight();
            int h17 = h(activity);
            android.util.DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i17 = displayMetrics.heightPixels;
            int i18 = (height - h17) - i17;
            com.tencent.mm.ui.yk.c("WeUIToolHelper", "[getNavigationBarHeightV2] decorViewHeight:%s statusBarHeight:%s displayMetricsHeight:%s finallyHeight:%s", java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i18 >= 0) {
                f198004a = i18;
            }
            return f198004a;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.ui.yk.f("WeUIToolHelper", "getNavigationBarHeightV2 fail: " + e17.getMessage(), new java.lang.Object[0]);
            return f198004a;
        }
    }

    public static int e(android.content.Context context) {
        if (com.tencent.mm.ui.b4.c(context)) {
            return com.tencent.mm.ui.cl.b(context);
        }
        int identifier = android.content.res.Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID);
        int dimensionPixelSize = identifier > 0 ? android.content.res.Resources.getSystem().getDimensionPixelSize(identifier) : 0;
        int g17 = g(context);
        return (g17 == 0 || g17 >= dimensionPixelSize) ? dimensionPixelSize : g17;
    }

    public static boolean f(android.content.Context context) {
        n3.g3 a17;
        if (com.tencent.mm.ui.b4.c(context)) {
            if (context == null || (a17 = com.tencent.mm.ui.cl.a(context)) == null) {
                return false;
            }
            return a17.f(2);
        }
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.getWindow() != null && (activity.getWindow().getAttributes().flags & 512) == 512) {
                return false;
            }
        }
        return g(context) > 0;
    }

    public static int g(android.content.Context context) {
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getSize(point);
        android.graphics.Point b17 = b(context);
        int max = java.lang.Math.max(point.y, point.x);
        if (context.getResources().getConfiguration().orientation == 1) {
            max = point.y;
        }
        int max2 = java.lang.Math.max(b17.y, b17.x);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            max = java.lang.Math.max(rect.bottom, rect.right);
            if (context.getResources().getConfiguration().orientation == 1) {
                max = rect.bottom;
            }
        }
        return max2 - max;
    }

    public static int h(android.content.Context context) {
        return i(context, com.tencent.mm.ui.zk.a(context, 25));
    }

    public static int i(android.content.Context context, int i17) {
        n3.g3 a17;
        e3.d a18;
        int i18 = (!com.tencent.mm.ui.b4.c(context) || context == null || (a17 = com.tencent.mm.ui.cl.a(context)) == null || (a18 = a17.a(1)) == null) ? 0 : a18.f247045b;
        if (i18 >= com.tencent.mm.ui.zk.a(context, 25)) {
            return i18;
        }
        int k17 = k(context, i17);
        if (k17 <= 0) {
            if (k17 > 0) {
                return k17;
            }
            com.tencent.mm.ui.yk.c("WeUIToolHelper", "[getStatusBarHeight] return default!!!", new java.lang.Object[0]);
            return i17;
        }
        if (!(context instanceof android.app.Activity)) {
            return k17;
        }
        android.app.Activity activity = (android.app.Activity) context;
        android.util.DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        android.graphics.Rect rect = new android.graphics.Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        if (displayMetrics == null || rect.height() <= 0) {
            return k17;
        }
        int height = displayMetrics.heightPixels - rect.height();
        com.tencent.mm.ui.yk.c("WeUIToolHelper", "[fixStatusBarHeight] new statusBar:%s ", java.lang.Integer.valueOf(height));
        if (height == 0) {
            height = rect.top;
            com.tencent.mm.ui.yk.c("WeUIToolHelper", "[fixStatusBarHeight] new DisplayFrameTop:%s ", java.lang.Integer.valueOf(height));
        }
        if (height <= k17 || height - k17 >= 100) {
            return k17;
        }
        com.tencent.mm.ui.yk.c("WeUIToolHelper", "[fixStatusBarHeight] return new statusBar:%s ", java.lang.Integer.valueOf(height));
        return height;
    }

    public static int j(android.content.Context context) {
        n3.g3 a17;
        e3.d a18;
        int a19 = com.tencent.mm.ui.zk.a(context, 25);
        return com.tencent.mm.ui.b4.c(context) ? (context == null || (a17 = com.tencent.mm.ui.cl.a(context)) == null || (a18 = a17.a(1)) == null) ? a19 : a18.f247045b : k(context, a19);
    }

    public static int k(android.content.Context context, int i17) {
        java.lang.String obj;
        int intValue;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.android.internal.R$dimen");
            obj = cls.getField("status_bar_height").get(com.tencent.mm.ui.c2.f198069a.a(cls)).toString();
            boolean z17 = com.tencent.mm.ui.dl.f208345a;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.ui.yk.f("WeUIToolHelper", "getStatusBarHeightFromSysR by R$dimen fail: " + e17.getMessage(), new java.lang.Object[0]);
            try {
                i17 = context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID));
            } catch (java.lang.Exception e18) {
                com.tencent.mm.ui.yk.f("WeUIToolHelper", "getStatusBarHeightFromSysR by identifier fail: " + e18.getMessage(), new java.lang.Object[0]);
            }
        }
        if (obj != null) {
            try {
            } catch (java.lang.NumberFormatException e19) {
                com.tencent.mm.ui.yk.d("WeUIUtil", e19, "", new java.lang.Object[0]);
            }
            if (obj.length() > 0) {
                intValue = java.lang.Integer.decode(obj).intValue();
                i17 = context.getResources().getDimensionPixelSize(intValue);
                com.tencent.mm.ui.yk.c("WeUIToolHelper", "[getStatusBarHeightFromSysR] :%s ", java.lang.Integer.valueOf(i17));
                return i17;
            }
        }
        intValue = 0;
        i17 = context.getResources().getDimensionPixelSize(intValue);
        com.tencent.mm.ui.yk.c("WeUIToolHelper", "[getStatusBarHeightFromSysR] :%s ", java.lang.Integer.valueOf(i17));
        return i17;
    }

    public static int l(android.content.Context context) {
        return ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static boolean m(android.content.Context context) {
        n3.g3 a17;
        if (!com.tencent.mm.ui.b4.c(context)) {
            return ((context instanceof android.app.Activity) && (((android.app.Activity) context).getWindow().getAttributes().flags & 1024) == 1024) ? false : true;
        }
        if (context == null || (a17 = com.tencent.mm.ui.cl.a(context)) == null) {
            return false;
        }
        return a17.f(1);
    }
}
