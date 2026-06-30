package w11;

/* loaded from: classes12.dex */
public final class g2 extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w11.h2 f442036d;

    public g2(w11.h2 h2Var) {
        this.f442036d = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.bj6 bj6Var;
        r45.jj6 jj6Var;
        jz5.f0 f0Var;
        r45.bj6 bj6Var2;
        boolean z17;
        java.util.LinkedList linkedList;
        w11.u uVar;
        java.util.LinkedList linkedList2;
        r45.c50 c50Var;
        java.util.LinkedList linkedList3;
        r45.c50 c50Var2;
        java.util.LinkedList linkedList4;
        java.util.LinkedList linkedList5;
        if (!gm0.j1.a() || gm0.m.r() || gm0.j1.u() == null || gm0.j1.u().c() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncServiceHandler", "processResp accready:%s hold:%s accstg:%s ", java.lang.Boolean.valueOf(gm0.j1.a()), java.lang.Boolean.valueOf(gm0.m.r()), gm0.j1.u());
            return;
        }
        int startPerformance = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcReceiveMsgEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcReceiveMsgDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcReceiveMsgCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcReceiveMsgIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcReceiveMsgThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcReceiveMsgTimeout(), 201, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcReceiveMsgAction(), "MicroMsg.SyncServiceHandler");
        long c17 = c01.id.c();
        synchronized (this.f442036d.f442054d) {
            byte[] j17 = w11.c2.f441991a.b().j("process_data_list");
            if (j17 != null) {
                bj6Var = new r45.bj6();
                try {
                    bj6Var.parseFrom(j17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SyncServiceHandler", e17, "process parse data queue 1", new java.lang.Object[0]);
                }
            } else {
                bj6Var = null;
            }
            jj6Var = (bj6Var == null || (linkedList5 = bj6Var.f370812d) == null) ? null : (r45.jj6) kz5.n0.Z(linkedList5);
        }
        if (jj6Var != null) {
            w11.h2 h2Var = this.f442036d;
            com.tencent.mars.xlog.Log.i("MicroMsg.SyncServiceHandler", "ProcessSyncData syncData");
            com.tencent.mm.plugin.zero.a1 a1Var = new com.tencent.mm.plugin.zero.a1();
            a1Var.b(new w11.v(jj6Var));
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            r45.ew4 ew4Var = jj6Var.f377883d;
            int size = (ew4Var == null || (c50Var2 = ew4Var.f373759e) == null || (linkedList4 = c50Var2.f371295e) == null) ? 0 : linkedList4.size();
            r45.ew4 ew4Var2 = jj6Var.f377883d;
            if (ew4Var2 != null && (c50Var = ew4Var2.f373759e) != null && (linkedList3 = c50Var.f371295e) != null) {
                int i17 = 0;
                for (java.lang.Object obj : linkedList3) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.b50 b50Var = (r45.b50) obj;
                    mm.w.h("SyncServiceHandler", b50Var);
                    mm.h hVar = mm.h.f328485a;
                    kotlin.jvm.internal.o.d(jj6Var.f377883d);
                    java.lang.System.currentTimeMillis();
                    w11.v vVar = new w11.v(jj6Var);
                    r45.cx4 cx4Var = jj6Var.f377893q;
                    if (cx4Var == null) {
                        cx4Var = com.tencent.mm.booter.x1.e();
                    }
                    if (!a1Var.d(vVar, i17, size, b50Var, false, cx4Var, 2)) {
                        jx3.f.INSTANCE.idkeyStat(99L, 46L, 1L, false);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SyncServiceHandler", "processResp Single Cmd NetSync[%s] time:%s size:%s index:%s", java.lang.Integer.valueOf(jj6Var.f377888i), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i17));
                    i17 = i18;
                }
            }
            java.lang.Integer num = null;
            a1Var.a(new w11.v(jj6Var));
            synchronized (h2Var.f442054d) {
                byte[] j18 = w11.c2.f441991a.b().j("process_data_list");
                if (j18 != null) {
                    bj6Var2 = new r45.bj6();
                    try {
                        bj6Var2.parseFrom(j18);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SyncServiceHandler", e18, "process parse data queue 2", new java.lang.Object[0]);
                    }
                } else {
                    bj6Var2 = null;
                }
                r45.jj6 jj6Var2 = (bj6Var2 == null || (linkedList2 = bj6Var2.f370812d) == null) ? null : (r45.jj6) kz5.h0.C(linkedList2);
                if (kotlin.jvm.internal.o.b(jj6Var2 != null ? jj6Var2.f377889m : null, jj6Var.f377889m)) {
                    try {
                        z17 = w11.c2.f441991a.b().H("process_data_list", bj6Var2 != null ? bj6Var2.toByteArray() : null);
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SyncServiceHandler", e19, "process save data queue", new java.lang.Object[0]);
                        z17 = false;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("process save data queue saveResult:");
                    sb6.append(z17);
                    sb6.append(" QueueSize: ");
                    if (bj6Var2 != null && (linkedList = bj6Var2.f370812d) != null) {
                        num = java.lang.Integer.valueOf(linkedList.size());
                    }
                    sb6.append(num);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SyncServiceHandler", sb6.toString());
                }
                uVar = (w11.u) h2Var.f442053c.remove(java.lang.Integer.valueOf(jj6Var.f377888i));
            }
            h2Var.c(jj6Var);
            if (jj6Var.f377890n == 1) {
                jx3.f.INSTANCE.idkeyStat(99L, 104L, 1L, false);
            } else {
                jx3.f.INSTANCE.idkeyStat(99L, 105L, 1L, false);
            }
            ((w11.f2) h2Var.f442051a).b(jj6Var, uVar);
            int stopPerformance = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcReceiveMsgEnable(), startPerformance);
            ((ku5.t0) ku5.t0.f312615d).h(new w11.g2(h2Var), w11.h2.f442050f);
            h2Var.a(jj6Var, w11.f.f442019h);
            com.tencent.mars.xlog.Log.i("MicroMsg.SyncServiceHandler", "sync data process finish costTime:" + (c01.id.c() - c17) + " startPerformance:" + startPerformance + " stopPerformance:" + stopPerformance);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SyncServiceHandler", "no sync data process");
        }
    }
}
