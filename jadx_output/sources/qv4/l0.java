package qv4;

/* loaded from: classes12.dex */
public final class l0 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qv4.r0 f366996a;

    public l0(qv4.r0 r0Var) {
        this.f366996a = r0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        org.json.JSONObject jSONObject;
        long currentTimeMillis;
        com.tencent.mars.xlog.Log.i("FTS.GlobalTeachViewAdapter", "actionName:" + str + " data:" + obj);
        if (kotlin.jvm.internal.o.b(str, "onPageSettingSwitchChange")) {
            if (obj instanceof org.json.JSONObject) {
                jSONObject = (org.json.JSONObject) obj;
            } else {
                if (obj instanceof java.lang.String) {
                    try {
                        jSONObject = new org.json.JSONObject((java.lang.String) obj);
                    } catch (org.json.JSONException unused) {
                    }
                }
                jSONObject = null;
            }
            if (jSONObject != null) {
                int optInt = jSONObject.optInt("settingType", 0);
                boolean optBoolean = jSONObject.optBoolean("isSwitchOn", false);
                qv4.r0 r0Var = this.f366996a;
                if (optInt != 10) {
                    switch (optInt) {
                        case 1:
                            r0Var.n(optBoolean);
                            break;
                        case 2:
                            r0Var.o(jSONObject.optInt("businessType"), optBoolean);
                            break;
                        case 3:
                            r0Var.l(optBoolean);
                            break;
                        case 4:
                            qv4.r0.d(r0Var, optBoolean);
                            break;
                        case 5:
                            qv4.r0.e(r0Var, optBoolean);
                            break;
                        case 6:
                            r0Var.m(optBoolean);
                            break;
                    }
                } else {
                    rv4.t a17 = r0Var.f367007a.a();
                    boolean z17 = !optBoolean;
                    a17.getClass();
                    com.tencent.mars.xlog.Log.i("FTS.GlobalTeachViewAdapter", "hideVoiceV3Btn visible: " + z17);
                    if (z17) {
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        currentTimeMillis = java.lang.System.currentTimeMillis();
                    } else {
                        currentTimeMillis = 0;
                    }
                    a17.f400554a.put("hideVoiceV3Btn", currentTimeMillis);
                    a17.a();
                    r0Var.f367009c.j();
                }
            }
        }
        return false;
    }
}
