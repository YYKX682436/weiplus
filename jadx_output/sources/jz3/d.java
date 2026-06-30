package jz3;

/* loaded from: classes13.dex */
public class d extends com.tencent.mm.sdk.event.n {
    public d() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.DecodeQRCodeInImageSyncEvent decodeQRCodeInImageSyncEvent = (com.tencent.mm.autogen.events.DecodeQRCodeInImageSyncEvent) iEvent;
        if (com.tencent.mm.sdk.platformtools.t8.K0(decodeQRCodeInImageSyncEvent.f54080g.f7868a)) {
            com.tencent.mars.xlog.Log.e("DECODE_QRCODE_IN_IMAGE_HANDLER", "[-] img path is null or empty.");
            decodeQRCodeInImageSyncEvent.f54081h.f7977a = null;
        } else {
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            java.lang.String[][] strArr = {null};
            jz3.c cVar = new jz3.c(this, strArr, countDownLatch);
            kd0.b3 b3Var = new kd0.b3();
            b3Var.f306604a = java.lang.System.currentTimeMillis();
            b3Var.f306605b = decodeQRCodeInImageSyncEvent.f54080g.f7868a;
            b3Var.f306607d = new int[]{0};
            zs5.u0.f475485h.b(b3Var, cVar);
            try {
                countDownLatch.await(5L, java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("DECODE_QRCODE_IN_IMAGE_HANDLER", th6, "[-] Timeout when wait for decoding.", new java.lang.Object[0]);
                am.t3 t3Var = decodeQRCodeInImageSyncEvent.f54081h;
                t3Var.f7977a = new java.lang.String[]{"<timeout>"};
                t3Var.f7978b = true;
            }
            synchronized (strArr) {
                java.lang.String[] strArr2 = strArr[0];
                if (strArr2 == null || strArr2.length <= 0) {
                    decodeQRCodeInImageSyncEvent.f54081h.f7977a = null;
                } else {
                    decodeQRCodeInImageSyncEvent.f54081h.f7977a = strArr2;
                }
            }
        }
        return false;
    }
}
