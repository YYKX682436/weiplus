package oy1;

/* loaded from: classes13.dex */
public final class c0 implements qy1.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f349846a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f349847b;

    /* renamed from: c, reason: collision with root package name */
    public long f349848c;

    /* renamed from: d, reason: collision with root package name */
    public int f349849d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f349850e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f349851f = new java.util.LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f349852g;

    /* renamed from: h, reason: collision with root package name */
    public final py1.b f349853h;

    /* renamed from: i, reason: collision with root package name */
    public final qy1.b0 f349854i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f349855j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f349856k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f349857l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f349858m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f349859n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f349860o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f349861p;

    /* renamed from: q, reason: collision with root package name */
    public long f349862q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f349863r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f349864s;

    /* JADX WARN: Can't wrap try/catch for region: R(12:8|(2:9|10)|(10:12|d6|17|18|19|20|(5:22|10e|27|28|29)|37|38|29)|46|18|19|20|(0)|37|38|29|6) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010c A[Catch: Exception -> 0x0118, TryCatch #2 {Exception -> 0x0118, blocks: (B:20:0x0100, B:22:0x010c, B:23:0x010e, B:26:0x0113, B:32:0x0116, B:33:0x0117, B:25:0x010f), top: B:19:0x0100, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c0(int r11) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oy1.c0.<init>(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(oy1.c0 r19, java.lang.String r20, r45.uc4 r21) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oy1.c0.b(oy1.c0, java.lang.String, r45.uc4):void");
    }

    public static final void c(oy1.c0 c0Var, java.util.List list) {
        c0Var.getClass();
        java.lang.Long valueOf = java.lang.Long.valueOf(c0Var.f349862q);
        int i17 = c0Var.f349846a;
        ny1.k kVar = new ny1.k(i17, valueOf);
        kVar.f341415b = "LiteAppCustomReportCgiEvent";
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.uc4 uc4Var = (r45.uc4) it.next();
            if (kotlin.jvm.internal.o.b(uc4Var.f387219f, "default")) {
                qy1.g gVar = qy1.g.f367725a;
                java.lang.String d17 = gVar.d(i17, uc4Var);
                long j17 = gVar.j();
                uc4Var.f387221h = j17;
                r45.pq5 pq5Var = uc4Var.f387218e;
                if (pq5Var != null) {
                    pq5Var.f383317h = gVar.f(d17 == null ? "" : d17, j17);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkMsgAndSave ");
                sb6.append(d17);
                sb6.append(' ');
                r45.pq5 pq5Var2 = uc4Var.f387218e;
                sb6.append(pq5Var2 != null ? pq5Var2.f383317h : null);
                sb6.append(" add!");
                com.tencent.mars.xlog.Log.i(c0Var.f349847b, sb6.toString());
                if (d17 == null) {
                    d17 = "";
                }
                c0Var.l("SDKCgiWaitReportMap", d17, uc4Var);
                kVar.a(uc4Var);
            }
        }
        c0Var.m(kVar, "custom collect event");
    }

    public static final void d(oy1.c0 c0Var, ny1.k kVar, boolean z17, boolean z18, boolean z19) {
        jz5.f0 f0Var;
        c0Var.getClass();
        java.lang.String str = kVar.f341415b;
        int i17 = c0Var.f349846a;
        java.lang.String str2 = c0Var.f349847b;
        if (z18) {
            long j17 = kVar.f341419f;
            int i18 = kVar.f341420g;
            if (j17 != c0Var.f349848c || i18 != c0Var.f349849d) {
                com.tencent.mars.xlog.Log.i(str2, "UpdateBatchInfo oldBatchAggregateMs = " + c0Var.f349848c + "oldBatchAggregateCount = " + c0Var.f349849d + "newBatchAggregateMs = " + j17 + " newBatchAggregateCount = " + i18);
                c0Var.f349848c = j17;
                c0Var.f349849d = i18;
            }
            if (kVar.f341423j != c0Var.f349862q) {
                com.tencent.mars.xlog.Log.i(str2, "UpdateBatchInfo configVersion : " + c0Var.f349862q + " --> " + kVar.f341423j);
                c0Var.f349862q = kVar.f341423j;
                qy1.g gVar = qy1.g.f367725a;
                r45.rv rvVar = new r45.rv();
                rvVar.f385221d = kVar.f341423j;
                rvVar.f385222e = java.lang.System.currentTimeMillis();
                java.util.Map map = c0Var.f349859n;
                ((java.util.LinkedHashMap) map).clear();
                java.util.LinkedList<r45.oq5> itemConfs = kVar.f341422i;
                kotlin.jvm.internal.o.f(itemConfs, "itemConfs");
                if (!itemConfs.isEmpty()) {
                    for (r45.oq5 oq5Var : itemConfs) {
                        java.lang.String b17 = qy1.g.f367725a.b(i17, oq5Var.f382451e, oq5Var.f382452f, java.lang.String.valueOf(oq5Var.f382450d));
                        if (b17 != null) {
                            oy1.w wVar = new oy1.w();
                            wVar.f349929a = oq5Var.f382453g;
                            wVar.f349931c = oq5Var.f382454h;
                            wVar.f349930b = oq5Var.f382455i;
                            map.put(b17, wVar);
                            java.util.LinkedList linkedList = rvVar.f385223f;
                            r45.a14 a14Var = new r45.a14();
                            a14Var.f369642e = oq5Var.f382453g;
                            a14Var.f369643f = oq5Var.f382454h;
                            a14Var.f369644g = oq5Var.f382455i;
                            a14Var.f369641d = b17;
                            linkedList.add(a14Var);
                            com.tencent.mars.xlog.Log.i(str2, "add config = " + oq5Var.f382451e + ' ' + oq5Var.f382452f + ' ' + oq5Var.f382450d + ' ' + oq5Var.f382453g + ' ' + oq5Var.f382454h + ' ' + oq5Var.f382455i);
                        }
                    }
                }
                gVar.n(i17, rvVar);
            }
        }
        if (kotlin.jvm.internal.o.b(str, "")) {
            return;
        }
        java.util.concurrent.ConcurrentLinkedQueue itemDataList = kVar.f341416c;
        kotlin.jvm.internal.o.f(itemDataList, "itemDataList");
        java.util.Iterator it = itemDataList.iterator();
        java.lang.Integer valueOf = it.hasNext() ? java.lang.Integer.valueOf(((r45.pq5) it.next()).f383318i) : null;
        if (valueOf == null) {
            throw new java.util.NoSuchElementException("No element of the collection was transformed to a non-null value.");
        }
        int intValue = valueOf.intValue();
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = kVar.f341417d;
        if (concurrentLinkedQueue != null) {
            java.util.Iterator it6 = concurrentLinkedQueue.iterator();
            while (it6.hasNext()) {
                java.lang.Long l17 = (java.lang.Long) it6.next();
                kotlin.jvm.internal.o.d(l17);
                java.lang.String q17 = b52.b.q(l17.longValue());
                qy1.b0 b0Var = c0Var.f349854i;
                r45.uc4 b18 = b0Var.b("SDKCgiWaitReportMap", q17);
                if (b18 != null) {
                    if (!z17) {
                        b18.f387219f = "send_err";
                        b18.f387218e.f383318i = intValue;
                        b18.f387223m = intValue == 0 ? 0L : java.lang.System.currentTimeMillis();
                        b18.f387222i = qy1.g.f367725a.k(intValue);
                        b18.f387224n = kVar.f341421h;
                        b0Var.f("SDKCgiAbnormalReportMap", b18);
                        com.tencent.mars.xlog.Log.e(str2, "send err retry cnt = " + intValue);
                    }
                    if (z19) {
                        com.tencent.mars.xlog.Log.i(str2, kVar.f341415b + ' ' + b18.f387218e.f383317h + " remove end!");
                        if (kotlin.jvm.internal.o.b(b18.f387218e.f383317h, c0Var.f349857l)) {
                            com.tencent.mars.xlog.Log.i(str2, "tryHeartbeat end");
                            oy1.p pVar = oy1.p.f349911a;
                            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                                if (pVar.b() == 2 || pVar.b() == 3) {
                                    oy1.l lVar = oy1.p.f349914d;
                                    if (lVar != null) {
                                        lVar.b();
                                    }
                                } else {
                                    oy1.q0.f349919d.b();
                                    oy1.l lVar2 = oy1.p.f349915e;
                                    if (lVar2 != null) {
                                        lVar2.b();
                                    }
                                }
                            }
                            c0Var.f349857l = null;
                        }
                    }
                    if (z17 && !z19) {
                        b18.f387219f = "send_err";
                        b18.f387224n = kVar.f341421h;
                        qy1.g gVar2 = qy1.g.f367725a;
                        ((ku5.t0) ku5.t0.f312615d).h(new qy1.f(i17, b18), "MicroMsg.MMKvUtils");
                    }
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.e(str2, "get And remove for kWaitingQueueMMkvMapId err cur business id = " + i17);
                }
            }
        }
        c0Var.h();
    }

    public final void e(r45.uc4 uc4Var) {
        if (uc4Var == null) {
            return;
        }
        qy1.g gVar = qy1.g.f367725a;
        int i17 = this.f349846a;
        java.lang.String d17 = gVar.d(i17, uc4Var);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e(this.f349847b, "cur businessId is " + i17 + ", curReportKey err!");
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 i18 = i();
        android.os.Message obtainMessage = i().obtainMessage();
        obtainMessage.what = 1000;
        obtainMessage.obj = nm5.j.c(d17, uc4Var);
        i18.sendMessage(obtainMessage);
    }

    public final void f(java.lang.String str, r45.uc4 localItemData) {
        if (kotlin.jvm.internal.o.b(str, "")) {
            return;
        }
        qy1.b0 b0Var = this.f349854i;
        ny1.k c17 = b0Var.c(str);
        int i17 = this.f349846a;
        if (c17 == null) {
            long j17 = localItemData.f387225o;
            if (j17 == 0) {
                jz5.l lVar = (jz5.l) oy1.m.f349894j.get(java.lang.Integer.valueOf(i17));
                j17 = lVar != null ? ((java.lang.Number) lVar.f302834e).longValue() : 60000L;
            }
            p(str.hashCode(), str, j17);
        }
        long j18 = this.f349862q;
        kotlin.jvm.internal.o.g(localItemData, "localItemData");
        ny1.k c18 = b0Var.c(str);
        if (c18 == null) {
            c18 = new ny1.k(b0Var.f367702a, str, localItemData, false, java.lang.Long.valueOf(j18));
            b0Var.d().put(str, c18);
        } else {
            c18.a(localItemData);
        }
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = c18.f341416c;
        int size = concurrentLinkedQueue != null ? concurrentLinkedQueue.size() : 0;
        com.tencent.mars.xlog.Log.i(this.f349847b, "cur [" + str + "], itemDataList size = " + size);
        oy1.m mVar = oy1.m.f349885a;
        jz5.l lVar2 = (jz5.l) oy1.m.f349894j.get(java.lang.Integer.valueOf(i17));
        if (size >= (lVar2 != null ? ((java.lang.Number) lVar2.f302833d).intValue() : 10)) {
            i().removeMessages(str.hashCode());
            ny1.k c19 = b0Var.c(str);
            if (c19 != null) {
                m(c19, "Size_out");
                this.f349853h.b(null, py1.c.f359051n, null);
                b0Var.d().remove(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        r9 = r10.f387218e;
        r11 = qy1.g.f367725a;
        r12 = r11.d(r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r12 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        r9.f383317h = r11.f(r12, r10.f387221h);
        com.tencent.mars.xlog.Log.i(r17.f349847b, "dispatchHistoryMMkv " + r10.f387218e.f383313d.f381603e + ' ' + r10.f387218e.f383314e + ' ' + r10.f387218e.f383317h + " add!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.String r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f349846a
            java.lang.String r3 = "SDKCgiReportHistoryMap"
            boolean r4 = kotlin.jvm.internal.o.b(r1, r3)
            if (r4 != 0) goto Lda
            qy1.g r4 = qy1.g.f367725a     // Catch: java.lang.Exception -> Lda
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Lda
            com.tencent.mm.sdk.platformtools.o4 r1 = r4.g(r1, r5)     // Catch: java.lang.Exception -> Lda
            if (r1 == 0) goto Lda
            java.lang.String[] r4 = r1.b()     // Catch: java.lang.Exception -> Lda
            if (r4 == 0) goto Lda
            int r5 = r4.length     // Catch: java.lang.Exception -> Lda
            r6 = 0
            r7 = r6
        L23:
            if (r7 >= r5) goto Lda
            r8 = r4[r7]     // Catch: java.lang.Exception -> Lda
            byte[] r9 = r1.j(r8)     // Catch: java.lang.Exception -> Lda
            if (r9 == 0) goto Ld3
            r45.uc4 r10 = new r45.uc4     // Catch: java.lang.Exception -> Lda
            r10.<init>()     // Catch: java.lang.Exception -> Lda
            r10.parseFrom(r9)     // Catch: java.lang.Exception -> Lda
            java.lang.String r9 = "history"
            r10.f387219f = r9     // Catch: java.lang.Exception -> Lda
            long r11 = r10.f387221h     // Catch: java.lang.Exception -> Lda
            r13 = 0
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 > 0) goto L49
            qy1.g r9 = qy1.g.f367725a     // Catch: java.lang.Exception -> Lda
            long r11 = r9.j()     // Catch: java.lang.Exception -> Lda
            r10.f387221h = r11     // Catch: java.lang.Exception -> Lda
        L49:
            long r11 = r10.f387220g     // Catch: java.lang.Exception -> Lda
            boolean r9 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Exception -> Lda
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lda
            long r13 = r13 - r11
            r11 = 1
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r11 = 1
            if (r9 > 0) goto L62
            r15 = 259200000(0xf731400, double:1.280618154E-315)
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 >= 0) goto L62
            r9 = r11
            goto L63
        L62:
            r9 = r6
        L63:
            if (r9 == 0) goto Ld3
            r45.pq5 r9 = r10.f387218e     // Catch: java.lang.Exception -> Lda
            java.lang.String r9 = r9.f383317h     // Catch: java.lang.Exception -> Lda
            if (r9 == 0) goto L73
            int r9 = r9.length()     // Catch: java.lang.Exception -> Lda
            if (r9 != 0) goto L72
            goto L73
        L72:
            r11 = r6
        L73:
            if (r11 == 0) goto Lc0
            r45.pq5 r9 = r10.f387218e     // Catch: java.lang.Exception -> Lda
            qy1.g r11 = qy1.g.f367725a     // Catch: java.lang.Exception -> Lda
            java.lang.String r12 = r11.d(r2, r10)     // Catch: java.lang.Exception -> Lda
            if (r12 != 0) goto L81
            java.lang.String r12 = ""
        L81:
            long r13 = r10.f387221h     // Catch: java.lang.Exception -> Lda
            java.lang.String r11 = r11.f(r12, r13)     // Catch: java.lang.Exception -> Lda
            r9.f383317h = r11     // Catch: java.lang.Exception -> Lda
            java.lang.String r9 = r0.f349847b     // Catch: java.lang.Exception -> Lda
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lda
            r11.<init>()     // Catch: java.lang.Exception -> Lda
            java.lang.String r12 = "dispatchHistoryMMkv "
            r11.append(r12)     // Catch: java.lang.Exception -> Lda
            r45.pq5 r12 = r10.f387218e     // Catch: java.lang.Exception -> Lda
            r45.nq5 r12 = r12.f383313d     // Catch: java.lang.Exception -> Lda
            java.lang.String r12 = r12.f381603e     // Catch: java.lang.Exception -> Lda
            r11.append(r12)     // Catch: java.lang.Exception -> Lda
            r12 = 32
            r11.append(r12)     // Catch: java.lang.Exception -> Lda
            r45.pq5 r13 = r10.f387218e     // Catch: java.lang.Exception -> Lda
            java.lang.String r13 = r13.f383314e     // Catch: java.lang.Exception -> Lda
            r11.append(r13)     // Catch: java.lang.Exception -> Lda
            r11.append(r12)     // Catch: java.lang.Exception -> Lda
            r45.pq5 r12 = r10.f387218e     // Catch: java.lang.Exception -> Lda
            java.lang.String r12 = r12.f383317h     // Catch: java.lang.Exception -> Lda
            r11.append(r12)     // Catch: java.lang.Exception -> Lda
            java.lang.String r12 = " add!"
            r11.append(r12)     // Catch: java.lang.Exception -> Lda
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> Lda
            com.tencent.mars.xlog.Log.i(r9, r11)     // Catch: java.lang.Exception -> Lda
        Lc0:
            if (r19 == 0) goto Lce
            r0.e(r10)     // Catch: java.lang.Exception -> Lda
            py1.b r9 = r0.f349853h     // Catch: java.lang.Exception -> Lda
            py1.c r10 = py1.c.f359060w     // Catch: java.lang.Exception -> Lda
            r11 = 0
            r9.b(r11, r10, r11)     // Catch: java.lang.Exception -> Lda
            goto Ld3
        Lce:
            qy1.b0 r9 = r0.f349854i     // Catch: java.lang.Exception -> Lda
            r9.f(r3, r10)     // Catch: java.lang.Exception -> Lda
        Ld3:
            r1.remove(r8)     // Catch: java.lang.Exception -> Lda
            int r7 = r7 + 1
            goto L23
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oy1.c0.g(java.lang.String, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01e0 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oy1.c0.h():void");
    }

    public final com.tencent.mm.sdk.platformtools.n3 i() {
        return (com.tencent.mm.sdk.platformtools.n3) this.f349863r.getValue();
    }

    public final void j(boolean z17) {
        i().removeMessages(1005);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = this.f349847b;
        if (z17) {
            com.tencent.mm.sdk.platformtools.n3 i17 = i();
            android.os.Message obtainMessage = i().obtainMessage();
            obtainMessage.what = 1006;
            i17.sendMessage(obtainMessage);
            com.tencent.mars.xlog.Log.i(str, "[onAppIn]");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "[onAppOut]");
        com.tencent.mm.sdk.platformtools.n3 i18 = i();
        android.os.Message obtainMessage2 = i().obtainMessage();
        obtainMessage2.what = 1005;
        obtainMessage2.obj = java.lang.Long.valueOf(currentTimeMillis);
        i18.sendMessageDelayed(obtainMessage2, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }

    public final void k(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        qy1.b0 b0Var = this.f349854i;
        b0Var.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(b0Var.d());
        int i17 = 0;
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            m((ny1.k) entry.getValue(), "Clean_out");
            this.f349853h.b(null, py1.c.f359050m, null);
            i().removeMessages(str2.hashCode());
            i17++;
        }
        b0Var.d().clear();
        com.tencent.mars.xlog.Log.i(this.f349847b, "checkToReportAllCollectMap  eventId = " + str + ", count = " + i17 + ", cost = " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public final boolean l(java.lang.String str, java.lang.String str2, r45.uc4 uc4Var) {
        qy1.g gVar = qy1.g.f367725a;
        boolean z17 = qy1.g.f367726b.get();
        if (z17) {
            this.f349857l = null;
        } else if (this.f349857l == null) {
            this.f349857l = uc4Var.f387218e.f383317h;
        } else {
            uc4Var.f387219f = "send_err";
            str = "SDKCgiAbnormalReportMap";
        }
        boolean f17 = this.f349854i.f(str, uc4Var);
        com.tencent.mars.xlog.Log.i(this.f349847b, "checkAndSend mmkv = " + str + " reportKey = " + str2 + ", isBatch = " + uc4Var.f387217d + ", writeFlag = " + f17 + " network " + z17);
        return f17 && kotlin.jvm.internal.o.b("SDKCgiWaitReportMap", str);
    }

    public final void m(ny1.k kVar, java.lang.String logTrace) {
        ny1.a aVar;
        java.util.concurrent.ConcurrentLinkedQueue itemDataList = kVar.f341416c;
        kotlin.jvm.internal.o.f(itemDataList, "itemDataList");
        r45.pq5 pq5Var = (r45.pq5) kz5.n0.Y(itemDataList);
        int i17 = pq5Var != null ? pq5Var.f383318i : 0;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = oy1.m.f349893i;
        int i18 = this.f349846a;
        if (concurrentHashMap.containsKey(java.lang.Integer.valueOf(i18))) {
            aVar = (ny1.a) concurrentHashMap.get(java.lang.Integer.valueOf(i18));
        } else {
            ny1.a aVar2 = new ny1.a(i18, 10072, "/cgi-bin/micromsg-bin/findersdkreport", 0);
            concurrentHashMap.put(java.lang.Integer.valueOf(i18), aVar2);
            aVar = aVar2;
        }
        java.lang.String str = this.f349847b;
        if (aVar != null) {
            ny1.j jVar = new ny1.j(aVar, kVar);
            int i19 = jVar.f341409e.f341396b;
            jz5.g gVar = this.f349855j;
            if (!((java.util.Set) ((jz5.n) gVar).getValue()).contains(java.lang.Integer.valueOf(i19))) {
                com.tencent.mars.xlog.Log.i(str, "add scene end = " + i19 + ",  already = " + ((java.util.Set) ((jz5.n) gVar).getValue()) + ' ');
                gm0.j1.d().a(i19, this.f349864s);
                ((java.util.Set) ((jz5.n) gVar).getValue()).add(java.lang.Integer.valueOf(i19));
            }
            long k17 = qy1.g.f367725a.k(i17);
            qy1.b0 b0Var = this.f349854i;
            b0Var.getClass();
            kotlin.jvm.internal.o.g(logTrace, "logTrace");
            if (oy1.m.f349896l == null) {
                oy1.m.f349896l = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_data_report_sdk_cgi_send_pending_collect, false));
            }
            java.lang.Boolean bool = oy1.m.f349896l;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            kotlinx.coroutines.y0 y0Var = b0Var.f367715n;
            if (booleanValue) {
                kotlinx.coroutines.l.d(y0Var, null, null, new qy1.a0(k17, b0Var, jVar, logTrace, null), 3, null);
            } else {
                kotlinx.coroutines.l.d(y0Var, null, null, new qy1.w(k17, b0Var, jVar, logTrace, null), 3, null);
            }
        }
        com.tencent.mars.xlog.Log.i(str, "businessId = " + i18 + ", reportKey = " + kVar.f341415b + " logTrace = " + logTrace);
    }

    public final void n(com.tencent.mm.modelbase.m1 m1Var, boolean z17, int i17) {
        ny1.j jVar = m1Var instanceof ny1.j ? (ny1.j) m1Var : null;
        if (jVar != null) {
            jVar.f341410f.f341421h = i17;
            com.tencent.mm.sdk.platformtools.n3 i18 = i();
            android.os.Message obtainMessage = i().obtainMessage();
            obtainMessage.what = 1002;
            ny1.k kVar = ((ny1.j) m1Var).f341410f;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            obtainMessage.obj = nm5.j.e(kVar, valueOf, bool, bool);
            i18.sendMessage(obtainMessage);
            com.tencent.mars.xlog.Log.w(this.f349847b, "sendFail and retry end! isCgiEnd = " + z17);
        }
    }

    public final void o(java.lang.String str) {
        ny1.k kVar = new ny1.k(this.f349846a, java.lang.Long.valueOf(this.f349862q));
        kVar.f341415b = "all_force_collect";
        qy1.b0 b0Var = this.f349854i;
        b0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(b0Var.e());
        b0Var.e().clear();
        b0Var.f367707f = 0;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kVar.a((r45.uc4) it.next());
        }
        m(kVar, str);
        com.tencent.mars.xlog.Log.i(this.f349847b, "sendForceCollectList logTrace = " + str + ", itemSize = " + kVar.f341416c.size());
    }

    public final void p(int i17, java.lang.String str, long j17) {
        com.tencent.mars.xlog.Log.i(this.f349847b, "startTimerToDelayReport key = " + i17 + " key hashCode = " + java.lang.Integer.hashCode(i17));
        i().removeMessages(i17);
        com.tencent.mm.sdk.platformtools.n3 i18 = i();
        android.os.Message obtainMessage = i().obtainMessage();
        obtainMessage.what = i17;
        if (str != null) {
            obtainMessage.obj = str;
        }
        i18.sendMessageDelayed(obtainMessage, j17);
    }
}
