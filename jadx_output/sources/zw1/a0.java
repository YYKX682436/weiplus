package zw1;

/* loaded from: classes9.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI f476570d;

    public a0(com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI collectCreateQRCodeNewUI) {
        this.f476570d = collectCreateQRCodeNewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI collectCreateQRCodeNewUI = this.f476570d;
        if (collectCreateQRCodeNewUI.f96382i == 2 && collectCreateQRCodeNewUI.isHandleAutoShowNormalStWcKb()) {
            collectCreateQRCodeNewUI.showNormalStWcKb();
        }
    }
}
