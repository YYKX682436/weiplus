package com.tencent.tmsqmsp.oaid2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.tmsqmsp.oaid2.d f215561a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.tmsqmsp.oaid2.d f215562b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.tmsqmsp.oaid2.d f215563c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.tmsqmsp.oaid2.d f215564d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.tmsqmsp.oaid2.d f215565e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.tmsqmsp.oaid2.d f215566f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.tmsqmsp.oaid2.d f215567g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.tmsqmsp.oaid2.d f215568h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.tmsqmsp.oaid2.d f215569i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.tmsqmsp.oaid2.d f215570j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.tencent.tmsqmsp.oaid2.d f215571k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.tencent.tmsqmsp.oaid2.d f215572l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f215573m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f215574n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f215575o;

    /* renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ com.tencent.tmsqmsp.oaid2.d[] f215576p;

    static {
        com.tencent.tmsqmsp.oaid2.b1 b1Var = new com.tencent.tmsqmsp.oaid2.b1("UNSUPPORTED");
        f215561a = b1Var;
        final java.lang.String str = "XM_TYPE";
        com.tencent.tmsqmsp.oaid2.d dVar = new com.tencent.tmsqmsp.oaid2.d(str) { // from class: com.tencent.tmsqmsp.oaid2.c1
            {
                int i17 = 0;
                com.tencent.tmsqmsp.oaid2.b1 b1Var2 = null;
                int i18 = 1;
            }

            @Override // com.tencent.tmsqmsp.oaid2.d
            public final boolean a() {
                java.lang.String str2 = com.tencent.tmsqmsp.oaid2.d.f215574n;
                return (str2.equalsIgnoreCase("XIAOMI") || com.tencent.tmsqmsp.oaid2.d.f215573m.equalsIgnoreCase("XIAOMI")) || (str2.equalsIgnoreCase("REDMI") || com.tencent.tmsqmsp.oaid2.d.f215573m.equalsIgnoreCase("REDMI")) || (str2.equalsIgnoreCase("BLACKSHARK") || com.tencent.tmsqmsp.oaid2.d.f215573m.equalsIgnoreCase("BLACKSHARK")) || str2.equalsIgnoreCase("MEITU") || (android.text.TextUtils.isEmpty(com.tencent.tmsqmsp.oaid2.e.a("ro.miui.ui.version.name")) ^ true);
            }
        };
        f215562b = dVar;
        final java.lang.String str2 = "VV_TYPE";
        com.tencent.tmsqmsp.oaid2.d dVar2 = new com.tencent.tmsqmsp.oaid2.d(str2) { // from class: com.tencent.tmsqmsp.oaid2.d1
            {
                int i17 = 1;
                com.tencent.tmsqmsp.oaid2.b1 b1Var2 = null;
                int i18 = 2;
            }

            @Override // com.tencent.tmsqmsp.oaid2.d
            public final boolean a() {
                return com.tencent.tmsqmsp.oaid2.d.f215574n.equalsIgnoreCase("VIVO") || com.tencent.tmsqmsp.oaid2.d.f215573m.equalsIgnoreCase("VIVO") || !android.text.TextUtils.isEmpty(com.tencent.tmsqmsp.oaid2.e.a("ro.vivo.os.version"));
            }
        };
        f215563c = dVar2;
        final java.lang.String str3 = "HW_TYPE";
        com.tencent.tmsqmsp.oaid2.d dVar3 = new com.tencent.tmsqmsp.oaid2.d(str3) { // from class: com.tencent.tmsqmsp.oaid2.e1
            {
                int i17 = 2;
                com.tencent.tmsqmsp.oaid2.b1 b1Var2 = null;
                int i18 = 3;
            }

            @Override // com.tencent.tmsqmsp.oaid2.d
            public final boolean a() {
                java.lang.String str4 = com.tencent.tmsqmsp.oaid2.d.f215574n;
                boolean z17 = str4.equalsIgnoreCase("HUAWEI") || com.tencent.tmsqmsp.oaid2.d.f215573m.equalsIgnoreCase("HUAWEI");
                boolean z18 = str4.equalsIgnoreCase("HONOR") || com.tencent.tmsqmsp.oaid2.d.f215573m.equalsIgnoreCase("HONOR");
                boolean z19 = com.tencent.tmsqmsp.oaid2.d.f215575o < 31;
                boolean z27 = !android.text.TextUtils.isEmpty(com.tencent.tmsqmsp.oaid2.e.a("ro.build.version.emui"));
                if (z17 || (z18 && z19)) {
                    return true;
                }
                return z27 && !z18;
            }
        };
        f215564d = dVar3;
        final java.lang.String str4 = "OP_TYPE";
        com.tencent.tmsqmsp.oaid2.d dVar4 = new com.tencent.tmsqmsp.oaid2.d(str4) { // from class: com.tencent.tmsqmsp.oaid2.f1
            {
                int i17 = 3;
                com.tencent.tmsqmsp.oaid2.b1 b1Var2 = null;
                int i18 = 4;
            }

            @Override // com.tencent.tmsqmsp.oaid2.d
            public final boolean a() {
                java.lang.String str5 = com.tencent.tmsqmsp.oaid2.d.f215574n;
                return (str5.equalsIgnoreCase("OPPO") || com.tencent.tmsqmsp.oaid2.d.f215573m.equalsIgnoreCase("OPPO") || !android.text.TextUtils.isEmpty(com.tencent.tmsqmsp.oaid2.e.a("ro.build.version.opporom"))) || (str5.equalsIgnoreCase("REALME") || com.tencent.tmsqmsp.oaid2.d.f215573m.equalsIgnoreCase("REALME")) || (str5.equalsIgnoreCase("ONEPLUS") || com.tencent.tmsqmsp.oaid2.d.f215573m.equalsIgnoreCase("ONEPLUS"));
            }
        };
        f215565e = dVar4;
        final java.lang.String str5 = "LX_TYPE";
        com.tencent.tmsqmsp.oaid2.d dVar5 = new com.tencent.tmsqmsp.oaid2.d(str5) { // from class: com.tencent.tmsqmsp.oaid2.g1
            {
                int i17 = 4;
                com.tencent.tmsqmsp.oaid2.b1 b1Var2 = null;
                int i18 = 5;
            }

            @Override // com.tencent.tmsqmsp.oaid2.d
            public final boolean a() {
                boolean z17;
                java.lang.String str6 = com.tencent.tmsqmsp.oaid2.d.f215574n;
                if (!str6.equalsIgnoreCase("LENOVO")) {
                    java.lang.String str7 = com.tencent.tmsqmsp.oaid2.d.f215573m;
                    if (!str7.equalsIgnoreCase("LENOVO") && !str7.equalsIgnoreCase("ZUK")) {
                        z17 = false;
                        return !z17 || (!str6.equalsIgnoreCase("MOTOROLA") || com.tencent.tmsqmsp.oaid2.d.f215573m.equalsIgnoreCase("MOTOROLA"));
                    }
                }
                z17 = true;
                if (z17) {
                }
            }
        };
        f215566f = dVar5;
        final java.lang.String str6 = "HS_TYPE";
        com.tencent.tmsqmsp.oaid2.d dVar6 = new com.tencent.tmsqmsp.oaid2.d(str6) { // from class: com.tencent.tmsqmsp.oaid2.h1
            {
                int i17 = 5;
                com.tencent.tmsqmsp.oaid2.b1 b1Var2 = null;
                int i18 = 6;
            }

            @Override // com.tencent.tmsqmsp.oaid2.d
            public final boolean a() {
                return com.tencent.tmsqmsp.oaid2.d.f215574n.equalsIgnoreCase("ASUS") || com.tencent.tmsqmsp.oaid2.d.f215573m.equalsIgnoreCase("ASUS");
            }
        };
        f215567g = dVar6;
        final java.lang.String str7 = "SX_TYPE";
        com.tencent.tmsqmsp.oaid2.d dVar7 = new com.tencent.tmsqmsp.oaid2.d(str7) { // from class: com.tencent.tmsqmsp.oaid2.i1
            {
                int i17 = 6;
                com.tencent.tmsqmsp.oaid2.b1 b1Var2 = null;
                int i18 = 7;
            }

            @Override // com.tencent.tmsqmsp.oaid2.d
            public final boolean a() {
                return com.tencent.tmsqmsp.oaid2.d.f215574n.equalsIgnoreCase("SAMSUNG") || com.tencent.tmsqmsp.oaid2.d.f215573m.equalsIgnoreCase("SAMSUNG");
            }
        };
        f215568h = dVar7;
        final java.lang.String str8 = "MZ_TYPE";
        com.tencent.tmsqmsp.oaid2.d dVar8 = new com.tencent.tmsqmsp.oaid2.d(str8) { // from class: com.tencent.tmsqmsp.oaid2.j1
            {
                int i17 = 7;
                com.tencent.tmsqmsp.oaid2.b1 b1Var2 = null;
                int i18 = 8;
            }

            @Override // com.tencent.tmsqmsp.oaid2.d
            public final boolean a() {
                java.lang.String str9 = com.tencent.tmsqmsp.oaid2.d.f215574n;
                return (str9.equalsIgnoreCase("MEIZU") || com.tencent.tmsqmsp.oaid2.d.f215573m.equalsIgnoreCase("MEIZU") || android.os.Build.DISPLAY.toUpperCase().contains("FLYME")) || (str9.equalsIgnoreCase("ALPS") || com.tencent.tmsqmsp.oaid2.d.f215573m.equalsIgnoreCase("ALPS"));
            }
        };
        f215569i = dVar8;
        final java.lang.String str9 = "NB_TYPE";
        com.tencent.tmsqmsp.oaid2.d dVar9 = new com.tencent.tmsqmsp.oaid2.d(str9) { // from class: com.tencent.tmsqmsp.oaid2.y0
            {
                int i17 = 8;
                com.tencent.tmsqmsp.oaid2.b1 b1Var2 = null;
                int i18 = 9;
            }

            @Override // com.tencent.tmsqmsp.oaid2.d
            public final boolean a() {
                return com.tencent.tmsqmsp.oaid2.d.f215574n.equalsIgnoreCase("NUBIA") || com.tencent.tmsqmsp.oaid2.d.f215573m.equalsIgnoreCase("NUBIA");
            }
        };
        f215570j = dVar9;
        final java.lang.String str10 = "MSA_TYPE";
        com.tencent.tmsqmsp.oaid2.d dVar10 = new com.tencent.tmsqmsp.oaid2.d(str10) { // from class: com.tencent.tmsqmsp.oaid2.z0
            {
                int i17 = 9;
                com.tencent.tmsqmsp.oaid2.b1 b1Var2 = null;
                int i18 = 10;
            }

            @Override // com.tencent.tmsqmsp.oaid2.d
            public final boolean a() {
                java.lang.String str11 = com.tencent.tmsqmsp.oaid2.d.f215574n;
                return (str11.equalsIgnoreCase("ZTE") || com.tencent.tmsqmsp.oaid2.d.f215573m.equalsIgnoreCase("ZTE")) || (!android.text.TextUtils.isEmpty(com.tencent.tmsqmsp.oaid2.e.a("ro.build.freeme.label")) || str11.equalsIgnoreCase("freemeos")) || str11.equalsIgnoreCase("SSUI");
            }
        };
        f215571k = dVar10;
        final java.lang.String str11 = "HONOR_TYPE";
        com.tencent.tmsqmsp.oaid2.d dVar11 = new com.tencent.tmsqmsp.oaid2.d(str11) { // from class: com.tencent.tmsqmsp.oaid2.a1
            {
                int i17 = 10;
                com.tencent.tmsqmsp.oaid2.b1 b1Var2 = null;
                int i18 = 11;
            }

            @Override // com.tencent.tmsqmsp.oaid2.d
            public final boolean a() {
                if (com.tencent.tmsqmsp.oaid2.d.f215575o >= 31) {
                    return com.tencent.tmsqmsp.oaid2.d.f215574n.equalsIgnoreCase("HONOR") || com.tencent.tmsqmsp.oaid2.d.f215573m.equalsIgnoreCase("HONOR");
                }
                return false;
            }
        };
        f215572l = dVar11;
        f215576p = new com.tencent.tmsqmsp.oaid2.d[]{b1Var, dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11};
        f215573m = android.os.Build.BRAND;
        f215574n = android.os.Build.MANUFACTURER;
        f215575o = android.os.Build.VERSION.SDK_INT;
    }

    public /* synthetic */ d(java.lang.String str, int i17, int i18, com.tencent.tmsqmsp.oaid2.b1 b1Var) {
        this(str, i17, i18);
    }

    public static boolean a(android.content.Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.coolpad.deviceidsupport", 0);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static com.tencent.tmsqmsp.oaid2.d b() {
        for (com.tencent.tmsqmsp.oaid2.d dVar : c()) {
            if (dVar.a()) {
                return dVar;
            }
        }
        return f215561a;
    }

    public static com.tencent.tmsqmsp.oaid2.d[] c() {
        return (com.tencent.tmsqmsp.oaid2.d[]) f215576p.clone();
    }

    public abstract boolean a();

    private d(java.lang.String str, int i17, int i18) {
    }
}
