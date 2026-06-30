package com.tencent.wechat.aff.status;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class ZIDL_qp5oaPRwK {
    private static final java.lang.String TAG = "StatusModuleReadManagerK";
    private static final java.util.concurrent.atomic.AtomicLong taskId = new java.util.concurrent.atomic.AtomicLong(0);

    public static long GenTaskId() {
        return taskId.incrementAndGet();
    }

    private void ZIDL_AX(java.lang.Object obj, byte[] bArr) {
        ((com.tencent.wechat.aff.status.StatusModuleReadManager.markStatusReadCallback) obj).complete((com.tencent.wechat.aff.status.MarkStatusReadResponse) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.status.MarkStatusReadResponse.getDefaultInstance(), bArr));
    }

    private void ZIDL_BX(java.lang.Object obj, byte[] bArr) {
        ((com.tencent.wechat.aff.status.StatusModuleReadManager.getStatusReadListCallback) obj).complete((com.tencent.wechat.aff.status.GetStatusReadListResponse) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.status.GetStatusReadListResponse.getDefaultInstance(), bArr));
    }

    private void ZIDL_CX(java.lang.Object obj, byte[] bArr) {
        ((com.tencent.wechat.aff.status.StatusModuleReadManager.readReadRecordListFromDBCallback) obj).complete((com.tencent.wechat.aff.status.GetStatusReadListResponse) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.status.GetStatusReadListResponse.getDefaultInstance(), bArr));
    }

    private void ZIDL_DX(java.lang.Object obj, boolean z17) {
        ((com.tencent.wechat.aff.status.StatusModuleReadManager.insertReadRecordCallback) obj).complete(z17);
    }

    public native void ZIDL_AV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_BV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_CV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_DV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_qp5oaPRwC(java.lang.Object obj, java.lang.String str, java.lang.String str2);
}
