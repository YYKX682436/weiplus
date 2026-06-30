package com.tencent.mm.plugin.messenger.foundation;

/* loaded from: classes11.dex */
public final class v2 extends pq5.c implements vg3.y4 {
    public v2(com.tencent.mm.plugin.messenger.foundation.t2 t2Var) {
    }

    public void x(final java.lang.Object obj) {
        w(new com.tencent.mm.plugin.messenger.foundation.x2(this, obj));
        fs.g.b(vg3.u4.class, new fs.o() { // from class: com.tencent.mm.plugin.messenger.foundation.v2$$b
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((b60.l) ((vg3.u4) nVar)).getClass();
                ((rj.p) ((qk.w7) i95.n0.c(qk.w7.class))).getClass();
                xr.a aVar = xr.a.f456127a;
                com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgEngine", "[afterSyncDoCmd] check time:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                return false;
            }
        });
    }

    public void y(final java.lang.Object obj) {
        w(new com.tencent.mm.plugin.messenger.foundation.w2(this, obj));
        fs.g.b(vg3.u4.class, new fs.o() { // from class: com.tencent.mm.plugin.messenger.foundation.v2$$a
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                java.util.ArrayList<qk.h6> arrayList;
                ((b60.l) ((vg3.u4) nVar)).getClass();
                ((rj.p) ((qk.w7) i95.n0.c(qk.w7.class))).getClass();
                xr.a aVar = xr.a.f456127a;
                xr.a.f456128b = true;
                if (xr.a.f456129c) {
                    com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgEngine", "[checkFromDb] begin!");
                    com.tencent.mm.storage.x7.f196331d.getClass();
                    android.database.Cursor D = com.tencent.mm.storage.x7.f196333f.D("FunctionMsgItem", com.tencent.mm.storage.x7.f196332e, "status<=? and opCode!= -1", new java.lang.String[]{"2"}, null, null, null, 2);
                    if (D != null) {
                        try {
                            arrayList = new java.util.ArrayList();
                            D.moveToFirst();
                            while (!D.isAfterLast()) {
                                qk.h6 h6Var = new qk.h6();
                                h6Var.convertFrom(D);
                                arrayList.add(h6Var);
                                D.moveToNext();
                            }
                            vz5.b.a(D, null);
                        } finally {
                        }
                    } else {
                        arrayList = null;
                    }
                    kotlin.jvm.internal.o.d(arrayList);
                    for (qk.h6 h6Var2 : arrayList) {
                        com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgEngine", "[checkFromDb] item:%s", h6Var2);
                        int i17 = h6Var2.field_opCode;
                        if (i17 != -1) {
                            as.a cVar = i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 101 ? null : new as.c() : new as.g() : new as.f() : new as.d() : new as.i();
                            if (cVar != null) {
                                xr.a.f456131e.a(i17, h6Var2, cVar);
                            }
                        }
                    }
                    com.tencent.mm.storage.x7.f196331d.getClass();
                    l75.k0 k0Var = com.tencent.mm.storage.x7.f196333f;
                    com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgStorage", "[deleteAllHandleFunctionMsg] ret1:" + k0Var.delete("FunctionMsgItem", "status=?", new java.lang.String[]{"100"}) + " ret2:" + k0Var.delete("FunctionMsgItem", "status=?", new java.lang.String[]{"3"}));
                    xr.a.f456129c = false;
                }
                com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgEngine", "[beforeSyncDoCmd] isInit:" + xr.a.f456129c);
                return false;
            }
        });
    }

    public void z(final java.lang.Object obj) {
        w(new com.tencent.mm.plugin.messenger.foundation.y2(this, obj));
        fs.g.b(vg3.u4.class, new fs.o() { // from class: com.tencent.mm.plugin.messenger.foundation.v2$$c
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((b60.l) ((vg3.u4) nVar)).getClass();
                ((rj.p) ((qk.w7) i95.n0.c(qk.w7.class))).getClass();
                xr.a aVar = xr.a.f456127a;
                xr.a.f456128b = false;
                aVar.a();
                com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgEngine", "[finishSyncDoCmd] check time:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                return false;
            }
        });
    }
}
