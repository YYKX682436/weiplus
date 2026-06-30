package e11;

/* loaded from: classes15.dex */
public class d implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f246361d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f246362e = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f246363f = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f246364g = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f246365h = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f246366i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f246367m = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f246368n = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f246369o = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f246370p = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f246371q = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f246372r = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f246373s = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f246374t = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f246375u = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f246376v = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f246377w = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f246378x = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f246379y = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.List f246380z = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.List A = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.List B = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.List C = new java.util.concurrent.CopyOnWriteArrayList();

    public void a(java.util.List list, java.util.List list2) {
        if (list.size() > 10000) {
            for (int i17 = 0; i17 < list2.size() + 100; i17++) {
                try {
                    list.remove(0);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ActiveDetector.ProcessDetector", "addDelayedMsgList %s", e17.getMessage());
                }
            }
        }
        list.addAll(list2);
    }

    public void b(e11.f fVar) {
        java.util.List list = this.f246361d;
        if (((java.util.concurrent.CopyOnWriteArrayList) list).size() > 30000) {
            for (int i17 = 0; i17 < 100; i17++) {
                try {
                    ((java.util.concurrent.CopyOnWriteArrayList) list).remove(0);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ActiveDetector.ProcessDetector", "addProcessStatusList %s", e17.getMessage());
                }
            }
        }
        ((java.util.concurrent.CopyOnWriteArrayList) list).add(fVar);
    }

    public void c(java.util.List list) {
        java.util.List list2 = this.f246363f;
        if (((java.util.concurrent.CopyOnWriteArrayList) list2).size() > 30000) {
            for (int i17 = 0; i17 < list.size() + 100; i17++) {
                try {
                    ((java.util.concurrent.CopyOnWriteArrayList) list2).remove(0);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ActiveDetector.ProcessDetector", "addReceiveInterProcessList %s", e17.getMessage());
                }
            }
        }
        ((java.util.concurrent.CopyOnWriteArrayList) list2).addAll(list);
    }

    public void d(java.util.List list) {
        java.util.List list2 = this.f246362e;
        if (((java.util.concurrent.CopyOnWriteArrayList) list2).size() > 30000) {
            for (int i17 = 0; i17 < list.size() + 100; i17++) {
                try {
                    ((java.util.concurrent.CopyOnWriteArrayList) list2).remove(0);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ActiveDetector.ProcessDetector", "addSendInterProcessList %s", e17.getMessage());
                }
            }
        }
        ((java.util.concurrent.CopyOnWriteArrayList) list2).addAll(list);
    }
}
