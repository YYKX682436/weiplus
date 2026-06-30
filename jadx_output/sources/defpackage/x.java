package defpackage;

/* loaded from: classes10.dex */
public final class x {
    public x(kotlin.jvm.internal.i iVar) {
    }

    public final defpackage.y a() {
        d95.b0 b0Var = new d95.b0();
        java.lang.String str = gm0.j1.u().h() + "UniComment.db";
        defpackage.x xVar = defpackage.y.f458297f;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(java.lang.Integer.valueOf(defpackage.y.f458299h.hashCode()), defpackage.w.f441808a);
        if (b0Var.S(str, hashMap, true, true)) {
            return new defpackage.y(b0Var);
        }
        throw new com.tencent.wcdb.database.SQLiteException("db init failed");
    }
}
