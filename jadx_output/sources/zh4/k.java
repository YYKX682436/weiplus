package zh4;

@j95.b(dependencies = {e70.q.class})
/* loaded from: classes11.dex */
public final class k extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f472976d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f472977e = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public li4.c f472978f;

    public final void Ai(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTextStatusModelDataByCgiData >> ");
        sb6.append(str == null || str.length() == 0);
        sb6.append(' ');
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.PluginTextStatus", sb6.toString());
        if (!(str2 == null || str2.length() == 0)) {
            if (!(str == null || str.length() == 0)) {
                bw5.ml0 dealCgiStatusModelData = com.tencent.wechat.aff.status.StatusXmlParseManager.getInstance().dealCgiStatusModelData(str, str2);
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.PluginTextStatus", "updateTextStatusModelDataByCgiData >> " + str2 + ' ' + dealCgiStatusModelData.f30281d + ' ' + dealCgiStatusModelData.f30282e);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.PluginTextStatus", "updateTextStatusModelDataByCgiData >> data invalid");
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.PluginTextStatus", "onAccountInitialized: ready");
        ai4.b0 b0Var = ai4.b0.f5123a;
        if (ai4.b0.f5125c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", "transferToAffDB: ready");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            boolean g17 = b0Var.g();
            boolean f17 = b0Var.f();
            if (g17 && f17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", "transferToAffDB: skip");
                b0Var.i();
            } else {
                int n17 = ai4.b0.f5124b.n(b0Var.d());
                ai4.b0.f5128f = n17;
                if (n17 >= b0Var.e()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", "transferToAffDB: reach maxTryCount:" + b0Var.e());
                    qj4.s.s(qj4.s.f363958a, 3L, null, java.lang.Integer.valueOf(ai4.b0.f5128f), null, null, null, null, 122, null);
                    b0Var.i();
                } else {
                    ((kotlinx.coroutines.c3) kotlinx.coroutines.l.d((kotlinx.coroutines.y0) ((jz5.n) ai4.b0.f5129g).getValue(), null, null, new ai4.a0(g17, f17, null), 3, null)).p(new ai4.s(currentTimeMillis));
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.StatusAffDBTransfer", "transferToAffDB: unable");
            b0Var.i();
        }
        this.f472976d = true;
        pm0.v.X(new zh4.i(this));
        oj4.j jVar = oj4.j.f345815a;
        ((ku5.t0) ku5.t0.f312615d).g(oj4.e.f345811d);
        pm0.v.O("TextStatusThread", zh4.j.f472975d);
        ai4.m.f5167a.e();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.PluginTextStatus", "onAccountRelease");
        synchronized (ai4.m.f5167a) {
            if (ai4.m.f5172f) {
                try {
                    com.tencent.wechat.aff.status.StatusStorageManager.getInstance().unSubscribeStatusInfoChangeEvent("plugin_textstatus_bridge_aff_sub_id");
                    com.tencent.mars.xlog.Log.i("MicroMsg.StatusStorageEventBridge", "stop: unsubscribe AFF StatusInfoChange ok, subId=plugin_textstatus_bridge_aff_sub_id");
                    ai4.m.f5172f = false;
                    ai4.m.f5168b.clear();
                    obj = ai4.m.f5169c;
                } catch (java.lang.Throwable th6) {
                    try {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.StatusStorageEventBridge", th6, "stop: unsubscribe AFF StatusInfoChange failed", new java.lang.Object[0]);
                        ai4.m.f5172f = false;
                        ai4.m.f5168b.clear();
                        obj = ai4.m.f5169c;
                        synchronized (obj) {
                            ai4.m.f5170d.clear();
                            ai4.m.f5171e.clear();
                        }
                    } catch (java.lang.Throwable th7) {
                        ai4.m.f5172f = false;
                        ai4.m.f5168b.clear();
                        synchronized (ai4.m.f5169c) {
                            ai4.m.f5170d.clear();
                            ai4.m.f5171e.clear();
                            throw th7;
                        }
                    }
                }
                synchronized (obj) {
                    ai4.m.f5170d.clear();
                    ai4.m.f5171e.clear();
                }
            }
        }
        bk4.i.a().N();
        this.f472976d = false;
        this.f472977e.clear();
        ai4.m0.f5173a.a().close();
        ((bt1.d) ((ct1.u) i95.n0.c(ct1.u.class))).wi(9);
        java.util.Set set = si4.c.f408316c;
        java.util.concurrent.ConcurrentHashMap.KeySetView keySetView = (java.util.concurrent.ConcurrentHashMap.KeySetView) si4.c.f408316c;
        int size = keySetView.size();
        keySetView.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", "onAccountReleased: reportedReadSet cleared, size=" + size);
    }

    public final void wi(yz5.a task) {
        kotlin.jvm.internal.o.g(task, "task");
        if (this.f472976d) {
            task.invoke();
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        this.f472977e.add(task);
    }
}
