package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
class ZIDL_NguQFDciB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.iam_scan.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.iam_scan.o0 f216927a;

    public ZIDL_NguQFDciB(java.lang.Object obj) {
        com.tencent.wechat.aff.iam_scan.o0 o0Var = (com.tencent.wechat.aff.iam_scan.o0) obj;
        this.f216927a = o0Var;
        ((vz3.p) o0Var).f441694a = this;
    }

    private native void ZIDL_AX(long j17, long j18);

    private native void ZIDL_BX(long j17, long j18);

    private native void ZIDL_CX(long j17, long j18);

    public void Q1(long j17) {
        ZIDL_AX(this.nativeHandler, j17);
    }

    public void ZIDL_AV(long j17, long j18, java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3, byte[] bArr, byte[] bArr2) {
        java.util.ArrayList arrayList;
        tz3.c cVar;
        com.tencent.wechat.aff.iam_scan.z0 c17;
        com.tencent.wechat.aff.iam_scan.z0 c18;
        java.util.LinkedList linkedList;
        com.tencent.wechat.aff.iam_scan.z0 c19;
        java.util.LinkedList linkedList2;
        com.tencent.wechat.aff.iam_scan.j jVar = (com.tencent.wechat.aff.iam_scan.j) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.iam_scan.j.f217064q, bArr);
        com.tencent.wechat.aff.iam_scan.k kVar = (com.tencent.wechat.aff.iam_scan.k) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.iam_scan.k.f217078p, bArr2);
        vz3.p pVar = (vz3.p) this.f216927a;
        pVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGoodsFrameResultAsync sessionId: ");
        sb6.append(j18);
        sb6.append(", status: ");
        com.tencent.wechat.aff.iam_scan.o oVar = com.tencent.wechat.aff.iam_scan.o.GOODS_STATUS_NOT_HANDLED;
        sb6.append(kVar != null ? kVar.f217087o[4] ? kVar.f217082g : oVar : null);
        sb6.append(", bufferKey: ");
        sb6.append(kVar != null ? java.lang.Long.valueOf(kVar.f217081f) : null);
        sb6.append(", productSize: ");
        sb6.append((kVar == null || (c19 = kVar.c()) == null || (linkedList2 = c19.f217202d) == null) ? null : java.lang.Integer.valueOf(linkedList2.size()));
        sb6.append(", trackIdList: ");
        sb6.append((kVar == null || (c18 = kVar.c()) == null || (linkedList = c18.f217202d) == null) ? null : kz5.n0.g0(linkedList, ",", null, null, 0, null, vz3.o.f441693d, 30, null));
        sb6.append(", serverDetectStatus: ");
        sb6.append((kVar == null || (c17 = kVar.c()) == null) ? null : java.lang.Integer.valueOf(c17.f217204f));
        com.tencent.mars.xlog.Log.i("MicroMsg.AffScanGoodsQueue", sb6.toString());
        if (jVar == null || kVar == null) {
            com.tencent.wechat.aff.iam_scan.n0 n0Var = pVar.f441694a;
            if (n0Var != null) {
                ((com.tencent.wechat.aff.iam_scan.ZIDL_NguQFDciB) n0Var).Q1(j17);
                return;
            }
            return;
        }
        vz3.q qVar = pVar.f441695b;
        if (j18 != qVar.f441703h) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AffScanGoodsQueue", "onGoodsFrameResultAsync sessionId not match: (" + j18 + ", " + qVar.f441703h + ')');
            com.tencent.wechat.aff.iam_scan.n0 n0Var2 = pVar.f441694a;
            if (n0Var2 != null) {
                ((com.tencent.wechat.aff.iam_scan.ZIDL_NguQFDciB) n0Var2).Q1(j17);
                return;
            }
            return;
        }
        qVar.f441696a += java.lang.System.currentTimeMillis() - jVar.f217067f;
        boolean z17 = true;
        qVar.f441697b++;
        boolean[] zArr = kVar.f217087o;
        if (zArr[4]) {
            oVar = kVar.f217082g;
        }
        if (oVar != com.tencent.wechat.aff.iam_scan.o.GOODS_STATUS_SUCCESS) {
            com.tencent.wechat.aff.iam_scan.n0 n0Var3 = pVar.f441694a;
            if (n0Var3 != null) {
                ((com.tencent.wechat.aff.iam_scan.ZIDL_NguQFDciB) n0Var3).Q1(j17);
                return;
            }
            return;
        }
        sz3.c1 c1Var = new sz3.c1();
        c1Var.f413987n = true;
        c1Var.f413974a = 3;
        c1Var.f413975b = java.lang.System.currentTimeMillis();
        c1Var.b(jVar.f217069h, jVar.f217070i, jVar.f217071m);
        sz3.b1 b1Var = new sz3.b1(byteBuffer2);
        b1Var.f413969d = (zArr[6] ? kVar.f217084i : new com.tencent.wechat.aff.iam_scan.m()).f217100d;
        b1Var.f413970e = (zArr[6] ? kVar.f217084i : new com.tencent.wechat.aff.iam_scan.m()).f217101e;
        c1Var.f413988o = b1Var;
        sz3.b1 b1Var2 = new sz3.b1(byteBuffer3);
        b1Var2.f413969d = (zArr[7] ? kVar.f217085m : new com.tencent.wechat.aff.iam_scan.m()).f217100d;
        b1Var2.f413970e = (zArr[7] ? kVar.f217085m : new com.tencent.wechat.aff.iam_scan.m()).f217101e;
        c1Var.f413989p = b1Var2;
        c1Var.f413985l = kVar.c().f217204f;
        int i17 = kVar.c().f217203e;
        java.util.ArrayList arrayList2 = c1Var.f413981h;
        if (i17 == 2) {
            c1Var.f413976c = 1001;
            c1Var.f413977d = 1;
            c1Var.f413985l = 0;
            java.util.LinkedList linkedList3 = kVar.c().f217202d;
            kotlin.jvm.internal.o.f(linkedList3, "getProducts(...)");
            com.tencent.wechat.aff.iam_scan.y0 y0Var = (com.tencent.wechat.aff.iam_scan.y0) kz5.n0.Z(linkedList3);
            boolean z18 = y0Var != null ? y0Var.f217192p : false;
            if (y0Var != null) {
                if (z18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AffScanGoodsQueue", "onGoodsFrameResultAsync by local, show trackId: " + y0Var.f217188i);
                }
                com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo = new com.tencent.mm.plugin.scanner.model.ScanProductInfo();
                scanProductInfo.copy(y0Var);
                sz3.a1 a1Var = new sz3.a1(scanProductInfo);
                sz3.b1 b1Var3 = new sz3.b1(et5.h.f(byteBuffer));
                b1Var3.f413968c = 4;
                b1Var3.f413969d = jVar.f217069h;
                b1Var3.f413970e = jVar.f217070i;
                vz3.a aVar = qVar.f441698c;
                b1Var3.f413971f = aVar != null ? aVar.f441668d : 0;
                a1Var.f413960b = b1Var3;
                sz3.y0 y0Var2 = a1Var.f413963e;
                y0Var2.f414166g = kVar.b().f217093e;
                y0Var2.f414167h = kVar.b().f217094f;
                y0Var2.f414160a = jVar.f217067f;
                arrayList2.add(a1Var);
            }
        } else if (i17 == 4 && c1Var.f413985l == 1) {
            c1Var.f413976c = 1002;
            c1Var.f413977d = 3;
            c1Var.f413983j = !com.tencent.mm.plugin.scanner.model.d1.f158848f;
            byte[] f17 = et5.h.f(byteBuffer);
            c1Var.f413978e = f17;
            if (c1Var.f413983j) {
                c1Var.f413984k = sz3.d1.f414006d;
                com.tencent.mars.xlog.Log.i("MicroMsg.AffScanGoodsQueue", "onGoodsFrameResultAsync by server, to upload");
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.AffScanGoodsQueue", "onGoodsFrameResultAsync by server, isDetecting and ignore");
                z17 = false;
            }
            sz3.a1 a1Var2 = new sz3.a1(new com.tencent.mm.plugin.scanner.model.ScanProductInfo());
            sz3.b1 b1Var4 = new sz3.b1(f17);
            b1Var4.f413968c = 4;
            b1Var4.f413969d = jVar.f217069h;
            b1Var4.f413970e = jVar.f217070i;
            vz3.a aVar2 = qVar.f441698c;
            b1Var4.f413971f = aVar2 != null ? aVar2.f441668d : 0;
            a1Var2.f413960b = b1Var4;
            a1Var2.f413963e.f414166g = kVar.b().f217093e;
            arrayList2.add(a1Var2);
        } else if (c1Var.f413985l == 2) {
            c1Var.f413976c = 1002;
            c1Var.f413977d = 3;
            java.util.LinkedList linkedList4 = kVar.c().f217202d;
            kotlin.jvm.internal.o.f(linkedList4, "getProducts(...)");
            com.tencent.wechat.aff.iam_scan.y0 y0Var3 = (com.tencent.wechat.aff.iam_scan.y0) kz5.n0.Z(linkedList4);
            if (y0Var3 != null) {
                if (y0Var3.f217192p) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AffScanGoodsQueue", "onGoodsFrameResultAsync by server, to add trackId: " + y0Var3.f217188i);
                }
                sz3.a1 a1Var3 = qVar.f441704i;
                if (a1Var3 != null) {
                    a1Var3.f413963e.f414166g = kVar.b().f217093e;
                    sz3.x0 x0Var = qVar.f441705j;
                    c1Var.f413986m = x0Var;
                    if (x0Var != null && (arrayList = x0Var.f414151e) != null) {
                        java.util.Iterator it = arrayList.iterator();
                        int i18 = 0;
                        while (it.hasNext()) {
                            java.lang.Object next = it.next();
                            int i19 = i18 + 1;
                            if (i18 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            ((sz3.w0) next).f414138i = y0Var3.f217188i;
                            i18 = i19;
                        }
                    }
                    a1Var3.f413959a.copy(y0Var3);
                    a1Var3.f413961c = a1Var3.f413962d;
                    arrayList2.add(a1Var3);
                }
            }
        } else {
            z17 = false;
        }
        if (z17 && (cVar = qVar.f441702g) != null) {
            cVar.b(c1Var);
        }
        com.tencent.wechat.aff.iam_scan.n0 n0Var4 = pVar.f441694a;
        if (n0Var4 != null) {
            ((com.tencent.wechat.aff.iam_scan.ZIDL_NguQFDciB) n0Var4).Q1(j17);
        }
    }

    public void ZIDL_BV(long j17) {
        vz3.p pVar = (vz3.p) this.f216927a;
        pVar.getClass();
        com.tencent.mars.xlog.Log.e("MicroMsg.AffScanGoodsQueue", "onFFEInitFailedAsync");
        pm0.v.X(new vz3.n(pVar.f441695b, pVar, j17));
    }

    public void ZIDL_CV(long j17, long j18, long j19) {
        this.f216927a.getClass();
    }

    @Override // com.tencent.wechat.aff.iam_scan.n0
    public void z0(long j17) {
        ZIDL_BX(this.nativeHandler, j17);
    }
}
