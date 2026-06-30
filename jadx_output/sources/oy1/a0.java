package oy1;

/* loaded from: classes13.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f349839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oy1.c0 f349840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f349841f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f349842g;

    public a0(com.tencent.mm.modelbase.m1 m1Var, oy1.c0 c0Var, int i17, int i18) {
        this.f349839d = m1Var;
        this.f349840e = c0Var;
        this.f349841f = i17;
        this.f349842g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        com.tencent.mm.modelbase.m1 m1Var = this.f349839d;
        if ((m1Var instanceof ny1.j) && ((ny1.j) m1Var).f341410f.f341414a == this.f349840e.f349846a) {
            java.util.concurrent.ConcurrentLinkedQueue localReportIdList = ((ny1.j) m1Var).f341410f.f341417d;
            kotlin.jvm.internal.o.f(localReportIdList, "localReportIdList");
            java.lang.Long l17 = (java.lang.Long) kz5.n0.Y(localReportIdList);
            if (l17 != null) {
                oy1.c0 c0Var = this.f349840e;
                long longValue = l17.longValue();
                synchronized (c0Var.f349858m) {
                    oy1.v vVar = (oy1.v) ((java.util.LinkedHashMap) c0Var.f349858m).get(java.lang.Long.valueOf(longValue));
                    if (vVar != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CgiStorageHelper", "netScene end !");
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        ((kotlinx.coroutines.r) ((qy1.o) vVar).f367746a).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
                    }
                }
            }
            if (this.f349841f == 0 && this.f349842g == 0) {
                oy1.c0 c0Var2 = this.f349840e;
                com.tencent.mm.modelbase.m1 scene = this.f349839d;
                kotlin.jvm.internal.o.f(scene, "$scene");
                c0Var2.getClass();
                if ((scene instanceof ny1.j ? (ny1.j) scene : null) != null) {
                    com.tencent.mm.sdk.platformtools.n3 i17 = c0Var2.i();
                    android.os.Message obtainMessage = c0Var2.i().obtainMessage();
                    obtainMessage.what = 1002;
                    ny1.k kVar = ((ny1.j) scene).f341410f;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    obtainMessage.obj = nm5.j.e(kVar, bool, bool, bool);
                    i17.sendMessage(obtainMessage);
                    return;
                }
                return;
            }
            qy1.g gVar = qy1.g.f367725a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f349840e.f349846a);
            sb6.append('_');
            sb6.append(this.f349842g);
            sb6.append('_');
            sb6.append(this.f349841f);
            gVar.l(11, sb6.toString());
            oy1.c0 c0Var3 = this.f349840e;
            com.tencent.mm.modelbase.m1 scene2 = this.f349839d;
            kotlin.jvm.internal.o.f(scene2, "$scene");
            c0Var3.getClass();
            ny1.k kVar2 = ((ny1.j) scene2).f341410f;
            if (kVar2 != null && (concurrentLinkedQueue = kVar2.f341416c) != null) {
                java.util.Iterator it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    ((r45.pq5) it.next()).f383318i++;
                }
            }
            oy1.c0 c0Var4 = this.f349840e;
            com.tencent.mm.modelbase.m1 scene3 = this.f349839d;
            kotlin.jvm.internal.o.f(scene3, "$scene");
            c0Var4.n(scene3, oy1.m.f349885a.a(this.f349840e.f349846a) == 0, this.f349842g);
        }
    }
}
