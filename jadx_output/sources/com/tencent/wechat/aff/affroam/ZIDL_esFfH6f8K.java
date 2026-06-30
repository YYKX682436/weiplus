package com.tencent.wechat.aff.affroam;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class ZIDL_esFfH6f8K {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_DX(java.lang.Object obj, int i17) {
        ((com.tencent.wechat.aff.affroam.j1) obj).complete(i17);
    }

    private void ZIDL_EX(java.lang.Object obj, int i17) {
        ((com.tencent.wechat.aff.affroam.m1) obj).complete(i17);
    }

    private void ZIDL_GX(java.lang.Object obj, int i17, int i18, byte[] bArr, byte[] bArr2) {
        android.support.v4.media.f.a(obj);
        if (i18 != 0) {
        }
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        throw null;
    }

    private void ZIDL_HX(java.lang.Object obj, int i17, byte[] bArr) {
        com.tencent.wechat.aff.affroam.v vVar = (com.tencent.wechat.aff.affroam.v) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.affroam.v.f215992i, bArr);
        lo1.d dVar = (lo1.d) ((com.tencent.wechat.aff.affroam.n1) obj);
        dVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on deviceInfo gotten, errorCode=");
        sb6.append(i17);
        sb6.append(", deviceId=");
        java.lang.String str = dVar.f320096a;
        sb6.append(str);
        sb6.append(", info=");
        sb6.append(vVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.AppBrandJsApiRoamApiHandler", sb6.toString());
        if (i17 != 0) {
            dVar.f320097b.invoke();
            return;
        }
        org.json.JSONObject put = new org.json.JSONObject().put("deviceId", str).put("totalSize", vVar.f215993d).put("usedSize", vVar.f215994e).put("backupUsedSize", vVar.f215995f).put("lastBackupTime", vVar.f215996g).put("cached", vVar.f215997h);
        kotlin.jvm.internal.o.d(put);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamJsApiEvent", "post event:deviceInfo, data:" + put);
        put.put("notify_type", "deviceInfo");
        ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Ai("wxd930c3b7cf7c92e6", put.toString());
    }

    public static native void ZIDL_esFfH6f8D(long j17, java.lang.String str, java.lang.String str2);

    public native int ZIDL_B(long j17, byte[] bArr);

    public native int ZIDL_C(long j17, byte[] bArr);

    public native void ZIDL_DV(long j17, java.lang.Object obj);

    public native void ZIDL_EV(long j17, java.lang.Object obj);

    public native void ZIDL_GV(long j17, java.lang.Object obj);

    public native void ZIDL_HV(long j17, java.lang.Object obj);

    public native void ZIDL_esFfH6f8C(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2, java.lang.Object obj3);
}
