package xp3;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static long f455930b = 1200000;

    /* renamed from: c, reason: collision with root package name */
    public static final xp3.o f455931c = new xp3.o();

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f455932d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public static final xp3.n f455933e = new xp3.n(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Runnable f455934f = new xp3.l(null);

    /* renamed from: a, reason: collision with root package name */
    public boolean f455935a = false;

    public static boolean b(float f17) {
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_process_hard_info, "", true);
        if (android.text.TextUtils.isEmpty(Zi)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ProcessElf", "[checkHardOpen] json is Empty! just pass!");
        } else {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONObject(Zi).getJSONArray("hard-open");
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                    java.lang.String string = jSONObject.getString("device-brand");
                    java.lang.String string2 = jSONObject.getString("device-model");
                    int i18 = jSONObject.getInt("sdk-version");
                    java.lang.String str = android.os.Build.BRAND + " " + wo.w0.m();
                    int i19 = android.os.Build.VERSION.SDK_INT;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ProcessElf", "[checkHardOpen] name:%s model:%s version:%s | %s %s ", string, string2, java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i19));
                    if (i18 <= i19 && str.contains(string) && str.contains(string2)) {
                        return true;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ProcessElf", e17, "", new java.lang.Object[0]);
            }
        }
        int nextInt = new java.util.Random().nextInt(10000);
        boolean z17 = 10000.0f * f17 > ((float) nextInt);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessElf", "[checkHardOpen] rand:%s test:%s isEnable:%s", java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(nextInt), java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public void a() {
        try {
            this.f455935a = b(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_process_enable, 0) / 10000.0f);
            f455930b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_process_check_time, 1200000L);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ProcessElf", e17, "", new java.lang.Object[0]);
            f455930b = 1200000L;
            this.f455935a = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessElf", "[call] isEnable:%b CHECK_TIME:%s", java.lang.Boolean.valueOf(this.f455935a), java.lang.Long.valueOf(f455930b));
        if (this.f455935a) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = f455932d;
            java.lang.Runnable runnable = f455934f;
            n3Var.removeCallbacks(runnable);
            n3Var.postDelayed(runnable, f455930b);
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("ACTION_ELF_CHECK_RESPONSE");
        intentFilter.addAction("com.tencent.mm.MMUIModeManager");
        boolean a17 = fp.h.a(33);
        xp3.n nVar = f455933e;
        if (a17) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(nVar, intentFilter);
        } else {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(nVar, intentFilter, 2);
        }
    }
}
