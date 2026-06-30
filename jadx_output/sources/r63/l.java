package r63;

/* loaded from: classes14.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final r63.l f393022a = new r63.l();

    /* renamed from: b, reason: collision with root package name */
    public static int f393023b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f393024c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f393025d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f393026e;

    /* renamed from: f, reason: collision with root package name */
    public static int f393027f;

    /* renamed from: g, reason: collision with root package name */
    public static int f393028g;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f393029h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.Boolean f393030i;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.Boolean f393031j;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.Boolean f393032k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f393033l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f393034m;

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.String f393035n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.Map f393036o;

    /* renamed from: p, reason: collision with root package name */
    public static long f393037p;

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.String f393038q;

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.Boolean f393039r;

    /* renamed from: s, reason: collision with root package name */
    public static final jz5.g f393040s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.tencent.mm.plugin.generic.report.finderevent.FinderPageEnterMonitor$screenStateReceiver$1 f393041t;

    /* JADX WARN: Type inference failed for: r0v8, types: [com.tencent.mm.plugin.generic.report.finderevent.FinderPageEnterMonitor$screenStateReceiver$1] */
    static {
        o63.e[] eVarArr = o63.e.f343196d;
        f393023b = 0;
        f393024c = new java.util.LinkedHashMap();
        f393025d = new java.util.LinkedHashMap();
        f393026e = new java.util.LinkedHashSet();
        f393027f = 0;
        f393028g = 0;
        f393029h = "";
        f393034m = new java.util.LinkedHashMap();
        f393035n = "";
        f393036o = new java.util.LinkedHashMap();
        f393040s = jz5.h.b(r63.k.f393021d);
        jz5.h.b(r63.i.f393019d);
        f393041t = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.generic.report.finderevent.FinderPageEnterMonitor$screenStateReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                kotlin.jvm.internal.o.g(context, "context");
                kotlin.jvm.internal.o.g(intent, "intent");
                java.lang.String action = intent.getAction();
                if (action != null) {
                    int hashCode = action.hashCode();
                    if (hashCode == -2128145023) {
                        if (action.equals("android.intent.action.SCREEN_OFF")) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", "ACTION_SCREEN_OFF!");
                        }
                    } else {
                        if (hashCode == -1454123155) {
                            if (action.equals("android.intent.action.SCREEN_ON")) {
                                r63.l lVar = r63.l.f393022a;
                                com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", "ACTION_SCREEN_ON!");
                                return;
                            }
                            return;
                        }
                        if (hashCode == 823795052 && action.equals("android.intent.action.USER_PRESENT")) {
                            r63.l lVar2 = r63.l.f393022a;
                            r63.l.f393037p = android.os.SystemClock.elapsedRealtime();
                            com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", "ACTION_USER_PRESENT，lastUserPresentTime = " + r63.l.f393037p);
                        }
                    }
                }
            }
        };
    }

    public static void c(r63.l lVar, java.lang.String str, int i17, java.lang.Integer num, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            num = null;
        }
        if ((i19 & 8) != 0) {
            i18 = 0;
        }
        lVar.getClass();
        if (num != null) {
            f393027f = num.intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", "floatBallSessionEnterType " + num);
        } else {
            o63.e[] eVarArr = o63.e.f343196d;
            if (i17 == 2 || i17 == 8) {
                f393028g = f393027f;
                f393027f = 1;
            } else if (i17 == 4 || i17 == 5) {
                f393028g = f393027f;
                f393027f = 2;
            } else if (i17 == 6 && f393028g != f393027f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", "fix mSessionEnterSource cur: " + f393027f + " -> " + f393028g);
                f393027f = f393028g;
            }
        }
        lVar.b(i18, i17);
        f393023b = i17;
        f393033l = true;
        f393038q = null;
        f393039r = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderPageEnterMonitor", "enter type " + f393023b + ", mSessionEnterSource type " + f393027f);
        com.tencent.mm.autogen.events.EnterFinderHomeTaskTypeEvent enterFinderHomeTaskTypeEvent = new com.tencent.mm.autogen.events.EnterFinderHomeTaskTypeEvent();
        if (str == null) {
            str = "";
        }
        am.w4 w4Var = enterFinderHomeTaskTypeEvent.f54110g;
        w4Var.f8262a = str;
        w4Var.f8263b = i17;
        w4Var.f8264c = f393027f;
        enterFinderHomeTaskTypeEvent.e();
    }

    public final boolean a(java.lang.String str) {
        return kotlin.jvm.internal.o.b("com.tencent.mm.ui.LauncherUI", str) || kotlin.jvm.internal.o.b("LauncherUI", str);
    }

    public final void b(int i17, int i18) {
        if (i17 == 0) {
            return;
        }
        f393025d.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}
