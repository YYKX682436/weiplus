package w11;

/* loaded from: classes12.dex */
public final class h2 {

    /* renamed from: e, reason: collision with root package name */
    public static final xu5.b f442049e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f442050f;

    /* renamed from: a, reason: collision with root package name */
    public final w11.t f442051a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f442052b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f442053c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f442054d;

    static {
        xu5.b a17 = xu5.b.a("SyncProcessorThreadTag");
        f442049e = a17;
        f442050f = a17.f457302a;
    }

    public h2(w11.t finishCmdCallback) {
        kotlin.jvm.internal.o.g(finishCmdCallback, "finishCmdCallback");
        this.f442051a = finishCmdCallback;
        this.f442052b = new java.util.LinkedList();
        this.f442053c = new java.util.HashMap();
        this.f442054d = new java.lang.Object();
    }

    public final void a(r45.jj6 jj6Var, w11.f fVar) {
        synchronized (this.f442052b) {
            java.util.LinkedList linkedList = this.f442052b;
            java.lang.String str = jj6Var.f377889m;
            if (str == null) {
                str = "";
            }
            if (linkedList.contains(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SyncServiceHandler", "already sync dataId " + jj6Var.f377889m);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SyncServiceHandler", "onContinueSync dataId:" + jj6Var.f377889m);
                java.util.LinkedList linkedList2 = this.f442052b;
                java.lang.String str2 = jj6Var.f377889m;
                if (str2 == null) {
                    str2 = "";
                }
                linkedList2.add(str2);
                ((w11.f2) this.f442051a).a(jj6Var, fVar);
            }
            if (this.f442052b.size() > 5) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SyncServiceHandler", "remove first dataId " + ((java.lang.String) this.f442052b.removeFirst()));
            }
        }
    }

    public final void b(r45.jj6 syncData, w11.u processor) {
        boolean z17;
        r45.bj6 bj6Var;
        boolean z18;
        int size;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        kotlin.jvm.internal.o.g(syncData, "syncData");
        kotlin.jvm.internal.o.g(processor, "processor");
        long c17 = c01.id.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(processor.hashCode());
        sb6.append('_');
        sb6.append(c17);
        syncData.f377889m = sb6.toString();
        syncData.f377888i = processor.hashCode();
        if (syncData.f377890n == 1) {
            jx3.f.INSTANCE.idkeyStat(99L, 100L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(99L, 101L, 1L, false);
        }
        if (!gm0.j1.a() || gm0.m.r() || gm0.j1.u() == null || gm0.j1.u().c() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncServiceHandler", "Error CmdProcHandler " + processor + " accHasReady:" + gm0.j1.a() + " hold:" + gm0.m.r() + " accstg:" + gm0.j1.u());
            c(syncData);
            ((w11.f2) this.f442051a).b(syncData, processor);
            ((w11.f2) this.f442051a).a(syncData, w11.f.f442015d);
            return;
        }
        r45.ew4 ew4Var = syncData.f377883d;
        if (ew4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncServiceHandler", "Error SyncResponse " + processor + " accHasReady:" + gm0.j1.a() + " hold:" + gm0.m.r() + " accstg:" + gm0.j1.u());
            ((w11.f2) this.f442051a).b(syncData, processor);
            ((w11.f2) this.f442051a).a(syncData, w11.f.f442016e);
            return;
        }
        mm.h hVar = mm.h.f328485a;
        java.lang.String from = "SyncServiceHandler-".concat(processor.getClass().getName());
        kotlin.jvm.internal.o.g(from, "from");
        r45.c50 c50Var = ew4Var.f373759e;
        boolean z19 = false;
        int size2 = (c50Var == null || (linkedList2 = c50Var.f371295e) == null) ? 0 : linkedList2.size();
        kotlin.jvm.internal.o.e(jx3.f.A(size2, new int[]{0, 1, 2, 3, 5, 10}, new java.lang.Integer[]{java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.cd.CTRL_INDEX), 248, 247, 246, 245, 244, 243}), "null cannot be cast to non-null type kotlin.Int");
        jx3.f.INSTANCE.idkeyStat(99L, com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) r0), 1L, false);
        try {
            java.lang.reflect.Method method = android.os.PowerManager.class.getMethod("isScreenOn", new java.lang.Class[0]);
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            java.lang.Object invoke = method.invoke((android.os.PowerManager) systemService, new java.lang.Object[0]);
            kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            z17 = ((java.lang.Boolean) invoke).booleanValue();
        } catch (java.lang.Exception e17) {
            jx3.f.INSTANCE.idkeyStat(99L, 45L, 1L, false);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncServiceHandler", "reflectScreenOn invoke ERROR use isScreenOn:%s e:%s", bool, com.tencent.mm.sdk.platformtools.z3.c(e17));
            z17 = true;
        }
        if (!z17) {
            jx3.f.INSTANCE.idkeyStat(99L, size2 > 0 ? 221L : 218L, 1L, false);
        } else if (z65.c.f470455a) {
            jx3.f.INSTANCE.idkeyStat(99L, size2 > 0 ? 219L : 216L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(99L, size2 > 0 ? 220L : 217L, 1L, false);
        }
        long j17 = ew4Var.f373764m;
        if (java.lang.String.valueOf(j17).length() == 10) {
            j17 *= 1000;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = currentTimeMillis - j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncServiceHandler", "client time is:%s,server time is:%s,diff time is:%s, diff second time is:%s,just save millisecond diff time", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j18 / 1000));
        c01.id.g(j17);
        gm0.j1.b().D(ew4Var.f373762h, ew4Var.f373763i);
        gm0.m.A(ew4Var.f373762h);
        r45.c50 c50Var2 = ew4Var.f373759e;
        if ((c50Var2 == null || (linkedList = c50Var2.f371295e) == null || !linkedList.isEmpty()) ? false : true) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SyncServiceHandler", "Empty CmdList " + syncData.toJSON());
            d(syncData.f377884e, ew4Var, processor);
            c(syncData);
            ((w11.f2) this.f442051a).b(syncData, processor);
            ((w11.f2) this.f442051a).a(syncData, w11.f.f442017f);
            return;
        }
        synchronized (this.f442054d) {
            this.f442053c.put(java.lang.Integer.valueOf(syncData.f377888i), processor);
            byte[] j19 = w11.c2.f441991a.b().j("process_data_list");
            if (j19 != null) {
                bj6Var = new r45.bj6();
                try {
                    bj6Var.parseFrom(j19);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SyncServiceHandler", e18, "parse data queue", new java.lang.Object[0]);
                }
            } else {
                bj6Var = new r45.bj6();
            }
            z18 = bj6Var.f370812d.size() < 4;
            bj6Var.f370812d.add(syncData);
            size = bj6Var.f370812d.size();
            try {
                z19 = w11.c2.f441991a.b().H("process_data_list", bj6Var.toByteArray());
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SyncServiceHandler", e19, "save data queue", new java.lang.Object[0]);
            }
            if (z19) {
                d(syncData.f377884e, ew4Var, processor);
            } else {
                jx3.f.INSTANCE.idkeyStat(99L, 53L, 1L, false);
            }
            if (syncData.f377890n == 1) {
                jx3.f.INSTANCE.idkeyStat(99L, 102L, 1L, false);
            } else {
                jx3.f.INSTANCE.idkeyStat(99L, 103L, 1L, false);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncServiceHandler", "doProcessCmd: saveResult:" + z19 + " continueSync:" + z18 + " costTime:" + (c01.id.a() - c17) + " queueSize:" + size + " netSceneMap:" + this.f442053c.size() + " syncData:" + syncData.toJSON());
        ((ku5.t0) ku5.t0.f312615d).h(new w11.g2(this), f442050f);
        if (z18) {
            a(syncData, w11.f.f442018g);
        }
    }

    public final void c(r45.jj6 syncData) {
        kotlin.jvm.internal.o.g(syncData, "syncData");
        r45.ew4 ew4Var = syncData.f377883d;
        if (ew4Var != null) {
            gm0.j1.u().c().w(8196, java.lang.Long.valueOf(ew4Var.f373760f));
            boolean z17 = (ew4Var.f373760f & syncData.f377886g) != 0;
            if (!z17) {
                a25.u uVar = com.tencent.mm.plugin.zero.a1.f188619b != null ? (a25.u) com.tencent.mm.plugin.zero.a1.f188619b.get() : null;
                w11.v vVar = new w11.v(syncData);
                if (uVar != null) {
                    boolean z18 = vVar instanceof w11.z0;
                    com.tencent.mm.plugin.messenger.foundation.v2 v2Var = com.tencent.mm.plugin.messenger.foundation.z2.f148769b;
                    if (z18) {
                        v2Var.z(vVar);
                    } else if ((vVar instanceof java.lang.String) && vVar.equals("NetSceneInit")) {
                        v2Var.z(vVar);
                    } else {
                        v2Var.z(vVar);
                    }
                }
            }
            if (!z17 && (ew4Var.f373760f & 256) != 0) {
                com.tencent.mm.autogen.events.SnsSyncEvent snsSyncEvent = new com.tencent.mm.autogen.events.SnsSyncEvent();
                snsSyncEvent.f54843g.f8611a = 3;
                snsSyncEvent.e();
            }
            if (!z17 && (ew4Var.f373760f & 2097152) != 0) {
                new com.tencent.mm.autogen.events.OpenIMSyncEvent().e();
            }
            if (!z17 && (ew4Var.f373760f & 128) != 0) {
                new com.tencent.mm.autogen.events.StorySyncEvent().e();
            }
            if (!z17 && (ew4Var.f373760f & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0) {
                new com.tencent.mm.autogen.events.FinderSyncEvent().e();
            }
            if (z17 || (ew4Var.f373760f & 32) == 0) {
                return;
            }
            new com.tencent.mm.autogen.events.BypNewSyncEvent().e();
        }
    }

    public final void d(boolean z17, r45.ew4 ew4Var, java.lang.Object obj) {
        w11.b2 b2Var = w11.c2.f441991a;
        byte[] a17 = b2Var.a();
        byte[] d17 = x51.j1.d(ew4Var.f373761g);
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncServiceHandler", "mergeSyncBuf processResp %s synckey req:%s  shouldMerge:%s", obj, o45.qi.d(a17), java.lang.Boolean.valueOf(z17));
        r45.cu5 cu5Var = ew4Var.f373761g;
        if (cu5Var != null) {
            if ((cu5Var != null ? cu5Var.f371839d : 0) > 0) {
                if (z17) {
                    byte[] c17 = o45.qi.c(a17, d17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SyncServiceHandler", "processResp synckey merge:%s", o45.qi.d(c17));
                    if (c17 != null) {
                        if (!(c17.length == 0)) {
                            d17 = c17;
                        }
                    }
                    ew4Var.f373761g = x51.j1.a(d17);
                }
                byte[] d18 = x51.j1.d(ew4Var.f373761g);
                if (java.util.Arrays.equals(a17, d18)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SyncServiceHandler", "processResp %s  Sync Key Not change, not save", obj);
                    return;
                } else {
                    b2Var.d(d18, true);
                    return;
                }
            }
        }
        jx3.f.INSTANCE.idkeyStat(99L, 47L, 1L, false);
    }
}
