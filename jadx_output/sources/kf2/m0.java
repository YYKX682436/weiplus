package kf2;

/* loaded from: classes.dex */
public final class m0 extends kf2.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(df2.k controller, com.tencent.mm.plugin.lite.s liteAppStore) {
        super(controller, liteAppStore);
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(liteAppStore, "liteAppStore");
    }

    @Override // kf2.x
    public boolean d(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        java.lang.Boolean bool = null;
        try {
            org.json.JSONObject jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
            if (jSONObject == null) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
                jSONObject = new org.json.JSONObject((java.lang.String) obj);
            }
            bool = java.lang.Boolean.valueOf(jSONObject.getBoolean("mute"));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("GamePendantLiteAppApi", th6, "", new java.lang.Object[0]);
        }
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            df2.k kVar = this.f307311a;
            ((mm2.c1) kVar.business(mm2.c1.class)).n9(booleanValue);
            if (booleanValue) {
                tn0.w0 Q6 = kVar.Q6();
                if (Q6 != null) {
                    Q6.e0(true);
                }
            } else {
                tn0.w0 Q62 = kVar.Q6();
                if (Q62 != null) {
                    Q62.e0(false);
                }
            }
        }
        return false;
    }

    @Override // kf2.x
    public java.lang.String e() {
        return "setMicMute";
    }
}
