package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public final class e9 {
    public java.lang.String A;
    public java.lang.String B;
    public int C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f193871m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f193872n;

    /* renamed from: o, reason: collision with root package name */
    public int f193873o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f193874p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f193875q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f193877s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f193878t;

    /* renamed from: w, reason: collision with root package name */
    public int f193881w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f193882x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f193883y;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f193859a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f193860b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f193861c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f193862d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f193863e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f193864f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f193865g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f193866h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f193867i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f193868j = "";

    /* renamed from: k, reason: collision with root package name */
    public long f193869k = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f193870l = "";

    /* renamed from: r, reason: collision with root package name */
    public int f193876r = 0;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f193879u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f193880v = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f193884z = "";

    public static com.tencent.mm.storage.e9 f(java.lang.String str) {
        com.tencent.mm.storage.e9 e9Var = new com.tencent.mm.storage.e9();
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msg", null);
        if (d17 != null) {
            try {
                e9Var.f193859a = (java.lang.String) d17.get(".msg.$fromusername");
                e9Var.f193860b = (java.lang.String) d17.get(".msg.$alias");
                e9Var.f193861c = (java.lang.String) d17.get(".msg.$fromnickname");
                e9Var.f193862d = (java.lang.String) d17.get(".msg.$fullpy");
                e9Var.f193863e = (java.lang.String) d17.get(".msg.$shortpy");
                e9Var.f193864f = (java.lang.String) d17.get(".msg.$content");
                e9Var.f193865g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.$imagestatus"), 0);
                e9Var.f193866h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.$scene"), 0);
                e9Var.f193867i = (java.lang.String) d17.get(".msg.$mhash");
                e9Var.f193868j = (java.lang.String) d17.get(".msg.$mfullhash");
                if (d17.get(d17.get(".msg.$qqnum")) != null && ((java.lang.String) d17.get(d17.get(".msg.$qqnum"))).length() > 0) {
                    e9Var.f193869k = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".msg.$qqnum"), 0L);
                }
                e9Var.f193870l = (java.lang.String) d17.get(".msg.$qqnickname");
                e9Var.f193874p = (java.lang.String) d17.get(".msg.$sign");
                if (d17.get(".msg.$sex") != null && ((java.lang.String) d17.get(".msg.$sex")).length() > 0) {
                    e9Var.f193873o = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.$sex"), 0);
                }
                e9Var.f193871m = (java.lang.String) d17.get(".msg.$city");
                e9Var.f193872n = (java.lang.String) d17.get(".msg.$province");
                e9Var.f193875q = (java.lang.String) d17.get(".msg.$country");
                if (d17.get(".msg.$snsflag") != null) {
                    e9Var.f193876r = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.$snsflag"), 0);
                    e9Var.f193877s = (java.lang.String) d17.get(".msg.$snsbgimgid");
                }
                e9Var.f193878t = (java.lang.String) d17.get(".msg.$ticket");
                java.lang.String str2 = (java.lang.String) d17.get(".msg.$bigheadimgurl");
                if (str2 == null) {
                    str2 = "";
                }
                e9Var.f193879u = str2;
                java.lang.String str3 = (java.lang.String) d17.get(".msg.$smallheadimgurl");
                if (str3 == null) {
                    str3 = "";
                }
                e9Var.f193880v = str3;
                java.lang.String str4 = (java.lang.String) d17.get(".msg.$openimappid");
                if (str4 == null) {
                    str4 = "";
                }
                e9Var.H = str4;
                java.lang.String str5 = (java.lang.String) d17.get(".msg.$openimdescwordingid");
                if (str5 == null) {
                    str5 = "";
                }
                e9Var.I = str5;
                e9Var.f193881w = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.$opcode"), 0);
                java.lang.String str6 = (java.lang.String) d17.get(".msg.$encryptusername");
                if (str6 == null) {
                    str6 = "";
                }
                e9Var.f193882x = str6;
                java.lang.String str7 = (java.lang.String) d17.get(".msg.$googlecontact");
                if (str7 == null) {
                    str7 = "";
                }
                e9Var.f193883y = str7;
                java.lang.String str8 = (java.lang.String) d17.get(".msg.$chatroomusername");
                if (str8 == null) {
                    str8 = "";
                }
                e9Var.f193884z = str8;
                e9Var.A = (java.lang.String) d17.get(".msg.$sourceusername");
                e9Var.B = (java.lang.String) d17.get(".msg.$sourcenickname");
                e9Var.F = (java.lang.String) d17.get(".msg.$sharecardusername");
                e9Var.G = (java.lang.String) d17.get(".msg.$sharecardnickname");
                int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.Antispam.$isSuspiciousUser"), 0);
                e9Var.C = P;
                if (P == 1) {
                    e9Var.D = (java.lang.String) d17.get(".msg.Antispam.safetyWarning");
                    e9Var.E = (java.lang.String) d17.get(".msg.Antispam.safetyWarningDetail");
                }
                g(d17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgInfo", e17, "", new java.lang.Object[0]);
            }
        }
        return e9Var;
    }

    public static r45.dz3 g(java.util.Map map) {
        try {
            java.lang.String str = (java.lang.String) map.get(".msg.images.image.$url");
            java.lang.String str2 = (java.lang.String) map.get(".msg.images.image.$fileid");
            if (android.text.TextUtils.isEmpty(str) && android.text.TextUtils.isEmpty(str2)) {
                return null;
            }
            java.lang.String str3 = (java.lang.String) map.get(".msg.images.image.$aeskey");
            if (android.text.TextUtils.isEmpty(str3)) {
                return null;
            }
            r45.dz3 dz3Var = new r45.dz3();
            java.util.LinkedList linkedList = dz3Var.f372869e;
            r45.v60 v60Var = new r45.v60();
            v60Var.f387932d = str;
            v60Var.f387933e = str3;
            v60Var.f387935g = str2;
            linkedList.add(v60Var);
            dz3Var.f372868d = linkedList.size();
            return dz3Var;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgInfo", th6, "parseImgInfoList fail", new java.lang.Object[0]);
            return null;
        }
    }

    public java.lang.String a() {
        return (com.tencent.mm.sdk.platformtools.t8.K0(this.f193875q) || com.tencent.mm.sdk.platformtools.t8.K0(this.f193872n)) ? this.f193871m : com.tencent.mm.sdk.platformtools.t8.K0(this.f193871m) ? com.tencent.mm.storage.ha.k().j(this.f193875q, this.f193872n) : com.tencent.mm.storage.ha.k().h(this.f193875q, this.f193872n, this.f193871m);
    }

    public java.lang.String b() {
        java.lang.String str = this.f193861c;
        if (str != null && str.length() > 0) {
            return this.f193861c;
        }
        com.tencent.mars.xlog.Log.f("MicroMsg.MsgInfo", "username is nullOrNil");
        return this.f193859a;
    }

    public java.lang.String c() {
        return this.f193859a;
    }

    public java.lang.String d() {
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.f193875q) ? (com.tencent.mm.sdk.platformtools.t8.K0(this.f193872n) || com.tencent.mm.sdk.platformtools.t8.K0(this.f193871m) || !com.tencent.mm.storage.ha.r(this.f193875q)) ? com.tencent.mm.storage.ha.k().i(this.f193875q) : com.tencent.mm.storage.ha.k().j(this.f193875q, this.f193872n) : this.f193872n;
    }

    public int e() {
        return this.f193866h;
    }
}
