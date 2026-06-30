package com.tencent.mm.plugin.lite.logic;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public final class j2 implements com.tencent.mm.ipcinvoker.j {
    private j2() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("shortAppId");
        java.lang.String string2 = bundle.getString("type");
        java.lang.String string3 = bundle.getString("param");
        long j17 = bundle.getLong("timeout");
        if (j17 <= 0) {
            j17 = 20000;
        }
        bundle.getInt("from");
        bundle.getBoolean("syncCheckUpdate");
        com.tencent.mm.plugin.lite.logic.g1.s().p();
        if (!string2.equals("game")) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
            return;
        }
        kh0.g gVar = (kh0.g) i95.n0.c(kh0.g.class);
        com.tencent.mm.plugin.lite.logic.i2 i2Var = new com.tencent.mm.plugin.lite.logic.i2(this, rVar);
        jh0.v vVar = (jh0.v) gVar;
        vVar.getClass();
        vz4.d0.b(string3, string, j17 / 1000, true, new jh0.u(vVar, i2Var));
    }
}
