package mc;

/* loaded from: classes14.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.cloud.huiyan.callback.LoggerInfoCallBack f325535d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f325536e;

    /* renamed from: f, reason: collision with root package name */
    public volatile mc.n f325537f;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.text.SimpleDateFormat f325538g;

    /* renamed from: h, reason: collision with root package name */
    public volatile java.util.Date f325539h;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f325532a = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f325534c = "";

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f325533b = new java.lang.Object();

    public static void c(mc.q qVar) {
        java.util.HashMap hashMap = qVar.f325532a;
        java.lang.String str = "";
        if (hashMap != null && hashMap.size() != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList(qVar.f325532a.entrySet());
            java.util.Collections.sort(arrayList, new mc.o());
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("platform", "Android");
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    jSONObject2.put((java.lang.String) entry.getKey(), entry.getValue());
                }
                jSONObject.put("tips", jSONObject2);
                str = jSONObject.toString();
            } catch (org.json.JSONException e17) {
                mc.p.f325531a.e("LoggerManager", "create json error: " + e17.getLocalizedMessage());
            }
        }
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            qVar.a("tips_counts: " + android.util.Base64.encodeToString(pc.h.a(str), 2));
        } catch (java.lang.Exception e18) {
            e18.getLocalizedMessage();
        }
    }

    public static void d(mc.q qVar, java.lang.String str) {
        qVar.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            mc.p.f325531a.e("LoggerManager", "add tips event with empty!");
            return;
        }
        java.util.HashMap hashMap = qVar.f325532a;
        if (hashMap == null) {
            mc.p.f325531a.e("LoggerManager", "tips save map is null!");
            return;
        }
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, 1);
            return;
        }
        java.lang.Object obj = hashMap.get(str);
        if (obj instanceof java.lang.Integer) {
            hashMap.put(str, java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue() + 1));
        }
    }

    public final void a(java.lang.String str) {
        java.lang.String str2;
        if (this.f325535d == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.tencent.cloud.huiyan.callback.LoggerInfoCallBack loggerInfoCallBack = this.f325535d;
        java.lang.String str3 = this.f325534c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            if (this.f325538g == null) {
                this.f325538g = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            }
            if (this.f325539h == null) {
                this.f325539h = new java.util.Date();
            }
            this.f325539h.setTime(currentTimeMillis);
            str2 = this.f325538g.format(this.f325539h);
        } catch (java.lang.Exception unused) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG);
        sb6.append(this.f325534c);
        sb6.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG);
        sb6.append(str);
        loggerInfoCallBack.onLog(str3, sb6.toString());
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        com.tencent.cloud.component.common.ai.log.AiLog.debug(str, str2);
        if (this.f325535d == null || this.f325537f == null) {
            return;
        }
        android.os.Message obtainMessage = this.f325537f.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = str2;
        this.f325537f.sendMessage(obtainMessage);
    }

    public final void e(java.lang.String str, java.lang.String str2) {
        com.tencent.cloud.component.common.ai.log.AiLog.error(str, str2);
        if (this.f325535d == null || this.f325537f == null) {
            return;
        }
        android.os.Message obtainMessage = this.f325537f.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = str2;
        this.f325537f.sendMessage(obtainMessage);
    }
}
