package nm;

/* loaded from: classes12.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    public static final bm5.p1 f338436g = new nm.d();

    /* renamed from: a, reason: collision with root package name */
    public final nm.h f338437a = new nm.h(this, null);

    /* renamed from: b, reason: collision with root package name */
    public final nm.g f338438b = new nm.g(this);

    /* renamed from: c, reason: collision with root package name */
    public final android.app.Application[] f338439c = {null};

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Boolean[] f338440d = {null};

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f338441e = new java.util.ArrayList(32);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f338442f = false;

    public static void a(nm.i iVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement2", "[+] performAndCleanPendingActionsLocked: pending action count: %s.", java.lang.Integer.valueOf(((java.util.ArrayList) iVar.f338441e).size()));
        java.util.Iterator it = ((java.util.ArrayList) iVar.f338441e).iterator();
        while (it.hasNext()) {
            ((ku5.t0) ku5.t0.f312615d).h((java.lang.Runnable) it.next(), "FirstScreenArrangedTasks");
        }
        ((java.util.ArrayList) iVar.f338441e).clear();
    }
}
