package com.tencent.wechat.aff.affroam;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ZIDL_esFfd8OmK {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_FX(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.tencent.wechat.aff.affroam.f1) obj).a(i17, (com.tencent.wechat.aff.affroam.f) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.affroam.f.f215823h, bArr));
    }

    private void ZIDL_GX(java.lang.Object obj, int i17) {
        com.tencent.mm.plugin.backup.roambackup.y yVar = (com.tencent.mm.plugin.backup.roambackup.y) ((com.tencent.wechat.aff.affroam.d1) obj);
        yVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - yVar.f92927a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("delete backup data complete, pkgId=");
        long j17 = yVar.f92928b;
        sb6.append(j17);
        sb6.append(", errorCode=");
        sb6.append(i17);
        sb6.append(", duration = ");
        sb6.append(currentTimeMillis);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", sb6.toString());
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        int size = yVar.f92930d.size();
        int i18 = yVar.f92931e.f215832g.f215988d;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("duration", java.lang.Long.valueOf(currentTimeMillis));
        linkedHashMap.put("isAll", java.lang.Long.valueOf(yVar.f92929c ? 1L : 0L));
        linkedHashMap.put("conversationListSize", java.lang.Long.valueOf(size));
        linkedHashMap.put("deviceType", java.lang.Long.valueOf(i18));
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", "reportDeleteData, extraInfoMap = " + linkedHashMap);
        com.tencent.mm.plugin.backup.roambackup.y1 y1Var = com.tencent.mm.plugin.backup.roambackup.y1.Y;
        com.tencent.mm.plugin.backup.roambackup.k0 k0Var = new com.tencent.mm.plugin.backup.roambackup.k0(currentTimeMillis, linkedHashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + y1Var);
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
        roamBackupRecoverReport28098Struct.f60066d = 9L;
        roamBackupRecoverReport28098Struct.f60067e = 7L;
        k0Var.invoke(roamBackupRecoverReport28098Struct);
        roamBackupRecoverReport28098Struct.k();
        com.tencent.mm.plugin.backup.roambackup.b.f92568a.b(j17);
        r0Var.q(j17);
        ((nv.v1) i95.n0.c(nv.v1.class)).Ri(j17);
        yz5.q qVar = com.tencent.mm.plugin.backup.roambackup.r0.f92690g;
        if (qVar != null) {
            qVar.invoke(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Boolean.FALSE);
        }
        r0Var.c();
        com.tencent.mm.plugin.backup.roambackup.r0.a(r0Var, yVar.f92928b, yVar.f92932f, yVar.f92933g, i17);
    }

    private void ZIDL_JX(java.lang.Object obj, int i17, byte[][] bArr) {
        android.support.v4.media.f.a(obj);
        com.tencent.wechat.zidl2.ZidlUtil.stringArrayToList(bArr);
        throw null;
    }

    private void ZIDL_KX(java.lang.Object obj, long j17, int i17, byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        com.tencent.mm.plugin.backup.roambackup.f1 f1Var = (com.tencent.mm.plugin.backup.roambackup.f1) ((com.tencent.wechat.aff.affroam.g1) obj);
        com.tencent.mars.xlog.Log.i(f1Var.f92593a.f92673d, "[loadMediaAsync] invokeId=" + j17 + ", error=" + i17 + ", tempPath=" + str);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) f1Var.f92594b).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Integer.valueOf(i17), str)));
    }

    public static native void ZIDL_esFfd8OmD(long j17, java.lang.String str, java.lang.String str2);

    public native int ZIDL_B(long j17, long j18);

    public native byte[] ZIDL_C(long j17);

    public native byte[] ZIDL_D(long j17, byte[] bArr);

    public native byte[] ZIDL_E(long j17, byte[] bArr);

    public native void ZIDL_FV(long j17, java.lang.Object obj, long j18, long j19);

    public native void ZIDL_GV(long j17, java.lang.Object obj, byte[][] bArr, boolean z17);

    public native void ZIDL_H(long j17, byte[] bArr);

    public native void ZIDL_I(long j17);

    public native void ZIDL_JV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_KV(long j17, java.lang.Object obj, byte[] bArr, long j18, long j19, byte[] bArr2);

    public native void ZIDL_L(long j17, long j18, int i17);

    public native byte[] ZIDL_M(long j17);

    public native int ZIDL_N(long j17, byte[] bArr);

    public native long ZIDL_O(long j17, byte[] bArr);

    public native void ZIDL_esFfd8OmC(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);
}
