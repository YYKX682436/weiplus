package com.tencent.wechat.aff.affroam;

/* loaded from: classes15.dex */
class ZIDL_rRMvYRQ6B extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.affroam.t0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.u0 f215764a;

    private native void ZIDL_BX(long j17, long j18, int i17);

    private native void ZIDL_CI(long j17, int i17, byte[] bArr);

    private native void ZIDL_DX(long j17, long j18, int i17);

    private native void ZIDL_EX(long j17, long j18, int i17, byte[] bArr);

    private native void ZIDL_FX(long j17, long j18, int i17, byte[] bArr);

    private native void ZIDL_GX(long j17, long j18, int i17, byte[] bArr);

    private native void ZIDL_HX(long j17, long j18, int i17, long[] jArr);

    private native void ZIDL_IX(long j17, long j18, int i17);

    private native void ZIDL_JX(long j17, long j18, int i17, int[] iArr);

    private native void ZIDL_KX(long j17, long j18, int i17);

    private native void ZIDL_LX(long j17, long j18, int i17);

    private native void ZIDL_MX(long j17, long j18, int i17);

    private native void ZIDL_NI(long j17, long j18, long j19, long j27);

    private native void ZIDL_OX(long j17, long j18, int i17);

    private native void ZIDL_PI(long j17, long j18, long j19, long j27);

    private native void ZIDL_QX(long j17, long j18, int i17);

    private native void ZIDL_RX(long j17, long j18, int i17, byte[] bArr);

    private native void ZIDL_SX(long j17, long j18, int i17);

    private native void ZIDL_TX(long j17, long j18, int i17);

    private native void ZIDL_UX(long j17, long j18, int i17, byte[] bArr, byte[] bArr2);

    private native void ZIDL_VX(long j17, long j18, int i17, byte[] bArr);

    @Override // com.tencent.wechat.aff.affroam.t0
    public void D0(long j17, int i17, byte[] bArr) {
        ZIDL_VX(this.nativeHandler, j17, i17, bArr);
    }

    @Override // com.tencent.wechat.aff.affroam.t0
    public void E0(long j17, int i17) {
        ZIDL_TX(this.nativeHandler, j17, i17);
    }

    @Override // com.tencent.wechat.aff.affroam.t0
    public void I0(long j17, int i17, java.lang.String str, byte[] bArr) {
        ZIDL_UX(this.nativeHandler, j17, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), bArr);
    }

    @Override // com.tencent.wechat.aff.affroam.t0
    public void M0(long j17, long j18, long j19) {
        ZIDL_NI(this.nativeHandler, j17, j18, j19);
    }

    @Override // com.tencent.wechat.aff.affroam.t0
    public void P(long j17, int i17) {
        ZIDL_DX(this.nativeHandler, j17, i17);
    }

    @Override // com.tencent.wechat.aff.affroam.t0
    public void P1(long j17, int i17, com.tencent.wechat.aff.affroam.b0 b0Var) {
        ZIDL_FX(this.nativeHandler, j17, i17, b0Var.toByteArrayOrNull());
    }

    public void Q1(long j17, int i17) {
        ZIDL_KX(this.nativeHandler, j17, i17);
    }

    public void R1(long j17, int i17, java.util.ArrayList arrayList) {
        ZIDL_JX(this.nativeHandler, j17, i17, com.tencent.wechat.zidl2.ZidlUtil.intListToArray(arrayList));
    }

    public void S1(long j17, int i17) {
        ZIDL_BX(this.nativeHandler, j17, i17);
    }

    @Override // com.tencent.wechat.aff.affroam.t0
    public void T(long j17, int i17) {
        ZIDL_QX(this.nativeHandler, j17, i17);
    }

    @Override // com.tencent.wechat.aff.affroam.t0
    public void V(long j17, int i17, com.tencent.wechat.aff.affroam.x xVar) {
        ZIDL_EX(this.nativeHandler, j17, i17, xVar.toByteArrayOrNull());
    }

    public void ZIDL_BV(long j17, byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.aff.affroam.u0 u0Var = this.f215764a;
        com.tencent.wechat.aff.affroam.p commonInfo = (com.tencent.wechat.aff.affroam.p) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.affroam.p.f215940h, bArr);
        ho1.v vVar = (ho1.v) u0Var;
        vVar.getClass();
        kotlin.jvm.internal.o.g(commonInfo, "commonInfo");
        com.tencent.mars.xlog.Log.i(vVar.f282829a, " CustomRoamDiskImpl initializeAsync taskId = " + j17);
        ro1.v vVar2 = ro1.v.f398014a;
        java.lang.String str = commonInfo.f215942e;
        kotlin.jvm.internal.o.f(str, "getDeviceId(...)");
        po1.d e17 = vVar2.e(str);
        if (e17 == null || e17.f357296b != po1.g.f357310h) {
            com.tencent.mars.xlog.Log.e(vVar.f282829a, "device type error: rawType=" + commonInfo.f215943f + ", unifyDevice=" + e17);
            com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
            if (t0Var != null) {
                ((com.tencent.wechat.aff.affroam.ZIDL_rRMvYRQ6B) t0Var).S1(j17, -1);
                return;
            }
            return;
        }
        po1.d e18 = vVar2.e(e17.f357295a);
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        so1.b bVar = so1.b.f410226a;
        if (e18 == null) {
            e18 = e17;
        }
        ro1.g b17 = (bVar.h(e18) ? so1.g.f410238a : to1.g.f420911a).b();
        if (!b17.b(e17)) {
            com.tencent.mars.xlog.Log.e(vVar.f282829a, "mUDiskChannel initialize failed");
            com.tencent.wechat.aff.affroam.t0 t0Var2 = vVar.f282836h;
            if (t0Var2 != null) {
                ((com.tencent.wechat.aff.affroam.ZIDL_rRMvYRQ6B) t0Var2).S1(j17, -1);
                return;
            }
            return;
        }
        vVar.f282831c = b17;
        vVar.f282832d = e17;
        int i17 = b17 instanceof so1.c ? 4 : 16;
        java.util.concurrent.ExecutorService executorService = vVar.f282833e;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        vVar.f282833e = java.util.concurrent.Executors.newFixedThreadPool(i17, new ho1.b1(vVar.f282830b));
        vVar.f282837i = true;
        com.tencent.wechat.aff.affroam.t0 t0Var3 = vVar.f282836h;
        if (t0Var3 != null) {
            ((com.tencent.wechat.aff.affroam.ZIDL_rRMvYRQ6B) t0Var3).S1(j17, 0);
        }
    }

    public void ZIDL_DV(long j17) {
        ho1.v vVar = (ho1.v) this.f215764a;
        com.tencent.mars.xlog.Log.i(vVar.f282829a, " CustomRoamDiskImpl uninitAsync");
        ((ku5.t0) ku5.t0.f312615d).g(new ho1.r(vVar, j17));
    }

    public void ZIDL_EV(long j17) {
        ho1.v vVar = (ho1.v) this.f215764a;
        com.tencent.mars.xlog.Log.i(vVar.f282829a, "getRoamDiskInfoAsync taskId=" + j17);
        ((ku5.t0) ku5.t0.f312615d).g(new ho1.q(vVar, j17));
    }

    public void ZIDL_FV(long j17, byte[] bArr, int i17) {
        com.tencent.wechat.aff.affroam.u0 u0Var = this.f215764a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.v vVar = (ho1.v) u0Var;
        com.tencent.mars.xlog.Log.i(vVar.f282829a, "getFileInfoListAsync, parentPath = " + str + ", recursiveDepth = " + i17);
        ((ku5.t0) ku5.t0.f312615d).g(new ho1.p(str, vVar, j17));
    }

    public void ZIDL_GV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.affroam.u0 u0Var = this.f215764a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.v vVar = (ho1.v) u0Var;
        com.tencent.mars.xlog.Log.i(vVar.f282829a, "getFileInfoAsync filePath=".concat(str));
        ((ku5.t0) ku5.t0.f312615d).g(new ho1.o(str, vVar, j17));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ZIDL_HV(long r5, byte[][] r7) {
        /*
            r4 = this;
            com.tencent.wechat.aff.affroam.u0 r0 = r4.f215764a
            java.util.ArrayList r7 = com.tencent.wechat.zidl2.ZidlUtil.stringArrayToList(r7)
            ho1.v r0 = (ho1.v) r0
            if (r7 == 0) goto L16
            r0.getClass()
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L14
            goto L16
        L14:
            r1 = 0
            goto L17
        L16:
            r1 = 1
        L17:
            if (r1 == 0) goto L30
            java.lang.String r7 = r0.f282829a
            java.lang.String r1 = "dirPaths is null or empty"
            com.tencent.mars.xlog.Log.e(r7, r1)
            com.tencent.wechat.aff.affroam.t0 r7 = r0.f282836h
            if (r7 == 0) goto L53
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = -1
            com.tencent.wechat.aff.affroam.ZIDL_rRMvYRQ6B r7 = (com.tencent.wechat.aff.affroam.ZIDL_rRMvYRQ6B) r7
            r7.t0(r5, r1, r0)
            goto L53
        L30:
            java.lang.String r1 = r0.f282829a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getDirsSizeAsync, dirPaths.size="
            r2.<init>(r3)
            int r3 = r7.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r1, r2)
            ku5.u0 r1 = ku5.t0.f312615d
            ho1.n r2 = new ho1.n
            r2.<init>(r0, r7, r5)
            ku5.t0 r1 = (ku5.t0) r1
            r1.g(r2)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.affroam.ZIDL_rRMvYRQ6B.ZIDL_HV(long, byte[][]):void");
    }

    public void ZIDL_IV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.affroam.u0 u0Var = this.f215764a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.v vVar = (ho1.v) u0Var;
        com.tencent.mars.xlog.Log.i(vVar.f282829a, " CustomRoamDiskImpl deleteFileAsync");
        ((ku5.t0) ku5.t0.f312615d).q(new ho1.e(str, vVar, j17));
    }

    public void ZIDL_JV(long j17, byte[][] bArr) {
        com.tencent.wechat.aff.affroam.u0 u0Var = this.f215764a;
        com.tencent.wechat.zidl2.ZidlUtil.stringArrayToList(bArr);
        ho1.v vVar = (ho1.v) u0Var;
        com.tencent.mars.xlog.Log.i(vVar.f282829a, " CustomRoamDiskImpl deleteFileListAsync");
        com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
        if (t0Var != null) {
            ((com.tencent.wechat.aff.affroam.ZIDL_rRMvYRQ6B) t0Var).R1(j17, 0, new java.util.ArrayList());
        }
    }

    public void ZIDL_KV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.affroam.u0 u0Var = this.f215764a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.v vVar = (ho1.v) u0Var;
        vVar.getClass();
        com.tencent.mars.xlog.Log.i(vVar.f282829a, " CustomRoamDiskImpl createDirAsync taskId = " + j17 + ", dirPath = " + str);
        com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
        if (t0Var != null) {
            ((com.tencent.wechat.aff.affroam.ZIDL_rRMvYRQ6B) t0Var).Q1(j17, 0);
        }
    }

    public void ZIDL_LV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.affroam.u0 u0Var = this.f215764a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.v vVar = (ho1.v) u0Var;
        com.tencent.mars.xlog.Log.i(vVar.f282829a, " CustomRoamDiskImpl deleteDirAsync");
        ((ku5.t0) ku5.t0.f312615d).q(new ho1.d(str, vVar, j17));
    }

    public void ZIDL_MV(long j17, long j18, byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.aff.affroam.u0 u0Var = this.f215764a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ho1.v vVar = (ho1.v) u0Var;
        vVar.getClass();
        com.tencent.mars.xlog.Log.i(vVar.f282829a, "uploadFileAsync taskId = " + j17 + ", id = " + j18 + ", localPath = " + str + ", remotePath = " + str2);
        vVar.a(new ho1.u(str, vVar, j17, java.lang.System.currentTimeMillis(), str2, j18));
    }

    public void ZIDL_OV(long j17, long j18, byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.aff.affroam.u0 u0Var = this.f215764a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ho1.v vVar = (ho1.v) u0Var;
        vVar.getClass();
        com.tencent.mars.xlog.Log.i(vVar.f282829a, "downloadFileAsync, taskId = " + j17 + ", remotePath = " + str + ", localPath = " + str2);
        vVar.a(new ho1.g(vVar, j17, java.lang.System.currentTimeMillis(), str, str2, j18));
    }

    public void ZIDL_QV(long j17, byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.aff.affroam.u0 u0Var = this.f215764a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.v vVar = (ho1.v) u0Var;
        vVar.getClass();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Long.valueOf(j17);
        objArr[1] = str;
        objArr[2] = bArr2 != null ? java.lang.Integer.valueOf(bArr2.length) : null;
        com.tencent.mars.xlog.Log.i(vVar.f282829a, "fileStreamWriteOnceAsync, taskId = %s, remotePath = %s, buf.size = %s", objArr);
        vVar.a(new ho1.m(vVar, j17, str, bArr2));
    }

    public void ZIDL_RV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.affroam.u0 u0Var = this.f215764a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.v vVar = (ho1.v) u0Var;
        vVar.getClass();
        com.tencent.mars.xlog.Log.i(vVar.f282829a, "fileStreamWriteBeginAsync taskId=" + j17 + ", remotePath=" + str);
        vVar.a(new ho1.k(vVar, str, j17));
    }

    public void ZIDL_SV(long j17, byte[] bArr, byte[] buf) {
        com.tencent.wechat.aff.affroam.u0 u0Var = this.f215764a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.v vVar = (ho1.v) u0Var;
        vVar.getClass();
        kotlin.jvm.internal.o.g(buf, "buf");
        vVar.a(new ho1.j(vVar, str, j17, buf));
    }

    public void ZIDL_TV(long j17, byte[] bArr, byte[] buf) {
        com.tencent.wechat.aff.affroam.u0 u0Var = this.f215764a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.v vVar = (ho1.v) u0Var;
        vVar.getClass();
        kotlin.jvm.internal.o.g(buf, "buf");
        com.tencent.mars.xlog.Log.i(vVar.f282829a, "fileStreamWriteEndAsync taskId=" + j17 + " context=" + str);
        vVar.a(new ho1.l(vVar, str, j17, buf));
    }

    public void ZIDL_UV(long j17, byte[] bArr, long j18) {
        com.tencent.wechat.aff.affroam.u0 u0Var = this.f215764a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.v vVar = (ho1.v) u0Var;
        vVar.getClass();
        com.tencent.mars.xlog.Log.i(vVar.f282829a, "fileStreamReadBeginAsync taskId=" + j17 + ", remotePath=" + str + ", readSize = " + j18);
        vVar.a(new ho1.i(vVar, j17, str, j18));
    }

    public void ZIDL_VV(long j17, byte[] bArr, long j18) {
        com.tencent.wechat.aff.affroam.u0 u0Var = this.f215764a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ho1.v vVar = (ho1.v) u0Var;
        vVar.getClass();
        com.tencent.mars.xlog.Log.i(vVar.f282829a, "fileStreamReadAsync taskId=" + j17 + ", readSize=" + j18 + ", readSize=" + j18);
        vVar.a(new ho1.h(vVar, str, j17, j18));
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.affroam.u0 u0Var = (com.tencent.wechat.aff.affroam.u0) obj;
        this.f215764a = u0Var;
        ho1.v vVar = (ho1.v) u0Var;
        com.tencent.mars.xlog.Log.i(vVar.f282829a, " CustomRoamDiskImpl setCallback");
        vVar.f282836h = this;
    }

    @Override // com.tencent.wechat.aff.affroam.t0
    public void f1(long j17, int i17) {
        ZIDL_MX(this.nativeHandler, j17, i17);
    }

    @Override // com.tencent.wechat.aff.affroam.t0
    public void g0(long j17, int i17) {
        ZIDL_SX(this.nativeHandler, j17, i17);
    }

    @Override // com.tencent.wechat.aff.affroam.t0
    public void h0(long j17, int i17, com.tencent.wechat.aff.affroam.a0 a0Var) {
        ZIDL_GX(this.nativeHandler, j17, i17, a0Var.toByteArrayOrNull());
    }

    @Override // com.tencent.wechat.aff.affroam.t0
    public void h1(long j17, int i17) {
        ZIDL_IX(this.nativeHandler, j17, i17);
    }

    @Override // com.tencent.wechat.aff.affroam.t0
    public void k0(long j17, int i17) {
        ZIDL_OX(this.nativeHandler, j17, i17);
    }

    @Override // com.tencent.wechat.aff.affroam.t0
    public void o1(long j17, int i17) {
        ZIDL_LX(this.nativeHandler, j17, i17);
    }

    @Override // com.tencent.wechat.aff.affroam.t0
    public void q1(long j17, long j18, long j19) {
        ZIDL_PI(this.nativeHandler, j17, j18, j19);
    }

    @Override // com.tencent.wechat.aff.affroam.t0
    public void t0(long j17, int i17, java.util.ArrayList arrayList) {
        ZIDL_HX(this.nativeHandler, j17, i17, com.tencent.wechat.zidl2.ZidlUtil.longListToArray(arrayList));
    }

    @Override // com.tencent.wechat.aff.affroam.t0
    public void w1(long j17, int i17, java.lang.String str) {
        ZIDL_RX(this.nativeHandler, j17, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
