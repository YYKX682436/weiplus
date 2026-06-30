package mj4;

/* loaded from: classes11.dex */
public final class l extends rj4.e {
    public static final l75.e0 W = rj4.e.initAutoDBInfo(rj4.e.class);
    public java.lang.String V = "";

    @Override // rj4.e, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 _dbInfo = W;
        kotlin.jvm.internal.o.f(_dbInfo, "_dbInfo");
        return _dbInfo;
    }

    public final java.lang.String getUserName() {
        if (this.V.length() > 0) {
            return this.V;
        }
        if (kotlin.jvm.internal.o.b(this.field_HashUserName, bk4.k1.a())) {
            java.lang.String field_HashUserName = this.field_HashUserName;
            kotlin.jvm.internal.o.f(field_HashUserName, "field_HashUserName");
            return field_HashUserName;
        }
        java.lang.String str = this.field_HashUserName;
        if (str == null || str.length() == 0) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.TextStatusUtils", "getUserNameByHash: failed", new java.lang.Object[0]);
            return "";
        }
        com.tencent.mm.storage.z3 wi6 = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).wi(str, 1);
        java.lang.String d17 = wi6 != null ? wi6.d1() : "";
        return d17 == null ? "" : d17;
    }
}
