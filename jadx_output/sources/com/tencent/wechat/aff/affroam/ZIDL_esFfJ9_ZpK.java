package com.tencent.wechat.aff.affroam;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ZIDL_esFfJ9_ZpK {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_AX(java.lang.Object obj, int i17, long[] jArr) {
        ((com.tencent.wechat.aff.affroam.y0) obj).a(i17, com.tencent.wechat.zidl2.ZidlUtil.longArrayToList(jArr));
    }

    private void ZIDL_BX(java.lang.Object obj, int i17, long[] jArr) {
        android.support.v4.media.f.a(obj);
        com.tencent.wechat.zidl2.ZidlUtil.longArrayToList(jArr);
        throw null;
    }

    private void ZIDL_CX(java.lang.Object obj, int i17, byte[][] bArr) {
        android.support.v4.media.f.a(obj);
        com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(com.tencent.wechat.aff.affroam.g.f215828p, bArr);
        throw null;
    }

    private void ZIDL_DX(java.lang.Object obj, int i17, byte[][] bArr) {
        ((com.tencent.wechat.aff.affroam.a1) obj).a(i17, com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(com.tencent.wechat.aff.affroam.g.f215828p, bArr));
    }

    private void ZIDL_FX(java.lang.Object obj, int i17, byte[][] bArr) {
        java.lang.Object obj2;
        java.util.ArrayList mmpbListUnSerializeFromBasic = com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(com.tencent.wechat.aff.affroam.g.f215828p, bArr);
        com.tencent.mm.plugin.backup.roambackup.q0 q0Var = (com.tencent.mm.plugin.backup.roambackup.q0) ((com.tencent.wechat.aff.affroam.b1) obj);
        q0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[+] Update backup package complete, error = ");
        sb6.append(i17);
        sb6.append(", packageId = ");
        long j17 = q0Var.f92680a;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", sb6.toString());
        kotlin.jvm.internal.o.d(mmpbListUnSerializeFromBasic);
        java.util.Iterator it = mmpbListUnSerializeFromBasic.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((com.tencent.wechat.aff.affroam.g) obj2).f215829d == j17) {
                    break;
                }
            }
        }
        q0Var.f92681b.invoke(java.lang.Integer.valueOf(i17), (com.tencent.wechat.aff.affroam.g) obj2);
    }

    private void ZIDL_GX(java.lang.Object obj, int i17, byte[][] bArr) {
        android.support.v4.media.f.a(obj);
        com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(com.tencent.wechat.aff.affroam.g.f215828p, bArr);
        throw null;
    }

    private void ZIDL_HX(java.lang.Object obj, int i17) {
        com.tencent.mm.plugin.backup.roambackup.b0 b0Var = (com.tencent.mm.plugin.backup.roambackup.b0) ((com.tencent.wechat.aff.affroam.z0) obj);
        b0Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - b0Var.f92570a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", "[+] Delete backup package complete, error = " + i17 + ", packageId = " + b0Var.f92571b + ", duration = " + currentTimeMillis);
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        com.tencent.wechat.aff.affroam.g gVar = b0Var.f92572c;
        long j17 = gVar.f215837o.f215838d;
        int i18 = gVar.f215832g.f215988d;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("duration", java.lang.Long.valueOf(currentTimeMillis));
        linkedHashMap.put("pkgSize", java.lang.Long.valueOf(j17));
        linkedHashMap.put("deviceType", java.lang.Long.valueOf(i18));
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", "reportDeletePackage, extraInfoMap = " + linkedHashMap);
        com.tencent.mm.plugin.backup.roambackup.y1 y1Var = com.tencent.mm.plugin.backup.roambackup.y1.R;
        com.tencent.mm.plugin.backup.roambackup.l0 l0Var = new com.tencent.mm.plugin.backup.roambackup.l0(currentTimeMillis, linkedHashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + y1Var);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 8L;
        roamBackupRecoverReport28098Struct.f60067e = 8L;
        l0Var.invoke(roamBackupRecoverReport28098Struct);
        roamBackupRecoverReport28098Struct.k();
        ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.plugin.backup.roambackup.z(b0Var.f92571b), 1500L);
        b0Var.f92573d.f293455d = 1.0f;
        r0Var.q(b0Var.f92571b);
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.backup.roambackup.a0 a0Var = new com.tencent.mm.plugin.backup.roambackup.a0(b0Var.f92571b, i17, b0Var.f92574e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(a0Var, 500L, false);
    }

    private void ZIDL_IX(java.lang.Object obj, int i17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public native void ZIDL_AV(long j17, java.lang.Object obj, byte[][] bArr);

    public native void ZIDL_BV(long j17, java.lang.Object obj, byte[][] bArr);

    public native void ZIDL_CV(long j17, java.lang.Object obj, boolean z17);

    public native void ZIDL_DV(long j17, java.lang.Object obj, boolean z17);

    public native byte[] ZIDL_E(long j17, long j18);

    public native void ZIDL_FV(long j17, java.lang.Object obj, byte[][] bArr);

    public native void ZIDL_GV(long j17, java.lang.Object obj, byte[][] bArr);

    public native void ZIDL_HV(long j17, java.lang.Object obj, long[] jArr);

    public native void ZIDL_IV(long j17, java.lang.Object obj, long[] jArr);

    public native int ZIDL_J(long j17);

    public native void ZIDL_esFfJ9_ZpC(java.lang.Object obj, java.lang.String str, java.lang.String str2);
}
