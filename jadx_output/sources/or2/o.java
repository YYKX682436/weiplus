package or2;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final or2.o f347664a = new or2.o();

    /* renamed from: b, reason: collision with root package name */
    public static final int f347665b = oj.d.e(com.tencent.mm.sdk.platformtools.x2.f193071a).f345682d;

    public final void a(java.lang.String scene, org.json.JSONObject info) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(26986, scene, info, 6);
    }

    public final void b(java.util.concurrent.ConcurrentLinkedDeque pendingReportList) {
        kotlin.jvm.internal.o.g(pendingReportList, "pendingReportList");
        if (pendingReportList.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(pendingReportList);
        pendingReportList.clear();
        pm0.v.O("Finder.FinderFpsReporter", new or2.l(arrayList));
    }
}
