package dk2;

/* loaded from: classes12.dex */
public final class tb implements ek2.n2 {

    /* renamed from: g, reason: collision with root package name */
    public gk2.e f234126g;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.PriorityQueue f234120a = new java.util.PriorityQueue();

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f234121b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f234122c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f234123d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f234124e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f234125f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f234127h = new com.tencent.mm.sdk.platformtools.n3("FinderLivePollingService");

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f234128i = new dk2.eb(this);

    public static final void b(dk2.tb tbVar) {
        jz5.f0 f0Var;
        com.tencent.mm.sdk.platformtools.n3 n3Var = tbVar.f234127h;
        java.lang.Runnable runnable = tbVar.f234128i;
        n3Var.removeCallbacks(runnable);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.PriorityQueue priorityQueue = tbVar.f234120a;
        java.util.Iterator it = priorityQueue.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            dk2.bb bbVar = (dk2.bb) it.next();
            if (hashSet.contains(java.lang.Integer.valueOf(bbVar.f233248d))) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FinderLivePollingService", "duplicate pending command found, remove it ".concat(tbVar.c()));
                it.remove();
            } else {
                hashSet.add(java.lang.Integer.valueOf(bbVar.f233248d));
            }
        }
        dk2.bb bbVar2 = (dk2.bb) priorityQueue.peek();
        if (bbVar2 != null) {
            if (bbVar2.f233250f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderLivePollingService", "checkNextPollingRequestTime first command is disabled ".concat(tbVar.c()));
            } else {
                long j17 = bbVar2.f233252h;
                if (j17 == 0 || j17 <= android.os.SystemClock.uptimeMillis()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FinderLivePollingService", "checkNextPollingRequestTime doRequestNow:" + bbVar2 + ' ' + tbVar.c());
                    n3Var.post(runnable);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FinderLivePollingService", "checkNextPollingRequestTime pendingRequest:" + bbVar2 + ' ' + tbVar.c());
                    n3Var.postAtTime(runnable, j17);
                }
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLivePollingService", "checkNextPollingRequestTime pendingList is empty ".concat(tbVar.c()));
        }
    }

    @Override // ek2.n2
    public void a(ek2.o2 cgi, int i17, int i18, java.lang.String str, r45.zb2 resp) {
        kotlin.jvm.internal.o.g(cgi, "cgi");
        kotlin.jvm.internal.o.g(resp, "resp");
        this.f234127h.post(new dk2.jb(this, cgi, i17, i18, resp, str));
    }

    public final java.lang.String c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" || pendingCommandList: [");
        java.util.Iterator it = this.f234120a.iterator();
        while (it.hasNext()) {
            sb6.append(((dk2.bb) it.next()).toString());
            sb6.append(",");
        }
        sb6.append("] requestingCommandList: [");
        java.util.Iterator it6 = this.f234121b.values().iterator();
        while (it6.hasNext()) {
            sb6.append(((dk2.bb) it6.next()).toString());
            sb6.append(",");
        }
        sb6.append("] enabledCmdIds:[" + d(this.f234124e) + ']');
        sb6.append("] enabledCmdIdsInMiniMode:[" + d(this.f234125f) + ']');
        sb6.append(" now:[" + android.os.SystemClock.uptimeMillis() + ']');
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String d(java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            sb6.append(((java.lang.Number) it.next()).intValue());
            sb6.append(",");
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final void e(int i17, com.tencent.mm.protobuf.f req, dk2.cb callback, boolean z17) {
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f234127h.post(new dk2.ob(this, i17, req, callback, z17));
    }

    public final void f(int i17) {
        this.f234127h.post(new dk2.qb(i17, this));
    }

    public final void g(int i17, boolean z17, boolean z18) {
        java.lang.Object obj;
        dk2.bb bbVar = (dk2.bb) this.f234121b.get(java.lang.Integer.valueOf(i17));
        if (bbVar != null) {
            bbVar.f233250f = z17;
            if (z17) {
                bbVar.f233252h = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            }
        }
        java.util.PriorityQueue priorityQueue = this.f234120a;
        java.util.Iterator it = priorityQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((dk2.bb) obj).f233248d == i17) {
                    break;
                }
            }
        }
        dk2.bb bbVar2 = (dk2.bb) obj;
        if (bbVar2 != null) {
            priorityQueue.remove(bbVar2);
            bbVar2.f233250f = z17;
            if (z17) {
                bbVar2.f233252h = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            }
            if (!z17) {
                bbVar2.f233252h = z18 ? 0L : android.os.SystemClock.uptimeMillis() + (bbVar2.f233251g * 1000);
            }
            priorityQueue.add(bbVar2);
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLivePollingService", "updateCmdIdDisabledState " + i17 + ' ' + z17 + ' ' + z18 + ' ' + c());
        }
    }

    public final void h(int i17, com.tencent.mm.protobuf.f req) {
        kotlin.jvm.internal.o.g(req, "req");
        this.f234127h.post(new dk2.rb(i17, req, this));
    }
}
