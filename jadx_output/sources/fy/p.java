package fy;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final fy.p f267177d = new fy.p();

    public p() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        int i17;
        org.json.JSONObject param = (org.json.JSONObject) obj;
        yz5.l onComplete = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        try {
            str = param.getString("contact_id");
        } catch (java.lang.Exception unused) {
            str = "";
        }
        try {
            i17 = param.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        } catch (java.lang.Exception unused2) {
            i17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCall", "ask_confirm_call invoke param: " + str + ' ' + i17);
        kotlin.jvm.internal.o.d(str);
        if (str.length() == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.SUCCESS, false);
            jSONObject.put("error_message", "contact_id is required");
            onComplete.invoke(jSONObject);
        } else if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().j0(str)) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(ya.b.SUCCESS, true);
            onComplete.invoke(jSONObject2);
        } else {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(ya.b.SUCCESS, false);
            jSONObject3.put("error_message", "contact not found");
            onComplete.invoke(jSONObject3);
        }
        return jz5.f0.f302826a;
    }
}
