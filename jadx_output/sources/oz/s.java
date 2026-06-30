package oz;

@j95.b
/* loaded from: classes12.dex */
public final class s extends jm0.o implements pz.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f350187m = new java.lang.Object();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedHashMap f350188n = new java.util.LinkedHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.feature.download.ScheduledDownloadService$networkChangeListener$1 f350189o;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.feature.download.ScheduledDownloadService$networkChangeListener$1] */
    public s() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f350189o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.feature.cdn.api.NetworkChangeEvent>(a0Var) { // from class: com.tencent.mm.feature.download.ScheduledDownloadService$networkChangeListener$1
            {
                this.__eventId = -211003263;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.feature.cdn.api.NetworkChangeEvent networkChangeEvent) {
                com.tencent.mm.feature.cdn.api.NetworkChangeEvent event = networkChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.ScheduledDownloadService", "networkChangeListener: networkChanged, action=retryPendingTasks");
                if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    oz.s sVar = oz.s.this;
                    synchronized (sVar.f350187m) {
                        for (oz.b bVar : sVar.f350188n.values()) {
                            if (!bVar.f350145d.isEmpty()) {
                                oz.v vVar = bVar.f350144c;
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.util.Iterator it = vVar.f350194a.f196336d.iterator();
                                while (it.hasNext()) {
                                    com.tencent.mm.storage.y9 y9Var = (com.tencent.mm.storage.y9) it.next();
                                    kotlin.jvm.internal.o.d(y9Var);
                                    if (bVar.f350145d.contains(new com.tencent.mm.plugin.msg.MsgIdTalker(y9Var.f196384d, y9Var.f196387g))) {
                                        arrayList.add(y9Var);
                                    }
                                }
                                for (com.tencent.mm.storage.y9 y9Var2 : vVar.f350195b.values()) {
                                    kotlin.jvm.internal.o.d(y9Var2);
                                    if (bVar.f350145d.contains(new com.tencent.mm.plugin.msg.MsgIdTalker(y9Var2.f196384d, y9Var2.f196387g))) {
                                        arrayList.add(y9Var2);
                                    }
                                }
                                java.util.Iterator it6 = arrayList.iterator();
                                int i17 = 0;
                                while (it6.hasNext()) {
                                    com.tencent.mm.storage.y9 y9Var3 = (com.tencent.mm.storage.y9) it6.next();
                                    y9Var3.f196385e = 0L;
                                    oz.v vVar2 = bVar.f350144c;
                                    vVar2.getClass();
                                    if (vVar2.f350194a.f196336d.contains(y9Var3)) {
                                        vVar2.d();
                                    }
                                    i17++;
                                }
                                if (i17 > 0) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ScheduledDownloadService", "resetCooldownForCellularLimitedTasks: scene=" + bVar.f350142a + ", resetCount=" + i17);
                                }
                            }
                        }
                    }
                    sVar.hj();
                }
                return false;
            }
        };
    }

    public static final void Zi(oz.s sVar, int i17, oz.b bVar, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        synchronized (sVar.f350187m) {
            bVar.f350146e.remove(msgIdTalker);
            if (bVar.f350147f.remove(msgIdTalker)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScheduledDownloadService", "handleDownloadResult[" + bVar.f350142a + "]: cancelled, msgId=" + msgIdTalker.f149480d + ", retCode=" + i17);
                bVar.f350145d.remove(msgIdTalker);
                bVar.f350144c.b(msgIdTalker);
                return;
            }
            if (!gm0.j1.a()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ScheduledDownloadService", "handleDownloadResult[" + bVar.f350142a + "]: skip, reason=accountNotReady, msgId=" + msgIdTalker.f149480d);
                return;
            }
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).getClass();
            if (i17 == -21230) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScheduledDownloadService", "handleDownloadResult[" + bVar.f350142a + "]: mobileLimited, msgId=" + msgIdTalker.f149480d + ", retCode=" + i17);
                synchronized (sVar.f350187m) {
                    bVar.f350145d.add(msgIdTalker);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScheduledDownloadService", "handleDownloadResult[" + bVar.f350142a + "]: done, msgId=" + msgIdTalker.f149480d + ", retCode=" + i17);
                synchronized (sVar.f350187m) {
                    bVar.f350145d.remove(msgIdTalker);
                    bVar.f350144c.b(msgIdTalker);
                }
            }
            sVar.ij(bVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0144, code lost:
    
        if (r12.f196386f <= r10.f196386f) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014b, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014d A[Catch: all -> 0x029e, TryCatch #5 {all -> 0x029e, blocks: (B:154:0x013e, B:115:0x014d, B:117:0x0155, B:136:0x0279, B:142:0x027f, B:125:0x028b, B:133:0x0291, B:145:0x0160, B:149:0x0174), top: B:153:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0181 A[EDGE_INSN: B:144:0x0181->B:54:0x0181 BREAK  A[LOOP:3: B:50:0x0134->B:131:0x0134], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x014b A[EDGE_INSN: B:152:0x014b->B:53:0x014b BREAK  A[LOOP:3: B:50:0x0134->B:131:0x0134], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void aj(oz.s r17, oz.b r18) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oz.s.aj(oz.s, oz.b):void");
    }

    @Override // jm0.o
    public void Ni(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        synchronized (this.f350187m) {
            oz.b bVar = new oz.b("auto_sync", new oz.a(1000L, true, "ScheduledDownload_auto_sync", ""));
            this.f350188n.put(bVar.f350142a, bVar);
            oz.b bVar2 = new oz.b("voice_download", new oz.a(1000L, false, "ScheduledDownload_voice_download", "voice_download"));
            this.f350188n.put(bVar2.f350142a, bVar2);
            java.util.Collection values = this.f350188n.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            java.util.Iterator it = values.iterator();
            while (it.hasNext()) {
                ((oz.b) it.next()).a();
            }
        }
        alive();
    }

    @Override // jm0.o
    public void Vi() {
        dead();
        synchronized (this.f350187m) {
            java.util.Collection values = this.f350188n.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            java.util.Iterator it = values.iterator();
            while (it.hasNext()) {
                ((oz.b) it.next()).b();
            }
        }
    }

    public void bj(long j17, java.lang.String talker, java.lang.String scene, boolean z17, boolean z18) {
        oz.b bVar;
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(scene, "scene");
        synchronized (this.f350187m) {
            bVar = (oz.b) this.f350188n.get(scene);
        }
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScheduledDownloadService", "addTask: skip, reason=unknownScene, scene=" + scene + ", msgId=" + j17);
            return;
        }
        if (bVar.f350143b.f350139b) {
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN, java.lang.Boolean.TRUE);
            java.lang.Boolean bool = m17 instanceof java.lang.Boolean ? (java.lang.Boolean) m17 : null;
            if (!(bool != null ? bool.booleanValue() : false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScheduledDownloadService", "addTask: skip, reason=autoSyncDisabled, scene=" + scene + ", msgId=" + j17 + ", talker=" + talker);
                return;
            }
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScheduledDownloadService", "addTask: skip, reason=accountNotReady, scene=" + scene + ", msgId=" + j17);
            return;
        }
        synchronized (this.f350187m) {
            bVar.f350144c.a(j17, talker, z17);
        }
        if (z18) {
            ((ku5.t0) ku5.t0.f312615d).l(new oz.m(this, bVar), 0L, bVar.f350143b.f350140c);
        } else {
            ij(bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0463  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final oz.l cj(com.tencent.mm.storage.f9 r20, oz.b r21, com.tencent.mm.plugin.msg.MsgIdTalker r22) {
        /*
            Method dump skipped, instructions count: 1253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oz.s.cj(com.tencent.mm.storage.f9, oz.b, com.tencent.mm.plugin.msg.MsgIdTalker):oz.l");
    }

    public final long fj() {
        java.lang.String f17 = j62.e.g().f(new com.tencent.mm.repairer.config.file.RepairerConfigAutoDownloadSizeLimit());
        kotlin.jvm.internal.o.f(f17, "getExptString(...)");
        java.lang.Long j17 = r26.h0.j(f17);
        long j18 = 1024;
        return (j17 != null ? j17.longValue() : 80L) * j18 * j18;
    }

    public void hj() {
        java.util.List<oz.b> S0;
        synchronized (this.f350187m) {
            java.util.Collection values = this.f350188n.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            S0 = kz5.n0.S0(values);
        }
        for (oz.b bVar : S0) {
            kotlin.jvm.internal.o.d(bVar);
            ij(bVar);
        }
    }

    public final void ij(oz.b bVar) {
        ku5.u0 u0Var = ku5.t0.f312615d;
        oz.r rVar = new oz.r(this, bVar);
        oz.a aVar = bVar.f350143b;
        ((ku5.t0) u0Var).l(rVar, aVar.f350138a, aVar.f350140c);
    }

    @Override // jm0.o
    public java.lang.String wi() {
        return "MicroMsg.ScheduledDownloadService";
    }
}
