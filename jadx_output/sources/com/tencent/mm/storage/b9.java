package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public final class b9 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f193775a = "";

    /* renamed from: b, reason: collision with root package name */
    public double f193776b = 0.0d;

    /* renamed from: c, reason: collision with root package name */
    public double f193777c = 0.0d;

    /* renamed from: d, reason: collision with root package name */
    public int f193778d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f193779e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f193780f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f193781g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f193782h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f193783i = null;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f193784j = null;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f193785k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f193786l = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f193787m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f193788n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f193789o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f193790p = "";

    /* renamed from: q, reason: collision with root package name */
    public float f193791q = 0.0f;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f193792r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f193793s = "";

    public static com.tencent.mm.storage.b9 d(java.lang.String str) {
        com.tencent.mm.storage.b9 b9Var = new com.tencent.mm.storage.b9();
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msg", null);
        if (d17 != null) {
            java.lang.String str2 = (java.lang.String) d17.get(".msg.location.$fromusername");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            b9Var.f193775a = str2;
            b9Var.f193776b = com.tencent.mm.sdk.platformtools.t8.A1((java.lang.String) d17.get(".msg.location.$x"));
            b9Var.f193777c = com.tencent.mm.sdk.platformtools.t8.A1((java.lang.String) d17.get(".msg.location.$y"));
            java.lang.String str3 = (java.lang.String) d17.get(".msg.location.$label");
            if (str3 == null) {
                str3 = "";
            }
            b9Var.f193779e = str3;
            java.lang.String str4 = (java.lang.String) d17.get(".msg.location.$maptype");
            if (str4 == null) {
                str4 = "";
            }
            b9Var.f193781g = str4;
            b9Var.f193778d = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".msg.location.$scale"), 0);
            java.lang.String str5 = (java.lang.String) d17.get(".msg.location.$localLocationen");
            if (str5 == null) {
                str5 = "";
            }
            b9Var.f193784j = str5;
            java.lang.String str6 = (java.lang.String) d17.get(".msg.location.$localLocationcn");
            if (str6 == null) {
                str6 = "";
            }
            b9Var.f193782h = str6;
            java.lang.String str7 = (java.lang.String) d17.get(".msg.location.$localLocationtw");
            if (str7 == null) {
                str7 = "";
            }
            b9Var.f193783i = str7;
            java.lang.String str8 = (java.lang.String) d17.get(".msg.location.$poiname");
            if (str8 == null) {
                str8 = "";
            }
            b9Var.f193780f = str8;
            java.lang.String str9 = (java.lang.String) d17.get(".msg.location.$infourl");
            if (str9 == null) {
                str9 = "";
            }
            b9Var.f193785k = str9;
            java.lang.String str10 = (java.lang.String) d17.get(".msg.location.$poiid");
            if (str10 == null) {
                str10 = "";
            }
            b9Var.f193786l = str10;
            b9Var.f193787m = com.tencent.mm.sdk.platformtools.t8.y((java.lang.String) d17.get(".msg.location.$isFromPoiList"), false);
            java.lang.String str11 = (java.lang.String) d17.get(".msg.location.$poiCategoryTips");
            if (str11 == null) {
                str11 = "";
            }
            b9Var.f193788n = str11;
            java.lang.String str12 = (java.lang.String) d17.get(".msg.location.$poiBusinessHour");
            if (str12 == null) {
                str12 = "";
            }
            b9Var.f193789o = str12;
            java.lang.String str13 = (java.lang.String) d17.get(".msg.location.$poiPhone");
            if (str13 == null) {
                str13 = "";
            }
            b9Var.f193790p = str13;
            b9Var.f193791q = com.tencent.mm.sdk.platformtools.t8.B1((java.lang.String) d17.get(".msg.location.$poiPriceTips"));
            java.lang.String str14 = (java.lang.String) d17.get(".msg.location.$buildingId");
            if (str14 == null) {
                str14 = "";
            }
            b9Var.f193792r = str14;
            java.lang.String str15 = (java.lang.String) d17.get(".msg.location.$floorName");
            b9Var.f193793s = str15 != null ? str15 : "";
        }
        return b9Var;
    }

    public java.lang.String a() {
        return this.f193780f;
    }

    public boolean b() {
        java.lang.String str = this.f193780f;
        return (str == null || str.equals("") || this.f193780f.equals("[位置]")) ? false : true;
    }

    public boolean c() {
        return java.lang.Math.abs(this.f193777c) <= 180.0d && java.lang.Math.abs(this.f193776b) <= 90.0d;
    }

    public java.lang.String toString() {
        return java.lang.String.format("%d-%d-%d", java.lang.Integer.valueOf((int) (this.f193776b * 1000000.0d)), java.lang.Integer.valueOf((int) (this.f193777c * 1000000.0d)), java.lang.Integer.valueOf(this.f193778d));
    }
}
