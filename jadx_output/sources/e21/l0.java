package e21;

/* loaded from: classes11.dex */
public class l0 implements com.tencent.mm.modelbase.j1, xg3.o0 {

    /* renamed from: h, reason: collision with root package name */
    public e21.r f246545h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f246546i;

    /* renamed from: d, reason: collision with root package name */
    public boolean f246541d = false;

    /* renamed from: e, reason: collision with root package name */
    public final kk.j f246542e = new jt0.j(200);

    /* renamed from: f, reason: collision with root package name */
    public final kk.j f246543f = new jt0.j(200);

    /* renamed from: g, reason: collision with root package name */
    public final kk.j f246544g = new jt0.j(200);

    /* renamed from: m, reason: collision with root package name */
    public final e21.e0 f246547m = new e21.e0();

    /* renamed from: n, reason: collision with root package name */
    public long f246548n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f246549o = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new e21.g0(this), false);

    public l0(e21.g0 g0Var) {
        this.f246546i = new java.util.HashMap();
        this.f246546i = new java.util.HashMap();
    }

    public e21.r b() {
        if (this.f246545h == null && gm0.j1.a()) {
            synchronized (e21.r.class) {
                if (this.f246545h == null) {
                    this.f246545h = new e21.r(gm0.j1.u().f273153f);
                }
            }
        }
        return this.f246545h;
    }

    public final void c(int i17, int i18, java.lang.String str, java.lang.String str2) {
        java.util.HashSet hashSet = (java.util.HashSet) this.f246546i.get(java.lang.Integer.valueOf(i17));
        if (hashSet == null) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() != null) {
                linkedList.add((xg3.n0) weakReference.get());
            }
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            ((xg3.n0) it6.next()).a(i18, str, str2);
        }
        linkedList.clear();
    }

    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        e21.j jVar;
        e21.g gVar;
        r45.j25 j25Var;
        java.util.LinkedList linkedList;
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.OplogService", "onSceneEnd[%s] errType:%d,errCode:%d,errMsg:%s, sceneType %d", java.lang.Integer.valueOf(m1Var.hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.getType()));
        int type = m1Var.getType();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f246549o;
        kk.j jVar2 = this.f246542e;
        e21.e0 e0Var = this.f246547m;
        if (type == 806 && ((z17 = m1Var instanceof l41.c0))) {
            r45.a15 a15Var = (r45.a15) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
            kk.j jVar3 = this.f246543f;
            xg3.q0 q0Var = ((l41.c0) m1Var).f315788g;
            if (i17 == 0 || i18 == 0) {
                if (z17) {
                    int i19 = a15Var.getBaseResponse() != null ? a15Var.getBaseResponse().f376959d : 0;
                    e0Var.a(q0Var, i19);
                    com.tencent.mm.autogen.events.OplogServiceResultEvent oplogServiceResultEvent = new com.tencent.mm.autogen.events.OplogServiceResultEvent();
                    oplogServiceResultEvent.f54602g.f8204a = i19;
                    oplogServiceResultEvent.e();
                    c(q0Var.b(), i19, "", "");
                    com.tencent.mars.xlog.Log.i("MicroMsg.OplogService", "openim op success, type:%d id %d", java.lang.Integer.valueOf(q0Var.f454427f), java.lang.Integer.valueOf(q0Var.b()));
                    int count = b().getCount();
                    b().m0(q0Var);
                    ((lt0.f) jVar3).remove(java.lang.Integer.valueOf(q0Var.f454423b));
                    this.f246541d = false;
                    e0Var.b(q0Var, (java.lang.Integer) ((lt0.f) jVar3).i(java.lang.Integer.valueOf(q0Var.f454423b)), count);
                    com.tencent.mars.xlog.Log.i("MicroMsg.OplogService", "openim op success, mapRecentDown: %d, mapOpenImRecentDown: %d", java.lang.Integer.valueOf(((lt0.f) jVar2).size()), java.lang.Integer.valueOf(((lt0.f) jVar3).size()));
                    long j17 = ((lt0.f) jVar2).size() > 0 ? 500L : 0L;
                    b4Var.c(j17, j17);
                    return;
                }
                return;
            }
            java.lang.String g17 = (a15Var == null || a15Var.getBaseResponse() == null) ? "" : x51.j1.g(a15Var.getBaseResponse().f376960e);
            if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                g17 = str;
            }
            int i27 = q0Var.f454423b;
            c(q0Var.b(), -1, "", g17);
            this.f246541d = false;
            java.lang.Integer num = (java.lang.Integer) ((lt0.f) jVar3).i(java.lang.Integer.valueOf(i27));
            com.tencent.mars.xlog.Log.i("MicroMsg.OplogService", "summeroplog id:%d, inserttime:%d, mapCnt:%d", java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(q0Var.f454424c), num);
            if (num == null) {
                ((lt0.f) jVar3).j(java.lang.Integer.valueOf(i27), 1);
                return;
            }
            if (num.intValue() < 2) {
                ((lt0.f) jVar3).j(java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(num.intValue() + 1));
                return;
            }
            int count2 = b().getCount();
            b().m0(q0Var);
            ((lt0.f) jVar3).remove(java.lang.Integer.valueOf(q0Var.f454423b));
            e0Var.b(q0Var, num, count2);
            return;
        }
        if (m1Var.getType() == 12607 && (m1Var instanceof it1.a)) {
            it1.a aVar = (it1.a) m1Var;
            r45.pr prVar = (r45.pr) aVar.f294497e.f70711b.f70700a;
            kk.j jVar4 = this.f246544g;
            xg3.q0 q0Var2 = aVar.f294499g;
            if (i17 == 0 || i18 == 0) {
                int i28 = ((r45.ie) prVar.getCustom(0)) != null ? ((r45.ie) prVar.getCustom(0)).f376959d : 0;
                e0Var.a(q0Var2, i28);
                c(q0Var2.b(), i28, "", "");
                com.tencent.mars.xlog.Log.i("MicroMsg.OplogService", "byp op success, opType:%d id %d ret %d", java.lang.Integer.valueOf(q0Var2.f454427f), java.lang.Integer.valueOf(q0Var2.b()), java.lang.Integer.valueOf(i28));
                int count3 = b().getCount();
                b().m0(q0Var2);
                ((lt0.f) jVar4).remove(java.lang.Integer.valueOf(q0Var2.f454423b));
                this.f246541d = false;
                e0Var.b(q0Var2, (java.lang.Integer) ((lt0.f) jVar4).i(java.lang.Integer.valueOf(q0Var2.f454423b)), count3);
                com.tencent.mars.xlog.Log.i("MicroMsg.OplogService", "byp op success, mapRecentDown: %d, mapBypRecentDown: %d", java.lang.Integer.valueOf(((lt0.f) jVar2).size()), java.lang.Integer.valueOf(((lt0.f) jVar4).size()));
                long j18 = ((lt0.f) jVar2).size() > 0 ? 500L : 0L;
                b4Var.c(j18, j18);
                return;
            }
            java.lang.String g18 = (prVar == null || ((r45.ie) prVar.getCustom(0)) == null) ? "" : x51.j1.g(((r45.ie) prVar.getCustom(0)).f376960e);
            if (com.tencent.mm.sdk.platformtools.t8.K0(g18)) {
                g18 = str;
            }
            int i29 = q0Var2.f454423b;
            c(q0Var2.b(), -1, "", g18);
            this.f246541d = false;
            java.lang.Integer num2 = (java.lang.Integer) ((lt0.f) jVar4).i(java.lang.Integer.valueOf(i29));
            com.tencent.mars.xlog.Log.i("MicroMsg.OplogService", "byp op failed, id:%d, inserttime:%d, mapCnt:%d", java.lang.Integer.valueOf(i29), java.lang.Long.valueOf(q0Var2.f454424c), num2);
            if (num2 == null) {
                ((lt0.f) jVar4).j(java.lang.Integer.valueOf(i29), 1);
                return;
            }
            if (num2.intValue() < 2) {
                ((lt0.f) jVar4).j(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(num2.intValue() + 1));
                return;
            }
            int count4 = b().getCount();
            b().m0(q0Var2);
            ((lt0.f) jVar4).remove(java.lang.Integer.valueOf(q0Var2.f454423b));
            e0Var.b(q0Var2, num2, count4);
            return;
        }
        if (m1Var.getType() == 681 && (m1Var instanceof e21.j)) {
            if (i17 != 0 || i18 != 0 || (gVar = (jVar = (e21.j) m1Var).f246537e) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OplogService", "summeroplog tryStartNetscene onSceneEnd errType:%d, errCode:%d, rr:%s not retry", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), ((e21.j) m1Var).f246537e.toString());
                this.f246541d = false;
                return;
            }
            r45.i25 i25Var = gVar.f246521b.f246528a;
            int i37 = i25Var.f376687d;
            if (i37 != 0 || (j25Var = i25Var.f376688e) == null || (linkedList = j25Var.f377518e) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OplogService", "summeroplog tryStartNetscene onSceneEnd Ret:%d  not ok and no retry.", java.lang.Integer.valueOf(i37));
                this.f246541d = false;
                return;
            }
            if (j25Var != null && linkedList.size() != 0) {
                com.tencent.mm.autogen.events.OplogServiceResultEvent oplogServiceResultEvent2 = new com.tencent.mm.autogen.events.OplogServiceResultEvent();
                int intValue = ((java.lang.Integer) i25Var.f376688e.f377518e.getLast()).intValue();
                am.vn vnVar = oplogServiceResultEvent2.f54602g;
                vnVar.f8204a = intValue;
                java.util.LinkedList linkedList2 = i25Var.f376688e.f377519f;
                vnVar.f8205b = linkedList2.isEmpty() ? "" : ((r45.g25) linkedList2.getLast()).f374842e;
                vnVar.f8206c = linkedList2.isEmpty() ? "" : ((r45.g25) linkedList2.getLast()).f374841d;
                if (com.tencent.mm.sdk.platformtools.t8.K0(vnVar.f8205b) && com.tencent.mm.sdk.platformtools.t8.K0(vnVar.f8206c)) {
                    for (int size = linkedList2.size() - 1; size >= 0; size--) {
                        vnVar.f8205b = ((r45.g25) linkedList2.get(size)).f374842e;
                        vnVar.f8206c = ((r45.g25) linkedList2.get(size)).f374841d;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(vnVar.f8205b) || !com.tencent.mm.sdk.platformtools.t8.K0(vnVar.f8206c)) {
                            break;
                        }
                    }
                }
                oplogServiceResultEvent2.e();
            }
            java.util.List list = jVar.f246538f;
            r45.j25 j25Var2 = i25Var.f376688e;
            new e21.j0(this, this, list, j25Var2.f377518e, j25Var2.f377519f).c(50L, 50L);
        }
    }
}
