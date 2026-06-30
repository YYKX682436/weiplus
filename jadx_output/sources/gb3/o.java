package gb3;

/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final gb3.o f270035a = new gb3.o();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f270036b = "";

    /* renamed from: c, reason: collision with root package name */
    public static int f270037c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f270038d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f270039e = "";

    /* renamed from: f, reason: collision with root package name */
    public static int f270040f;

    /* renamed from: g, reason: collision with root package name */
    public static int f270041g;

    public final void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyMsgActionReport", "reportData：order_id %s, send_recv: %s  hb_scene:%s cover_id:%s has_open :%s is_valid：%s action：%s", f270036b, java.lang.Integer.valueOf(f270037c), f270038d, f270039e, java.lang.Integer.valueOf(f270040f), java.lang.Integer.valueOf(f270041g), java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28839, f270036b, java.lang.Integer.valueOf(f270037c), f270038d, f270039e, java.lang.Integer.valueOf(f270040f), java.lang.Integer.valueOf(f270041g), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }
}
