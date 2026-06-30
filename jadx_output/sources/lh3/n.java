package lh3;

@j95.b
/* loaded from: classes7.dex */
public class n extends i95.w implements kh3.f {

    /* renamed from: o, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.b4 f318686o = null;

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.String f318687p = "";

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.String f318688q = "";

    /* renamed from: m, reason: collision with root package name */
    public final boolean f318695m;

    /* renamed from: d, reason: collision with root package name */
    public boolean f318689d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f318690e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f318691f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f318692g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f318693h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f318694i = 60;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f318696n = new java.util.HashMap();

    public n() {
        boolean z17 = false;
        this.f318695m = false;
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 29 || (i17 >= 28 && android.os.Build.VERSION.PREVIEW_SDK_INT != 0)) {
            z17 = true;
        }
        this.f318695m = z17;
    }

    public int Ai(int i17) {
        if (!Ui()) {
            return (com.tencent.mars.comm.NetStatusUtil.isMobile(com.tencent.mm.sdk.platformtools.x2.f193071a) || !this.f318689d || (i17 & this.f318690e) == 0) ? 2 : 3;
        }
        wi(1);
        if (2 != this.f318692g && this.f318689d) {
            return (i17 & this.f318690e) == 0 ? 2 : 1;
        }
        return 0;
    }

    public int Bi() {
        if (Ui()) {
            return this.f318691f;
        }
        return 0;
    }

    public final void Di(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SimcardService", "NotifySimTypeChange flag[%d]", java.lang.Integer.valueOf(i17));
        java.util.Map map = this.f318696n;
        if (map == null) {
            return;
        }
        for (java.util.Map.Entry entry : ((java.util.HashMap) map).entrySet()) {
            int i19 = (((java.lang.Integer) entry.getKey()).intValue() & i17) == 0 ? 2 : 1;
            java.util.Iterator it = ((java.util.Set) entry.getValue()).iterator();
            while (it.hasNext()) {
                ((kh3.e) it.next()).a(i19, i18);
            }
        }
    }

    public void Ni(int i17, kh3.e eVar) {
        if (eVar == null) {
            return;
        }
        java.util.Map map = this.f318696n;
        if (!((java.util.HashMap) map).containsKey(java.lang.Integer.valueOf(i17))) {
            ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), new java.util.HashSet());
        }
        ((java.util.Set) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17))).add(eVar);
    }

    public final java.lang.String Ri() {
        try {
            java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                java.net.NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement != null) {
                    java.util.Enumeration<java.net.InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        java.net.InetAddress nextElement2 = inetAddresses.nextElement();
                        if (nextElement2 != null && !nextElement2.isLoopbackAddress() && (nextElement2 instanceof java.net.Inet4Address)) {
                            java.lang.String name = nextElement.getName();
                            if (name != null) {
                                java.lang.String lowerCase = name.toLowerCase();
                                com.tencent.mars.xlog.Log.i("MicroMsg.SimcardService", "getSelfIp %s, %s isUp:%b", nextElement2.getHostAddress(), lowerCase, java.lang.Boolean.valueOf(nextElement.isUp()));
                                if (!lowerCase.startsWith("wlan") && !lowerCase.startsWith("wifi")) {
                                }
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.SimcardService", "getSelfIp result %s, %s", nextElement2.getHostAddress(), nextElement.getName());
                            return com.tencent.mm.sdk.platformtools.t8.K0(nextElement2.getHostAddress()) ? "127.0.0.1" : nextElement2.getHostAddress();
                        }
                    }
                }
            }
            return "127.0.0.1";
        } catch (java.lang.Exception unused) {
            return "127.0.0.1";
        }
    }

    public boolean Ui() {
        if (!com.tencent.mars.comm.NetStatusUtil.isMobile(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return false;
        }
        int iSPCode = com.tencent.mars.comm.NetStatusUtil.getISPCode(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.i("MicroMsg.SimcardService", "isUnicomNetwork ispcode[%d]", java.lang.Integer.valueOf(iSPCode));
        return iSPCode == 46001 || iSPCode == 46006 || iSPCode == 46009;
    }

    public void Vi(int i17, kh3.e eVar) {
        if (eVar == null) {
            return;
        }
        java.util.Map map = this.f318696n;
        if (((java.util.HashMap) map).containsKey(java.lang.Integer.valueOf(i17))) {
            ((java.util.Set) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17))).remove(eVar);
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        if (f318686o == null) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new lh3.m(this), true);
            f318686o = b4Var;
            b4Var.c(30000L, 30000L);
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
    }

    public void wi(int i17) {
        c01.oa oaVar;
        if (Ui()) {
            if (this.f318693h != 0) {
                long i18 = com.tencent.mm.sdk.platformtools.t8.i1();
                com.tencent.mars.xlog.Log.i("MicroMsg.SimcardService", "CheckMobileSIMType scene[%d] cacheExpiredTime[%d] lastCheckMobileSIMTypeTime[%d] now[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f318694i), java.lang.Long.valueOf(this.f318693h), java.lang.Long.valueOf(i18));
                if (i17 != 2) {
                    long b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("NetInfoCheckMobileSimTypeCacheTime", 28800);
                    long j17 = this.f318694i;
                    if (b17 > j17) {
                        b17 = j17;
                    }
                    if (i18 - this.f318693h < b17) {
                        return;
                    }
                } else if (i18 - this.f318693h < 60) {
                    return;
                }
            }
            this.f318693h = com.tencent.mm.sdk.platformtools.t8.i1();
            f318688q = Ri();
            com.tencent.mars.xlog.Log.i("MicroMsg.SimcardService", "CheckMobileSIMType start");
            if (this.f318695m) {
                java.lang.String n17 = wo.w0.n();
                java.lang.String str = f318688q;
                java.lang.String p17 = wo.w0.p();
                if (n17 == "") {
                    n17 = null;
                }
                oaVar = new c01.oa(i17, str, null, null, p17, n17);
            } else {
                f318687p = wo.w0.h();
                oaVar = new c01.oa(i17, f318688q, wo.w0.g(true), f318687p, null, null);
            }
            gm0.j1.d().g(oaVar);
        }
    }
}
