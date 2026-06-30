package zw1;

/* loaded from: classes8.dex */
public class w5 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f476839a;

    public w5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, android.app.Activity activity) {
        this.f476839a = activity;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        android.app.Activity activity = this.f476839a;
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Qj(activity, "wxalite190b0cf18204487696c6d9890f89c090@pay", "", "preloadLiteApp");
    }
}
