package com.tencent.mm.plugin.ting.audiopush;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/ting/audiopush/TingAudioPushConfigLogic;", "", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TingAudioPushConfigLogic extends android.content.BroadcastReceiver {
    public static final /* synthetic */ int N = 0;
    public final jz5.g A;
    public boolean B;
    public boolean C;
    public boolean D;
    public java.lang.String E;
    public cv.v0 F;
    public java.lang.Integer G;
    public final jz5.g H;
    public bw5.c2 I;

    /* renamed from: J, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f174638J;
    public final kotlinx.coroutines.y0 K;
    public final java.util.List L;
    public final java.util.List M;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f174639a = "MicroMsg.TingAudioPush.ConfigLogic";

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f174640b = "ting_listen_audio_push_last_get_time";

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f174641c = "ting_listen_outdoor_audio_push_last_get_time";

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f174642d = "ting_listen_audio_push_config";

    /* renamed from: e, reason: collision with root package name */
    public final long f174643e = 20;

    /* renamed from: f, reason: collision with root package name */
    public final long f174644f = 21;

    /* renamed from: g, reason: collision with root package name */
    public final long f174645g = 22;

    /* renamed from: h, reason: collision with root package name */
    public final long f174646h = 23;

    /* renamed from: i, reason: collision with root package name */
    public final long f174647i = 30;

    /* renamed from: j, reason: collision with root package name */
    public final long f174648j = 31;

    /* renamed from: k, reason: collision with root package name */
    public final long f174649k = 32;

    /* renamed from: l, reason: collision with root package name */
    public final long f174650l = 33;

    /* renamed from: m, reason: collision with root package name */
    public final long f174651m = 41;

    /* renamed from: n, reason: collision with root package name */
    public final long f174652n = 42;

    /* renamed from: o, reason: collision with root package name */
    public final long f174653o = 45;

    /* renamed from: p, reason: collision with root package name */
    public final long f174654p = 46;

    /* renamed from: q, reason: collision with root package name */
    public final long f174655q = 90;

    /* renamed from: r, reason: collision with root package name */
    public final long f174656r = 91;

    /* renamed from: s, reason: collision with root package name */
    public final long f174657s = 92;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f174658t;

    /* renamed from: u, reason: collision with root package name */
    public final tk4.c0 f174659u;

    /* renamed from: v, reason: collision with root package name */
    public long f174660v;

    /* renamed from: w, reason: collision with root package name */
    public long f174661w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f174662x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f174663y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f174664z;

    public TingAudioPushConfigLogic() {
        jz5.g b17 = jz5.h.b(tk4.c.f419962d);
        this.f174658t = b17;
        this.f174659u = new tk4.c0();
        this.f174663y = jz5.h.b(tk4.d.f419972d);
        this.f174664z = jz5.h.b(tk4.e.f419973d);
        this.A = jz5.h.b(tk4.f.f419974d);
        this.H = jz5.h.b(tk4.b.f419960d);
        this.f174638J = kotlinx.coroutines.sync.l.a(false, 1, null);
        this.K = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
        android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new tk4.a(this));
        }
        this.F = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi();
        java.lang.Object value = ((jz5.n) b17).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        this.E = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType((android.content.Context) value);
        this.L = kz5.c0.i("android.net.wifi.WIFI_STATE_CHANGED", "android.net.wifi.STATE_CHANGE", io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
        this.M = kz5.c0.i("android.media.ACTION_SCO_AUDIO_STATE_UPDATED", "android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED", "android.bluetooth.adapter.action.STATE_CHANGED", "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.device.action.ACL_DISCONNECTED", "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED", "android.bluetooth.headset.action.SHORTCUT_ACTION", "android.bluetooth.adapter.action.LOCAL_NAME_CHANGED", "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED", "android.bluetooth.adapter.action.DISCOVERY_FINISHED", "android.intent.action.HEADSET_PLUG");
    }

    public final void a(bw5.d2 d2Var) {
        int i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ting_audio_push_view_jump_square, 0) == 1 ? 1 : 0;
        bw5.xa0 xa0Var = new bw5.xa0();
        xa0Var.f35038u = d2Var.v();
        boolean[] zArr = xa0Var.S;
        zArr[15] = true;
        xa0Var.f35028h = d2Var.f26287n[3] ? d2Var.f26282f : com.tencent.mm.protobuf.g.f192155b;
        zArr[5] = true;
        bw5.pp0 pp0Var = new bw5.pp0();
        pp0Var.f31785h = xa0Var;
        pp0Var.E[5] = true;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("focusListId", "3008");
        byte[] byteArray = pp0Var.toByteArray();
        if (byteArray == null) {
            byteArray = new byte[0];
        }
        linkedHashMap.put("focusListContext", byteArray);
        linkedHashMap.put("audioReadParamsNative", java.lang.Boolean.TRUE);
        linkedHashMap.put("inAudio", 1);
        linkedHashMap.put("player_expand", java.lang.Integer.valueOf(i17 ^ 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:24:0x006e, B:26:0x007a, B:31:0x0086, B:32:0x008c, B:34:0x0093, B:35:0x009d), top: B:23:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:24:0x006e, B:26:0x007a, B:31:0x0086, B:32:0x008c, B:34:0x0093, B:35:0x009d), top: B:23:0x006e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(boolean r15) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic.b(boolean):boolean");
    }

    public final boolean c() {
        if (android.os.Build.VERSION.SDK_INT < 26 || !((java.lang.Boolean) ((jz5.n) this.f174663y).getValue()).booleanValue()) {
            return false;
        }
        boolean z17 = this.C;
        java.lang.String str = this.f174639a;
        if (z17 || this.B || this.D) {
            com.tencent.mars.xlog.Log.i(str, "isFeatureAvailable false, scene blocked, isInShareScene:" + this.C + ", isInPayScene:" + this.B + ", isInTingApp:" + this.D);
            return false;
        }
        jz5.g gVar = this.A;
        if (((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.i(str, "isFeatureAvailable false, isTeenMode:" + ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue());
            return false;
        }
        com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner processUIStartedStateOwner = com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE;
        if (!processUIStartedStateOwner.isForeground()) {
            com.tencent.mars.xlog.Log.i(str, "isFeatureAvailable false, isForeground:" + processUIStartedStateOwner.isForeground());
            return false;
        }
        com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct tingAudioPushLogStruct = new com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct();
        tingAudioPushLogStruct.f61302d = this.f174643e;
        tingAudioPushLogStruct.k();
        if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mars.xlog.Log.i(str, "isFloatPermissionGranted false");
            com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct tingAudioPushLogStruct2 = new com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct();
            tingAudioPushLogStruct2.f61302d = this.f174656r;
            tingAudioPushLogStruct2.k();
            return false;
        }
        if ((c01.z1.i() & 2147483648L) == 0) {
            return true;
        }
        com.tencent.mars.xlog.Log.i(str, "MM_STATUS_LISTEN_AUDIO_CONFIG_CLOSE closed!");
        com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct tingAudioPushLogStruct3 = new com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct();
        tingAudioPushLogStruct3.f61302d = this.f174657s;
        tingAudioPushLogStruct3.k();
        return false;
    }

    public final boolean d() {
        return ((java.lang.Boolean) ((jz5.n) this.f174664z).getValue()).booleanValue();
    }

    public final void e(java.lang.Integer num) {
        cv.v0 Bi = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi();
        cv.v0 v0Var = this.F;
        java.lang.Integer num2 = this.G;
        this.F = Bi;
        if (num != null) {
            this.G = java.lang.Integer.valueOf(num.intValue());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("audioPushStatusChange onConnectedDeviceMayChange may changed: current: ");
        sb6.append(Bi.f222517b);
        sb6.append(" , ");
        sb6.append(num);
        sb6.append(", last: ");
        sb6.append(v0Var != null ? v0Var.f222517b : null);
        sb6.append(", ");
        sb6.append(num2);
        com.tencent.mars.xlog.Log.i(this.f174639a, sb6.toString());
        boolean z17 = false;
        if (v0Var != null && Bi.f222516a == v0Var.f222516a) {
            z17 = true;
        }
        if (z17 && (kotlin.jvm.internal.o.b(num, num2) || num == null)) {
            return;
        }
        f(num);
    }

    public final void f(java.lang.Integer num) {
        java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        bw5.y40 y40Var = new bw5.y40();
        boolean[] zArr = y40Var.f35368f;
        int i17 = 0;
        int i18 = 2;
        if (num != null) {
            y40Var.f35367e = num.intValue();
            zArr[2] = true;
        } else {
            int i19 = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi().f222516a;
            if (i19 == 1) {
                y40Var.f35367e = 0;
                zArr[2] = true;
            } else if (i19 == 2) {
                y40Var.f35367e = 0;
                zArr[2] = true;
            }
        }
        if (formatedNetType != null) {
            int hashCode = formatedNetType.hashCode();
            if (hashCode != 1621) {
                if (hashCode != 1652) {
                    if (hashCode != 1683) {
                        if (hashCode != 1714) {
                            if (hashCode == 2664213 && formatedNetType.equals("WIFI")) {
                                i17 = 1;
                            }
                        } else if (formatedNetType.equals("5G")) {
                            i17 = 5;
                        }
                    } else if (formatedNetType.equals("4G")) {
                        i17 = 4;
                    }
                } else if (formatedNetType.equals("3G")) {
                    i17 = 3;
                }
            } else if (formatedNetType.equals("2G")) {
                i17 = 2;
            }
        }
        y40Var.f35366d = i17;
        zArr[1] = true;
        java.lang.String str = "audioPushStatusChange real hasChanged " + formatedNetType + ' ' + y40Var.f35367e;
        java.lang.String str2 = this.f174639a;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (b(true) && d()) {
            gm4.a.f273557a.i(this.f174641c, (int) (java.lang.System.currentTimeMillis() / 1000));
            this.f174661w = java.lang.System.currentTimeMillis();
            if (this.I == null) {
                com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct tingAudioPushLogStruct = new com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct();
                tingAudioPushLogStruct.f61302d = this.f174645g;
                tingAudioPushLogStruct.k();
            } else {
                com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct tingAudioPushLogStruct2 = new com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct();
                tingAudioPushLogStruct2.f61302d = this.f174646h;
                tingAudioPushLogStruct2.k();
                i18 = 4;
            }
            com.tencent.mars.xlog.Log.i(str2, "audioPushStatusChange networkStatusChangeGetConfigAndPush " + i18 + ", " + y40Var.f35366d + ", " + y40Var.f35367e);
            new tk4.d0(i18, y40Var).l().K(new tk4.j(this, true));
        }
    }

    public final void g(bw5.d2 d2Var, boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f174639a, "onPlayCategory, id:" + d2Var.b().c());
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        il4.e eVar = new il4.e(null, 0, 2101, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554425, null);
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(d2Var.c());
        lp0Var.g(d2Var.c().getListenId());
        if (z17) {
            a(d2Var);
        }
        i95.m c17 = i95.n0.c(qk.g9.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        qk.g9.Ye((qk.g9) c17, lp0Var, null, d2Var.b(), null, eVar, 10, null);
    }

    public final void h(bw5.d2 d2Var, boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f174639a, "onPlayListenItem, id:" + d2Var.c().getListenId());
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(d2Var.c());
        lp0Var.g(d2Var.c().getListenId());
        il4.e eVar = new il4.e(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554431, null);
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        eVar.f292106c = 2101;
        if (z17) {
            a(d2Var);
        }
        qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
        java.lang.String b17 = lp0Var.b();
        kotlin.jvm.internal.o.f(b17, "getClientId(...)");
        ((rk4.z8) g9Var).qj(b17, lp0Var, eVar);
    }

    public final void i(bw5.d2 d2Var, long j17) {
        com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct tingAudioPushLogStruct = new com.tencent.mm.autogen.mmdata.rpt.TingAudioPushLogStruct();
        tingAudioPushLogStruct.f61302d = j17;
        tingAudioPushLogStruct.f61303e = tingAudioPushLogStruct.b("PushType", d2Var.f26287n[1] ? d2Var.f26280d : "", true);
        tingAudioPushLogStruct.f61305g = tingAudioPushLogStruct.b("PushTitle", d2Var.b().getName(), true);
        bw5.o50 b17 = d2Var.b();
        tingAudioPushLogStruct.f61306h = tingAudioPushLogStruct.b("PushDesc", b17.L1[36] ? b17.Q : "", true);
        tingAudioPushLogStruct.f61304f = tingAudioPushLogStruct.b("UniqueId", d2Var.v(), true);
        tingAudioPushLogStruct.k();
    }

    public final java.util.Map j(bw5.d2 d2Var) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("currscene", 2101);
        java.lang.String c17 = d2Var.b().c();
        kotlin.jvm.internal.o.f(c17, "getCategoryId(...)");
        hashMap.put("actioncategoryid", c17);
        java.lang.String listenId = d2Var.c().getListenId();
        kotlin.jvm.internal.o.f(listenId, "getListenId(...)");
        hashMap.put("actionlistenid", listenId);
        java.lang.String str = d2Var.f26287n[1] ? d2Var.f26280d : "";
        kotlin.jvm.internal.o.f(str, "getConfigType(...)");
        hashMap.put("config_type", str);
        hashMap.put(ya.b.CONTENT_TYPE, java.lang.Integer.valueOf(d2Var.f26285i));
        return hashMap;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlinx.coroutines.l.d(this.K, null, null, new tk4.g(this, intent, null), 3, null);
    }
}
