package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f149583a = {"ilink2", "voipComm", "voipChannel", "voipCodec", "confService"};

    /* renamed from: b, reason: collision with root package name */
    public static boolean f149584b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wxmm.v2conference f149585c = new com.tencent.wxmm.v2conference();

    public static java.lang.String a() {
        boolean z17;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
        try {
            java.lang.reflect.Method declaredMethod = android.net.ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            z17 = ((java.lang.Boolean) declaredMethod.invoke(connectivityManager, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Exception unused) {
            z17 = false;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "mobile network not connectedorconnecting");
            return "";
        }
        java.lang.String simOperator = ((android.telephony.TelephonyManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("phone")).getSimOperator();
        if (simOperator == null || simOperator.length() < 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "nic_op NULL");
            return "";
        }
        return simOperator.substring(0, 3) + ":" + simOperator.substring(3, simOperator.length());
    }

    public static r45.u70 b(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        r45.u70 u70Var = new r45.u70();
        u70Var.f387098d = "wechat";
        u70Var.f387099e = "voip-mt";
        u70Var.f387103i = lp0.b.X() + "/ilink";
        u70Var.f387115w = 1;
        u70Var.f387104m = 0;
        u70Var.f387107p = 1;
        u70Var.f387109q = com.tencent.mars.xlog.Log.getImpl() != null ? com.tencent.mars.xlog.Log.getImpl().getLogLevel(0L) : 0;
        u70Var.f387111s = i17;
        u70Var.f387112t = i18;
        u70Var.f387113u = i19;
        u70Var.H = wo.t.d();
        u70Var.I = com.tencent.mm.sdk.platformtools.t8.P(wo.r.d(), 0);
        u70Var.f387097J = wo.r.a();
        u70Var.L = android.os.Build.MANUFACTURER;
        u70Var.M = wo.w0.m();
        java.lang.String str3 = android.os.Build.VERSION.RELEASE;
        u70Var.N = str3;
        u70Var.P = android.os.Build.VERSION.INCREMENTAL;
        u70Var.Q = android.os.Build.DISPLAY;
        u70Var.T = a();
        u70Var.f387108p0 = true;
        u70Var.f387118z = 1;
        u70Var.C = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().f273148a.a(1));
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ilink_codeclist_param, 2);
        u70Var.D = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "iCodecListParam: " + Ni);
        u70Var.f387114v = 1;
        if (Ni == 1) {
            u70Var.f387114v = 5;
        } else if (Ni == 0) {
            u70Var.f387114v = 21;
        }
        if (zj3.j.g()) {
            u70Var.f387114v = u70Var.f387114v | 65536 | 4194304;
        }
        int Ai = ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Ai(2);
        int i27 = Ai != 3 ? Ai : 1;
        if (gq4.v.Ni()) {
            u70Var.U = i27;
        } else {
            u70Var.U = i27 + 65536;
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "isVoipDoubleLinkSettingOpen false, setsimtype " + u70Var.U);
        }
        java.lang.String g17 = wo.w0.g(false);
        if (g17 == null || g17.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkNativeEngine", "getDeviceId failed");
        } else {
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            u70Var.R = com.tencent.mm.protobuf.g.b(com.tencent.mm.sdk.platformtools.w2.b(g17.getBytes()).getBytes());
        }
        u70Var.S = str3;
        u70Var.V = java.lang.String.format("0x%x", java.lang.Integer.valueOf(o45.wf.f343029g));
        return u70Var;
    }

    public static int c(int i17, byte[] bArr, int i18) {
        return f149585c.SetAppCmd(i17, bArr, i18);
    }

    public static int d(r45.ai6 ai6Var) {
        int i17 = -1;
        if (ai6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkNativeEngine", "steve: videoResParam is null");
            return -1;
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "videoResParam:" + ai6Var + ",length:" + ai6Var.toByteArray().length);
            i17 = f149585c.SubscribeVideo(ai6Var.toByteArray(), ai6Var.toByteArray().length);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("steve: subScribeVideoAndResList ret:");
            sb6.append(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", sb6.toString());
            return i17;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Multitalk.ILinkNativeEngine", e17, "SetVideoResolution exception", new java.lang.Object[0]);
            return i17;
        }
    }
}
