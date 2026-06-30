package com.tencent.wechat.aff.brand_service;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class ZIDL_eRuvB8TjK {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_CBX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_CX(java.lang.Object obj, byte[] bArr) {
        com.tencent.wechat.mm.brand_service.e b17;
        com.tencent.wechat.mm.brand_service.k kVar = (com.tencent.wechat.mm.brand_service.k) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.brand_service.k.f218997h, bArr);
        ((ow.q) ((com.tencent.wechat.aff.brand_service.f) obj)).getClass();
        ow.t tVar = ow.t.f349265a;
        if (kVar != null) {
            try {
                if (!kVar.f218998d.isEmpty()) {
                    b17 = ow.t.b(tVar, kVar);
                    ((ku5.t0) ku5.t0.f312615d).B(new ow.p(b17));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("BrandEcsNotifyCacheMgr", e17, "[BRS]fetchAndInitNotifyData: error", new java.lang.Object[0]);
                ow.t.f349266b = false;
                ow.t.f349268d = false;
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("BrandEcsNotifyCacheMgr", "[BRS]fetchAndInitNotifyData: BizMsgInfoList is null");
        b17 = ow.t.a(tVar);
        ((ku5.t0) ku5.t0.f312615d).B(new ow.p(b17));
    }

    private void ZIDL_DBX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_DX(java.lang.Object obj, boolean z17) {
        ((ow.v) ((com.tencent.wechat.aff.brand_service.u) obj)).getClass();
        com.tencent.mars.xlog.Log.i("BrandEcsNotifyTimerMgr", "[BRS BSNotifyTimerMgr]updateNotifyMsgAff isUpdateSuccess " + z17);
        if (z17) {
            com.tencent.mars.xlog.Log.i("BrandEcsNotifyTimerMgr", "[BRS BSNotifyTimerMgr]performUpdate onUpdateMainSession...");
            dw.f.f244070a.a();
        }
    }

    private void ZIDL_EX(java.lang.Object obj, boolean z17) {
        ((com.tencent.wechat.aff.brand_service.b) obj).complete(z17);
    }

    private void ZIDL_FX(java.lang.Object obj) {
        ((com.tencent.wechat.aff.brand_service.g) obj).getClass();
    }

    private void ZIDL_GBX(java.lang.Object obj) {
        ((com.tencent.wechat.aff.brand_service.n) obj).getClass();
    }

    private void ZIDL_GX(java.lang.Object obj) {
        ((com.tencent.wechat.aff.brand_service.t) obj).getClass();
    }

    private void ZIDL_IX(java.lang.Object obj) {
        ((com.tencent.wechat.aff.brand_service.j) obj).getClass();
    }

    private void ZIDL_JX(java.lang.Object obj) {
        ((com.tencent.wechat.aff.brand_service.k) obj).getClass();
    }

    private void ZIDL_KX(java.lang.Object obj) {
        ((com.tencent.wechat.aff.brand_service.l) obj).getClass();
    }

    private void ZIDL_LX(java.lang.Object obj) {
        ((com.tencent.wechat.aff.brand_service.s) obj).getClass();
    }

    private void ZIDL_MX(java.lang.Object obj) {
        ((com.tencent.wechat.aff.brand_service.h) obj).getClass();
    }

    private void ZIDL_OBX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_OX(java.lang.Object obj) {
        ((com.tencent.wechat.aff.brand_service.d) obj).getClass();
    }

    private void ZIDL_PBX(java.lang.Object obj, byte[] bArr) {
        com.tencent.wechat.mm.brand_service.o0 o0Var = (com.tencent.wechat.mm.brand_service.o0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.brand_service.o0.f219108o, bArr);
        ((zv.b2) ((com.tencent.wechat.aff.brand_service.e) obj)).getClass();
        java.util.Iterator it = o0Var.f219110e.iterator();
        while (it.hasNext()) {
            com.tencent.wechat.mm.brand_service.n0 n0Var = (com.tencent.wechat.mm.brand_service.n0) it.next();
            if (n0Var.f219081e == 1000) {
                com.tencent.wechat.mm.brand_service.z0 z0Var = new com.tencent.wechat.mm.brand_service.z0();
                z0Var.parseFrom(n0Var.f219083g.f192156a);
                if (n0Var.f219085i) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBrandServiceFeatureService", "[BRS] preload mb card, start, frameSetName: " + z0Var.f219258d + ", frameSetDataLen: " + z0Var.f219259e.length());
                    i95.m mVar = (gw.i) i95.n0.c(gw.i.class);
                    java.lang.String str = z0Var.f219258d;
                    kotlin.jvm.internal.o.f(str, "getFrameSetName(...)");
                    java.lang.String str2 = z0Var.f219259e;
                    kotlin.jvm.internal.o.f(str2, "getFrameSetData(...)");
                    hw.o0 o0Var2 = (hw.o0) mVar;
                    o0Var2.getClass();
                    if (o0Var2.hj()) {
                        ((ku5.t0) ku5.t0.f312615d).k(new hw.n0(o0Var2, str, str2), 1500L);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBrandServiceFeatureService", "[BRS] preload mb card, need_preload is false, frameSetName: " + z0Var.f219258d + ", frameSetDataLen: " + z0Var.f219259e.length());
                }
            }
        }
    }

    private void ZIDL_PX(java.lang.Object obj) {
        ((com.tencent.wechat.aff.brand_service.c) obj).getClass();
    }

    private void ZIDL_QBX(java.lang.Object obj) {
        ((com.tencent.wechat.aff.brand_service.o) obj).getClass();
    }

    private void ZIDL_RBX(java.lang.Object obj) {
        ((com.tencent.wechat.aff.brand_service.i) obj).getClass();
    }

    private void ZIDL_RX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_SBX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_TX(java.lang.Object obj) {
        ((com.tencent.wechat.aff.brand_service.q) obj).getClass();
    }

    private void ZIDL_UBX(java.lang.Object obj) {
        ((com.tencent.wechat.aff.brand_service.m) obj).getClass();
    }

    private void ZIDL_UX(java.lang.Object obj) {
        ((com.tencent.wechat.aff.brand_service.r) obj).getClass();
    }

    private void ZIDL_VBX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_VX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_WX(java.lang.Object obj, byte[] bArr, byte[] bArr2, boolean z17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public native void ZIDL_AB(long j17, boolean z17);

    public native boolean ZIDL_B(long j17);

    public native byte[] ZIDL_BB(long j17);

    public native void ZIDL_CBV(long j17, java.lang.Object obj, int i17, byte[] bArr);

    public native void ZIDL_CV(long j17, java.lang.Object obj, long j18, int i17);

    public native void ZIDL_DBV(long j17, java.lang.Object obj, int i17);

    public native void ZIDL_DV(long j17, java.lang.Object obj, long j18, long j19);

    public native void ZIDL_EV(long j17, java.lang.Object obj);

    public native void ZIDL_FB(long j17, boolean z17, byte[] bArr, byte[] bArr2);

    public native void ZIDL_FV(long j17, java.lang.Object obj, byte[] bArr, byte[] bArr2, int i17, byte[] bArr3);

    public native void ZIDL_GBV(long j17, java.lang.Object obj, byte[] bArr, byte[] bArr2);

    public native void ZIDL_GV(long j17, java.lang.Object obj, byte[] bArr);

    public native boolean ZIDL_H(long j17);

    public native boolean ZIDL_HB(long j17, byte[] bArr);

    public native boolean ZIDL_IB(long j17, byte[][] bArr);

    public native void ZIDL_IV(long j17, java.lang.Object obj);

    public native boolean ZIDL_JB(long j17, byte[] bArr);

    public native void ZIDL_JV(long j17, java.lang.Object obj, int i17, long j18);

    public native void ZIDL_KB(long j17);

    public native void ZIDL_KV(long j17, java.lang.Object obj);

    public native byte[] ZIDL_LB(long j17, byte[] bArr, int i17);

    public native void ZIDL_LV(long j17, java.lang.Object obj, boolean z17);

    public native void ZIDL_MB(long j17);

    public native void ZIDL_MV(long j17, java.lang.Object obj, byte[] bArr);

    public native boolean ZIDL_N(long j17, long j18, int i17);

    public native boolean ZIDL_NB(long j17);

    public native void ZIDL_OBV(long j17, java.lang.Object obj, int i17);

    public native void ZIDL_OV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_PBV(long j17, java.lang.Object obj);

    public native void ZIDL_PV(long j17, java.lang.Object obj, byte[] bArr, long j18);

    public native void ZIDL_Q(long j17, int i17, byte[] bArr);

    public native void ZIDL_QBV(long j17, java.lang.Object obj, long j18);

    public native void ZIDL_RBV(long j17, java.lang.Object obj, long j18);

    public native void ZIDL_RV(long j17, java.lang.Object obj, int i17);

    public native void ZIDL_S(long j17);

    public native void ZIDL_SBV(long j17, java.lang.Object obj);

    public native boolean ZIDL_TB(long j17);

    public native void ZIDL_TV(long j17, java.lang.Object obj);

    public native void ZIDL_UBV(long j17, java.lang.Object obj);

    public native void ZIDL_UV(long j17, java.lang.Object obj, int i17, int i18, byte[][] bArr, byte[] bArr2);

    public native void ZIDL_VBV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_VV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_WV(long j17, java.lang.Object obj, int i17, byte[] bArr);

    public native void ZIDL_X(long j17);

    public native void ZIDL_Y(long j17);

    public native void ZIDL_Z(long j17, byte[] bArr);

    public native void ZIDL_eRuvB8TjC(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2);
}
