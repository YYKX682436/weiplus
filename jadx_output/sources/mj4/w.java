package mj4;

/* loaded from: classes9.dex */
public final class w extends rj4.h {
    public static final l75.e0 Q = rj4.h.initAutoDBInfo(rj4.h.class);
    public pj4.b0 P;

    @Override // rj4.h, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 _dbInfo = Q;
        kotlin.jvm.internal.o.f(_dbInfo, "_dbInfo");
        return _dbInfo;
    }

    public final pj4.b0 t0() {
        java.lang.String str = this.field_textStatusExtInfo;
        boolean z17 = true;
        if (str != null && str.hashCode() == 0) {
            return this.P;
        }
        java.lang.String str2 = this.field_textStatusExtInfo;
        if (str2 != null && !r26.n0.N(str2)) {
            z17 = false;
        }
        if (z17) {
            return null;
        }
        pj4.b0 b0Var = new pj4.b0();
        try {
            b0Var.parseFrom(android.util.Base64.decode(str2, 0));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatus.TextStatusStrangerContact", th6, "getStatus err", new java.lang.Object[0]);
        }
        this.P = b0Var;
        return b0Var;
    }
}
