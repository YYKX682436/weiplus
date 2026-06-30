package fy;

/* loaded from: classes8.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final fy.q f267178d = new fy.q();

    public q() {
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
            str = param.getString("chat_id");
        } catch (java.lang.Exception unused) {
            str = "";
        }
        try {
            i17 = param.getInt("voip_scene");
        } catch (java.lang.Exception unused2) {
            i17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCall", "make_voice_call invoke param: " + str + ' ' + i17);
        kotlin.jvm.internal.o.d(str);
        if (str.length() == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.SUCCESS, false);
            jSONObject.put("error_message", "chat_id is required");
            onComplete.invoke(jSONObject);
        } else {
            com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
            am.y00 y00Var = voipEvent.f54945g;
            y00Var.f8415b = 5;
            y00Var.f8418e = str;
            y00Var.f8417d = com.tencent.mm.sdk.platformtools.x2.f193071a;
            y00Var.f8419f = i17 == 0 ? 4 : 2;
            voipEvent.e();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(ya.b.SUCCESS, true);
            onComplete.invoke(jSONObject2);
        }
        return jz5.f0.f302826a;
    }
}
