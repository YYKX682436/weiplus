package gt4;

/* loaded from: classes13.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget f275575d;

    public x1(com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget) {
        this.f275575d = walletSuccPageAwardWidget;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget walletSuccPageAwardWidget = this.f275575d;
        if (walletSuccPageAwardWidget.f180739n.getHeight() != walletSuccPageAwardWidget.getHeight()) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) walletSuccPageAwardWidget.f180739n.getLayoutParams();
            layoutParams.width = walletSuccPageAwardWidget.f180736h.getWidth();
            layoutParams.height = walletSuccPageAwardWidget.f180736h.getHeight();
            walletSuccPageAwardWidget.f180739n.setLayoutParams(layoutParams);
        }
        int i17 = walletSuccPageAwardWidget.f180741p.f1110m;
        boolean z17 = i17 == 1 || i17 == 3;
        boolean z18 = i17 == 2 || i17 == 3;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSuccPageAwardWidget", "initScratchShakeView, canScratch: %s, canShrake: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        int b17 = i65.a.b(walletSuccPageAwardWidget.getContext(), 50);
        com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView walletScratchShakeView = walletSuccPageAwardWidget.f180739n;
        float f17 = b17;
        int i18 = b17 / 2;
        walletScratchShakeView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletScratchShakeView", "init canShake: %s, canScratch: %s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        walletScratchShakeView.f180729f = z17;
        walletScratchShakeView.f180728e = z18;
        gt4.r1 r1Var = walletScratchShakeView.f180727d;
        if (r1Var != null) {
            walletScratchShakeView.removeView(r1Var);
            walletScratchShakeView.f180727d = null;
        }
        gt4.r1 r1Var2 = new gt4.r1(walletScratchShakeView, walletScratchShakeView.getContext());
        walletScratchShakeView.f180727d = r1Var2;
        walletScratchShakeView.addView(r1Var2, new android.view.ViewGroup.LayoutParams(-1, -1));
        gt4.r1 r1Var3 = walletScratchShakeView.f180727d;
        r1Var3.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletScratchShakeView", "init inner view");
        android.graphics.Paint paint = new android.graphics.Paint();
        r1Var3.f275515f = paint;
        paint.setAntiAlias(true);
        r1Var3.f275515f.setDither(true);
        android.content.res.Resources resources = r1Var3.getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f482214ci0));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletScratchShakeView$WalletScratchShakeInnerView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(FI)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/wallet_core/ui/view/WalletScratchShakeView$WalletScratchShakeInnerView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(FI)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        int[] iArr = {30, decodeResource.getWidth() / 3, decodeResource.getWidth() - (decodeResource.getWidth() / 3), decodeResource.getWidth() - 30};
        int[] iArr2 = {0, decodeResource.getHeight()};
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocate(92).order(java.nio.ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 4);
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
        order.putInt(iArr[2]);
        order.putInt(iArr[3]);
        order.putInt(iArr2[0]);
        order.putInt(iArr2[1]);
        for (int i19 = 0; i19 < 9; i19++) {
            order.putInt(1);
        }
        r1Var3.f275516g = new android.graphics.drawable.NinePatchDrawable(r1Var3.getResources(), new android.graphics.NinePatch(decodeResource, order.array(), "shake_bg"));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        r1Var3.f275517h = paint2;
        paint2.setAntiAlias(true);
        r1Var3.f275517h.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        r1Var3.f275517h.setStyle(android.graphics.Paint.Style.STROKE);
        r1Var3.f275517h.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        r1Var3.f275517h.setStrokeWidth(f17);
        android.graphics.Paint paint3 = new android.graphics.Paint();
        r1Var3.f275518i = paint3;
        paint3.setAntiAlias(true);
        r1Var3.f275518i.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        r1Var3.f275518i.setStyle(android.graphics.Paint.Style.FILL);
        r1Var3.f275518i.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        r1Var3.f275519m = new android.graphics.Path();
        r1Var3.f275520n = new android.graphics.Path();
        r1Var3.f275529w = 0.0f;
        r1Var3.f275528v = 0.0f;
        r1Var3.f275523q = android.view.ViewConfiguration.get(r1Var3.getContext()).getScaledTouchSlop();
        r1Var3.f275525s = false;
        r1Var3.f275526t = false;
        if (r1Var3.C.f180728e) {
            q35.d dVar = new q35.d(r1Var3.getContext());
            r1Var3.f275527u = dVar;
            dVar.a(new gt4.m1(r1Var3));
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            r1Var3.f275531y = android.os.SystemClock.elapsedRealtime();
        }
        r1Var3.invalidate();
        walletScratchShakeView.setClipChildren(false);
        walletSuccPageAwardWidget.f180739n.setScratchShakeCallback(new gt4.v1(walletSuccPageAwardWidget));
    }
}
