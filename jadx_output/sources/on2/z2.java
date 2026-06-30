package on2;

/* loaded from: classes3.dex */
public final class z2 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final int f347088f;

    /* renamed from: g, reason: collision with root package name */
    public final zg2.d f347089g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.g0 f347090h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f347091i;

    /* renamed from: m, reason: collision with root package name */
    public km2.z f347092m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.concurrent.ConcurrentLinkedDeque f347093n;

    /* renamed from: o, reason: collision with root package name */
    public r45.ht1 f347094o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.j0 f347095p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f347096q;

    /* renamed from: r, reason: collision with root package name */
    public r45.a94 f347097r;

    /* renamed from: s, reason: collision with root package name */
    public km2.z f347098s;

    /* renamed from: t, reason: collision with root package name */
    public r45.k74 f347099t;

    /* renamed from: u, reason: collision with root package name */
    public final int f347100u;

    /* renamed from: v, reason: collision with root package name */
    public final int f347101v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f347088f = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3784j5).getValue()).r()).intValue();
        zg2.d dVar = new zg2.d(null, 1, null);
        dVar.f472822d = new on2.k2(dVar);
        this.f347089g = dVar;
        this.f347090h = dVar;
        this.f347091i = new java.util.LinkedList();
        this.f347093n = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f347095p = new androidx.lifecycle.j0(java.lang.Boolean.FALSE);
        this.f347097r = new r45.a94();
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3811m2).getValue()).r()).intValue();
        this.f347100u = intValue;
        this.f347101v = intValue / 2;
    }

    public static /* synthetic */ java.lang.Object R6(on2.z2 z2Var, boolean z17, android.content.Context context, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            context = null;
        }
        return z2Var.Q6(z17, context, continuation);
    }

    public final java.lang.Object N6(r45.dz1 dz1Var, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        java.lang.String string;
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        long j17 = ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0);
        long j18 = ((mm2.e1) business(mm2.e1.class)).f328983m;
        java.lang.String str = ((mm2.e1) business(mm2.e1.class)).f328992v;
        int integer = dz1Var.getInteger(1);
        java.lang.String string2 = dz1Var.getString(2);
        java.lang.String str2 = "";
        if (string2 == null) {
            string2 = "";
        }
        r45.xy1 xy1Var = (r45.xy1) dz1Var.getCustom(3);
        int integer2 = xy1Var != null ? xy1Var.getInteger(0) : 0;
        r45.xy1 xy1Var2 = (r45.xy1) dz1Var.getCustom(3);
        if (xy1Var2 != null && (string = xy1Var2.getString(1)) != null) {
            str2 = string;
        }
        int integer3 = dz1Var.getInteger(4);
        long j19 = dz1Var.getLong(5);
        com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(((mm2.e1) business(mm2.e1.class)).f328985o);
        r45.yy1 yy1Var = (r45.yy1) dz1Var.getCustom(6);
        int integer4 = dz1Var.getInteger(0);
        r45.gz1 gz1Var = (r45.gz1) dz1Var.getCustom(9);
        r45.xy1 xy1Var3 = (r45.xy1) dz1Var.getCustom(3);
        ek2.s0 s0Var = new ek2.s0(new ek2.t0(j17, j18, str, integer, string2, integer2, str2, 0, integer3, j19, b17, yy1Var, integer4, gz1Var, xy1Var3 != null ? xy1Var3.getString(3) : null));
        az2.j.u(s0Var, context, null, 0L, 6, null);
        pq5.g l17 = s0Var.l();
        l17.K(new on2.n2(this, nVar));
        l17.f(this);
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public final androidx.lifecycle.j0 O6() {
        return this.f347095p;
    }

    public final java.util.concurrent.ConcurrentLinkedDeque P6() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LAST_LOTTERYID_STRING_SYNC, "");
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) m17;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = new java.util.concurrent.ConcurrentLinkedDeque();
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", "getLotteryIdList lotteryList is empty!");
        } else {
            java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"|"}, false, 0, 6, null);
            int size = f07.size();
            for (int i17 = 0; i17 < size; i17++) {
                java.lang.String str2 = (java.lang.String) f07.get(i17);
                java.util.List f08 = r26.n0.f0(str2, new java.lang.String[]{":"}, false, 0, 6, null);
                if (f08.size() == 2) {
                    long E1 = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) f08.get(0));
                    java.lang.String str3 = (java.lang.String) f08.get(1);
                    if (E1 != 0) {
                        if (!(str3 == null || str3.length() == 0)) {
                            concurrentLinkedDeque.add(new jz5.l(java.lang.Long.valueOf(E1), str3));
                        }
                    }
                    if (zl2.q4.f473933a.E()) {
                        com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", "getLotteryIdList invalid liveId lotteryInfo:" + str2);
                    }
                } else if (zl2.q4.f473933a.E()) {
                    com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", "getLotteryIdList invalid lotteryInfo:" + str2);
                }
            }
            com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", "getLotteryIdList lotteryList:" + concurrentLinkedDeque);
        }
        return concurrentLinkedDeque;
    }

    public final java.lang.Object Q6(boolean z17, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        r45.ct1 ct1Var = new r45.ct1();
        ct1Var.set(1, db2.t4.f228171a.a(8605));
        ct1Var.set(2, java.lang.Long.valueOf(((mm2.e1) business(mm2.e1.class)).f328983m));
        ct1Var.set(3, com.tencent.mm.protobuf.g.b(((mm2.e1) business(mm2.e1.class)).f328985o));
        ct1Var.set(4, ((mm2.e1) business(mm2.e1.class)).f328992v);
        ct1Var.set(5, ((mm2.c1) business(mm2.c1.class)).f328852o);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 8605;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetlotterypanel";
        lVar.f70664a = ct1Var;
        lVar.f70665b = new r45.dt1();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        az2.j jVar = (az2.j) wi6;
        if (z17) {
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            android.content.Context context2 = context;
            kotlin.jvm.internal.o.d(context2);
            az2.j.u(jVar, context2, null, 0L, 6, null);
        }
        pq5.g l17 = jVar.l();
        if (l17 != null) {
            l17.K(new on2.p2(this, nVar));
            l17.f(this);
        }
        java.lang.Object a18 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a18;
    }

    public final boolean S6() {
        r45.cz1 cz1Var;
        km2.z zVar = this.f347092m;
        boolean z17 = pm0.v.z((zVar == null || (cz1Var = zVar.f309232d) == null) ? 0 : cz1Var.getInteger(9), 1);
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", "haveParticipated :" + z17);
        return z17;
    }

    public final boolean T6() {
        km2.z zVar = this.f347092m;
        return zVar != null && zVar.f309229a == 2;
    }

    public final boolean U6(r45.cz1 cz1Var, r45.cz1 cz1Var2) {
        if (!kotlin.jvm.internal.o.b(cz1Var.getString(0), cz1Var2.getString(0))) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", "isRemoteItemValid invalid id:" + cz1Var.getString(0) + ',' + cz1Var2.getString(0));
            return false;
        }
        int integer = cz1Var2.getInteger(8);
        int integer2 = cz1Var.getInteger(8);
        int integer3 = cz1Var2.getInteger(3);
        int integer4 = cz1Var.getInteger(3);
        if (integer4 >= integer3) {
            if (integer3 < integer4) {
                com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", "printLotteryInfoList RemoteItem:" + pm0.b0.g(java.lang.Integer.valueOf(integer2)) + " invalid");
                return false;
            }
            if ((integer2 == 1 && integer != 1) || (integer2 == 2 && integer == 3)) {
                com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", "printLotteryInfoList RemoteItem:" + pm0.b0.g(java.lang.Integer.valueOf(integer2)) + " invalid");
                return false;
            }
        }
        return true;
    }

    public final boolean V6() {
        km2.z zVar = this.f347092m;
        return zVar != null && zVar.f309229a == 1;
    }

    public final boolean W6(java.lang.String lotteryId) {
        kotlin.jvm.internal.o.g(lotteryId, "lotteryId");
        if (this.f347093n.isEmpty()) {
            this.f347093n = P6();
        }
        java.util.Iterator it = this.f347093n.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                return false;
            }
            jz5.l lVar = (jz5.l) it.next();
            r45.nw1 nw1Var = ((mm2.e1) business(mm2.e1.class)).f328988r;
            if (nw1Var != null && ((java.lang.Number) lVar.f302833d).longValue() == nw1Var.getLong(0)) {
                z17 = true;
            }
            if (z17 && kotlin.jvm.internal.o.b(lVar.f302834e, lotteryId)) {
                return true;
            }
        }
    }

    public final void X6(r45.ht1 ht1Var) {
        pm0.v.X(new on2.q2(ht1Var, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y6(int r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on2.z2.Y6(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void Z6(java.lang.String prefix, boolean z17) {
        kotlin.jvm.internal.o.g(prefix, "prefix");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("printLotteryInfoList(" + prefix + ",fromJoinLive:" + z17 + ")：");
        int i17 = 0;
        for (java.lang.Object obj : this.f347091i) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append("index:" + i17 + ',' + ((km2.z) obj) + "};");
            i17 = i18;
        }
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", sb6.toString());
    }

    public final void a7(r45.yy1 yy1Var) {
        r45.cz1 cz1Var;
        kotlin.jvm.internal.o.g(yy1Var, "new");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replaceClaimMethod from ");
        km2.z zVar = this.f347092m;
        java.lang.Object obj = (zVar == null || (cz1Var = zVar.f309232d) == null) ? null : (r45.yy1) cz1Var.getCustom(13);
        if (obj == null) {
            obj = "";
        }
        sb6.append(pm0.b0.g(obj));
        sb6.append(" to ");
        sb6.append(pm0.b0.g(yy1Var));
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", sb6.toString());
        km2.z zVar2 = this.f347092m;
        r45.cz1 cz1Var2 = zVar2 != null ? zVar2.f309232d : null;
        if (cz1Var2 == null) {
            return;
        }
        cz1Var2.set(13, yy1Var);
    }

    public final void b7(java.util.LinkedList liveMsgLotteryInfoList, boolean z17) {
        kotlin.jvm.internal.o.g(liveMsgLotteryInfoList, "liveMsgLotteryInfoList");
        pm0.v.X(new on2.v2(z17, this, liveMsgLotteryInfoList));
    }

    public final void c7(java.lang.String str) {
        r45.nw1 nw1Var = ((mm2.e1) business(mm2.e1.class)).f328988r;
        if (str != null) {
            if (this.f347093n.isEmpty()) {
                this.f347093n = P6();
            }
            java.util.Iterator it = this.f347093n.iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                jz5.l lVar = (jz5.l) it.next();
                r45.nw1 nw1Var2 = ((mm2.e1) business(mm2.e1.class)).f328988r;
                if (nw1Var2 != null && ((java.lang.Number) lVar.f302833d).longValue() == nw1Var2.getLong(0)) {
                    it.remove();
                    break;
                }
            }
            int size = this.f347093n.size();
            int i17 = this.f347101v;
            int i18 = this.f347100u;
            if (size > i18) {
                for (int i19 = 0; i19 < i17; i19++) {
                    this.f347093n.removeLast();
                }
            }
            this.f347093n.add(new jz5.l(java.lang.Long.valueOf(nw1Var.getLong(0)), str));
            java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f347093n;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it6 = concurrentLinkedDeque.iterator();
            kotlin.jvm.internal.o.f(it6, "iterator(...)");
            while (it6.hasNext()) {
                jz5.l lVar2 = (jz5.l) it6.next();
                sb6.append(((java.lang.Number) lVar2.f302833d).longValue() + ':' + ((java.lang.String) lVar2.f302834e));
                sb6.append("|");
            }
            if (!(sb6.length() == 0)) {
                sb6.deleteCharAt(sb6.length() - 1);
            }
            java.lang.String sb7 = sb6.toString();
            kotlin.jvm.internal.o.f(sb7, "toString(...)");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LAST_LOTTERYID_STRING_SYNC, sb7);
            com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", "saveLastWinLotteryId MAX_LOTTERY_ID_LIST:" + i18 + ",DROP_LIST_SIZE:" + i17 + ",liveId:" + nw1Var.getLong(0) + ",lotteryId:" + str + ",lotteryList:" + this.f347093n + ",cacheListStr:" + sb7);
        }
    }

    public final void d7(boolean z17) {
        boolean z18 = pm0.v.z(((mm2.c1) business(mm2.c1.class)).Q1, 262144);
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", "isSecurityDisable = " + z18);
        if (z18) {
            this.f347096q = false;
        } else {
            this.f347096q = z17;
        }
    }

    public final void e7(r45.ht1 ht1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set lotteryRecord:");
        java.lang.Object obj = this.f347094o;
        if (obj == null) {
            obj = "";
        }
        sb6.append(pm0.b0.g(obj));
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", sb6.toString());
        this.f347094o = ht1Var;
    }

    public final void f7() {
        ae2.in inVar = ae2.in.f3688a;
        d7((((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3771i2).getValue()).r()).intValue() == 1) || zl2.q4.f473933a.E());
    }

    public final void g7(r45.cz1 cz1Var) {
        pm0.v.X(new on2.y2(cz1Var, this));
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        pm0.v.X(new on2.w2(this));
        pm0.v.X(new on2.m2(this));
        this.f347093n = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f347098s = null;
        d7(false);
        e7(null);
        this.f347097r = new r45.a94();
    }
}
