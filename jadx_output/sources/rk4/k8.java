package rk4;

/* loaded from: classes11.dex */
public final class k8 implements qk.f9, kotlinx.coroutines.y0 {

    /* renamed from: r, reason: collision with root package name */
    public static final rk4.u6 f396788r = new rk4.u6(null);

    /* renamed from: s, reason: collision with root package name */
    public static final com.tencent.mm.flutter.ui.FlutterPageStyle f396789s = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 3581, null);

    /* renamed from: t, reason: collision with root package name */
    public static al4.a f396790t;

    /* renamed from: u, reason: collision with root package name */
    public static final jz5.g f396791u;

    /* renamed from: v, reason: collision with root package name */
    public static yz5.a f396792v;

    /* renamed from: w, reason: collision with root package name */
    public static long f396793w;

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.Class f396794x;

    /* renamed from: d, reason: collision with root package name */
    public final oz5.l f396795d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f396796e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ar0 f396797f;

    /* renamed from: g, reason: collision with root package name */
    public pi0.l1 f396798g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f396799h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Boolean f396800i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Boolean f396801m;

    /* renamed from: n, reason: collision with root package name */
    public long f396802n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f396803o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f396804p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f396805q;

    static {
        jz5.h.b(rk4.t6.f396981d);
        f396791u = jz5.h.b(rk4.s6.f396969d);
        f396794x = com.tencent.mm.plugin.ting.TingFlutterActivity.class;
    }

    public k8() {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f396795d = kotlinx.coroutines.internal.b0.f310484a.plus(kotlinx.coroutines.t3.a(null, 1, null));
        this.f396796e = "";
        this.f396797f = bw5.ar0.TingScene_UnDefined;
        this.f396799h = "TingRouter";
        this.f396803o = jz5.h.b(rk4.y7.f397108d);
        jz5.h.b(rk4.z6.f397129d);
        this.f396804p = jz5.h.b(rk4.g8.f396682d);
        this.f396805q = jz5.h.b(new rk4.n7(this));
        if (rk4.i5.f396721e) {
            return;
        }
        rk4.i5.f396721e = true;
        int i17 = jm4.j1.f300393d;
        urgen.ur_0025.UR_68E4.UR_2E66(rk4.i5.f396720d);
    }

    public static /* synthetic */ java.lang.Object K(rk4.k8 k8Var, pi0.l1 l1Var, java.lang.String str, java.util.Map map, boolean z17, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            map = null;
        }
        java.util.Map map2 = map;
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        return k8Var.J(l1Var, str, map2, z17, continuation);
    }

    public static java.lang.Object P(rk4.k8 k8Var, pi0.l1 l1Var, android.content.Context context, boolean z17, java.lang.Long l17, java.lang.Boolean bool, boolean z18, android.os.Bundle bundle, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        boolean z19 = (i17 & 2) != 0 ? false : z17;
        java.lang.Long l18 = (i17 & 4) != 0 ? null : l17;
        java.lang.Boolean bool2 = (i17 & 8) != 0 ? null : bool;
        boolean z27 = (i17 & 16) != 0 ? false : z18;
        android.os.Bundle bundle2 = (i17 & 32) != 0 ? null : bundle;
        k8Var.getClass();
        if (bundle2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showTingStyle extras, count: ");
            sb6.append(bundle2.size());
            sb6.append(", keys: ");
            java.util.Set<java.lang.String> keySet = bundle2.keySet();
            kotlin.jvm.internal.o.f(keySet, "keySet(...)");
            sb6.append(kz5.n0.g0(keySet, ", ", null, null, 0, null, null, 62, null));
            com.tencent.mars.xlog.Log.i("MicroMsg.TingRouter", sb6.toString());
            bundle2.remove("key_listen_sync_item_type");
            bundle2.remove("key_enter_tab");
            bundle2.remove("key_red_dot_buffer");
            bundle2.remove("key_active_ext_info");
            bundle2.remove("key_discover_entrance_reddot");
            android.os.Parcel obtain = android.os.Parcel.obtain();
            kotlin.jvm.internal.o.f(obtain, "obtain(...)");
            bundle2.writeToParcel(obtain, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.TingRouter", "showTingStyle extras after, count: " + bundle2.size() + ", size: " + obtain.dataSize());
        }
        boolean booleanValue = bool2 != null ? bool2.booleanValue() : k8Var.n(context);
        ef0.h3 h3Var = (ef0.h3) rk4.u6.a(f396788r);
        if (!h3Var.f252224d) {
            h3Var.f252224d = true;
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new rk4.j8(bundle2, k8Var, z19, booleanValue, z27, l1Var, context, l18, null), 3, null);
        return jz5.f0.f302826a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(rk4.k8 r18, java.lang.String r19, java.util.Map r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.k8.f(rk4.k8, java.lang.String, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Object g(rk4.k8 k8Var, kotlin.coroutines.Continuation continuation) {
        java.lang.Object h17;
        k8Var.getClass();
        rk4.k5.e("start to destroyEngine", "MicroMsg.TingRouter");
        pi0.l1 l1Var = k8Var.f396798g;
        k8Var.f396798g = null;
        jz5.f0 f0Var = jz5.f0.f302826a;
        return (l1Var == null || (h17 = l1Var.h(k8Var.f396799h, continuation)) != pz5.a.f359186d) ? f0Var : h17;
    }

    public static final void h(rk4.k8 k8Var, bw5.lp0 lp0Var, il4.e eVar, bw5.o50 o50Var, java.util.List list) {
        k8Var.getClass();
        if (lp0Var != null) {
            if (((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).mj(lp0Var.b())) {
                ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).wj();
                return;
            }
        }
        if (lp0Var != null) {
            qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
            java.lang.String b17 = lp0Var.b();
            kotlin.jvm.internal.o.f(b17, "getClientId(...)");
            if (((rk4.z8) g9Var).oj(b17)) {
                return;
            }
        }
        ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).rj(lp0Var, list, o50Var, null, eVar);
    }

    public static final boolean i(rk4.k8 k8Var) {
        w71.o0 a17;
        jm4.a6 a6Var;
        k8Var.getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i17 = jm4.p5.f300404d;
        jm4.n5 n5Var = (jm4.n5) urgen.ur_0025.UR_B9B9.UR_1332();
        if (!((n5Var == null || (a6Var = (jm4.a6) urgen.ur_0025.UR_B9B9.UR_A27C(((jm4.p5) n5Var).getCppPointer())) == null || !urgen.ur_0025.UR_D52B.UR_8067(((jm4.b6) a6Var).getCppPointer(), "clicfg_ting_app_dissambled", false)) ? false : true) || (a17 = w71.q0.f443436d.a()) == null) {
            return false;
        }
        byte[][] UR_8178 = urgen.ur_C563.UR_9607.UR_8178(((w71.q0) a17).getCppPointer());
        int length = UR_8178.length;
        bw5.l20[] l20VarArr = new bw5.l20[length];
        for (int i18 = 0; i18 < length; i18++) {
            l20VarArr[i18] = new bw5.l20();
        }
        for (int i19 = 0; i19 < length; i19++) {
            w71.l.a(UR_8178[i19], l20VarArr[i19]);
        }
        bw5.l20 l20Var = null;
        for (int i27 = 0; i27 < length; i27++) {
            bw5.l20 l20Var2 = l20VarArr[i27];
            if ((l20Var2.f29616m[2] ? l20Var2.f29611e : bw5.f20.HybridRouterBizTypeDefault) == bw5.f20.HybridRouterBizTypeTing && l20Var2.f29613g == 1) {
                l20Var = l20Var2;
            }
        }
        if (l20Var == null) {
            return false;
        }
        boolean z17 = l20Var.f29616m[6];
        bw5.m20 m20Var = bw5.m20.HybridRouterPageStateDefault;
        if ((z17 ? l20Var.f29615i : m20Var) == m20Var) {
            return false;
        }
        if (z17) {
            m20Var = l20Var.f29615i;
        }
        return m20Var != bw5.m20.HybridRouterPageStatePageExit;
    }

    public static /* synthetic */ java.lang.Object m(rk4.k8 k8Var, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        return k8Var.l(z17, z18, continuation);
    }

    public static /* synthetic */ pi0.l1 s(rk4.k8 k8Var, pi0.q qVar, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str = "ting";
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        return k8Var.r(qVar, str, z17);
    }

    public void A(android.content.Context context, boolean z17, bw5.lp0 lp0Var, java.util.List list, il4.e eVar, bw5.o50 o50Var, android.os.Bundle bundle, bw5.ar0 enterScene, yz5.a aVar) {
        il4.e eVar2 = eVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        boolean z18 = bundle != null ? bundle.getBoolean("openInNewActivity", false) : false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("goToTingPlayerActivity play: ");
        sb6.append(z17);
        sb6.append(", withFloatBall: ");
        sb6.append(eVar2 != null ? java.lang.Boolean.valueOf(eVar2.f292107d) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRouter", sb6.toString());
        if (lp0Var != null && lp0Var.d() != null && !km4.v.b(context, lp0Var.d().f34189e, true)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingRouter", "goToTingPlayerActivity not support listenType, title: %s, listenId: %s", rk4.j5.j(lp0Var), lp0Var.d().getListenId());
            return;
        }
        M(enterScene);
        if (eVar2 == null) {
            eVar2 = new il4.e(null, 0, enterScene.f25422d, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        }
        il4.e eVar3 = eVar2;
        eVar3.f292119p = lp0Var != null ? lp0Var.b() : null;
        il4.l.p(eVar3, true, context, lp0Var);
        kotlinx.coroutines.l.d(this, null, null, new rk4.w7(this, z18, enterScene, z17, lp0Var, list, o50Var, eVar3, aVar, context, bundle, null), 3, null);
    }

    public void B(bw5.ar0 enterScene, boolean z17, bw5.pp0 pp0Var, java.lang.String str) {
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRouter", "gotoHomePageAudioTab scene: " + enterScene);
        o40.e eVar = (o40.e) i95.n0.c(o40.e.class);
        eVar.getClass();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((wy2.g) eVar).Ni(context);
    }

    public final boolean C() {
        return ((java.lang.Boolean) ((jz5.n) this.f396803o).getValue()).booleanValue() || ((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).isTeenMode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D(android.content.Context context) {
        rk4.u6 u6Var = f396788r;
        if (!((ef0.h3) rk4.u6.a(u6Var)).Ai()) {
            return false;
        }
        if (context instanceof android.app.Activity) {
            if ((context instanceof qk.c9) && ((qk.c9) context).getF109514v()) {
                return true;
            }
            qk.t8 a17 = rk4.u6.a(u6Var);
            int taskId = ((android.app.Activity) context).getTaskId();
            java.lang.Integer num = ((ef0.h3) a17).f252226f;
            return num != null && num.intValue() == taskId;
        }
        android.app.ActivityManager.RunningTaskInfo m17 = com.tencent.mm.app.w.m(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRouter", "canReUseTingFlutterActivityInstance topActivity: " + m17.topActivity + ", taskId: " + m17.id);
        qk.t8 a18 = rk4.u6.a(u6Var);
        int i17 = m17.id;
        java.lang.Integer num2 = ((ef0.h3) a18).f252226f;
        return num2 != null && num2.intValue() == i17;
    }

    public void E(android.content.Context context, bw5.o50 categoryItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(categoryItem, "categoryItem");
        km4.s a17 = km4.s.f309318f.a(bw5.ar0.TingScene_Chat);
        a17.e("share_radio_invite_page");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        byte[] byteArray = categoryItem.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        linkedHashMap.put("categoryItem", byteArray);
        a17.a(linkedHashMap);
        a17.d(bw5.f20.HybridRouterBizTypeTingMusicChat);
        w71.o0 a18 = w71.q0.f443436d.a();
        if (a18 != null) {
            ((w71.q0) a18).a(a17, rk4.b8.f396565d);
        }
    }

    public void F(android.content.Context context, java.lang.String routeName, java.util.Map map, com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(routeName, "routeName");
        kotlinx.coroutines.l.d(this, null, null, new rk4.d8(routeName, this, map, context, flutterPageStyle, null), 3, null);
    }

    public final boolean G(boolean z17) {
        if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi()) {
            return z17;
        }
        return true;
    }

    public void H(il4.e ext, java.util.List contexts) {
        kotlin.jvm.internal.o.g(ext, "ext");
        kotlin.jvm.internal.o.g(contexts, "contexts");
        bw5.ar0 i17 = bw5.ar0.i(ext.f292106c);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRouter", "playAndOpenFocusUpdateWithContexts scene: " + i17);
        kotlin.jvm.internal.o.d(i17);
        M(i17);
        il4.l.q(ext, true, null, null, 12, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i18 = 0;
        for (java.lang.Object obj : contexts) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            bw5.lp0 lp0Var = new bw5.lp0();
            lp0Var.j((bw5.v70) obj);
            lp0Var.g("ting_" + i18);
            arrayList.add(lp0Var);
            i18 = i19;
        }
        bw5.o50 o50Var = new bw5.o50();
        o50Var.i("1018");
        o50Var.j(2);
        o50Var.k(16);
        bw5.pp0 pp0Var = new bw5.pp0();
        bw5.op0 op0Var = new bw5.op0();
        op0Var.f31187e.addAll(contexts);
        op0Var.f31188f[2] = true;
        pp0Var.f31789o = op0Var;
        pp0Var.E[9] = true;
        ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Ai(false);
        if (kz5.n0.Z(arrayList) != null) {
            ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).rj((bw5.lp0) kz5.n0.X(arrayList), arrayList, o50Var, pp0Var, ext);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingRouter", "playAndOpenFocusUpdateWithContexts fail: tingItemList.first is empty!");
        }
        kotlinx.coroutines.l.d(this, null, null, new rk4.e8(this, "1018", pp0Var, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x022a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(pi0.l1 r25, android.content.Context r26, boolean r27, bw5.lp0 r28, il4.e r29, android.os.Bundle r30, kotlin.coroutines.Continuation r31) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.k8.I(pi0.l1, android.content.Context, boolean, bw5.lp0, il4.e, android.os.Bundle, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object J(pi0.l1 l1Var, java.lang.String str, java.util.Map map, boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRouter", "pushWithDefaultParams, routeName: " + str + ", params: " + map + ", routeConfig: " + z17);
        java.util.Map t17 = t(z17);
        if (map == null) {
            map = kz5.q0.f314001d;
        }
        t17.putAll(map);
        java.lang.Object o17 = l1Var.o(str, t17, continuation);
        return o17 == pz5.a.f359186d ? o17 : jz5.f0.f302826a;
    }

    public void L(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRouter", "resetHome " + z17);
        this.f396801m = java.lang.Boolean.valueOf(z17);
    }

    public final void M(bw5.ar0 ar0Var) {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        rk4.k5.e("set currEnterScene: " + ar0Var + ", uuid: " + uuid, "MicroMsg.TingRouter");
        this.f396797f = ar0Var;
        this.f396796e = uuid;
        b66.x Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
        if (Zi != null) {
            java.lang.String sessionId = this.f396796e;
            bw5.ar0 enterScene = this.f396797f;
            kotlin.jvm.internal.o.g(sessionId, "sessionId");
            kotlin.jvm.internal.o.g(enterScene, "enterScene");
            urgen.ur_2BA9.UR_5769.UR_5DD9(((b66.y) Zi).getCppPointer(), sessionId, enterScene.f25422d);
        }
    }

    public void N(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRouter", "setPlayerExpand " + z17);
        this.f396800i = java.lang.Boolean.valueOf(z17);
    }

    public final java.lang.Object O(kotlin.coroutines.Continuation continuation) {
        return ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui();
    }

    public final java.util.List Q() {
        return kz5.n0.t0(kz5.c0.i(new sy5.e(), new rk4.r0(), new rk4.l3(), new rk4.x4(), ((r03.e) ((s03.g) i95.n0.c(s03.g.class))).wi(null), new rk4.q3(), new rk4.a1(), new rk4.p0(), new rk4.s3(), new rk4.v4()), ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).nj());
    }

    @Override // kotlinx.coroutines.y0
    /* renamed from: getCoroutineContext */
    public oz5.l getF11582e() {
        return this.f396795d;
    }

    public void j(android.content.Context context, qk.x9 bizType, java.util.List list, yz5.p callback, bw5.ar0 enterScene) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bizType, "bizType");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        kotlinx.coroutines.l.d(this, null, null, new rk4.v6(this, enterScene, bizType, list, context, callback, null), 3, null);
    }

    public void k(bw5.lp0 item, bw5.ar0 enterScene) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRouter", "goToSelfAlbumPage scene: " + enterScene + ", item: " + item.d().getTitle());
        il4.e eVar = new il4.e(null, 0, enterScene.f25422d, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        M(enterScene);
        il4.l.q(eVar, true, null, item, 4, null);
        kotlinx.coroutines.l.d(this, null, null, new rk4.w6(this, item, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(boolean r23, boolean r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.k8.l(boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean n(android.content.Context context) {
        boolean z17 = com.tencent.mm.app.w.INSTANCE.f53889n;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRouter", "canReUseTingFlutterActivityInstance isAppForeground: " + z17);
        if (z17) {
            return D(context);
        }
        return false;
    }

    public void o(android.content.Context context, bw5.o50 categoryItem, bw5.ar0 enterScene, il4.e eVar, yz5.a aVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(categoryItem, "categoryItem");
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        qk.f9.d(this, context, categoryItem, null, qk.ja.f364192e, enterScene, eVar, aVar, null, null, null, false, 1920, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(android.content.Context r13, bw5.o50 r14, bw5.ar0 r15, boolean r16, yz5.a r17) {
        /*
            r12 = this;
            r6 = r13
            r4 = r15
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.String r0 = "categoryItem"
            r8 = r14
            kotlin.jvm.internal.o.g(r14, r0)
            java.lang.String r0 = "enterScene"
            kotlin.jvm.internal.o.g(r15, r0)
            boolean r0 = r12.v()
            if (r0 != 0) goto L19
            return
        L19:
            vl4.u r0 = vl4.u.f437904a
            jm4.n2 r1 = r0.a()
            java.lang.String r2 = r14.c()
            r3 = 0
            if (r1 != 0) goto L27
            goto L4e
        L27:
            r5 = r1
            jm4.p2 r5 = (jm4.p2) r5
            jm4.g3 r5 = r5.f()
            if (r5 == 0) goto L4e
            jm4.h3 r5 = (jm4.h3) r5
            jm4.d1 r5 = r5.p()
            if (r5 != 0) goto L39
            goto L4e
        L39:
            jm4.e1 r5 = (jm4.e1) r5
            bw5.o50 r5 = r5.a()
            if (r5 != 0) goto L49
            java.lang.String r5 = "MicroMsg.TingChatRoomUtil"
            java.lang.String r7 = "getCurRoomCategoryId chatRoomCategory is null"
            com.tencent.mars.xlog.Log.i(r5, r7)
            goto L4e
        L49:
            java.lang.String r5 = r5.c()
            goto L4f
        L4e:
            r5 = r3
        L4f:
            boolean r2 = kotlin.jvm.internal.o.b(r2, r5)
            if (r2 != 0) goto L61
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L61
            rk4.d7 r0 = rk4.d7.f396615d
            pm0.v.X(r0)
            return
        L61:
            r9 = r12
            r12.M(r15)
            java.lang.Class<qk.g9> r0 = qk.g9.class
            i95.m r0 = i95.n0.c(r0)
            qk.g9 r0 = (qk.g9) r0
            rk4.z8 r0 = (rk4.z8) r0
            r0.getClass()
            jm4.v2 r0 = jm4.w2.f300435d
            jm4.u2 r0 = r0.a()
            if (r0 == 0) goto L92
            bw5.eq0 r1 = bw5.eq0.TingChatRoom
            jm4.w2 r0 = (jm4.w2) r0
            jm4.n2 r0 = r0.a(r1)
            if (r0 == 0) goto L92
            jm4.p2 r0 = (jm4.p2) r0
            jm4.g3 r0 = r0.f()
            if (r0 == 0) goto L92
            jm4.h3 r0 = (jm4.h3) r0
            jm4.d1 r3 = r0.p()
        L92:
            r10 = r3
            if (r10 != 0) goto La6
            java.lang.String r0 = "MicroMsg.TingRouter"
            java.lang.String r1 = "onFloatBallCoverClick: chatRoomCategoryId is null"
            com.tencent.mars.xlog.Log.w(r0, r1)
            rk4.e7 r0 = new rk4.e7
            r0.<init>(r13)
            pm0.v.X(r0)
            return
        La6:
            kotlin.jvm.internal.h0 r2 = new kotlin.jvm.internal.h0
            r2.<init>()
            rk4.f7 r0 = new rk4.f7
            r0.<init>(r2, r13)
            pm0.v.X(r0)
            rk4.j7 r11 = new rk4.j7
            r0 = r11
            r1 = r12
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r13
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            jm4.e1 r10 = (jm4.e1) r10
            byte[] r0 = r14.toByteArray()
            jm4.x1 r1 = new jm4.x1
            r1.<init>()
            r1.f300442e = r11
            long r2 = r10.getCppPointer()
            kotlin.jvm.internal.o.d(r0)
            urgen.ur_0025.UR_5D5A.UR_05C3(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.k8.p(android.content.Context, bw5.o50, bw5.ar0, boolean, yz5.a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof rk4.k7
            if (r0 == 0) goto L13
            r0 = r7
            rk4.k7 r0 = (rk4.k7) r0
            int r1 = r0.f396787g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f396787g = r1
            goto L18
        L13:
            rk4.k7 r0 = new rk4.k7
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f396785e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f396787g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f396784d
            rk4.k8 r0 = (rk4.k8) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L42
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f396784d = r6
            r0.f396787g = r3
            java.lang.Object r7 = r6.O(r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            r0 = r6
        L42:
            r1 = r7
            pi0.q r1 = (pi0.q) r1
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            pi0.l1 r7 = s(r0, r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.k8.q(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final pi0.l1 r(pi0.q qVar, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRouter", "createFlutterInstance, plugin: " + str + ", forceNavigator: " + z17);
        int i17 = jm4.z5.f300455d;
        jm4.x5 x5Var = (jm4.x5) urgen.ur_0025.UR_DAAF.UR_1332();
        if (x5Var != null) {
            urgen.ur_0025.UR_DAAF.UR_2BF4(((jm4.z5) x5Var).getCppPointer());
        }
        pi0.l1 l1Var = new pi0.l1(qVar, str, Q(), false, null, 24, null);
        if (z17) {
            l1Var.q(new rk4.i8(this, l1Var, new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4093, null)));
        }
        return l1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map t(boolean r15) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.k8.t(boolean):java.util.Map");
    }

    public void u(yz5.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRouter", "destroyFlutterEngine");
        kotlinx.coroutines.l.d(this, null, null, new rk4.o7(this, aVar, null), 3, null);
    }

    public final boolean v() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (java.lang.Math.abs(currentTimeMillis - this.f396802n) < 1000) {
            rk4.k5.e("double tap check failed", "MicroMsg.TingRouter");
            return false;
        }
        this.f396802n = currentTimeMillis;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.TingUtilService", "isInTingPlayerPage " + ((java.lang.Number) r5.getKey()).intValue() + ", " + ((java.lang.Boolean) r5.getValue()).booleanValue());
        r1 = jm4.a5.f300372f;
        r1 = (jm4.z4) urgen.ur_0025.UR_6F99.UR_1332();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0098, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009a, code lost:
    
        r1 = java.lang.Boolean.valueOf(((jm4.a5) r1).a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a6, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.TingUtilService", "isInTingPlayerPage - Flutter Stack " + ((java.lang.Number) r5.getKey()).intValue() + ", " + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00cf, code lost:
    
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d1, code lost:
    
        r1 = r1.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d6, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(android.content.Context r35, bw5.ar0 r36) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.k8.w(android.content.Context, bw5.ar0):void");
    }

    public void x(android.content.Context context, byte[] buffer, java.util.Map map, yz5.p pVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buffer, "buffer");
        try {
            L(true);
            N(false);
            kotlinx.coroutines.l.d(this, null, null, new rk4.q7(this, buffer, context, null), 3, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingRouter", "finderSleepMode jump to ting error " + e17);
        }
    }

    public void y(android.content.Context context, android.os.Bundle bundle, bw5.ar0 enterScene, il4.e eVar, yz5.a aVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRouter", "goToTingFlutterActivity, enterScene: " + enterScene);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = eVar;
        if (eVar == null) {
            h0Var.f310123d = new il4.e(null, 0, enterScene.f25422d, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        }
        M(enterScene);
        il4.l.p((il4.e) h0Var.f310123d, true, context, ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).uj());
        kotlinx.coroutines.l.d(this, null, null, new rk4.t7(this, enterScene, bundle, h0Var, context, aVar, null), 3, null);
    }

    public void z(android.content.Context context, boolean z17, bw5.lp0 lp0Var, il4.e eVar, bw5.o50 o50Var, android.os.Bundle bundle, bw5.ar0 enterScene, yz5.a aVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        A(context, z17, lp0Var, null, eVar, o50Var, bundle, enterScene, aVar);
    }
}
