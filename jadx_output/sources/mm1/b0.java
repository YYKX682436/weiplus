package mm1;

/* loaded from: classes11.dex */
public final class b0 implements rv.j2, kotlinx.coroutines.y0 {

    /* renamed from: i, reason: collision with root package name */
    public static um1.a f328635i;

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f328636m;

    /* renamed from: n, reason: collision with root package name */
    public static bw5.x2 f328637n;

    /* renamed from: d, reason: collision with root package name */
    public final oz5.l f328638d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f328639e;

    /* renamed from: f, reason: collision with root package name */
    public pi0.l1 f328640f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f328641g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f328642h;

    static {
        new mm1.q(null);
        f328636m = jz5.h.b(mm1.p.f328685d);
        f328637n = bw5.x2.BizAudioEnterScene_Unknown;
    }

    public b0() {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f328638d = kotlinx.coroutines.internal.b0.f310484a.plus(kotlinx.coroutines.t3.a(null, 1, null));
        this.f328639e = "";
        this.f328641g = "BizAudioRouter";
        jz5.h.b(mm1.z.f328733d);
        this.f328642h = jz5.h.b(new mm1.u(this));
        tm1.h hVar = tm1.h.f420470a;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioController", "initBizAudioPlayTaskController");
        hVar.b();
        ((mm1.f0) ((rv.k2) i95.n0.c(rv.k2.class))).getClass();
        if (mm1.o.f328683e) {
            return;
        }
        mm1.o.f328683e = true;
        int i17 = jm4.j1.f300393d;
        urgen.ur_0025.UR_68E4.UR_2E66(mm1.o.f328682d);
    }

    public static java.lang.Object g(mm1.b0 b0Var, pi0.l1 l1Var, android.content.Context context, com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle, java.lang.Long l17, android.os.Bundle bundle, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        java.lang.Long l18 = (i17 & 4) != 0 ? null : l17;
        android.os.Bundle bundle2 = (i17 & 8) != 0 ? null : bundle;
        b0Var.getClass();
        if (bundle2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showBizStyle extras, count: ");
            sb6.append(bundle2.size());
            sb6.append(", keys: ");
            java.util.Set<java.lang.String> keySet = bundle2.keySet();
            kotlin.jvm.internal.o.f(keySet, "keySet(...)");
            sb6.append(kz5.n0.g0(keySet, ", ", null, null, 0, null, null, 62, null));
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioRouter", sb6.toString());
            bundle2.remove("key_listen_sync_item_type");
            bundle2.remove("key_enter_tab");
            bundle2.remove("key_red_dot_buffer");
            bundle2.remove("key_active_ext_info");
            bundle2.remove("key_discover_entrance_reddot");
            android.os.Parcel obtain = android.os.Parcel.obtain();
            kotlin.jvm.internal.o.f(obtain, "obtain(...)");
            bundle2.writeToParcel(obtain, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioRouter", "showBizStyle extras after, count: " + bundle2.size() + ", size: " + obtain.dataSize());
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new mm1.a0(bundle2, b0Var, l1Var, context, flutterPageStyle, l18, null), 3, null);
        return jz5.f0.f302826a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof mm1.r
            if (r0 == 0) goto L13
            r0 = r11
            mm1.r r0 = (mm1.r) r0
            int r1 = r0.f328693i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f328693i = r1
            goto L18
        L13:
            mm1.r r0 = new mm1.r
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f328691g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f328693i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r10 = r0.f328688d
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lb5
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            long r4 = r0.f328690f
            boolean r10 = r0.f328689e
            java.lang.Object r2 = r0.f328688d
            mm1.b0 r2 = (mm1.b0) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L71
        L41:
            kotlin.ResultKt.throwOnFailure(r11)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r11 = "MicroMsg.BizAudioRouter"
            java.lang.String r2 = "cancelDelayTerminal"
            com.tencent.mars.xlog.Log.i(r11, r2)
            jz5.g r11 = r9.f328642h
            jz5.n r11 = (jz5.n) r11
            java.lang.Object r11 = r11.getValue()
            fv.k r11 = (fv.k) r11
            r11.b()
            pi0.l1 r11 = r9.f328640f
            if (r11 != 0) goto Lb8
            r0.f328688d = r9
            r0.f328689e = r10
            r0.f328690f = r5
            r0.f328693i = r4
            java.lang.Object r11 = r9.c(r0)
            if (r11 != r1) goto L6f
            return r1
        L6f:
            r2 = r9
            r4 = r5
        L71:
            r6 = r11
            pi0.l1 r6 = (pi0.l1) r6
            r2.f328640f = r6
            java.lang.String r7 = r2.f328641g
            r6.b(r7)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            jz5.l r7 = new jz5.l
            java.lang.String r8 = "coldBootInPlayer"
            r7.<init>(r8, r10)
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r4)
            jz5.l r4 = new jz5.l
            java.lang.String r5 = "coldBootClickTime"
            r4.<init>(r5, r10)
            java.lang.Integer r10 = new java.lang.Integer
            r5 = 0
            r10.<init>(r5)
            jz5.l r5 = new jz5.l
            java.lang.String r8 = "coldBootScene"
            r5.<init>(r8, r10)
            jz5.l[] r10 = new jz5.l[]{r7, r4, r5}
            java.util.Map r10 = kz5.c1.k(r10)
            r0.f328688d = r11
            r0.f328693i = r3
            java.lang.String r3 = "audio_player"
            java.lang.Object r10 = r2.f(r6, r3, r10, r0)
            if (r10 != r1) goto Lb4
            return r1
        Lb4:
            r10 = r11
        Lb5:
            r11 = r10
            pi0.l1 r11 = (pi0.l1) r11
        Lb8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mm1.b0.b(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object c(kotlin.coroutines.Continuation continuation) {
        return new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "biz_audio", kz5.n0.t0(kz5.c0.i(new sy5.e(), new vm1.x0(), new vm1.p(), ((r03.e) ((s03.g) i95.n0.c(s03.g.class))).wi(null), new vm1.i(), new vm1.n(), new vm1.j(), new lx.v5(), new com.tencent.mm.plugin.audio.flutter.plugin.FlutterBizAudioPlugin()), ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).nj()), false, null, 24, null);
    }

