package q01;

/* loaded from: classes12.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q01.x f359338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f359339e;

    public v(q01.x xVar, com.tencent.mm.modelbase.m1 m1Var) {
        this.f359338d = xVar;
        this.f359339e = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        q01.x xVar = this.f359338d;
        com.tencent.mm.modelbase.m1 m1Var = this.f359339e;
        if (xVar.d().get() < xVar.c().get() && !(m1Var instanceof z11.b)) {
            q01.e0 e0Var = q01.e0.f359270a;
            int i17 = 0;
            if (e0Var.e()) {
                synchronized (e0Var.d()) {
                    int hashCode = m1Var.hashCode();
                    java.util.Iterator it = e0Var.d().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (((java.lang.Number) ((jz5.l) obj).f302833d).intValue() == hashCode) {
                                break;
                            }
                        }
                    }
                    jz5.l lVar = (jz5.l) obj;
                    if (lVar != null) {
                        q01.e0.f359270a.d().remove(lVar);
                    }
                    q01.e0 e0Var2 = q01.e0.f359270a;
                    e0Var2.d().add(new jz5.l(java.lang.Integer.valueOf(hashCode), java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
                    com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect watch: " + m1Var.getClass().getName() + '@' + hashCode + ", total=" + e0Var2.d().size());
                }
            }
            com.tencent.mm.modelbase.u0 u0Var = xVar.f359345e;
            com.tencent.mm.modelbase.r1 r1Var = u0Var instanceof com.tencent.mm.modelbase.r1 ? (com.tencent.mm.modelbase.r1) u0Var : null;
            if (r1Var != null) {
                synchronized (r1Var.f70773p) {
                    linkedList = new java.util.LinkedList(r1Var.f70767g);
                }
                if (!linkedList.isEmpty()) {
                    java.util.Iterator it6 = linkedList.iterator();
                    while (it6.hasNext()) {
                        if (kotlin.jvm.internal.o.b((com.tencent.mm.modelbase.m1) it6.next(), m1Var) && (i17 = i17 + 1) < 0) {
                            kz5.c0.o();
                            throw null;
                        }
                    }
                }
            } else {
                i17 = -1;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneQueueTracker", "NetSceneInspect leaking callback to onSceneEnd: " + xVar.e() + ", leakCount=" + i17);
            java.util.LinkedHashMap a17 = xVar.a();
            a17.put("leakCount", java.lang.Integer.valueOf(i17));
            ap.a.a(10001, "errNetScene", null, a17, "LeakCallback", q01.a1.f359259a.a(m1Var), xVar.b(), java.lang.String.valueOf(i17));
        }
    }
}
