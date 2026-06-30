package com.tencent.mm.storage;

/* loaded from: classes12.dex */
public class g5 {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public int F;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f193951a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f193952b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f193953c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f193954d;

    /* renamed from: e, reason: collision with root package name */
    public int f193955e;

    /* renamed from: f, reason: collision with root package name */
    public int f193956f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f193957g;

    /* renamed from: h, reason: collision with root package name */
    public long f193958h;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f193961k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f193962l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f193963m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f193964n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f193965o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f193966p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f193967q;

    /* renamed from: s, reason: collision with root package name */
    public int f193969s;

    /* renamed from: t, reason: collision with root package name */
    public int f193970t;

    /* renamed from: u, reason: collision with root package name */
    public long f193971u;

    /* renamed from: v, reason: collision with root package name */
    public int f193972v;

    /* renamed from: w, reason: collision with root package name */
    public int f193973w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f193974x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f193975y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f193976z;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f193959i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f193960j = "";

    /* renamed from: r, reason: collision with root package name */
    public boolean f193968r = true;

    public static com.tencent.mm.storage.g5 a(java.util.Map map, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (map == null) {
            return null;
        }
        com.tencent.mm.storage.g5 g5Var = new com.tencent.mm.storage.g5();
        g5Var.f193959i = str2;
        g5Var.f193951a = str;
        g5Var.f193953c = (java.lang.String) map.get(".msg.emoji.$idbuffer");
        g5Var.f193952b = (java.lang.String) map.get(".msg.emoji.$fromusername");
        java.lang.String str4 = (java.lang.String) map.get(".msg.emoji.$androidmd5");
        g5Var.f193954d = str4;
        if (str4 == null) {
            g5Var.f193954d = (java.lang.String) map.get(".msg.emoji.$md5");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(g5Var.f193954d)) {
            g5Var.f193954d = g5Var.f193954d.toLowerCase();
        }
        try {
            g5Var.f193955e = java.lang.Integer.valueOf((java.lang.String) map.get(".msg.emoji.$type")).intValue();
            if (map.get(".msg.emoji.$androidlen") != null) {
                g5Var.f193956f = java.lang.Integer.valueOf((java.lang.String) map.get(".msg.emoji.$androidlen")).intValue();
            } else if (map.get(".msg.emoji.$len") != null) {
                g5Var.f193956f = java.lang.Integer.valueOf((java.lang.String) map.get(".msg.emoji.$len")).intValue();
            }
            if (map.get(".msg.gameext.$type") != null) {
                java.lang.Integer.valueOf((java.lang.String) map.get(".msg.gameext.$type")).intValue();
            }
            if (map.get(".msg.gameext.$content") != null) {
                java.lang.Integer.valueOf((java.lang.String) map.get(".msg.gameext.$content")).intValue();
            }
            if (map.get(".msg.emoji.$productid") != null) {
                g5Var.f193957g = (java.lang.String) map.get(".msg.emoji.$productid");
            }
            if (map.get(".msg.emoji.$cdnurl") != null) {
                g5Var.f193961k = (java.lang.String) map.get(".msg.emoji.$cdnurl");
            }
            if (map.get(".msg.emoji.$tpurl") != null) {
                g5Var.f193974x = (java.lang.String) map.get(".msg.emoji.$tpurl");
            }
            if (map.get(".msg.emoji.$tpauthkey") != null) {
                g5Var.f193975y = (java.lang.String) map.get(".msg.emoji.$tpauthkey");
            }
            if (map.get(".msg.emoji.$designerid") != null) {
                g5Var.f193962l = (java.lang.String) map.get(".msg.emoji.$designerid");
            }
            if (map.get(".msg.emoji.$thumburl") != null) {
                g5Var.f193963m = (java.lang.String) map.get(".msg.emoji.$thumburl");
            }
            if (map.get(".msg.emoji.$encrypturl") != null) {
                g5Var.f193964n = (java.lang.String) map.get(".msg.emoji.$encrypturl");
            }
            if (map.get(".msg.emoji.$aeskey") != null) {
                g5Var.f193965o = (java.lang.String) map.get(".msg.emoji.$aeskey");
            }
            if (map.get(".msg.emoji.$width") != null) {
                g5Var.f193972v = java.lang.Integer.valueOf((java.lang.String) map.get(".msg.emoji.$width")).intValue();
            }
            if (map.get(".msg.emoji.$height") != null) {
                g5Var.f193973w = java.lang.Integer.valueOf((java.lang.String) map.get(".msg.emoji.$height")).intValue();
            }
            if (map.get(".msg.emoji.$externurl") != null) {
                g5Var.f193966p = (java.lang.String) map.get(".msg.emoji.$externurl");
            }
            if (map.get(".msg.emoji.$externmd5") != null) {
                g5Var.f193967q = (java.lang.String) map.get(".msg.emoji.$externmd5");
            }
            if (map.get(".msg.emoji.$activityid") != null) {
                g5Var.f193976z = (java.lang.String) map.get(".msg.emoji.$activityid");
            }
            if (map.get(".msg.emoji.$attachedtext") != null) {
                g5Var.B = (java.lang.String) map.get(".msg.emoji.$attachedtext");
            }
            if (map.get(".msg.emoji.$attachedtextcolor") != null) {
                g5Var.D = (java.lang.String) map.get(".msg.emoji.$attachedtextcolor");
            }
            if (map.get(".msg.emoji.$lensid") != null) {
                g5Var.C = (java.lang.String) map.get(".msg.emoji.$lensid");
            }
            if (map.get(".msg.emoji.$linkid") != null) {
                g5Var.A = (java.lang.String) map.get(".msg.emoji.$linkid");
            }
            if (map.get(".msg.emoji.$desc") != null) {
                g5Var.E = (java.lang.String) map.get(".msg.emoji.$desc");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                g5Var.f193960j = str3;
            }
            if (map.get(".msg.storeunique") != null) {
                g5Var.F = java.lang.Integer.valueOf((java.lang.String) map.get(".msg.storeunique")).intValue();
            }
            return g5Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiMsgInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }
}