    public void d(android.content.Context context, android.os.Bundle bundle, bw5.x2 enterScene, qk.a aVar, il4.e eVar, java.lang.Boolean bool, yz5.a aVar2, bw5.lp0 lp0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioRouter", "goToBizAudioFlutterActivity, enterScene: " + enterScene);
        int i17 = enterScene == bw5.x2.BizAudioEnterScene_Unknown ? f328637n.f34931d : enterScene.f34931d;
        boolean z17 = eVar != null ? eVar.f292128y : false;
        tm1.i.f420479a = z17;
        com.tencent.wechat.iam.biz.o.f217761b.g(z17);
        kotlinx.coroutines.l.d(this, null, null, new mm1.w(this, i17, bool, aVar, z17, context, bundle, enterScene, lp0Var, aVar2, null), 3, null);
    }

    public void e(il4.e ext, java.util.List contexts) {
        kotlin.jvm.internal.o.g(ext, "ext");
        kotlin.jvm.internal.o.g(contexts, "contexts");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : contexts) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            bw5.lp0 lp0Var = new bw5.lp0();
            lp0Var.j((bw5.v70) obj);
            lp0Var.g("ting_" + i17);
            arrayList.add(lp0Var);
            i17 = i18;
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
        ((b66.i) tm1.h.f420470a.a()).e();
        if (kz5.n0.Z(arrayList) != null) {
            ((mm1.f0) ((rv.k2) i95.n0.c(rv.k2.class))).aj((bw5.lp0) kz5.n0.X(arrayList), arrayList, o50Var, pp0Var, ext);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioRouter", "playAndOpenFocusUpdateWithContexts fail: tingItemList.first is empty!");
        }
        kotlinx.coroutines.l.d(this, null, null, new mm1.y(this, "1018", pp0Var, null), 3, null);
    }

    public final java.lang.Object f(pi0.l1 l1Var, java.lang.String str, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioRouter", "pushWithDefaultParams, routeName: " + str + ", params: " + map);
        java.util.Map l17 = kz5.c1.l(new jz5.l("enableMiniProgram", 1), new jz5.l("isWechatUser", 1), new jz5.l("audioNew", java.lang.Boolean.TRUE), new jz5.l("reset_home", 0), new jz5.l("player_expand", 0));
        if (map == null) {
            map = kz5.q0.f314001d;
        }
        l17.putAll(map);
        java.lang.Object o17 = l1Var.o(str, l17, continuation);
        return o17 == pz5.a.f359186d ? o17 : jz5.f0.f302826a;
    }

    @Override // kotlinx.coroutines.y0
    /* renamed from: getCoroutineContext */
    public oz5.l getF11582e() {
        return this.f328638d;
    }
}
