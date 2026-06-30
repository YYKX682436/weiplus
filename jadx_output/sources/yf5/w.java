package yf5;

/* loaded from: classes11.dex */
public final class w extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f461960d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f461961e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.mvvmlist.MvvmList f461962f;

    /* renamed from: g, reason: collision with root package name */
    public yf5.m f461963g;

    /* renamed from: h, reason: collision with root package name */
    public yf5.a f461964h;

    /* renamed from: i, reason: collision with root package name */
    public yf5.w0 f461965i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f461966m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f461967n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f461968o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f461969p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f461970q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f461971r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f461972s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f461973t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f461974u;

    public w(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f461960d = context;
        this.f461961e = "MicroMsg.ConversationAdapter.ConversationDataSource";
        this.f461966m = jz5.h.b(new yf5.v(this));
        this.f461967n = jz5.h.b(new yf5.u(this));
        this.f461968o = jz5.h.b(yf5.t.f461951d);
        this.f461969p = jz5.h.b(yf5.s.f461949d);
        this.f461970q = new java.util.ArrayList();
        int o17 = com.tencent.mm.sdk.platformtools.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536);
        this.f461971r = o17 == 262144 || o17 == 65536;
        this.f461972s = new java.util.concurrent.ConcurrentHashMap();
        this.f461973t = true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:218|(4:220|(2:222|(2:224|(1:226)))(2:238|(1:244))|228|(5:230|(1:232)(1:237)|233|(1:235)|236))|245|246|247|(1:249)|250|228|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0777, code lost:
    
        if (r3 != 131) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x07ec, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x07ed, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConversationWithCacheAdapter", r0, "", new java.lang.Object[0]);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0148, code lost:
    
        if (((r0 == null || (r0 = r0.f461995d) == null || r40.a1() != r0.a1()) ? false : true) == false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0adc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0b02 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0a51  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yf5.x d(com.tencent.mm.storage.l4 r40, com.tencent.mm.storage.z3 r41) {
        /*
            Method dump skipped, instructions count: 2937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf5.w.d(com.tencent.mm.storage.l4, com.tencent.mm.storage.z3):yf5.x");
    }

    public final void e(com.tencent.mm.storage.l4 l4Var, yf5.x xVar, com.tencent.mm.storage.z3 z3Var) {
        java.lang.String h17 = l4Var.h1();
        boolean z17 = true;
        if (z3Var == null) {
            kotlin.jvm.internal.o.d(h17);
            z3Var = gm0.j1.a() ? ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(h17, true) : null;
        }
        if (z3Var != null) {
            xVar.f462002n = z3Var.f236586x1;
            xVar.f462001m = (int) z3Var.E2;
        } else {
            xVar.f462002n = -1;
            xVar.f462001m = -1;
        }
        xVar.f462009u = z3Var != null;
        if (z3Var != null) {
            z3Var.B2();
        }
        xVar.f462010v = z3Var != null && z3Var.T == 0;
        boolean R4 = com.tencent.mm.storage.z3.R4(h17);
        xVar.f462006r = R4;
        xVar.f462008t = R4 && xVar.f462010v;
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        boolean z18 = xVar.f462006r;
        ((sg3.a) v0Var).getClass();
        java.lang.String d17 = c01.a2.d(z3Var, h17, z18);
        xVar.f461997f = d17;
        boolean z19 = xVar.f462006r;
        android.content.Context context = this.f461960d;
        if (z19 && com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            xVar.f461996e = context.getString(com.tencent.mm.R.string.b5v);
        } else {
            if (h17 != null && r26.i0.p(h17, "conversationboxservice", true)) {
                xVar.f461996e = context.getString(com.tencent.mm.R.string.f492258fu1);
            } else {
                boolean m47 = com.tencent.mm.storage.z3.m4(z3Var != null ? z3Var.d1() : null);
                jz5.g gVar = this.f461966m;
                if (m47) {
                    j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
                    java.lang.String str = xVar.f461997f;
                    ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
                    ((l41.q2) b0Var).getClass();
                    xVar.f461996e = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str);
                } else {
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String str2 = xVar.f461997f;
                    float intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
                    ((ke0.e) xVar2).getClass();
                    xVar.f461996e = com.tencent.mm.pluginsdk.ui.span.c0.n(context, str2, intValue);
                }
            }
        }
        xVar.f462007s = z3Var != null && c01.e2.P(z3Var);
        xVar.f462014z = com.tencent.mm.ui.conversation.w3.b(l4Var);
        if (!com.tencent.mm.storage.z3.q4(l4Var.h1()) && !c01.e2.E(l4Var.h1())) {
            z17 = false;
        }
        xVar.f462012x = z17;
        if (!com.tencent.mm.storage.z3.m4(l4Var.h1()) || z3Var == null) {
            return;
        }
        java.lang.String fj6 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(z3Var.Q0(), z3Var.G0());
        if (fj6 == null) {
            fj6 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(fj6)) {
            return;
        }
        if (kotlin.jvm.internal.o.b("3552365301", z3Var.Q0())) {
            fj6 = "@".concat(fj6);
        }
        xVar.f462013y = fj6;
    }

    public final java.lang.CharSequence f(com.tencent.mm.storage.l4 conv) {
        kotlin.jvm.internal.o.g(conv, "conv");
        int a17 = conv.a1();
        android.content.Context context = this.f461960d;
        if (a17 == 1) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.gqx);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        if (conv.w0() == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            return "";
        }
        long w07 = conv.w0();
        yf5.r rVar = yf5.r.f461944a;
        java.lang.CharSequence f17 = k35.m1.f(context, w07, true, ((java.lang.Boolean) ((jz5.n) yf5.r.f461946c).getValue()).booleanValue());
        kotlin.jvm.internal.o.f(f17, "formatTimeInList(...)");
        return f17;
    }

    public final yf5.l0 g(yf5.k0 request) {
        boolean z17;
        long G0;
        kotlin.jvm.internal.o.g(request, "request");
        long nanoTime = java.lang.System.nanoTime();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p75.d dVar = dm.i2.W;
        p75.m m17 = dVar.m();
        int o17 = com.tencent.mm.sdk.platformtools.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536);
        if (o17 == 262144 || o17 == 65536) {
            m17 = m17.d(dVar.j("message_fold"));
        }
        p75.m a17 = g95.x.f269827a.a(m17);
        p75.i0 i17 = i();
        p75.d dVar2 = dm.i2.T;
        i17.f352657d = dVar2.w(java.lang.Long.valueOf(request.f461897c)).c(a17);
        i17.f352659f = kz5.b0.c(new g95.v());
        i17.c(request.f461898d, 0);
        p75.l0 a18 = i17.a();
        jz5.g gVar = this.f461968o;
        java.util.List k17 = a18.k(((jm0.l) ((jz5.n) gVar).getValue()).Q4(), com.tencent.mm.storage.l4.class);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) k17;
        boolean z18 = arrayList2.size() >= request.f461898d;
        java.lang.String str = this.f461961e;
        if (z18 && ((com.tencent.mm.storage.l4) kz5.n0.X(k17)).G0() == ((com.tencent.mm.storage.l4) kz5.n0.i0(k17)).G0()) {
            com.tencent.mars.xlog.Log.w(str, "all flag is same, count: " + arrayList2.size() + ", flag: " + ((com.tencent.mm.storage.l4) kz5.n0.X(k17)).G0());
            p75.i0 i18 = i();
            i18.f352657d = a17.c(dVar2.i(java.lang.Long.valueOf(((com.tencent.mm.storage.l4) kz5.n0.X(k17)).G0())));
            k17 = i18.a().k(((jm0.l) ((jz5.n) gVar).getValue()).Q4(), com.tencent.mm.storage.l4.class);
            z17 = true;
        } else {
            z17 = false;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : k17) {
            if (!this.f461970q.contains(((com.tencent.mm.storage.l4) obj).h1())) {
                arrayList3.add(obj);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
        java.util.Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((com.tencent.mm.storage.l4) it.next()).h1());
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator it6 = ((java.util.ArrayList) d75.b.c(arrayList4, 100)).iterator();
        while (it6.hasNext()) {
            java.util.List list = (java.util.List) it6.next();
            p75.i0 i19 = dm.e2.N1.i();
            java.util.Iterator it7 = it6;
            i19.f352657d = dm.e2.P1.l(list);
            java.util.List list2 = k17;
            for (java.util.Iterator it8 = ((java.util.ArrayList) i19.a().k(gm0.j1.u().f273153f, com.tencent.mm.storage.z3.class)).iterator(); it8.hasNext(); it8 = it8) {
                com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) it8.next();
                java.lang.String d17 = z3Var.d1();
                kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                hashMap.put(d17, z3Var);
            }
            java.util.Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                arrayList5.add(hashMap.get((java.lang.String) it9.next()));
            }
            it6 = it7;
            k17 = list2;
        }
        java.util.List list3 = k17;
        if (arrayList3.size() != arrayList5.size()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ConversationDataSource: may getContact error, ");
            sb6.append(com.tencent.mm.sdk.platformtools.h2.a(arrayList4, ","));
            sb6.append(", ");
            java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(arrayList5, 10));
            for (java.util.Iterator it10 = arrayList5.iterator(); it10.hasNext(); it10 = it10) {
                com.tencent.mm.storage.z3 z3Var2 = (com.tencent.mm.storage.z3) it10.next();
                arrayList6.add(z3Var2 != null ? z3Var2.d1() : null);
            }
            sb6.append(com.tencent.mm.sdk.platformtools.h2.a(arrayList6, ","));
            com.tencent.mars.xlog.Log.e(str, sb6.toString());
        }
        int size = arrayList3.size();
        int i27 = 0;
        while (i27 < size) {
            int i28 = size;
            yf5.x d18 = d((com.tencent.mm.storage.l4) arrayList3.get(i27), (com.tencent.mm.storage.z3) arrayList5.get(i27));
            if (d18 == null) {
                d18 = new yf5.x();
                d18.f461995d = (com.tencent.mm.storage.l4) arrayList3.get(i27);
            }
            arrayList.add(d18);
            i27++;
            size = i28;
        }
        com.tencent.mars.xlog.Log.i(str, "get data list " + request.f461895a + ' ' + request.f461897c + ", " + request.f461898d + ", result: " + arrayList.size() + ", cost: " + (java.lang.System.nanoTime() - nanoTime));
        com.tencent.mm.sdk.platformtools.h2.a(arrayList4, ",");
        yf5.l0 l0Var = new yf5.l0(request);
        l0Var.f461905c = z18;
        l0Var.f461904b = arrayList;
        if (z17) {
            G0 = ((com.tencent.mm.storage.l4) kz5.n0.i0(list3)).G0() - 1;
        } else {
            com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) kz5.n0.k0(list3);
            G0 = l4Var != null ? l4Var.G0() : 0L;
        }
        l0Var.f461906d = G0;
        return l0Var;
    }

    public final yf5.x h(java.lang.String str) {
        p75.m a17 = g95.x.f269827a.a(dm.i2.L.j(str));
        p75.i0 i17 = dm.i2.K.i();
        i17.f352657d = a17;
        com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) i17.a().o(((jm0.l) ((jz5.n) this.f461968o).getValue()).Q4(), com.tencent.mm.storage.l4.class);
        if (l4Var != null) {
            return d(l4Var, null);
        }
        return null;
    }

    public final p75.i0 i() {
        return dm.i2.K.g(kz5.c0.i(dm.i2.M, dm.i2.N, dm.i2.P, dm.i2.Q, dm.i2.L, dm.i2.R, dm.i2.S, dm.i2.T, dm.i2.U, dm.i2.V, dm.i2.X, dm.i2.Y, dm.i2.Z, dm.i2.f237526p0, dm.i2.f237528x0, dm.i2.f237530y0, dm.i2.f237525l1, dm.i2.f237527p1, dm.i2.W));
    }

    public final boolean j(yf5.x xVar) {
        com.tencent.mm.storage.l4 l4Var;
        if (xVar == null || (l4Var = xVar.f461995d) == null) {
            return false;
        }
        return kotlin.jvm.internal.o.b(l4Var.W0(), "message_fold") || com.tencent.mm.sdk.platformtools.t8.K0(l4Var.W0());
    }

    public final void k(int i17, java.lang.String username) {
        yf5.m mVar;
        kotlin.jvm.internal.o.g(username, "username");
        boolean z17 = true;
        if (i17 == 2) {
            yf5.x h17 = h(username);
            if (h17 == null || !j(h17) || (mVar = this.f461963g) == null) {
                return;
            }
            v65.i.b(mVar.f461910d, null, new yf5.k(mVar, h17, mVar.f461912f.f461864b, null), 1, null);
            return;
        }
        java.lang.String str = this.f461961e;
        if (i17 == 3 || i17 == 4) {
            yf5.x h18 = h(username);
            if (h18 != null) {
                int o17 = com.tencent.mm.sdk.platformtools.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536);
                if (!(o17 == 262144 || o17 == 65536)) {
                    com.tencent.mm.storage.l4 l4Var = h18.f461995d;
                    if (kotlin.jvm.internal.o.b(l4Var != null ? l4Var.W0() : null, "message_fold") && h18.f462014z == 0) {
                        yf5.m mVar2 = this.f461963g;
                        if (mVar2 != null) {
                            mVar2.c(username);
                            return;
                        }
                        return;
                    }
                }
                if (j(h18)) {
                    yf5.m mVar3 = this.f461963g;
                    if (mVar3 != null) {
                        v65.i.b(mVar3.f461910d, null, new yf5.l(mVar3, h18, true, mVar3.f461912f.f461864b, null), 1, null);
                        return;
                    }
                    return;
                }
                yf5.m mVar4 = this.f461963g;
                if (mVar4 != null) {
                    mVar4.c(username);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove conv, parentRef: ");
                com.tencent.mm.storage.l4 l4Var2 = h18.f461995d;
                sb6.append(l4Var2 != null ? l4Var2.W0() : null);
                sb6.append(", name: ");
                com.tencent.mm.storage.l4 l4Var3 = h18.f461995d;
                sb6.append(l4Var3 != null ? l4Var3.h1() : null);
                com.tencent.mars.xlog.Log.w(str, sb6.toString());
                return;
            }
            return;
        }
        if (i17 == 5) {
            if (kotlin.jvm.internal.o.b(username, "")) {
                yf5.m mVar5 = this.f461963g;
                if (mVar5 != null) {
                    mVar5.b();
                    return;
                }
                return;
            }
            this.f461972s.remove(username);
            yf5.m mVar6 = this.f461963g;
            if (mVar6 != null) {
                mVar6.c(username);
                return;
            }
            return;
        }
        if (i17 != 8) {
            return;
        }
        int o18 = com.tencent.mm.sdk.platformtools.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536);
        if (o18 != 262144 && o18 != 65536) {
            z17 = false;
        }
        if (this.f461971r != z17) {
            this.f461971r = z17;
            com.tencent.mars.xlog.Log.i(str, "isShowPlaceTop change: " + z17);
            if (!this.f461971r) {
                yf5.m mVar7 = this.f461963g;
                if (mVar7 != null) {
                    mVar7.b();
                    return;
                }
                return;
            }
            yf5.m mVar8 = this.f461963g;
            if (mVar8 != null) {
                java.util.List a17 = mVar8.a();
                com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = mVar8.f461907a.f461962f;
                if (mvvmList != null) {
                    mvvmList.n(a17, false);
                }
            }
        }
    }

    public final void l() {
        java.util.ArrayList arrayList = this.f461970q;
        arrayList.clear();
        boolean z17 = ((c01.z1.p() & 32768) == 0) && ((c01.z1.p() & 4096) != 0);
        if (z17 != this.f461973t) {
            if (z17) {
                k(5, "floatbottle");
            } else {
                k(2, "floatbottle");
            }
            this.f461973t = z17;
        }
        if (this.f461973t) {
            arrayList.add("floatbottle");
        }
        arrayList.add("qmessage");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_notify_msg_enable, false);
        com.tencent.mars.xlog.Log.i(this.f461961e, "isShowAppBrandNotifyMsgEntry: %b", java.lang.Boolean.valueOf(fj6));
        if (fj6 != this.f461974u) {
            if (fj6) {
                k(2, "appbrand_notify_message");
            } else {
                k(5, "appbrand_notify_message");
            }
            this.f461974u = fj6;
        }
        if (this.f461974u) {
            return;
        }
        arrayList.add("appbrand_notify_message");
    }
}
