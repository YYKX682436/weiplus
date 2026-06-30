package fy;

/* loaded from: classes9.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final fy.l f267173d = new fy.l();

    public l() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        org.json.JSONObject param = (org.json.JSONObject) obj;
        yz5.l onComplete = (yz5.l) obj2;
        java.lang.String str2 = "";
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCall", "send_text_message invoke");
        try {
            str = param.getString("chat_id");
        } catch (java.lang.Exception unused) {
            str = "";
        }
        try {
            str2 = param.getString("content");
        } catch (java.lang.Exception unused2) {
        }
        kotlin.jvm.internal.o.d(str);
        if (str.length() == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.SUCCESS, false);
            jSONObject.put("error_message", "chat_id is required");
            onComplete.invoke(jSONObject);
        } else {
            kotlin.jvm.internal.o.d(str2);
            if (str2.length() == 0) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(ya.b.SUCCESS, false);
                jSONObject2.put("error_message", "content is required");
                onComplete.invoke(jSONObject2);
            } else {
                w11.r1 b17 = w11.s1.b(str, null, 2, null);
                b17.f442130e = 1;
                b17.f442131f = 0;
                b17.e(str2);
                b17.g(str);
                b17.f442133h = null;
                b17.f442140o = null;
                b17.f442134i = 5;
                if (b17.a().a()) {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put(ya.b.SUCCESS, true);
                    onComplete.invoke(jSONObject3);
                } else {
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    jSONObject4.put(ya.b.SUCCESS, false);
                    jSONObject4.put("error_message", "send message failed");
                    onComplete.invoke(jSONObject4);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
