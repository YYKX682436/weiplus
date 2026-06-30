package qa3;

/* loaded from: classes15.dex */
public final class f implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qa3.h f361043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f361044b;

    public f(qa3.h hVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f361043a = hVar;
        this.f361044b = countDownLatch;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        qa3.o oVar = qa3.o.f361051a;
        qa3.h hVar = this.f361043a;
        oVar.c(hVar.f361035a, false, "errCode:" + i17);
        if (hVar.f361038d <= 0) {
            this.f361044b.countDown();
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        qa3.o oVar = qa3.o.f361051a;
        qa3.h hVar = this.f361043a;
        oVar.c(hVar.f361035a, true, "");
        if (hVar.f361038d <= 0) {
            this.f361044b.countDown();
        }
    }
}
