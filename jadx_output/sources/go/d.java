package go;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static int f273699d;

    /* renamed from: i, reason: collision with root package name */
    public static long f273704i;

    /* renamed from: a, reason: collision with root package name */
    public static final go.d f273696a = new go.d();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f273697b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f273698c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f273700e = "";

    /* renamed from: f, reason: collision with root package name */
    public static yz5.l f273701f = go.a.f273693d;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.ArrayList f273702g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f273703h = jz5.h.b(go.b.f273694d);

    public final int a(android.content.Context context, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        int c17 = c(f273700e);
        if (c17 != 1) {
            if (c17 != 2) {
                return c17;
            }
            f273699d = 0;
            e().A(f273700e, 0);
            return 0;
        }
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211779f = false;
        e4Var.d(com.tencent.mm.R.string.nfg);
        e4Var.c();
        f273704i = msgInfo.getMsgId();
        f(msgInfo);
        e().A(f273700e, 2);
        int o17 = e().o("enable_times", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoTranslationCache", "buttonClick() auto translation enable times: " + o17);
        if (o17 == 0 || o17 == 1) {
            e().A("enable_times", o17 + 1);
        } else if (o17 == 2) {
            e().A("enable_times", o17 + 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.AutoTranslationCache", "buttonClick() auto translation insert system tips after: [" + msgInfo.j() + "](" + msgInfo.getMsgId() + ')');
            java.lang.String Q0 = msgInfo.Q0();
            long msgId = msgInfo.getMsgId();
            com.tencent.mars.xlog.Log.i("MicroMsg.AutoTranslationSysTipHelper", "insertSysTip talkerMap:" + Q0 + ", msgId:" + msgId);
            pm0.v.K(null, new go.f(new com.tencent.mm.storage.f9(), Q0, msgId));
        }
        return 2;
    }

    public final void b(boolean z17, long j17) {
        if (z17) {
            return;
        }
        if (!(f273700e.length() == 0) && c(f273700e) == 0) {
            int i17 = f273699d + 1;
            if (i17 <= 3) {
                f273702g.add(java.lang.Long.valueOf(j17));
            }
            if (i17 >= 3) {
                e().A(f273700e, 1);
            }
            f273699d = i17;
        }
    }

    public final int c(java.lang.String talker) {
        kotlin.jvm.internal.o.g(talker, "talker");
        if (e().i("enable_globally", false)) {
            return 2;
        }
        return e().o(talker, 0);
    }

    public final int d(java.lang.String talker, long j17) {
        java.lang.Long l17;
        boolean z17;
        kotlin.jvm.internal.o.g(talker, "talker");
        if (!e().i("enable_globally", false) && (l17 = (java.lang.Long) f273697b.get(talker)) != null && l17.longValue() == j17) {
            java.util.Iterator it = f273702g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                if (((java.lang.Number) it.next()).longValue() == j17) {
                    z17 = true;
                    break;
                }
            }
            if (!z17) {
                return c(talker);
            }
        }
        return 0;
    }

    public final com.tencent.mm.sdk.platformtools.o4 e() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f273703h).getValue();
    }

    public final void f(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        f273701f.invoke(msgInfo);
        f273698c.put(java.lang.Long.valueOf(msgInfo.getMsgId()), java.lang.Boolean.TRUE);
        java.lang.String talker = f273700e;
        long createTime = msgInfo.getCreateTime();
        kotlin.jvm.internal.o.g(talker, "talker");
        if (createTime > e().q(talker.concat("@last_translation"), 0L)) {
            e().B(f273700e + "@last_translation", createTime);
        }
    }
}
