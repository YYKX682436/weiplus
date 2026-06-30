package f65;

/* loaded from: classes14.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final f65.o f259912a = new f65.o();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f259913b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f259914c = "";

    /* renamed from: d, reason: collision with root package name */
    public static int f259915d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f259916e = "";

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f259917f = "";

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f259918g = "";

    /* renamed from: h, reason: collision with root package name */
    public static int f259919h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f259920i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f259921j = "";

    /* renamed from: k, reason: collision with root package name */
    public static int f259922k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static int f259923l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static int f259924m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static long f259925n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static int f259926o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static int f259927p;

    /* renamed from: q, reason: collision with root package name */
    public static int f259928q;

    /* renamed from: r, reason: collision with root package name */
    public static int f259929r;

    /* renamed from: s, reason: collision with root package name */
    public static long f259930s;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f259931t;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f259932u;

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReporter", "clear search >> " + f259917f);
        f259917f = "";
        f259923l = 0;
        f259918g = "";
        f259922k = 0;
        f259930s = 0L;
        f259924m = 0;
        f259921j = "";
    }

    public final void b(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgActionLogStruct intelligentMsgActionLogStruct = new com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgActionLogStruct();
        intelligentMsgActionLogStruct.f58525s = intelligentMsgActionLogStruct.b("Username", f259913b, true);
        intelligentMsgActionLogStruct.f58510d = intelligentMsgActionLogStruct.b("sessionid", f259914c, true);
        intelligentMsgActionLogStruct.f58512f = i17;
        if (i17 == 1) {
            intelligentMsgActionLogStruct.f58513g = f259915d;
            intelligentMsgActionLogStruct.f58516j = intelligentMsgActionLogStruct.b("ExpoQuery", f259916e, true);
            intelligentMsgActionLogStruct.f58526t = f259919h;
        } else if (i17 == 2) {
            intelligentMsgActionLogStruct.f58529w = f259929r;
        } else if (i17 == 4) {
            intelligentMsgActionLogStruct.p(f259918g);
            intelligentMsgActionLogStruct.f58524r = f259920i;
            intelligentMsgActionLogStruct.f58528v = f259928q;
            intelligentMsgActionLogStruct.f58518l = 3L;
            f259922k = 3;
            c(52);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReporter", "externalReport >> action: " + intelligentMsgActionLogStruct.f58512f);
        intelligentMsgActionLogStruct.k();
    }

    public final void c(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgActionLogStruct intelligentMsgActionLogStruct = new com.tencent.mm.autogen.mmdata.rpt.IntelligentMsgActionLogStruct();
        intelligentMsgActionLogStruct.f58525s = intelligentMsgActionLogStruct.b("Username", f259913b, true);
        intelligentMsgActionLogStruct.f58510d = intelligentMsgActionLogStruct.b("sessionid", f259914c, true);
        if ((f259917f.length() == 0) && i17 != 51) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReporter", "action: " + i17 + ", searchSessionId is empty, no report");
            return;
        }
        intelligentMsgActionLogStruct.f58511e = intelligentMsgActionLogStruct.b("searchsessionid", f259917f, true);
        intelligentMsgActionLogStruct.f58524r = f259920i;
        intelligentMsgActionLogStruct.f58528v = f259928q;
        intelligentMsgActionLogStruct.f58512f = i17;
        if (i17 != 5) {
            switch (i17) {
                case 51:
                    if (!f259931t) {
                        f259931t = true;
                        break;
                    } else {
                        return;
                    }
                case 52:
                    intelligentMsgActionLogStruct.p(f259918g);
                    intelligentMsgActionLogStruct.f58514h = intelligentMsgActionLogStruct.b("PrintQuery", f259921j, true);
                    intelligentMsgActionLogStruct.f58518l = f259922k;
                    break;
                case 53:
                    intelligentMsgActionLogStruct.p(f259918g);
                    break;
                case 54:
                    intelligentMsgActionLogStruct.p(f259918g);
                    intelligentMsgActionLogStruct.f58522p = f259926o;
                    break;
                case 55:
                    intelligentMsgActionLogStruct.p(f259918g);
                    intelligentMsgActionLogStruct.f58520n = f259924m;
                    break;
                case 56:
                    if (f259923l != 0) {
                        intelligentMsgActionLogStruct.p(f259918g);
                        intelligentMsgActionLogStruct.f58519m = f259923l;
                        intelligentMsgActionLogStruct.f58520n = f259924m;
                        intelligentMsgActionLogStruct.f58523q = java.lang.System.currentTimeMillis() - f259930s;
                        a();
                        break;
                    } else {
                        return;
                    }
                case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
                    if (f259923l <= 0) {
                        intelligentMsgActionLogStruct.p(f259918g);
                        intelligentMsgActionLogStruct.f58519m = f259923l;
                        intelligentMsgActionLogStruct.f58523q = java.lang.System.currentTimeMillis() - f259930s;
                        a();
                        break;
                    } else {
                        return;
                    }
            }
        } else {
            intelligentMsgActionLogStruct.f58521o = f259925n;
            intelligentMsgActionLogStruct.f58522p = f259926o;
            intelligentMsgActionLogStruct.p(f259918g);
            intelligentMsgActionLogStruct.f58527u = f259927p;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReporter", "internalReport >> action: " + intelligentMsgActionLogStruct.f58512f);
        intelligentMsgActionLogStruct.k();
    }

    public final void d(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReporter", "setSearchPeopleImageCnt >> " + i17 + ' ' + f259917f);
        if (f259917f.length() == 0) {
            return;
        }
        f259924m = i17;
    }

    public final void e(java.lang.String queryText) {
        kotlin.jvm.internal.o.g(queryText, "queryText");
        f259918g = r26.i0.t(queryText, ",", " ", false);
    }

    public final void f() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        f259930s = currentTimeMillis;
        f259924m = 0;
        f259923l = 0;
        f259932u = false;
        f259917f = java.lang.String.valueOf(currentTimeMillis);
        f259922k = 0;
    }
}
