package jv2;

/* loaded from: classes10.dex */
public final class g {
    public g(kotlin.jvm.internal.i iVar) {
    }

    public final jv2.h a() {
        d95.b0 b0Var = new d95.b0();
        java.lang.String str = gm0.j1.u().h() + "UniComment.db";
        jv2.g gVar = jv2.h.f302217f;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(java.lang.Integer.valueOf(jv2.h.f302219h.hashCode()), jv2.f.f302216a);
        if (b0Var.S(str, hashMap, true, true)) {
            return new jv2.h(b0Var);
        }
        throw new com.tencent.wcdb.database.SQLiteException("db init failed");
    }
}
