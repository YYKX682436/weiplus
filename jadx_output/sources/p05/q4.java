package p05;

/* loaded from: classes14.dex */
public final class q4 {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.q4 f350661a = new p05.q4();

    /* renamed from: b, reason: collision with root package name */
    public static int f350662b = 65;

    /* renamed from: c, reason: collision with root package name */
    public static int f350663c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f350664d = 60;

    /* renamed from: e, reason: collision with root package name */
    public static int f350665e = 100;

    /* renamed from: f, reason: collision with root package name */
    public static int f350666f = 30;

    /* renamed from: g, reason: collision with root package name */
    public static int f350667g;

    /* renamed from: h, reason: collision with root package name */
    public static int f350668h;

    /* renamed from: i, reason: collision with root package name */
    public static yz5.p f350669i;

    static {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("xlab_effect_config");
        com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffectConfig", "config is : " + f350662b + ", " + f350663c + ", " + f350664d + ", " + f350665e + ", " + f350666f);
        f350667g = M.getInt("start_count", f350667g);
        f350668h = M.getInt("end_count", f350668h);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("count track is : ");
        sb6.append(f350667g);
        sb6.append(", ");
        sb6.append(f350668h);
        com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffectConfig", sb6.toString());
    }

    public final void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.XLabEffectConfig", "setConfig: " + i17 + ", " + i18);
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("xlab_effect_config");
        if (i17 == 0) {
            f350662b = i18;
            M.putInt("skin_smooth", i18);
        } else if (i17 == 1) {
            f350663c = i18;
            M.putInt("eye_morph", i18);
        } else if (i17 == 2) {
            f350664d = i18;
            M.putInt("face_morph", i18);
        } else if (i17 == 3) {
            f350665e = i18;
            M.putInt("skin_bright", i18);
        } else if (i17 == 4) {
            f350666f = i18;
            M.putInt("eye_bright", i18);
        }
        yz5.p pVar = f350669i;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }
}
