package ns4;

/* loaded from: classes4.dex */
public final class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339440d;

    public b3(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339440d = weCoinRechargeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        android.view.ViewGroup.LayoutParams layoutParams;
        int i18 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView.f179184w;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339440d;
        weCoinRechargeView.getClass();
        int i19 = com.tencent.mm.ui.bk.h(weCoinRechargeView).y;
        java.lang.Object systemService = weCoinRechargeView.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getSize(point);
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(weCoinRechargeView);
        java.lang.Math.max(point.y, point.x);
        int max = java.lang.Math.max(h17.y, h17.x);
        android.graphics.Rect rect = new android.graphics.Rect();
        weCoinRechargeView.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int max2 = (max - java.lang.Math.max(rect.bottom - rect.top, rect.right - rect.left)) - com.tencent.mm.ui.bk.p(weCoinRechargeView);
        if (max2 > 0) {
            i19 -= com.tencent.mm.ui.bk.j(weCoinRechargeView);
        }
        androidx.appcompat.app.b supportActionBar = weCoinRechargeView.getSupportActionBar();
        if (supportActionBar != null) {
            i17 = supportActionBar.l();
            if (i17 <= 0) {
                i17 = weCoinRechargeView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479623ay);
            }
        } else {
            i17 = 0;
        }
        int p17 = ((i19 - i17) - com.tencent.mm.ui.bk.p(weCoinRechargeView)) - weCoinRechargeView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479675cc);
        int b17 = i65.a.b(weCoinRechargeView, 520);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinRechargeView", "updateMainContentView, [contentViewHeight] " + p17 + ", [maxSpaceSize] " + b17 + ", [bottomHeight] " + max2);
        if (p17 > b17) {
            p17 = b17;
        }
        android.view.View findViewById = weCoinRechargeView.findViewById(com.tencent.mm.R.id.f487718pk0);
        if (findViewById == null || (layoutParams = findViewById.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = p17;
        findViewById.setLayoutParams(layoutParams);
    }
}
