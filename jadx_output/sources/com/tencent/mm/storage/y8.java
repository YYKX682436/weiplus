package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public final class y8 {

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f196370m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f196371n;

    /* renamed from: o, reason: collision with root package name */
    public int f196372o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f196373p;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f196358a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f196359b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f196360c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f196361d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f196362e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f196363f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f196364g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f196365h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f196366i = "";

    /* renamed from: j, reason: collision with root package name */
    public long f196367j = 0;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f196368k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f196369l = "";

    /* renamed from: q, reason: collision with root package name */
    public int f196374q = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f196375r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f196376s = "";

    /* renamed from: t, reason: collision with root package name */
    public int f196377t = 0;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f196378u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f196379v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f196380w = "";

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f196381x = "";

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f196382y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f196383z = "";
    public java.lang.String A = "";
    public java.lang.String B = "";
    public java.lang.String C = "";
    public java.lang.String D = "";

    /* JADX WARN: Removed duplicated region for block: B:16:0x026c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.storage.y8 i(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.y8.i(java.lang.String):com.tencent.mm.storage.y8");
    }

    public static void j(java.lang.String str, com.tencent.mm.storage.y8 y8Var) {
        int i17 = y8Var.f196374q;
        java.util.Set set = c01.e2.f37117a;
        if (com.tencent.mm.storage.z3.D3(i17)) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfo", "parseBizNameCard bizNameCardStr is null");
                y8Var.f196374q = y8Var.f196374q & (-17) & (-513);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfo", "parseBizNameCard bizNameCardStr size %d", java.lang.Integer.valueOf(str.length()));
            r45.kl klVar = new r45.kl();
            try {
                klVar.parseFrom(android.util.Base64.decode(str, 2));
                if (com.tencent.mm.sdk.platformtools.t8.K0(klVar.f378797d)) {
                    return;
                }
                r45.ll llVar = new r45.ll();
                llVar.parseFrom(android.util.Base64.decode(klVar.f378797d, 2));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(llVar.f379568i)) {
                    y8Var.f196358a = llVar.f379568i;
                }
                int i18 = llVar.f379564e;
                if (i18 > 0) {
                    y8Var.f196374q = i18;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(llVar.f379563d)) {
                    y8Var.f196359b = llVar.f379563d;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(llVar.f379565f)) {
                    y8Var.C = llVar.f379565f;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfo", "parseBizNameCard user:[%s] nickname:[%s] verifyflag:[%d] verifyName:[%s]", y8Var.f196358a, y8Var.f196359b, java.lang.Integer.valueOf(y8Var.f196374q), y8Var.C);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MsgInfo", "parseBizNameCard ex %s", e17.getMessage());
            }
        }
    }

    public int a() {
        return this.f196377t;
    }

    public java.lang.String b() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f196378u)) {
            java.lang.String[] split = this.f196378u.split("_");
            if (split.length > 0) {
                if (split.length > 2) {
                    this.f196370m = com.tencent.mm.storage.ha.k().h(split[0], split[1], split[2]);
                } else if (split.length == 2) {
                    this.f196370m = com.tencent.mm.storage.ha.k().j(split[0], split[1]);
                } else {
                    this.f196370m = "";
                }
            }
        }
        return this.f196370m;
    }

    public java.lang.String c() {
        if (!android.text.TextUtils.isEmpty(this.f196359b)) {
            return this.f196359b;
        }
        if (!android.text.TextUtils.isEmpty(this.f196360c)) {
            return this.f196360c;
        }
        com.tencent.mars.xlog.Log.f("MicroMsg.MsgInfo", "username is nullOrNil");
        java.lang.String str = this.f196358a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str == null ? "" : str;
    }

    public java.lang.String d() {
        return this.f196358a;
    }

    public java.lang.String e() {
        return this.f196383z;
    }

    public java.lang.String f() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f196378u)) {
            java.lang.String[] split = this.f196378u.split("_");
            if (split.length > 0) {
                if (split.length <= 2 || !com.tencent.mm.storage.ha.r(split[0])) {
                    this.f196371n = com.tencent.mm.storage.ha.k().i(split[0]);
                } else {
                    this.f196371n = com.tencent.mm.storage.ha.k().j(split[0], split[1]);
                }
            }
        }
        return this.f196371n;
    }

    public java.lang.String g() {
        java.lang.String str = this.f196369l;
        if (str != null && str.length() > 0) {
            return this.f196369l;
        }
        java.lang.String str2 = this.f196368k;
        return (str2 == null || str2.length() <= 0) ? java.lang.Long.toString(this.f196367j) : this.f196368k;
    }

    public int h() {
        return this.f196374q;
    }
}
