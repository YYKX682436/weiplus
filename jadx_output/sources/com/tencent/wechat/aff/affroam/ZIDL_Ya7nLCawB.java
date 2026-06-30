package com.tencent.wechat.aff.affroam;

/* loaded from: classes11.dex */
class ZIDL_Ya7nLCawB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.affroam.g0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.h0 f215727a;

    private native void ZIDL_BX(long j17, long j18, long j19, byte[] bArr);

    private native void ZIDL_CX(long j17, long j18, byte[] bArr);

    private native void ZIDL_DX(long j17, long j18, int i17, byte[] bArr);

    private native void ZIDL_EX(long j17, long j18, boolean z17, long j19, byte[] bArr);

    private native void ZIDL_FX(long j17, long j18, boolean z17, long j19, byte[] bArr);

    private native void ZIDL_GX(long j17, long j18, byte[] bArr);

    private native void ZIDL_HI(long j17, byte[] bArr, long j18, long j19);

    private native void ZIDL_IX(long j17, long j18);

    private native void ZIDL_KX(long j17, long j18, byte[] bArr);

    private native void ZIDL_LX(long j17, long j18, byte[] bArr);

    private native void ZIDL_MX(long j17, long j18, byte[] bArr);

    private native void ZIDL_NI(long j17, byte[] bArr, long j18, long j19);

    private native void ZIDL_OX(long j17, long j18, byte[] bArr);

    private native void ZIDL_PX(long j17, long j18, byte[][] bArr);

    private native void ZIDL_QX(long j17, long j18);

    private native void ZIDL_RX(long j17, long j18);

    private native void ZIDL_SX(long j17, long j18, byte[] bArr);

    private native void ZIDL_TX(long j17, long j18, byte[] bArr);

    private native void ZIDL_UX(long j17, long j18, byte[][] bArr);

    private native void ZIDL_VX(long j17, long j18, byte[] bArr);

    private native void ZIDL_WX(long j17, long j18, long j19, long j27);

    private native void ZIDL_XX(long j17, long j18, long j19, byte[][] bArr);

    @Override // com.tencent.wechat.aff.affroam.g0
    public void C0(long j17, byte[] bArr) {
        ZIDL_TX(this.nativeHandler, j17, bArr);
    }

    @Override // com.tencent.wechat.aff.affroam.g0
    public void M(long j17, java.util.ArrayList arrayList) {
        ZIDL_PX(this.nativeHandler, j17, com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(arrayList));
    }

    @Override // com.tencent.wechat.aff.affroam.g0
    public void O1(long j17, byte[] bArr) {
        ZIDL_VX(this.nativeHandler, j17, bArr);
    }

    public void Q1(long j17, long j18, long j19) {
        ZIDL_WX(this.nativeHandler, j17, j18, j19);
    }

    public void R1(long j17, java.util.ArrayList arrayList) {
        ZIDL_UX(this.nativeHandler, j17, com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(arrayList));
    }

    @Override // com.tencent.wechat.aff.affroam.g0
    public void X(long j17, int i17, byte[] bArr) {
        ZIDL_DX(this.nativeHandler, j17, i17, bArr);
    }

    public void ZIDL_A(boolean z17) {
        this.f215727a.getClass();
    }

    public void ZIDL_BV(long j17, byte[][] bArr, int i17) {
        com.tencent.wechat.aff.affroam.h0 h0Var = this.f215727a;
        com.tencent.wechat.zidl2.ZidlUtil.stringArrayToList(bArr);
        h0Var.getClass();
    }

    public void ZIDL_CV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.affroam.h0 h0Var = this.f215727a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.q1 q1Var = (ho1.q1) h0Var;
        q1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "[+] getAdamTunnelCryptoInfoAsync taskId = " + j17 + ", cryptoMaterial = " + str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getAdamTunnelCryptoInfoAsync ");
        sb6.append(j17);
        bm5.v1.a(sb6.toString(), new ho1.f1(str, q1Var, j17));
    }

    public void ZIDL_DV(long j17, byte[] bArr) {
        ho1.q1 q1Var = (ho1.q1) this.f215727a;
        q1Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[+] getIlinkDeviceBindingSessionAsync taskId = ");
        sb6.append(j17);
        sb6.append(", req = ");
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", sb6.toString());
        com.tencent.mm.protobuf.f parseFrom = new bo1.a().parseFrom(bArr);
        kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.proto.BuildRelationSessionReq");
        bo1.a aVar = (bo1.a) parseFrom;
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "[+] getIlinkDeviceBindingSessionAsync taskId = " + j17 + ", scene = " + aVar.f22976e + ", ilinkappid = " + aVar.f22977f + ", ticket = " + aVar.f22975d);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 8491;
        lVar.f70666c = "/cgi-bin/mmiot-bin/mmiot/mmiot_buildrelationsession";
        lVar.f70664a = aVar;
        lVar.f70665b = new bo1.b();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        iVar.l().K(new ho1.l1(q1Var, j17));
    }

    public void ZIDL_EV(long j17, long j18, byte[] bArr, long j19, long j27, long j28, int i17) {
        com.tencent.wechat.aff.affroam.h0 h0Var = this.f215727a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.q1 q1Var = (ho1.q1) h0Var;
        q1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "[+] getChatPackageAsync taskId = " + j17 + ", packageId = " + j18 + ", conversationId = " + str + ", fromTime = " + j19 + ", toTime = " + j27 + ", offset = " + j28 + ", limit = " + i17);
        synchronized (q1Var) {
            if (!q1Var.f282790d) {
                q1Var.f282790d = true;
                q1Var.f282788b = java.util.concurrent.Executors.newFixedThreadPool(36, new ho1.b1("Roam-Backup-Pool"));
            }
        }
        java.util.concurrent.ExecutorService executorService = q1Var.f282788b;
        kotlin.jvm.internal.o.d(executorService);
        ho1.j1 j1Var = new ho1.j1(str, j17, j19, j27, q1Var, j18, j28, i17);
        try {
            executorService.execute(j1Var);
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RoamBackup.RoamProviderImpl", e17, java.lang.String.valueOf(j1Var), new java.lang.Object[0]);
        }
    }

    public void ZIDL_FV(long j17, byte[] bArr, long j18, long j19, int i17) {
        com.tencent.wechat.aff.affroam.h0 h0Var = this.f215727a;
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        h0Var.getClass();
    }

    public void ZIDL_GV(long j17, byte[] bArr, int i17, byte[] bArr2, byte[] bArr3, boolean z17) {
        com.tencent.wechat.aff.affroam.h0 h0Var = this.f215727a;
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8);
        h0Var.getClass();
    }

    public void ZIDL_IV(long j17, byte[][] bArr) {
        com.tencent.wechat.aff.affroam.h0 h0Var = this.f215727a;
        com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(com.tencent.wechat.aff.affroam.i1.f215861g, bArr);
        h0Var.getClass();
    }

    public byte[] ZIDL_J() {
        this.f215727a.getClass();
        return "".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public void ZIDL_KV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.affroam.h0 h0Var = this.f215727a;
        h0Var.getClass();
    }

    public void ZIDL_LV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.affroam.h0 h0Var = this.f215727a;
        h0Var.getClass();
    }

    public void ZIDL_MV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.affroam.h0 h0Var = this.f215727a;
        h0Var.getClass();
    }

    public void ZIDL_OV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.affroam.h0 h0Var = this.f215727a;
        h0Var.getClass();
    }

    public void ZIDL_PV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.affroam.h0 h0Var = this.f215727a;
        com.tencent.wechat.aff.affroam.g pkgInfo = (com.tencent.wechat.aff.affroam.g) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.affroam.g.f215828p, bArr);
        ho1.q1 q1Var = (ho1.q1) h0Var;
        q1Var.getClass();
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        ((ku5.t0) ku5.t0.f312615d).q(new ho1.h1(pkgInfo, q1Var, j17));
    }

    public void ZIDL_QV(long j17, long j18, byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.aff.affroam.h0 h0Var = this.f215727a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        bw5.w0 chatPackage = (bw5.w0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.w0.f34545f, bArr2);
        ho1.q1 q1Var = (ho1.q1) h0Var;
        q1Var.getClass();
        kotlin.jvm.internal.o.g(chatPackage, "chatPackage");
        synchronized (q1Var) {
            if (!q1Var.f282789c) {
                q1Var.a();
                q1Var.f282789c = true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "[+] [insertChatPackageAsync] Start, taskId = " + j17 + ", convId = " + str);
        fo1.m.f264882a.f("Restore", "taskId=" + j17 + ", pkg = " + j18 + ", conv = " + str + ", msgSize = " + chatPackage.f34546d.f34095d.size(), new java.lang.Object[0]);
        xn1.k kVar = new xn1.k();
        kotlinx.coroutines.y0 y0Var = q1Var.f282791e;
        if (y0Var != null) {
            xn1.j.a(kotlinx.coroutines.l.d(y0Var, null, null, new ho1.n1(j17, str, kVar, chatPackage, j18, q1Var, null), 3, null), new ho1.o1(j17));
        }
    }

    public void ZIDL_RV(long j17, long j18, byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.aff.affroam.h0 h0Var = this.f215727a;
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        h0Var.getClass();
    }

    public void ZIDL_SV(long j17, byte[] reqBuf) {
        ho1.q1 q1Var = (ho1.q1) this.f215727a;
        q1Var.getClass();
        kotlin.jvm.internal.o.g(reqBuf, "reqBuf");
        oo1.j jVar = oo1.j.f347145a;
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "[+] getRoamBackupPackagesAsync taskId = " + j17 + ", req = " + reqBuf);
        bo1.j jVar2 = new bo1.j();
        jVar2.parseFrom(reqBuf);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 11705;
        lVar.f70666c = "/cgi-bin/micromsg-bin/roambackuppackagesget";
        lVar.f70664a = jVar2;
        lVar.f70665b = new bo1.k();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        iVar.l().K(new ho1.m1(q1Var, j17));
    }

    public void ZIDL_TV(long j17, byte[] reqBuf) {
        ho1.q1 q1Var = (ho1.q1) this.f215727a;
        q1Var.getClass();
        kotlin.jvm.internal.o.g(reqBuf, "reqBuf");
        oo1.j jVar = oo1.j.f347145a;
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = -1;
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "setRoamBackupPackagesAsync taskId=" + j17);
        bo1.l lVar = new bo1.l();
        lVar.parseFrom(reqBuf);
        f0Var.f310116d = lVar.f23007d;
        java.util.LinkedList linkedList = lVar.f23008e;
        if (linkedList.size() > 0) {
            bo1.h hVar = (bo1.h) linkedList.getFirst();
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "[setRoamBackupPackagesAsync] beforeUpdate: pkgId=" + hVar.f22995d + ", version=" + hVar.f22996e + ", op=" + lVar.f23007d);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "[setRoamBackupPackagesAsync] beforeUpdate: op=" + lVar.f23007d);
        }
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70667d = 8290;
        lVar2.f70666c = "/cgi-bin/micromsg-bin/roambackuppackagesset";
        lVar2.f70664a = lVar;
        lVar2.f70665b = new bo1.m();
        com.tencent.mm.modelbase.o a17 = lVar2.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        iVar.l().K(new ho1.p1(q1Var, j17, f0Var));
    }

    public void ZIDL_UV(long j17) {
        com.tencent.wechat.aff.affroam.g0 g0Var = ((ho1.q1) this.f215727a).f282787a;
        if (g0Var != null) {
            ((com.tencent.wechat.aff.affroam.ZIDL_Ya7nLCawB) g0Var).R1(j17, new java.util.ArrayList());
        }
    }

    public void ZIDL_VV(long j17) {
        ho1.q1 q1Var = (ho1.q1) this.f215727a;
        q1Var.getClass();
        bo1.f fVar = new bo1.f();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 15344;
        lVar.f70666c = "/cgi-bin/mmiot-bin/mmiot/mmiot_getdevicenetworkinfo";
        lVar.f70664a = fVar;
        lVar.f70665b = new bo1.g();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        iVar.l().K(new ho1.k1(q1Var, j17));
    }

    public void ZIDL_WV(long j17) {
        ho1.q1 q1Var = (ho1.q1) this.f215727a;
        q1Var.getClass();
        try {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
            com.tencent.wechat.aff.affroam.g0 g0Var = q1Var.f282787a;
            if (g0Var != null) {
                ((com.tencent.wechat.aff.affroam.ZIDL_Ya7nLCawB) g0Var).Q1(j17, statFs.getAvailableBytes(), 0L);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.wechat.aff.affroam.g0 g0Var2 = q1Var.f282787a;
            if (g0Var2 != null) {
                ((com.tencent.wechat.aff.affroam.ZIDL_Ya7nLCawB) g0Var2).Q1(j17, com.tencent.wcdb.core.Database.DictDefaultMatchValue, 0L);
            }
        }
    }

    public void ZIDL_XV(long j17, byte[] bArr, long[] jArr, byte[][] bArr2, int[] iArr) {
        com.tencent.wechat.aff.affroam.h0 h0Var = this.f215727a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.util.ArrayList<java.lang.Long> longArrayToList = com.tencent.wechat.zidl2.ZidlUtil.longArrayToList(jArr);
        java.util.ArrayList<java.lang.String> stringArrayToList = com.tencent.wechat.zidl2.ZidlUtil.stringArrayToList(bArr2);
        java.util.ArrayList<java.lang.Integer> intArrayToList = com.tencent.wechat.zidl2.ZidlUtil.intArrayToList(iArr);
        ho1.q1 q1Var = (ho1.q1) h0Var;
        q1Var.getClass();
        if (longArrayToList == null || stringArrayToList == null || intArrayToList == null) {
            throw new java.lang.RuntimeException("filterRestoreMediaAsync argument is null");
        }
        synchronized (q1Var) {
            if (!q1Var.f282789c) {
                q1Var.a();
                q1Var.f282789c = true;
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (co1.g.f43768a.b(str)) {
            java.util.concurrent.ExecutorService executorService = q1Var.f282793g;
            kotlin.jvm.internal.o.d(executorService);
            ((java.util.concurrent.ThreadPoolExecutor) executorService).execute(new ho1.d1(str, j17, currentTimeMillis, longArrayToList, stringArrayToList, intArrayToList, q1Var));
            return;
        }
        com.tencent.wechat.aff.affroam.g0 g0Var = q1Var.f282787a;
        if (g0Var != null) {
            ((com.tencent.wechat.aff.affroam.ZIDL_Ya7nLCawB) g0Var).m(j17, 0L, new java.util.ArrayList());
        }
    }

    @Override // com.tencent.wechat.aff.affroam.g0
    public void a(long j17, boolean z17, long j18, bw5.w0 w0Var) {
        ZIDL_EX(this.nativeHandler, j17, z17, j18, w0Var.toByteArrayOrNull());
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.affroam.h0 h0Var = (com.tencent.wechat.aff.affroam.h0) obj;
        this.f215727a = h0Var;
        ho1.q1 q1Var = (ho1.q1) h0Var;
        q1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "setCallback");
        q1Var.f282787a = this;
        com.tencent.mm.plugin.backup.roambackup.r0.f92687d.add(q1Var);
    }

    @Override // com.tencent.wechat.aff.affroam.g0
    public void m(long j17, long j18, java.util.ArrayList arrayList) {
        ZIDL_XX(this.nativeHandler, j17, j18, com.tencent.wechat.zidl2.ZidlUtil.stringListToArrayBytes(arrayList));
    }

    @Override // com.tencent.wechat.aff.affroam.g0
    public void p1(long j17, byte[] bArr) {
        ZIDL_SX(this.nativeHandler, j17, bArr);
    }

    @Override // com.tencent.wechat.aff.affroam.g0
    public void s0(long j17, java.lang.String str) {
        ZIDL_CX(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.tencent.wechat.aff.affroam.g0
    public void v(long j17) {
        ZIDL_QX(this.nativeHandler, j17);
    }
}
