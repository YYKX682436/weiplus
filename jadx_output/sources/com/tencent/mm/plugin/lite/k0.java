package com.tencent.mm.plugin.lite;

/* loaded from: classes15.dex */
public class k0 implements com.tencent.mm.plugin.lite.api.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f143846a;

    public k0(com.tencent.mm.plugin.lite.w wVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f143846a = countDownLatch;
    }

    public void a(java.util.ArrayList arrayList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "batchCheckLiteApp appIds:" + arrayList.toString());
        this.f143846a.countDown();
    }
}
