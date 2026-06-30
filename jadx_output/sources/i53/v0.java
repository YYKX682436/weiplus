package i53;

/* loaded from: classes15.dex */
public class v0 {

    /* renamed from: e, reason: collision with root package name */
    public m33.o1 f288753e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f288749a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f288750b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f288751c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f288752d = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f288754f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f288755g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f288756h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f288757i = "";

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.model.m0 f288758j = new i53.s0(this);

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.model.n0 f288759k = new i53.u0(this);

    public static boolean a(i53.v0 v0Var, java.lang.String str, int i17, int i18, int i19) {
        v0Var.f288751c.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "uploadMediaFile, localId : %s", str);
        return com.tencent.mm.plugin.webview.modeltools.z.bj().c("", str, i17, i18, i19, null);
    }

    public static void b(i53.v0 v0Var) {
        v0Var.f288754f.clear();
        v0Var.f288755g.clear();
        v0Var.f288756h.clear();
        com.tencent.mm.plugin.webview.modeltools.z.bj().i(v0Var.f288759k);
        com.tencent.mm.plugin.webview.model.i4 bj6 = com.tencent.mm.plugin.webview.modeltools.z.bj();
        com.tencent.mm.plugin.webview.model.m0 m0Var = v0Var.f288758j;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = bj6.f182938e;
        if (copyOnWriteArraySet == null || m0Var == null) {
            return;
        }
        copyOnWriteArraySet.remove(m0Var);
    }
}
