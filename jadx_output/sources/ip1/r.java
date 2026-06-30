package ip1;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final ip1.r f293608a;

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.o4 f293609b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f293610c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f293611d;

    static {
        ip1.r rVar = new ip1.r();
        f293608a = rVar;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            boolean a17 = gm0.j1.a();
            if (a17 && f293609b == null) {
                f293609b = com.tencent.mm.sdk.platformtools.o4.M(c01.z1.r() + "_audio_panel_mmkv");
            }
            rVar.a();
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarLogicHelper", "initMMKV %s, mmkv: %s, cost: %s", java.lang.Boolean.valueOf(a17), f293609b, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AudioPanelTaskBarLogicHelper", e17, "checkInitMMKV exception", new java.lang.Object[0]);
        }
    }

    public final void a() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = f293609b;
        f293610c = o4Var != null ? o4Var.getBoolean("key_clear_data_flag", false) : false;
        b();
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarLogicHelper", "initDataFromLocal clearDataFlag: " + f293610c + ", showAudioTaskBar: " + f293611d);
    }

    public final void b() {
        if (ip1.e.f293584a.a() && kotlin.jvm.internal.o.b(((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).aj(), java.lang.Boolean.FALSE)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarConfig", "canShowAudioPanel enableRecommend but user close, then not show");
        } else {
            int intValue = ((java.lang.Number) ((jz5.n) ip1.e.f293585b).getValue()).intValue();
            r2 = intValue == 0 || intValue == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarConfig", "canShowAudioPanel config: " + intValue + ", ret: " + r2);
        }
        f293611d = r2;
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarLogicHelper", "updateShowAudioTaskBarConfig expt: " + r2);
    }
}
