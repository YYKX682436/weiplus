package j65;

/* loaded from: classes12.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    public static android.util.DisplayMetrics f297939c = null;

    /* renamed from: d, reason: collision with root package name */
    public static android.util.DisplayMetrics f297940d = null;

    /* renamed from: e, reason: collision with root package name */
    public static android.util.DisplayMetrics f297941e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f297942f = true;

    /* renamed from: g, reason: collision with root package name */
    public static float f297943g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f297944h;

    /* renamed from: i, reason: collision with root package name */
    public static int f297945i;

    /* renamed from: j, reason: collision with root package name */
    public static j65.h f297946j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.Boolean f297947k = java.lang.Boolean.FALSE;

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.Boolean f297948l = java.lang.Boolean.TRUE;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f297949m = false;

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f297950n;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.reflect.Method f297951a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.reflect.Field f297952b = null;

    static {
        f297950n = false;
        java.lang.String str = android.os.Build.BRAND;
        if (str != null) {
            java.lang.String lowerCase = str.toLowerCase();
            if ((lowerCase.contains("huawei") || lowerCase.contains("honor")) && android.os.Build.VERSION.SDK_INT == 24) {
                f297950n = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0332, code lost:
    
        if (r12 > 1.2f) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x033c, code lost:
    
        j65.f.f297943g *= r12;
        r14 = r14 * r12;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMDensityManager", "scale targetDensity:%s , DeviceDpi:%s, WindowDpi:%s, DeviceWidth:%s, DisplayWidth:%s, dpiScale:%s, systemScale:%s", java.lang.Float.valueOf(r14), java.lang.Integer.valueOf(r3), java.lang.Integer.valueOf(r7), java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r13), java.lang.Float.valueOf(r12), java.lang.Float.valueOf(j65.f.f297943g));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x033b, code lost:
    
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0339, code lost:
    
        if (r12 <= 1.5f) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(android.util.DisplayMetrics r27) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j65.f.<init>(android.util.DisplayMetrics):void");
    }

    public static void a(j65.f fVar, java.lang.String str) {
        fVar.getClass();
        jx3.f.INSTANCE.idkeyStat(1055L, 1L, 1L, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMDensityManager", "killSelfAndCallUp, mIcheckDensitylistener:%s", f297946j);
        j65.h hVar = f297946j;
        if (hVar != null) {
            ((p65.m) hVar).a();
        }
    }

    public static boolean c() {
        java.lang.String str = android.os.Build.BRAND;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        if (f297950n) {
            return true;
        }
        if (f297947k.booleanValue() && com.tencent.mm.ui.bk.v()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMDensityManager", "dancy huaweiSpecial all!!");
            return true;
        }
        if (f297948l.booleanValue() && f297944h) {
            return true;
        }
        str.contains("samsung");
        return false;
    }

    public static android.util.DisplayMetrics d() {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        displayMetrics.setTo(f297940d);
        return displayMetrics;
    }

    public static float f() {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    public static int g() {
        return com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getInt("screenResolution_target_field", 400);
    }

    public static boolean h() {
        return f297942f && !c();
    }

    public static void k(int i17) {
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putInt("screenResolution_target_field", i17);
    }

    public android.content.res.Configuration b(android.content.res.Configuration configuration) {
        if (!h()) {
            return configuration;
        }
        android.content.res.Configuration configuration2 = new android.content.res.Configuration(configuration);
        configuration2.densityDpi = e().densityDpi;
        i();
        return configuration2;
    }

    public android.util.DisplayMetrics e() {
        if (!h()) {
            return f297941e;
        }
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        displayMetrics.setTo(f297939c);
        return displayMetrics;
    }

    public final void i() {
        try {
            android.util.DisplayMetrics e17 = e();
            if (this.f297951a == null) {
                java.lang.reflect.Method declaredMethod = android.graphics.Bitmap.class.getDeclaredMethod("setDefaultDensity", java.lang.Integer.TYPE);
                declaredMethod.setAccessible(true);
                this.f297951a = declaredMethod;
            }
            this.f297951a.invoke(null, java.lang.Integer.valueOf(e17.densityDpi));
            if (this.f297952b == null) {
                java.lang.reflect.Field declaredField = android.util.DisplayMetrics.class.getDeclaredField("DENSITY_DEVICE");
                this.f297952b = declaredField;
                if (!f297949m) {
                    try {
                        declaredField.setAccessible(true);
                        java.lang.reflect.Field declaredField2 = java.lang.reflect.Field.class.getDeclaredField("accessFlags");
                        declaredField2.setAccessible(true);
                        declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMDensityManager", e18, "", new java.lang.Object[0]);
                        f297949m = true;
                    }
                }
            }
            this.f297952b.setInt(null, e17.densityDpi);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMDensityManager", e19, "", new java.lang.Object[0]);
        }
    }

    public final java.lang.String j(android.util.DisplayMetrics displayMetrics) {
        return displayMetrics != null ? java.lang.String.format("scaledDensity:%s densityDpi:%s density:%s", java.lang.Float.valueOf(displayMetrics.scaledDensity), java.lang.Integer.valueOf(displayMetrics.densityDpi), java.lang.Float.valueOf(displayMetrics.density)) : "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ea, code lost:
    
        if ((i65.a.n(com.tencent.mm.sdk.platformtools.x2.f193071a) == 0.8f && g() != 440) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013b, code lost:
    
        if (r0 == false) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0292 A[Catch: Exception -> 0x0360, TryCatch #0 {Exception -> 0x0360, blocks: (B:69:0x01f3, B:44:0x028c, B:46:0x0292, B:47:0x02a4, B:61:0x02ca), top: B:68:0x01f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(android.content.res.Configuration r20, android.util.DisplayMetrics r21) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j65.f.l(android.content.res.Configuration, android.util.DisplayMetrics):void");
    }
}
