package ks3;

/* loaded from: classes8.dex */
public class k0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f311703g = com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyy);

    /* renamed from: h, reason: collision with root package name */
    public static android.util.SparseArray f311704h;

    /* renamed from: b, reason: collision with root package name */
    public ks3.z f311706b;

    /* renamed from: c, reason: collision with root package name */
    public ks3.i f311707c;

    /* renamed from: d, reason: collision with root package name */
    public ks3.s f311708d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f311705a = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f311709e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f311710f = new java.util.HashMap();

    static {
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyy);
        f311704h = null;
    }

    public k0() {
        f();
    }

    public static int a(ks3.k0 k0Var, hs3.l lVar) {
        k0Var.getClass();
        boolean z17 = lVar.f284585c.f284582c;
        hs3.j jVar = lVar.f284589g;
        if (!z17) {
            jVar.d(lVar.f284587e.f284595c, null);
            return 0;
        }
        hs3.o oVar = lVar.f284587e;
        java.util.Map map = lVar.f284588f;
        if (map == null) {
            jVar.b(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMTYPEERROR, "format error");
            return com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMTYPEERROR;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".Response.error.code"), 0);
        if (P == 0) {
            jVar.d(oVar.f284595c, lVar.f284588f);
            return 0;
        }
        jVar.b(P, k0Var.e(P, (java.lang.String) lVar.f284588f.get(".Response.error.message")));
        return P;
    }

    public static java.lang.String c() {
        return "https://" + f311703g;
    }

    public void b(long j17) {
        java.util.Map map = this.f311710f;
        ks3.j0 j0Var = (ks3.j0) ((java.util.HashMap) map).get(java.lang.Long.valueOf(j17));
        if (j0Var != null) {
            j0Var.onCancelled();
            j0Var.cancel(true);
        }
        ((java.util.HashMap) map).remove(java.lang.Long.valueOf(j17));
        ((java.util.HashMap) this.f311709e).remove(java.lang.Long.valueOf(j17));
    }

    public java.lang.String d() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        synchronized (lp0.b.class) {
            str = lp0.b.D() + "mail/";
        }
        sb6.append(str);
        sb6.append("attach/");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.vfs.w6.u(sb7);
        return sb7;
    }

    public final java.lang.String e(int i17, java.lang.String str) {
        int i18;
        if (i17 != -7) {
            if (i17 != -6) {
                if (i17 == -4 || i17 == -3) {
                    i18 = com.tencent.mm.R.string.hkk;
                } else if (i17 != -1) {
                    switch (i17) {
                        case -105:
                            break;
                        case -104:
                            i18 = com.tencent.mm.R.string.hkj;
                            break;
                        case -103:
                            i18 = com.tencent.mm.R.string.hki;
                            break;
                        case -102:
                            i18 = com.tencent.mm.R.string.hkh;
                            break;
                        default:
                            i18 = 0;
                            break;
                    }
                } else {
                    i18 = com.tencent.mm.R.string.hkf;
                }
            }
            i18 = com.tencent.mm.R.string.hkl;
        } else {
            i18 = com.tencent.mm.R.string.hkm;
        }
        return i18 == 0 ? str : i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, i18);
    }

    public void f() {
        java.util.HashMap hashMap = (java.util.HashMap) this.f311710f;
        java.util.Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((ks3.j0) it.next()).cancel(true);
        }
        hashMap.clear();
        ((java.util.HashMap) this.f311709e).clear();
        ((java.util.HashMap) this.f311705a).clear();
        java.lang.String str = ((com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCVoid(), js3.c.class)).f68406d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ks3.z zVar = new ks3.z("wcf://mailapp/addr/mail_address/addrpage");
            this.f311706b = zVar;
            zVar.f311788b.a();
        } else {
            this.f311706b = new ks3.z("wcf://mailapp/addr/mail_address/" + str + "/addrpage");
        }
        this.f311707c = new ks3.i("wcf://mailapp/draft/");
        this.f311708d = new ks3.s("wcf://mailapp/http/", 0);
    }

    public final long g(java.lang.String str, int i17, java.util.Map map, hs3.p pVar, hs3.k kVar, hs3.j jVar) {
        java.lang.String str2;
        if (map == null) {
            map = new java.util.HashMap();
        }
        map.put("appname", "qqmail_weixin");
        map.put("f", "xml");
        map.put("charset", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        try {
            java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
            loop0: while (networkInterfaces.hasMoreElements()) {
                java.util.Enumeration<java.net.InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    java.net.InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        str2 = nextElement.getHostAddress();
                        break loop0;
                    }
                }
            }
        } catch (java.net.SocketException | java.lang.Exception unused) {
        }
        str2 = null;
        map.put("clientip", str2);
        hs3.l lVar = new hs3.l(c() + str, new hs3.n(i17, map, this.f311705a, pVar), jVar);
        lVar.f284585c = kVar;
        com.tencent.mm.sdk.platformtools.u3.h(new ks3.h0(this, lVar));
        return lVar.f284583a;
    }
}
