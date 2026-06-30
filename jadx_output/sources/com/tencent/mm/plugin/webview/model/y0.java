package com.tencent.mm.plugin.webview.model;

/* loaded from: classes4.dex */
public class y0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f183190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f183191b;

    public y0(com.tencent.mm.plugin.webview.model.z0 z0Var, int[] iArr, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f183190a = iArr;
        this.f183191b = countDownLatch;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckTextLanguage", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        int[] iArr = this.f183190a;
        iArr[0] = 2;
        java.util.concurrent.CountDownLatch countDownLatch = this.f183191b;
        if (i17 != 0 || i18 != 0) {
            countDownLatch.countDown();
            return;
        }
        int i19 = ((r45.o20) oVar.f70711b.f70700a).f381841e;
        if (i19 == 1) {
            iArr[0] = 0;
        } else if (i19 == 2) {
            iArr[0] = 1;
        }
        countDownLatch.countDown();
    }
}
