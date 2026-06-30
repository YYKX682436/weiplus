package com.tencent.mm.plugin.subapp.jdbiz;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: c, reason: collision with root package name */
    public long f172134c;

    /* renamed from: i, reason: collision with root package name */
    public long f172140i;

    /* renamed from: j, reason: collision with root package name */
    public long f172141j;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f172132a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f172133b = "";

    /* renamed from: d, reason: collision with root package name */
    public long f172135d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f172136e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f172137f = false;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f172138g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f172139h = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f172142k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f172143l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f172144m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f172145n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f172146o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f172147p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f172148q = "";

    /* renamed from: r, reason: collision with root package name */
    public int f172149r = 0;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f172150s = "";

    public static com.tencent.mm.plugin.subapp.jdbiz.o a() {
        java.lang.String str = (java.lang.String) c01.d9.b().p().l(327942, "");
        com.tencent.mm.plugin.subapp.jdbiz.o oVar = new com.tencent.mm.plugin.subapp.jdbiz.o();
        com.tencent.mars.xlog.Log.i("MicroMsg.JdMsgContent", " create xml : " + str);
        oVar.b(str);
        return oVar;
    }

    public void b(java.lang.String str) {
        this.f172132a = "";
        this.f172133b = "";
        this.f172135d = 0L;
        this.f172138g = "";
        this.f172136e = false;
        this.f172137f = false;
        this.f172143l = "";
        this.f172144m = "";
        this.f172145n = "";
        this.f172142k = "";
        this.f172146o = "";
        this.f172150s = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JdMsgContent", "feed xml %s", str);
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "sysmsg", null);
        if (d17 == null) {
            return;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.biztype");
        if (str2 == null) {
            str2 = "";
        }
        this.f172132a = str2;
        java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.alert");
        if (str3 == null) {
            str3 = "";
        }
        this.f172142k = str3;
        java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.activityid");
        if (str4 == null) {
            str4 = "";
        }
        this.f172133b = str4;
        this.f172134c = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) d17.get(".sysmsg.starttime"));
        this.f172135d = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) d17.get(".sysmsg.expiretime"));
        java.lang.String str5 = (java.lang.String) d17.get(".sysmsg.content.jumpurl");
        if (str5 == null) {
            str5 = "";
        }
        this.f172146o = str5;
        java.lang.String str6 = (java.lang.String) d17.get(".sysmsg.content.jumpweapp.username");
        if (str6 == null) {
            str6 = "";
        }
        this.f172147p = str6;
        java.lang.String str7 = (java.lang.String) d17.get(".sysmsg.content.jumpweapp.path");
        if (str7 == null) {
            str7 = "";
        }
        this.f172148q = str7;
        this.f172149r = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".sysmsg.content.jumpweapp.version"), 0);
        this.f172140i = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) d17.get(".sysmsg.content.urlstarttime"));
        this.f172141j = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) d17.get(".sysmsg.content.urlexpiretime"));
        java.lang.String str8 = (java.lang.String) d17.get(".sysmsg.content.jdcelltitle");
        if (str8 == null) {
            str8 = "";
        }
        this.f172138g = str8;
        java.lang.String str9 = (java.lang.String) d17.get(".sysmsg.content.jdcellicon");
        if (str9 == null) {
            str9 = "";
        }
        this.f172139h = str9;
        com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) d17.get(".sysmsg.content.titlestarttime"));
        com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) d17.get(".sysmsg.content.titleexpiretime"));
        this.f172136e = "1".equals(d17.get(".sysmsg.content.findshowreddot"));
        this.f172137f = "1".equals(d17.get(".sysmsg.content.jdcellshowred"));
        java.lang.String str10 = (java.lang.String) d17.get(".sysmsg.content.alertviewtitle");
        if (str10 == null) {
            str10 = "";
        }
        this.f172143l = str10;
        java.lang.String str11 = (java.lang.String) d17.get(".sysmsg.content.alertviewconfirm");
        if (str11 == null) {
            str11 = "";
        }
        this.f172144m = str11;
        java.lang.String str12 = (java.lang.String) d17.get(".sysmsg.content.alertviewcancel");
        this.f172145n = str12 != null ? str12 : "";
    }

    public boolean c(com.tencent.mm.plugin.subapp.jdbiz.o oVar) {
        if (oVar == null) {
            return true;
        }
        java.lang.String str = this.f172133b;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = oVar.f172133b;
        return !str.equals(str2 != null ? str2 : "");
    }

    public boolean d() {
        long j17 = this.f172135d;
        return j17 != 0 && j17 < java.lang.System.currentTimeMillis() / 1000;
    }

    public boolean e() {
        return this.f172134c < java.lang.System.currentTimeMillis() / 1000;
    }
}
