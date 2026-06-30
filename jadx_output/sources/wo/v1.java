package wo;

/* loaded from: classes14.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final wo.u f447821a = new wo.u();

    /* renamed from: b, reason: collision with root package name */
    public static final wo.e f447822b = new wo.e();

    /* renamed from: c, reason: collision with root package name */
    public static final wo.c f447823c = new wo.c();

    /* renamed from: d, reason: collision with root package name */
    public static final wo.o1 f447824d = new wo.o1();

    /* renamed from: e, reason: collision with root package name */
    public static final wo.x1 f447825e = new wo.x1();

    /* renamed from: f, reason: collision with root package name */
    public static final wo.z0 f447826f = new wo.z0();

    /* renamed from: g, reason: collision with root package name */
    public static final wo.h1 f447827g = new wo.h1();

    /* renamed from: h, reason: collision with root package name */
    public static final wo.u1 f447828h = new wo.u1();

    /* renamed from: i, reason: collision with root package name */
    public static final wo.g1 f447829i = new wo.g1();

    /* renamed from: j, reason: collision with root package name */
    public static final wo.g1 f447830j = new wo.g1();

    /* renamed from: k, reason: collision with root package name */
    public static final wo.b f447831k = new wo.b();

    /* renamed from: l, reason: collision with root package name */
    public static int f447832l = -1;

    /* renamed from: m, reason: collision with root package name */
    public static final wo.o f447833m = new wo.o();

    public static void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SrvDeviceInfo", "update deviceInfo %s", str);
        if (str == null || str.length() <= 0 || str.hashCode() == f447832l) {
            return;
        }
        f447832l = str.hashCode();
        wo.u uVar = f447821a;
        uVar.f447803a = false;
        uVar.f447804b = 0;
        uVar.f447805c = 0;
        wo.e eVar = f447822b;
        eVar.a();
        wo.c cVar = f447823c;
        cVar.f();
        wo.o oVar = f447833m;
        oVar.b();
        wo.o1 o1Var = f447824d;
        o1Var.f447770a = 0;
        wo.x1 x1Var = f447825e;
        x1Var.f447866a = false;
        wo.z0 z0Var = f447826f;
        z0Var.f447867a = 0;
        z0Var.f447868b = 0;
        wo.h1 h1Var = f447827g;
        h1Var.f447717a = null;
        wo.u1 u1Var = f447828h;
        u1Var.f447810a = false;
        u1Var.f447811b = 0;
        wo.g1 g1Var = f447829i;
        g1Var.a();
        wo.g1 g1Var2 = f447830j;
        g1Var2.a();
        wo.b bVar = f447831k;
        bVar.f447586a = false;
        bVar.f447587b = "";
        if (new wo.y0().a(str, uVar, eVar, cVar, oVar, o1Var, x1Var, z0Var, h1Var, u1Var, g1Var, bVar, g1Var2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SrvDeviceInfo", "steve: mCameraInfo.mSupportVoipBeauty = " + eVar.I + ", mVoipBeautyWhiteCfg=" + eVar.f447655J);
            new com.tencent.mm.autogen.events.DeviceInfoUpdateEvent().e();
        }
    }
}
