package com.tencent.wechat.aff.affroam;

/* loaded from: classes5.dex */
class ZIDL_TLJya9_HB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.affroam.e0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.f0 f215726a;

    private native void ZIDL_AX(long j17, long j18, byte[][] bArr);

    private native void ZIDL_BX(long j17, long j18, byte[][] bArr);

    private native void ZIDL_FX(long j17, long j18, byte[][] bArr);

    private native void ZIDL_GX(long j17, long j18, byte[][] bArr);

    private native void ZIDL_HX(long j17, long j18, byte[][] bArr);

    private native void ZIDL_JX(long j17, long j18, byte[] bArr, boolean z17);

    private native void ZIDL_NX(long j17, long j18, int i17);

    private native void ZIDL_WX(long j17, long j18, byte[] bArr);

    @Override // com.tencent.wechat.aff.affroam.e0
    public void B0(long j17, java.util.ArrayList arrayList) {
        ZIDL_HX(this.nativeHandler, j17, com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(arrayList));
    }

    public void Q1(long j17, java.util.ArrayList arrayList) {
        ZIDL_BX(this.nativeHandler, j17, com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(arrayList));
    }

    @Override // com.tencent.wechat.aff.affroam.e0
    public void R0(long j17, java.util.ArrayList arrayList) {
        ZIDL_GX(this.nativeHandler, j17, com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(arrayList));
    }

    public void R1(long j17, int i17) {
        ZIDL_NX(this.nativeHandler, j17, i17);
    }

    @Override // com.tencent.wechat.aff.affroam.e0
    public void V0(long j17, java.util.ArrayList arrayList) {
        ZIDL_FX(this.nativeHandler, j17, com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(arrayList));
    }

    public byte[] ZIDL_AB(byte[] bArr) {
        com.tencent.wechat.aff.affroam.f0 f0Var = this.f215726a;
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((ho1.a1) f0Var).getClass();
        com.tencent.mm.plugin.backup.roambackup.p1 p1Var = (com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class));
        p1Var.getClass();
        return p1Var.f92678i.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public void ZIDL_AV(long j17) {
        ho1.a1 a1Var = (ho1.a1) this.f215726a;
        a1Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).q(new ho1.j0(a1Var, j17));
    }

    public boolean ZIDL_BB(byte[] bArr) {
        com.tencent.wechat.aff.affroam.f0 f0Var = this.f215726a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.a1 a1Var = (ho1.a1) f0Var;
        a1Var.getClass();
        com.tencent.mars.xlog.Log.i(a1Var.f282622a, "getPCUsbEnabled: deviceId=".concat(str));
        return false;
    }

    public void ZIDL_BV(long j17) {
        ho1.a1 a1Var = (ho1.a1) this.f215726a;
        a1Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.wechat.aff.affroam.e0 e0Var = a1Var.f282623b;
        if (e0Var != null) {
            ((com.tencent.wechat.aff.affroam.ZIDL_TLJya9_HB) e0Var).Q1(j17, arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.List] */
    public byte[] ZIDL_C(int i17) {
        ((ho1.a1) this.f215726a).getClass();
        java.util.List c17 = kz5.b0.c(java.lang.Integer.valueOf(i17));
        boolean isEmpty = c17.isEmpty();
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (!isEmpty) {
            ?? i18 = ((b93.b) c93.a.a()).i(kz5.n0.g0(c17, ",", null, null, 0, null, null, 62, null));
            if (i18 != 0) {
                p0Var = i18;
            }
        }
        return (p0Var.isEmpty() ^ true ? (java.lang.String) p0Var.get(0) : "null").getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public void ZIDL_CB() {
        com.tencent.mars.xlog.Log.i(((ho1.a1) this.f215726a).f282622a, "allowLocalNetwork");
    }

    public byte[] ZIDL_D(byte[] bArr) {
        java.lang.String e17;
        com.tencent.wechat.aff.affroam.f0 f0Var = this.f215726a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.a1 a1Var = (ho1.a1) f0Var;
        a1Var.getClass();
        try {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            if (com.tencent.mm.storage.z3.R4(str)) {
                ((sg3.a) v0Var).getClass();
                e17 = c01.a2.f(str, str);
                kotlin.jvm.internal.o.d(e17);
            } else {
                ((sg3.a) v0Var).getClass();
                e17 = c01.a2.e(str);
                kotlin.jvm.internal.o.d(e17);
            }
            str = e17;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(a1Var.f282622a, e18, "getUserDisplayName failed, username=".concat(str), new java.lang.Object[0]);
        }
        return str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public void ZIDL_DB(byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.aff.affroam.f0 f0Var = this.f215726a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ho1.a1 a1Var = (ho1.a1) f0Var;
        a1Var.getClass();
        com.tencent.mars.xlog.Log.i(a1Var.f282622a, "generalNotifyPc: func=" + str + ", args=" + str2);
        ((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Di(str, str2);
    }

    public byte[][] ZIDL_E(int i17) {
        ((ho1.a1) this.f215726a).getClass();
        java.util.Set c17 = kz5.o1.c(java.lang.Integer.valueOf(i17));
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = c17.iterator();
        while (it.hasNext()) {
            java.util.ArrayList P1 = b93.r.wi().P1(java.lang.String.valueOf(((java.lang.Number) it.next()).intValue()));
            if (P1 != null) {
                kz5.h0.u(hashSet, P1);
            }
        }
        return com.tencent.wechat.zidl2.ZidlUtil.stringListToArrayBytes(new java.util.ArrayList(hashSet));
    }

    public boolean ZIDL_EB() {
        ((ho1.a1) this.f215726a).getClass();
        if (!((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).n0()) {
            return true;
        }
        c01.w9.a();
        return false;
    }

    public void ZIDL_FB(boolean z17) {
        ((ho1.a1) this.f215726a).getClass();
        ho1.c.f282634c = z17;
        ((ku5.t0) ku5.t0.f312615d).B(new ho1.v0(z17));
    }

    public void ZIDL_FV(long j17) {
        ho1.a1 a1Var = (ho1.a1) this.f215726a;
        a1Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new ho1.l0(a1Var, j17));
    }

    public void ZIDL_GB() {
        ((ho1.a1) this.f215726a).getClass();
        ((ku5.t0) ku5.t0.f312615d).h(ho1.i0.f282710d, "endRecover");
    }

    public void ZIDL_GV(long j17) {
        ho1.a1 a1Var = (ho1.a1) this.f215726a;
        a1Var.getClass();
        c01.d9.e().g(new ug3.i(gm0.j1.b().f273249l, 1, new fo1.b(new ho1.o0(a1Var, j17))));
        com.tencent.mars.xlog.Log.i("AutoBindHelper", "post NetSceneGetOnlineInfo into NetSceneQueue");
    }

    public void ZIDL_HB(boolean z17) {
        ((ho1.a1) this.f215726a).getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new ho1.y0(z17));
    }

    public void ZIDL_HV(long j17) {
        ho1.a1 a1Var = (ho1.a1) this.f215726a;
        a1Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new ho1.m0(a1Var, j17));
    }

    public byte[][] ZIDL_I() {
        ((ho1.a1) this.f215726a).getClass();
        com.tencent.mm.vfs.r6 r6Var = com.tencent.mm.plugin.backup.roambackup.v1.f92916c;
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(r6Var.o());
        arrayList.add(gm0.j1.b().k());
        arrayList.add(oo1.o.f347151a.d());
        return com.tencent.wechat.zidl2.ZidlUtil.stringListToArrayBytes(arrayList);
    }

    public void ZIDL_JV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.affroam.f0 f0Var = this.f215726a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.a1 a1Var = (ho1.a1) f0Var;
        a1Var.getClass();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        ((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).bj(uuid, str, 8000L, new ho1.h0(a1Var, j17, str));
    }

    public boolean ZIDL_K(byte[] bArr) {
        com.tencent.wechat.aff.affroam.f0 f0Var = this.f215726a;
        com.tencent.wechat.aff.affroam.u device = (com.tencent.wechat.aff.affroam.u) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.affroam.u.f215987h, bArr);
        ((ho1.a1) f0Var).getClass();
        kotlin.jvm.internal.o.g(device, "device");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        to1.g gVar = to1.g.f420911a;
        kotlin.jvm.internal.o.d(context);
        return gVar.a(context, po1.d.f357294i.a(device));
    }

    public boolean ZIDL_L(byte[] bArr) {
        com.tencent.wechat.aff.affroam.f0 f0Var = this.f215726a;
        com.tencent.wechat.aff.affroam.u device = (com.tencent.wechat.aff.affroam.u) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.affroam.u.f215987h, bArr);
        ((ho1.a1) f0Var).getClass();
        kotlin.jvm.internal.o.g(device, "device");
        po1.d a17 = po1.d.f357294i.a(device);
        boolean z17 = true;
        if (a17.f357300f.length() == 0) {
            return false;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) ro1.v.f398014a.b();
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.o.b(((po1.d) it.next()).f357300f, a17.f357300f)) {
                    break;
                }
            }
        }
        z17 = false;
        return z17;
    }

    public boolean ZIDL_M() {
        ((ho1.a1) this.f215726a).getClass();
        return !((java.util.ArrayList) ro1.v.f398014a.b()).isEmpty();
    }

    public void ZIDL_NV(long j17) {
        ho1.a1 a1Var = (ho1.a1) this.f215726a;
        a1Var.getClass();
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("batterymanager");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        int intProperty = ((android.os.BatteryManager) systemService).getIntProperty(4);
        com.tencent.wechat.aff.affroam.e0 e0Var = a1Var.f282623b;
        if (e0Var != null) {
            ((com.tencent.wechat.aff.affroam.ZIDL_TLJya9_HB) e0Var).R1(j17, intProperty);
        }
    }

    public byte[] ZIDL_O(byte[] bArr) {
        com.tencent.wechat.aff.affroam.q0 q0Var;
        com.tencent.wechat.aff.affroam.f0 f0Var = this.f215726a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((ho1.a1) f0Var).getClass();
        po1.d e17 = ro1.v.f398014a.e(str);
        if (e17 != null) {
            q0Var = e17.e();
        } else {
            q0Var = new com.tencent.wechat.aff.affroam.q0();
            q0Var.f215957e = "null";
        }
        return q0Var.toByteArrayOrNull();
    }

    public void ZIDL_P(byte[] bArr) {
        com.tencent.wechat.aff.affroam.f0 f0Var = this.f215726a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((ho1.a1) f0Var).getClass();
        ro1.v.f398014a.c().remove(str);
        oo1.o.f347151a.b().remove(str);
    }

    public void ZIDL_Q(long j17, int i17, int i18, byte[] bArr) {
        com.tencent.wechat.aff.affroam.f0 f0Var = this.f215726a;
        com.tencent.wechat.aff.affroam.o0 taskType = com.tencent.wechat.aff.affroam.o0.a(i17);
        com.tencent.wechat.aff.affroam.n0 taskState = com.tencent.wechat.aff.affroam.n0.a(i18);
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.a1 a1Var = (ho1.a1) f0Var;
        a1Var.getClass();
        kotlin.jvm.internal.o.g(taskType, "taskType");
        kotlin.jvm.internal.o.g(taskState, "taskState");
        ((ku5.t0) ku5.t0.f312615d).g(new ho1.x0(a1Var, j17, taskType, taskState, str));
    }

    public void ZIDL_R(long j17, byte[] bArr, int i17) {
        com.tencent.wechat.aff.affroam.f0 f0Var = this.f215726a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.a1 a1Var = (ho1.a1) f0Var;
        a1Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new ho1.w0(a1Var, j17, str, i17));
    }

    public void ZIDL_S(long j17) {
        ho1.a1 a1Var = (ho1.a1) this.f215726a;
        a1Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new ho1.z0(a1Var, j17));
    }

    public void ZIDL_T(byte[] bArr) {
        boolean z17;
        com.tencent.wechat.aff.affroam.f0 f0Var = this.f215726a;
        com.tencent.wechat.aff.affroam.u uVar = (com.tencent.wechat.aff.affroam.u) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.affroam.u.f215987h, bArr);
        ho1.a1 a1Var = (ho1.a1) f0Var;
        a1Var.getClass();
        po1.c cVar = po1.d.f357294i;
        kotlin.jvm.internal.o.d(uVar);
        po1.d a17 = cVar.a(uVar);
        com.tencent.mars.xlog.Log.i(a1Var.f282622a, "openLocation, device=" + a17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (a17.f357296b == po1.g.f357310h) {
            java.util.ArrayList arrayList = (java.util.ArrayList) ro1.v.f398014a.b();
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.o.b(((po1.d) it.next()).f357300f, a17.f357300f)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            java.lang.String str = a17.f357297c;
            java.lang.String str2 = a17.f357298d;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("deviceId", a17.f357295a);
            jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str);
            jSONObject2.put("remark", str2);
            jSONObject2.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, a17.f357299e);
            jSONObject2.put("connection", z17);
            jSONObject.put("portableDevice", jSONObject2);
        } else {
            jSONObject.put("deviceId", a17.f357295a);
        }
        lo1.g.f320100a.b(jSONObject);
    }

    public void ZIDL_U() {
        ((ho1.a1) this.f215726a).getClass();
        com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService.f92724f.a();
    }

    public void ZIDL_V() {
        ((ho1.a1) this.f215726a).getClass();
        com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService.f92724f.b();
    }

    public void ZIDL_WV(long j17) {
        ho1.a1 a1Var = (ho1.a1) this.f215726a;
        a1Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new ho1.n0(a1Var, j17));
    }

    public void ZIDL_X(byte[] bArr, int i17, int i18, byte[] bArr2) {
        com.tencent.wechat.aff.affroam.f0 f0Var = this.f215726a;
        com.tencent.wechat.aff.affroam.g pkg = (com.tencent.wechat.aff.affroam.g) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.affroam.g.f215828p, bArr);
        com.tencent.wechat.aff.affroam.n0 state = com.tencent.wechat.aff.affroam.n0.a(i17);
        com.tencent.wechat.aff.affroam.o0 taskType = com.tencent.wechat.aff.affroam.o0.a(i18);
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ho1.a1 a1Var = (ho1.a1) f0Var;
        a1Var.getClass();
        kotlin.jvm.internal.o.g(pkg, "pkg");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(taskType, "taskType");
        ((ku5.t0) ku5.t0.f312615d).g(new ho1.r0(pkg, taskType, a1Var, state, str));
    }

    public void ZIDL_Y(long j17, int i17, byte[] bArr, int i18) {
        com.tencent.wechat.aff.affroam.f0 f0Var = this.f215726a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.a1 a1Var = (ho1.a1) f0Var;
        a1Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new ho1.u0(a1Var, j17, i17, i18, str));
    }

    public void ZIDL_Z(long j17) {
        com.tencent.mars.xlog.Log.i(((ho1.a1) this.f215726a).f282622a, "resetMediaTime: pkgId=" + j17);
        ((ku5.t0) ku5.t0.f312615d).r(new fo1.j(j17), "RoamBackup.MediaPullObserver");
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.affroam.f0 f0Var = (com.tencent.wechat.aff.affroam.f0) obj;
        this.f215726a = f0Var;
        ho1.a1 a1Var = (ho1.a1) f0Var;
        com.tencent.mars.xlog.Log.i(a1Var.f282622a, " AffRoamPlatformImpl setCallback");
        a1Var.f282623b = this;
    }

    @Override // com.tencent.wechat.aff.affroam.e0
    public void e0(long j17, java.lang.String str) {
        ZIDL_WX(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.tencent.wechat.aff.affroam.e0
    public void j0(long j17, java.lang.String str, boolean z17) {
        ZIDL_JX(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), z17);
    }

    @Override // com.tencent.wechat.aff.affroam.e0
    public void x1(long j17, java.util.ArrayList arrayList) {
        ZIDL_AX(this.nativeHandler, j17, com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(arrayList));
    }
}
