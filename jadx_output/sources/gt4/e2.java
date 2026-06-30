package gt4;

/* loaded from: classes12.dex */
public class e2 implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget f275426a;

    public e2(com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget) {
        this.f275426a = walletSuccPageAwardWidget;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... objArr) {
        com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget;
        a36.i iVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "load background_img finish, url: %s, bitmap: %s", str, bitmap);
        if (bitmap == null || (iVar = (walletSuccPageAwardWidget = this.f275426a).f180742q) == null || com.tencent.mm.sdk.platformtools.t8.K0(iVar.f1152g) || !walletSuccPageAwardWidget.f180742q.f1152g.equals(str)) {
            return;
        }
        walletSuccPageAwardWidget.getClass();
        int[] iArr = {(bitmap.getWidth() / 2) - 3, (bitmap.getWidth() / 2) + 3};
        int[] iArr2 = {(bitmap.getHeight() / 2) - 3, (bitmap.getHeight() / 2) + 3};
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocate(84).order(java.nio.ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(iArr[0]);
        order.putInt(iArr[1]);
        order.putInt(iArr2[0]);
        order.putInt(iArr2[1]);
        for (int i17 = 0; i17 < 9; i17++) {
            order.putInt(1);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new gt4.d2(this, new android.graphics.drawable.NinePatchDrawable(walletSuccPageAwardWidget.getResources(), new android.graphics.NinePatch(bitmap, order.array(), "widget_bg"))));
    }
}
