package com.tencent.wechat.aff.same_net_verify;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class ZIDL_ocx5sk2RK {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_BX(java.lang.Object obj, byte[] bArr) {
        com.tencent.wechat.aff.same_net_verify.c cVar = (com.tencent.wechat.aff.same_net_verify.c) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.same_net_verify.c.f217488n, bArr);
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.ob obVar = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.ob) ((com.tencent.wechat.aff.same_net_verify.a) obj);
        obVar.getClass();
        if (cVar != null) {
            if (!kotlin.jvm.internal.o.b(cVar.f217495m[3] ? cVar.f217491f : "", "CANCEL")) {
                kotlinx.coroutines.l.d(v65.m.f433580a, null, null, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.nb(cVar, obVar.f186414a, obVar.f186415b, null), 3, null);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("SameNetVerifyTAG", "resp == null || resp.err == CANCEL");
    }

    public native void ZIDL_A(long j17);

    public native void ZIDL_BV(long j17, java.lang.Object obj, byte[][] bArr, byte[] bArr2);

    public native void ZIDL_ocx5sk2RC(java.lang.Object obj, java.lang.String str, java.lang.String str2);
}
