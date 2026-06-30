package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class s1 extends dm.l1 {
    public static final l75.e0 W1 = dm.l1.initAutoDBInfo(com.tencent.mm.storage.s1.class);
    public r45.sj6 U1 = null;
    public com.tencent.mm.storage.c1 V1 = null;

    public boolean A0() {
        return this.field_type == 620757041;
    }

    public boolean D0() {
        int i17 = this.field_type;
        return i17 == 1 || i17 == 11 || i17 == 21 || i17 == 31 || i17 == 36 || i17 == 1107296305;
    }

    @Override // dm.l1, l75.f0
    public l75.e0 getDBInfo() {
        return W1;
    }

    public com.tencent.mm.storage.c1 t0() {
        com.tencent.mm.storage.c1 c1Var = this.V1;
        if (c1Var != null) {
            return c1Var;
        }
        com.tencent.mm.storage.c1 a17 = eq1.z.f255876a.a(this.field_content);
        this.V1 = a17;
        return a17;
    }

    public r45.sj6 u0() {
        if (!A0()) {
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.M0(this.N) && com.tencent.mm.sdk.platformtools.t8.K0(this.field_content)) {
            return null;
        }
        r45.sj6 sj6Var = this.U1;
        if (sj6Var != null) {
            return sj6Var;
        }
        this.U1 = new r45.sj6();
        boolean z17 = false;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.field_content)) {
            try {
                this.U1.parseFrom(android.util.Base64.decode(this.field_content, 0));
                z17 = true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfo", "[TRACE_BIZRECCARD] getTLRecCard parseFrom content ex %s", e17.getMessage());
            }
        }
        if (!z17) {
            try {
                this.U1.parseFrom(this.N);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineInfo", "getTLRecCard parseFrom ex %s", e18.getMessage());
                this.U1 = null;
            }
        }
        return this.U1;
    }

    public boolean v0() {
        return this.field_type == 285212721;
    }

    public boolean w0() {
        return this.field_type == 318767153;
    }

    public boolean y0() {
        int i17 = this.field_type;
        return i17 == 3 || i17 == 13 || i17 == 23 || i17 == 33 || i17 == 39;
    }

    public boolean z0() {
        return this.field_type == 10100;
    }
}
