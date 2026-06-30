package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class g implements e95.a {
    private java.lang.String field_alias;
    public java.lang.String field_conRemark;
    public int field_deleteFlag;
    public java.lang.String field_descWording;
    public java.lang.String field_descWordingId;
    public java.lang.String field_descWordingQuanpin;
    public byte[] field_lvbuff;
    private java.lang.String field_nickname;
    public java.lang.String field_openImAppid;
    public java.lang.String field_remarkDesc;
    public int field_showHead;
    public java.lang.String field_signature;
    private java.lang.String field_username;
    private int field_verifyFlag;
    public int field_weiboFlag;

    @Override // e95.a
    public void I(int i17, byte[] bArr) {
        if (i17 == 9) {
            this.field_lvbuff = bArr;
        }
    }

    @Override // e95.a
    public void L(int i17, long j17) {
        if (i17 == 4) {
            this.field_verifyFlag = (int) j17;
            return;
        }
        if (i17 == 5) {
            this.field_showHead = (int) j17;
        } else if (i17 == 6) {
            this.field_weiboFlag = (int) j17;
        } else {
            if (i17 != 8) {
                return;
            }
            this.field_deleteFlag = (int) j17;
        }
    }

    @Override // e95.a
    public void P(int i17, java.lang.String str) {
        if (i17 == 0) {
            this.field_username = str;
            return;
        }
        if (i17 == 1) {
            this.field_nickname = str;
            return;
        }
        if (i17 == 2) {
            this.field_alias = str;
            return;
        }
        if (i17 == 3) {
            this.field_conRemark = str;
            return;
        }
        switch (i17) {
            case 10:
                this.field_descWordingId = str;
                return;
            case 11:
                this.field_openImAppid = str;
                return;
            case 12:
                this.field_descWording = str;
                return;
            case 13:
                this.field_descWordingQuanpin = str;
                return;
            default:
                return;
        }
    }

    public void a(android.database.Cursor cursor) {
        this.field_username = cursor.getString(0);
        this.field_nickname = cursor.getString(1);
        this.field_alias = cursor.getString(2);
        this.field_conRemark = cursor.getString(3);
        this.field_verifyFlag = cursor.getInt(4);
        this.field_showHead = cursor.getInt(5);
        this.field_weiboFlag = cursor.getInt(6);
        cursor.getLong(7);
        this.field_deleteFlag = cursor.getInt(8);
        this.field_lvbuff = cursor.getBlob(9);
        this.field_descWordingId = cursor.getString(10);
        this.field_openImAppid = cursor.getString(11);
        if (cursor.getColumnCount() >= 14) {
            this.field_descWording = cursor.getString(12);
            this.field_descWordingQuanpin = cursor.getString(13);
        }
        f();
    }

    public void b(com.tencent.mm.storage.z3 z3Var) {
        this.field_username = z3Var.d1();
        this.field_nickname = z3Var.P0();
        this.field_alias = z3Var.t0();
        this.field_conRemark = z3Var.w0();
        this.field_verifyFlag = z3Var.f1();
        this.field_showHead = z3Var.W0();
        this.field_weiboFlag = z3Var.i1();
        this.field_deleteFlag = z3Var.F0();
        this.field_lvbuff = z3Var.L0();
        if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(this.field_username)) {
            this.field_descWording = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).aj(this.field_username, false);
            this.field_openImAppid = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Vi(this.field_username);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Ui(this.field_username)) && !com.tencent.mm.sdk.platformtools.t8.K0(this.field_openImAppid)) {
                vh0.g1 g1Var = (vh0.g1) i95.n0.c(vh0.g1.class);
                java.lang.String str = this.field_username;
                vh0.i2 i2Var = (vh0.i2) g1Var;
                java.lang.String Vi = i2Var.Vi(str);
                java.lang.String Ui = i2Var.Ui(str);
                java.lang.String str2 = "";
                if (!com.tencent.mm.sdk.platformtools.t8.K0(Vi) && !com.tencent.mm.sdk.platformtools.t8.K0(Ui)) {
                    l41.q2 q2Var = (l41.q2) ((j41.b0) i95.n0.c(j41.b0.class));
                    q2Var.getClass();
                    u41.k kVar = new u41.k();
                    kVar.field_appid = Vi;
                    kVar.field_language = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    kVar.field_wordingId = Ui;
                    ((i41.l) i95.n0.c(i41.l.class)).Ui().get(kVar, "appid", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, "wordingId");
                    if (kVar.systemRowid == -1) {
                        q2Var.wi(Vi, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a), Ui, 0);
                    } else {
                        str2 = kVar.field_quanpin;
                    }
                    kotlin.jvm.internal.o.f(str2, "getWordingQuanPinFromID(...)");
                }
                this.field_descWordingQuanpin = str2;
            }
        } else {
            this.field_descWording = z3Var.G0();
            this.field_openImAppid = z3Var.Q0();
        }
        f();
    }

    public java.lang.String c() {
        java.lang.String str = this.field_conRemark;
        if (str != null && !str.trim().equals("")) {
            return this.field_conRemark;
        }
        java.lang.String str2 = this.field_username;
        com.tencent.mm.contact.q qVar = com.tencent.mm.contact.s.I2;
        java.lang.String str3 = null;
        java.lang.String a17 = qVar != null ? ((com.tencent.mm.app.s7) qVar).a(str2) : null;
        if (a17 != null) {
            return a17;
        }
        java.lang.String str4 = this.field_nickname;
        if (str4 != null && str4.length() > 0) {
            return this.field_nickname;
        }
        java.lang.String str5 = this.field_alias;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            return str5;
        }
        java.lang.String str6 = this.field_username;
        if (str6 != null) {
            if (str6.toLowerCase().endsWith("@t.qq.com")) {
                str3 = "@" + str6.replace("@t.qq.com", "");
            } else if (str6.toLowerCase().endsWith("@qqim")) {
                str3 = str6.replace("@qqim", "");
                long longValue = java.lang.Long.valueOf(str3).longValue();
                if (longValue < 0) {
                    str3 = new kk.v(longValue).toString();
                }
            } else {
                str3 = str6;
            }
        }
        return (str3 == null || str3.length() == 0) ? this.field_username : str3;
    }

    public java.lang.String d() {
        return this.field_nickname;
    }

    public java.lang.String e() {
        return this.field_username;
    }

    public void f() {
        byte[] bArr = this.field_lvbuff;
        if (bArr == null || bArr == null) {
            return;
        }
        try {
            if (bArr.length == 0) {
                return;
            }
            com.tencent.mm.sdk.platformtools.e2 e2Var = new com.tencent.mm.sdk.platformtools.e2();
            if (e2Var.i(bArr) != 0) {
                return;
            }
            e2Var.n(4);
            e2Var.n(4);
            e2Var.o();
            e2Var.n(8);
            e2Var.n(4);
            e2Var.o();
            e2Var.o();
            e2Var.n(4);
            e2Var.n(4);
            e2Var.o();
            e2Var.o();
            e2Var.n(4);
            e2Var.n(4);
            this.field_signature = e2Var.g();
            e2Var.o();
            e2Var.o();
            e2Var.o();
            e2Var.n(4);
            e2Var.n(4);
            e2Var.o();
            e2Var.n(4);
            e2Var.o();
            e2Var.o();
            e2Var.n(4);
            e2Var.n(4);
            if (!e2Var.c()) {
                this.field_remarkDesc = e2Var.g();
            }
            this.field_lvbuff = null;
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.AddressUIContact", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    @Override // e95.a
    public java.lang.Object getKey() {
        return this.field_username;
    }

    @Override // e95.a
    public void r(int i17, double d17) {
    }

    @Override // e95.a
    public void s(int i17) {
    }

    @Override // e95.a
    public void v() {
        f();
    }
}
