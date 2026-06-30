package g40;

/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public h40.b f268693a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f268694b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.modelcdntran.c1 f268695c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f268696d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f268697e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f268698f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f268699g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f268700h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f268701i;

    public l(h40.b downloadFromScene, java.lang.String dataId) {
        kotlin.jvm.internal.o.g(downloadFromScene, "downloadFromScene");
        kotlin.jvm.internal.o.g(dataId, "dataId");
        this.f268693a = downloadFromScene;
        this.f268694b = dataId;
        this.f268695c = new g40.i(this);
        this.f268696d = new java.util.ArrayList();
    }

    public final void a(i40.a aVar) {
        if (aVar != null) {
            java.util.ArrayList arrayList = this.f268696d;
            boolean z17 = false;
            if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (kotlin.jvm.internal.o.b(((java.lang.ref.WeakReference) it.next()).get(), aVar)) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileRecordMsgDownloadHelper", "callback: isExist");
            } else {
                arrayList.add(new java.lang.ref.WeakReference(aVar));
            }
        }
    }

    public final r45.gp0 b(java.util.LinkedList linkedList, java.lang.String str) {
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            if (gp0Var.I == 17) {
                java.util.LinkedList dataList = gp0Var.f375451y2.f370964f;
                kotlin.jvm.internal.o.f(dataList, "dataList");
                r45.gp0 b17 = b(dataList, str);
                if (b17 != null) {
                    return b17;
                }
            }
            if (kotlin.jvm.internal.o.b(gp0Var.T, str)) {
                return gp0Var;
            }
        }
        return null;
    }

    public final void c() {
        this.f268697e = false;
        java.util.ArrayList arrayList = this.f268696d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i40.a aVar = (i40.a) ((java.lang.ref.WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.e();
            }
        }
        kz5.h0.B(arrayList, g40.k.f268692d);
        f();
    }

    public final void d(int i17, int i18, java.lang.String errMsg, boolean z17) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f268697e = false;
        java.util.ArrayList arrayList = this.f268696d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i40.a aVar = (i40.a) ((java.lang.ref.WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.d(i17, i18, errMsg, z17);
            }
        }
        kz5.h0.B(arrayList, g40.k.f268692d);
        f();
    }

    public final void e(long j17, long j18) {
        java.util.ArrayList arrayList = this.f268696d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i40.a aVar = (i40.a) ((java.lang.ref.WeakReference) it.next()).get();
            if (aVar != null) {
                aVar.a(j17, j18);
            }
        }
        kz5.h0.B(arrayList, g40.k.f268692d);
    }

    public final void f() {
        java.lang.String str;
        g40.l lVar;
        ((rx.j) ((sx.c0) i95.n0.c(sx.c0.class))).Bi(this.f268695c);
        if (((d40.q) i95.n0.c(d40.q.class)) != null && (str = this.f268699g) != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f40.i.f259430i.a().f259433h;
            if (concurrentHashMap.containsKey(str) && (lVar = (g40.l) concurrentHashMap.get(str)) != null) {
                lVar.f268696d.clear();
            }
            concurrentHashMap.remove(str);
        }
        this.f268697e = false;
    }
}
