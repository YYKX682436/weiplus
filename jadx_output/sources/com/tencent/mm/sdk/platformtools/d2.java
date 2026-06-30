package com.tencent.mm.sdk.platformtools;

/* loaded from: classes5.dex */
public abstract class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static int f192517a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static int f192518b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f192519c = false;

    /* renamed from: d, reason: collision with root package name */
    public static int f192520d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static int f192521e = -1;

    public static final int a(android.content.Context context) {
        if (f192519c) {
            return d(context, 0);
        }
        if (!((context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context) != null)) {
            return com.tencent.mm.sdk.platformtools.x2.d().getInt("com.tencent.mm.compatible.util.keybord.height", uc1.w1.CTRL_INDEX);
        }
        int i17 = com.tencent.mm.sdk.platformtools.x2.d().getInt("com.tencent.mm.compatible.util.keybord.height", i65.a.b(context, 230));
        f192517a = i17;
        return i17;
    }

    public static final int b(android.content.Context context, boolean z17) {
        if (f192519c) {
            return d(context, 0);
        }
        int i17 = f192517a;
        return (i17 <= 0 || !z17) ? a(context) : i17;
    }

    public static final int c(android.content.Context context) {
        if (f192519c) {
            return d(context, 0);
        }
        int i17 = f192520d;
        if (i17 > 0) {
            return i17;
        }
        if (!((context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context) != null)) {
            return com.tencent.mm.plugin.appbrand.jsapi.wccoin.u.CTRL_INDEX;
        }
        int b17 = i65.a.b(context, 380);
        f192520d = b17;
        return b17;
    }

    public static final int d(android.content.Context context, int i17) {
        if (i17 > 0) {
            int i18 = i17 + 230;
            if (!((context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context) != null)) {
                return i18 * 3;
            }
            int b17 = i65.a.b(context, i18);
            f192521e = b17;
            return b17;
        }
        int i19 = f192521e;
        if (i19 > 0) {
            return i19;
        }
        if (!((context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context) != null)) {
            return uc1.w1.CTRL_INDEX;
        }
        int b18 = i65.a.b(context, 230);
        f192521e = b18;
        return b18;
    }

    public static int e(android.content.Context context) {
        int[] f17 = f(context);
        return f17[0] < f17[1] ? 1 : 2;
    }

    public static int[] f(android.content.Context context) {
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        int[] iArr = new int[2];
        if (context instanceof android.app.Activity) {
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            ((android.app.Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            iArr[0] = displayMetrics.widthPixels;
            iArr[1] = displayMetrics.heightPixels;
        } else {
            android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
            iArr[0] = defaultDisplay.getWidth();
            iArr[1] = defaultDisplay.getHeight();
        }
        return iArr;
    }

    public static final int g(android.content.Context context) {
        return h(context, -1, 0);
    }

    public static final int h(android.content.Context context, int i17, int i18) {
        int d17 = d(context, i18);
        com.tencent.mars.xlog.Log.e("MicroMsg.KeyBordUtil", "getValidPanelHeight(): minPanelHeight= %d, isOpenIm=%b", java.lang.Integer.valueOf(d17), java.lang.Integer.valueOf(i18));
        boolean isInMultiWindowMode = (fp.h.c(24) && (context instanceof android.app.Activity)) ? ((android.app.Activity) context).isInMultiWindowMode() : false;
        if (!j(context) || isInMultiWindowMode) {
            int i19 = (int) (d17 / 1.5d);
            int i27 = f(context)[0] / 2;
            return i19 > i27 ? i27 : i19;
        }
        if (i17 <= 0) {
            i17 = b(context, true);
        }
        int c17 = c(context);
        return i17 > c17 ? c17 : i17 < d17 ? d17 : i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r6 > r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int i(android.content.Context r5, int r6, boolean r7) {
        /*
            r0 = 0
            int r1 = d(r5, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "MicroMsg.KeyBordUtil"
            java.lang.String r4 = "getValidPanelHeight(): minPanelHeight= %d, isOpenIm=%b"
            com.tencent.mars.xlog.Log.e(r3, r4, r2)
            boolean r2 = j(r5)
            if (r2 == 0) goto L32
            if (r7 == 0) goto L21
            goto L32
        L21:
            if (r6 > 0) goto L28
            r6 = 1
            int r6 = b(r5, r6)
        L28:
            int r5 = c(r5)
            if (r6 <= r5) goto L2f
            goto L41
        L2f:
            if (r6 >= r1) goto L43
            goto L44
        L32:
            double r6 = (double) r1
            r1 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r6 = r6 / r1
            int r6 = (int) r6
            int[] r5 = f(r5)
            r5 = r5[r0]
            int r5 = r5 / 2
            if (r6 <= r5) goto L43
        L41:
            r1 = r5
            goto L44
        L43:
            r1 = r6
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sdk.platformtools.d2.i(android.content.Context, int, boolean):int");
    }

    public static boolean j(android.content.Context context) {
        return e(context) == 1;
    }

    public static final boolean k(android.content.Context context, int i17) {
        if (f192517a == i17) {
            return true;
        }
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        if (!(context != null) || i17 < 0) {
            return false;
        }
        f192517a = i17;
        return com.tencent.mm.sdk.platformtools.x2.d().edit().putInt("com.tencent.mm.compatible.util.keybord.height", i17).commit();
    }
}
