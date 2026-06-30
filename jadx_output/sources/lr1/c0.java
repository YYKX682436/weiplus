package lr1;

/* loaded from: classes8.dex */
public final class c0 {

    /* renamed from: d, reason: collision with root package name */
    public static long f320646d;

    /* renamed from: a, reason: collision with root package name */
    public static final lr1.c0 f320643a = new lr1.c0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f320644b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final r01.a3 f320645c = new r01.a3(300000);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Queue f320647e = new java.util.LinkedList();

    public final void a(java.util.LinkedList items, int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        kotlin.jvm.internal.o.g(items, "items");
        if (com.tencent.mm.sdk.platformtools.t8.L0(items)) {
            return;
        }
        r45.fj fjVar = new r45.fj();
        int min = java.lang.Math.min(com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.MPDataLogic").o("BizAppMsgRelatedInfoRefreshIntervalSec", 300), 86400);
        int i18 = min > 0 ? min : 300;
        r01.a3 a3Var = f320645c;
        a3Var.f368021a = i18 * 1000;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = items.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            concurrentHashMap = f320644b;
            if (!hasNext) {
                break;
            }
            java.lang.Object next = it.next();
            if (!concurrentHashMap.contains(((r45.u9) next).f387146d)) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.Object next2 = it6.next();
            java.lang.String str = ((r45.u9) next2).f387146d;
            kotlin.jvm.internal.o.d(str);
            if (true ^ a3Var.b(str)) {
                arrayList2.add(next2);
            }
        }
        java.util.List K0 = kz5.n0.K0(arrayList2, java.lang.Math.max(com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.MPDataLogic").o("BizAppMsgRelatedInfoMaxUrlCount", 10), 2));
        java.util.LinkedList<r45.u9> linkedList = fjVar.f374391d;
        linkedList.addAll(K0);
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MPDataLogic", "getAppMsgRelatedInfo size=" + linkedList.size());
        fjVar.f374392e = i17;
        for (r45.u9 u9Var : linkedList) {
            concurrentHashMap.put(u9Var.f387146d, 1);
            java.lang.String ClientId = u9Var.f387146d;
            kotlin.jvm.internal.o.f(ClientId, "ClientId");
            a3Var.a(ClientId);
            com.tencent.mars.xlog.Log.getLogLevel();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = fjVar;
        lVar.f70665b = new r45.gj();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/timeline/bizappmsgrelatedinfo";
        lVar.f70667d = 2864;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new lr1.b0(fjVar, i17));
    }

    public final java.lang.String b(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return "_mpdata_" + com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.n(url);
    }

    public final boolean c(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.String[] strArr = {"__biz", "mid", "idx"};
        for (int i17 = 0; i17 < 3; i17++) {
            if (hy4.i.f(url, strArr[i17]) == null) {
                return true;
            }
        }
        return false;
    }
}
