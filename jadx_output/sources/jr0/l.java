package jr0;

/* loaded from: classes12.dex */
public class l extends qi.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f301333a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Long f301334b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f301335c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f301336d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Long f301337e;

    /* renamed from: f, reason: collision with root package name */
    public final ri.h0 f301338f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f301339g;

    /* renamed from: h, reason: collision with root package name */
    public jr0.j f301340h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f301341i;

    public l(android.content.Context context, java.lang.Long l17, java.lang.String str, java.lang.Boolean bool, java.lang.Long l18) {
        super(context);
        this.f301338f = new ri.h0();
        this.f301339g = new java.util.concurrent.ConcurrentHashMap();
        new java.util.concurrent.ConcurrentLinkedQueue();
        this.f301341i = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f301333a = context;
        this.f301334b = l17;
        this.f301335c = str;
        this.f301336d = bool.booleanValue();
        this.f301337e = l18;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.matrix.e0.f68710a;
        intentFilter.addAction("ENABLE_FPS");
        intentFilter.addAction("MODIFY_EVIL_THRESHOLD");
        intentFilter.addAction("ENABLE_METHOD_BEAT");
        intentFilter.addAction("ENABLE_ANR");
        intentFilter.addAction("ENABLE_START_UP");
        intentFilter.addAction("ENABLE_EVIL_METHOD");
        intentFilter.addAction("ENABLE_FPS_FLOAT");
        intentFilter.addAction("ENABLE_DEV_LOG");
        com.tencent.mm.matrix.strategy.MatrixStrategyNotifyBroadcast matrixStrategyNotifyBroadcast = new com.tencent.mm.matrix.strategy.MatrixStrategyNotifyBroadcast();
        try {
            if (fp.h.a(33)) {
                context.registerReceiver(matrixStrategyNotifyBroadcast, intentFilter, com.tencent.mm.matrix.strategy.MatrixStrategyNotifyBroadcast.f68844a, null);
            } else {
                context.registerReceiver(matrixStrategyNotifyBroadcast, intentFilter, com.tencent.mm.matrix.strategy.MatrixStrategyNotifyBroadcast.f68844a, null, 4);
            }
        } catch (java.lang.Throwable unused) {
            context.unregisterReceiver(matrixStrategyNotifyBroadcast);
            if (fp.h.a(33)) {
                context.registerReceiver(matrixStrategyNotifyBroadcast, intentFilter, com.tencent.mm.matrix.strategy.MatrixStrategyNotifyBroadcast.f68844a, null);
            } else {
                context.registerReceiver(matrixStrategyNotifyBroadcast, intentFilter, com.tencent.mm.matrix.strategy.MatrixStrategyNotifyBroadcast.f68844a, null, 4);
            }
        }
    }

    @Override // qi.a, qi.c
    public void a(ri.d0 d0Var) {
        jr0.i iVar = new jr0.i();
        iVar.f395862d = d0Var.f395862d;
        iVar.f395860b = d0Var.f395860b;
        qi.b bVar = d0Var.f395863e;
        iVar.f395863e = bVar;
        iVar.f395861c = d0Var.f395861c;
        iVar.f395859a = d0Var.f395859a;
        if (bVar instanceof dj.b) {
            java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f301341i;
            concurrentLinkedDeque.addFirst(iVar);
            if (concurrentLinkedDeque.size() >= 30) {
                concurrentLinkedDeque.removeLast();
            }
        }
        try {
            jr0.j jVar = this.f301340h;
            if (jVar != null && ((jr0.h) jVar).a(iVar)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MatrixReporter", "[reportJson] pass this report! tag=%s", iVar.f395860b);
                return;
            }
            jr0.k kVar = (jr0.k) this.f301339g.get(iVar.f395863e);
            if (kVar != null) {
                kVar.a(iVar);
            }
            try {
                if (com.tencent.mm.sdk.platformtools.x2.n()) {
                    e(iVar, null);
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("action.matrix.deprecated-report");
                intent.putExtra("tag", iVar.f395860b);
                intent.putExtra("key", iVar.f395861c);
                intent.putExtra("type", iVar.f395859a);
                intent.putExtra("value", iVar.f395862d.toString());
                intent.putExtra(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, (java.lang.String) null);
                oj.j.c("MicroMsg.MatrixReporter", "Matrix report with broadcast tag:%s", iVar.f395860b);
                this.f301333a.sendBroadcast(intent);
            } catch (java.lang.Throwable th6) {
                oj.j.b("MicroMsg.MatrixReporter", "Matrix report occur error:" + th6, new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MatrixReporter", e17, "", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x05fc A[Catch: Exception -> 0x0632, TryCatch #3 {Exception -> 0x0632, blocks: (B:41:0x05fc, B:43:0x0606, B:45:0x060f, B:49:0x0618, B:87:0x0461, B:89:0x0486, B:90:0x0489, B:92:0x04a6, B:93:0x04c2, B:95:0x04df, B:96:0x04fb, B:98:0x0518, B:99:0x0534, B:101:0x0551, B:102:0x056d, B:104:0x058a, B:105:0x05a6, B:182:0x05b7, B:184:0x05c2, B:186:0x05e4), top: B:17:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(ri.d0 r42, java.lang.String r43) {
        /*
            Method dump skipped, instructions count: 1613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jr0.l.e(ri.d0, java.lang.String):void");
    }

    public java.lang.String toString() {
        return "clientVersion=" + this.f301334b + " revision=" + this.f301335c + " isDebug=" + this.f301336d + " publishType" + this.f301337e;
    }
}
