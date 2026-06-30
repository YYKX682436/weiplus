package i04;

/* loaded from: classes8.dex */
public final class e {
    public e(kotlin.jvm.internal.i iVar) {
    }

    public final i04.f a(org.json.JSONObject json, j04.f fVar) {
        kotlin.jvm.internal.o.g(json, "json");
        java.lang.String string = json.getString(dm.i4.COL_ID);
        int i17 = json.getInt("i");
        java.lang.String string2 = json.getString("cb");
        long j17 = json.getLong("t");
        boolean z17 = json.getBoolean("o");
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MTimer", e17, "getKV error", new java.lang.Object[0]);
        }
        if (fVar != null) {
            kotlin.jvm.internal.o.d(string);
            return new i04.f(string, i17, fVar, j17, z17);
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MTimer", "%s, newTask not offline type", json.toString());
            return null;
        }
        java.lang.Object newInstance = java.lang.Class.forName(string2).newInstance();
        if (newInstance != null && (newInstance instanceof j04.f)) {
            kotlin.jvm.internal.o.d(string);
            return new i04.f(string, i17, (j04.f) newInstance, j17, z17);
        }
        return null;
    }
}
