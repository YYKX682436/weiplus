package su4;

/* loaded from: classes.dex */
public abstract class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f412978a = 0;

    static {
        new java.util.HashMap();
        new java.util.concurrent.ConcurrentHashMap();
    }

    public static void a(int i17, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, int i18, java.lang.String str4, boolean z18, java.lang.String str5) {
        if (i17 == 3 || i17 == 20 || i17 == 10000 || i17 == 103) {
            i(300, i17, str, str2, str5, 0, z17, "", true, str3, str4, i18, z18);
        } else {
            i(com.tencent.mm.plugin.appbrand.jsapi.share.r0.CTRL_INDEX, i17, str, str2, str5, 0, z17, "", true, str3, str4, i18, z18);
        }
    }

    public static int b(int i17) {
        if (i17 == 21) {
            return com.tencent.mm.plugin.websearch.l2.a(1);
        }
        if (i17 != 71 && i17 != 94) {
            if (i17 == 104) {
                return com.tencent.mm.plugin.websearch.l2.a(9);
            }
            if (i17 != 128) {
                return i17 != 201 ? com.tencent.mm.plugin.websearch.l2.a(0) : com.tencent.mm.plugin.websearch.l2.f181563b;
            }
        }
        return com.tencent.mm.plugin.websearch.l2.a(10);
    }

    public static java.lang.String c() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(context)) {
            return "fail";
        }
        com.tencent.mars.comm.NetStatusUtil.getNetType(context);
        return com.tencent.mars.comm.NetStatusUtil.is2G(context) ? "2g" : com.tencent.mars.comm.NetStatusUtil.is3G(context) ? "3g" : com.tencent.mars.comm.NetStatusUtil.is4G(context) ? "4g" : com.tencent.mars.comm.NetStatusUtil.isWifi(context) ? "wifi" : "fail";
    }

    public static void d(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, boolean z17, java.lang.String str4, java.lang.String str5, int i19) {
        h(4, i17, str, str2, str3, i18, z17, str4, true, str5, "", i19);
    }

    public static void e(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, boolean z17, java.lang.String str4, boolean z18, java.lang.String str5, int i19) {
        h(7, i17, str, str2, str3, i18, z17, str4, z18, str5, "", i19);
    }

    public static void f(int i17, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, int i18, java.lang.String str4, boolean z18, java.lang.String str5) {
        if (i17 == 3 || i17 == 20 || i17 == 10000 || i17 == 103) {
            i(302, i17, str, str2, str5, 0, z17, "", true, str3, str4, i18, z18);
        }
    }

    public static void g(int i17, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, int i18, java.lang.String str4, boolean z18, java.lang.String str5) {
        if (i17 == 3 || i17 == 20 || i17 == 10000 || i17 == 103) {
            i(301, i17, str, str2, str5, 0, z17, "", true, str3, str4, i18, z18);
        }
    }

    public static void h(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19, boolean z17, java.lang.String str4, boolean z18, java.lang.String str5, java.lang.String str6, int i27) {
        i(i17, i18, str, str2, str3, i19, z17, str4, z18, str5, str6, i27, false);
    }

    public static void i(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19, boolean z17, java.lang.String str4, boolean z18, java.lang.String str5, java.lang.String str6, int i27, boolean z19) {
        int i28 = z18 ? 1 : 2;
        if (i17 == 1 || i17 == 10 || i17 == 12) {
            i28 = 0;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.Object[] objArr2 = new java.lang.Object[16];
        objArr2[0] = java.lang.Integer.valueOf(i17);
        objArr2[1] = java.lang.Integer.valueOf(i18);
        boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr2[2] = str == null ? "" : str;
        objArr2[3] = str2 == null ? "" : str2;
        objArr2[4] = android.text.TextUtils.isEmpty(str3) ? "" : str3;
        objArr2[5] = java.lang.Integer.valueOf(i19);
        objArr2[6] = java.lang.Integer.valueOf(z17 ? 1 : 0);
        objArr2[7] = str4 == null ? "" : str4;
        objArr2[8] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        objArr2[9] = c();
        objArr2[10] = java.lang.Integer.valueOf(i28);
        objArr2[11] = str5 == null ? "" : str5;
        objArr2[12] = android.text.TextUtils.isEmpty(str6) ? "" : str6;
        objArr2[13] = java.lang.Integer.valueOf(i27);
        objArr2[14] = java.lang.Integer.valueOf(b(i18));
        objArr2[15] = java.lang.Integer.valueOf(z19 ? 1 : 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i29 = 0; i29 < 15; i29++) {
            sb6.append(java.lang.String.valueOf(objArr2[i29]).replace(',', ' '));
            sb6.append(',');
        }
        sb6.append(java.lang.String.valueOf(objArr2[15]));
        objArr[0] = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchActionTracer", "reporting 14904 %s ", objArr);
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.Object[] objArr3 = new java.lang.Object[16];
        objArr3[0] = java.lang.Integer.valueOf(i17);
        objArr3[1] = java.lang.Integer.valueOf(i18);
        objArr3[2] = str == null ? "" : str;
        objArr3[3] = str2 == null ? "" : str2;
        objArr3[4] = android.text.TextUtils.isEmpty(str3) ? "" : str3;
        objArr3[5] = java.lang.Integer.valueOf(i19);
        objArr3[6] = java.lang.Integer.valueOf(z17 ? 1 : 0);
        objArr3[7] = str4 == null ? "" : str4;
        objArr3[8] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        objArr3[9] = c();
        objArr3[10] = java.lang.Integer.valueOf(i28);
        objArr3[11] = str5 == null ? "" : str5;
        objArr3[12] = android.text.TextUtils.isEmpty(str6) ? "" : str6;
        objArr3[13] = java.lang.Integer.valueOf(i27);
        objArr3[14] = java.lang.Integer.valueOf(b(i18));
        objArr3[15] = java.lang.Integer.valueOf(z19 ? 1 : 0);
        fVar.d(14904, objArr3);
    }

    public static void j(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19, boolean z17, java.lang.String str4, boolean z18, java.lang.String str5, java.lang.String str6, int i27, boolean z19, long j17) {
        int i28 = z18 ? 1 : 2;
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[16];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[2] = str == null ? "" : str;
        objArr[3] = str2 == null ? "" : str2;
        objArr[4] = android.text.TextUtils.isEmpty(str3) ? "" : str3;
        objArr[5] = java.lang.Integer.valueOf(i19);
        objArr[6] = java.lang.Integer.valueOf(z17 ? 1 : 0);
        objArr[7] = str4 == null ? "" : str4;
        objArr[8] = java.lang.Long.valueOf(j17 > 0 ? j17 : java.lang.System.currentTimeMillis());
        objArr[9] = c();
        objArr[10] = java.lang.Integer.valueOf(i28);
        objArr[11] = str5 == null ? "" : str5;
        objArr[12] = android.text.TextUtils.isEmpty(str6) ? "" : str6;
        objArr[13] = java.lang.Integer.valueOf(i27);
        objArr[14] = java.lang.Integer.valueOf(b(i18));
        objArr[15] = java.lang.Integer.valueOf(z19 ? 1 : 0);
        fVar.d(14904, objArr);
    }

    public static void k(int i17, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, int i18) {
        h(10, i17, str, str2, "", 0, z17, "", true, str3, "", i18);
    }
}
