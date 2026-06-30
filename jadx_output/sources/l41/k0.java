package l41;

/* loaded from: classes10.dex */
public final class k0 {
    public k0(kotlin.jvm.internal.i iVar) {
    }

    public static java.lang.String a(l41.k0 k0Var, java.lang.Long l17, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.lang.Long l18, java.lang.Integer num5, java.lang.Integer num6, java.lang.Integer num7, java.lang.Long l19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = null;
        }
        if ((i17 & 2) != 0) {
            num = null;
        }
        if ((i17 & 4) != 0) {
            num2 = null;
        }
        if ((i17 & 8) != 0) {
            num3 = null;
        }
        if ((i17 & 16) != 0) {
            num4 = null;
        }
        if ((i17 & 32) != 0) {
            l18 = null;
        }
        if ((i17 & 64) != 0) {
            num5 = null;
        }
        if ((i17 & 128) != 0) {
            num6 = null;
        }
        if ((i17 & 256) != 0) {
            num7 = null;
        }
        if ((i17 & 512) != 0) {
            l19 = null;
        }
        k0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (l17 != null) {
            jSONObject.put("cost", l17.longValue());
        }
        if (num != null) {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, num.intValue());
        }
        if (num2 != null) {
            jSONObject.put("kefu_type", num2.intValue());
        }
        if (num3 != null) {
            jSONObject.put("groupid", num3.intValue());
        }
        if (num4 != null) {
            jSONObject.put("phase2_groupid", num4.intValue());
        }
        if (l18 != null) {
            jSONObject.put("timeStamp", l18.longValue());
        }
        if (num5 != null) {
            jSONObject.put("direct_enter", num5.intValue());
        }
        if (num6 != null) {
            jSONObject.put("ignore_product", num6.intValue());
        }
        if (num7 != null) {
            jSONObject.put("has_user_confirm", num7.intValue());
        }
        if (l19 != null) {
            jSONObject.put("business_cost", l19.longValue());
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
