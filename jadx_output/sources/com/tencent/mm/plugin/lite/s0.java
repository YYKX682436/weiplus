package com.tencent.mm.plugin.lite;

/* loaded from: classes7.dex */
public class s0 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f144170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f144171b;

    public s0(com.tencent.mm.plugin.lite.w wVar, java.lang.String[] strArr, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f144170a = strArr;
        this.f144171b = countDownLatch;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.MMWxaLiteAppCenter", "checkLiteAppAndGetPath check fail, errCode: " + i17);
        this.f144171b.countDown();
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "checkLiteAppAndGetPath check success, path: " + wxaLiteAppInfo.path);
        this.f144170a[0] = wxaLiteAppInfo.path;
        this.f144171b.countDown();
    }
}
