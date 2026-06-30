package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class w4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.v4 f196307a;

    public w4() {
        com.tencent.mm.storage.v4 v4Var = new com.tencent.mm.storage.v4();
        this.f196307a = v4Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().h());
        sb6.append("checkmsgid.ini");
        byte[] N = com.tencent.mm.vfs.w6.N(sb6.toString(), 0, -1);
        if (com.tencent.mm.sdk.platformtools.t8.M0(N)) {
            return;
        }
        try {
            v4Var.parseFrom(N);
            if (b()) {
                c();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DelSvrIdMgr", "DelSvrIDs parse Error");
            com.tencent.mars.xlog.Log.e("MicroMsg.DelSvrIdMgr", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }

    public void a(int i17, long j17, long j18, boolean z17) {
        if (j17 == 0) {
            return;
        }
        if (z17) {
            b();
        }
        int i18 = i17 - ((int) (j18 / 86400));
        com.tencent.mm.storage.v4 v4Var = this.f196307a;
        if (i18 == 0) {
            v4Var.f196281h.add(java.lang.Long.valueOf(j17));
        } else if (i18 == 1) {
            v4Var.f196282i.add(java.lang.Long.valueOf(j17));
        } else if (i18 != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DelSvrIdMgr", "should not add to thease lists, dayIndex:%d", java.lang.Integer.valueOf(i18));
        } else {
            v4Var.f196283m.add(java.lang.Long.valueOf(j17));
        }
        if (z17) {
            c();
        }
    }

    public boolean b() {
        com.tencent.mm.storage.v4 v4Var = this.f196307a;
        int i17 = v4Var.f196277d;
        v4Var.f196281h.size();
        v4Var.f196282i.size();
        v4Var.f196283m.size();
        int i18 = (int) (com.tencent.mm.sdk.platformtools.t8.i1() / 86400);
        int i19 = i18 - v4Var.f196277d;
        v4Var.f196277d = i18;
        if (i19 == 0) {
            return false;
        }
        if (i19 == 1) {
            v4Var.f196283m = v4Var.f196282i;
            java.util.LinkedList linkedList = v4Var.f196281h;
            v4Var.f196282i = linkedList;
            linkedList.clear();
            return true;
        }
        if (i19 != 2) {
            v4Var.f196283m.clear();
            v4Var.f196282i.clear();
            v4Var.f196281h.clear();
            return true;
        }
        v4Var.f196283m = v4Var.f196281h;
        v4Var.f196282i.clear();
        v4Var.f196281h.clear();
        return true;
    }

    public final void c() {
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        com.tencent.mm.storage.v4 v4Var = this.f196307a;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(v4Var.f196281h.size());
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(v4Var.f196282i.size());
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(v4Var.f196283m.size());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.DelSvrIdMgr", "summerdel toFile tid[%d] [%d, %d ,%d] stack[%s]", valueOf, valueOf2, valueOf3, valueOf4, new com.tencent.mm.sdk.platformtools.z3());
        try {
            v4Var.f196280g.clear();
            v4Var.f196279f.clear();
            v4Var.f196278e.clear();
            com.tencent.mm.storage.v4 v4Var2 = new com.tencent.mm.storage.v4();
            java.util.LinkedList linkedList = v4Var2.f196281h;
            linkedList.addAll(v4Var.f196281h);
            v4Var2.f196282i.addAll(v4Var.f196282i);
            v4Var2.f196283m.addAll(v4Var.f196283m);
            byte[] byteArray = v4Var2.toByteArray();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.i();
            sb6.append(gm0.j1.u().h());
            sb6.append("checkmsgid.ini");
            com.tencent.mm.vfs.w6.S(sb6.toString(), byteArray, 0, byteArray.length);
            com.tencent.mars.xlog.Log.i("MicroMsg.DelSvrIdMgr", "summerdel toFile done [%d, %d, %d] data len[%d]", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(v4Var2.f196282i.size()), java.lang.Integer.valueOf(v4Var2.f196283m.size()), java.lang.Integer.valueOf(byteArray.length));
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.idkeyStat(111L, 168L, 1L, false);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DelSvrIdMgr", e17, "summerdel ", new java.lang.Object[0]);
        }
    }
}
