package zw1;

/* loaded from: classes8.dex */
public class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.g4 f476624d;

    public f4(zw1.g4 g4Var) {
        this.f476624d = g4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String sb6;
        ww1.a3 a3Var;
        zw1.g4 g4Var = this.f476624d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "saveBitmap height: %s, width: %s", java.lang.Integer.valueOf(g4Var.f476638d.getHeight()), java.lang.Integer.valueOf(g4Var.f476638d.getWidth()));
        if (g4Var.f476645n.isFinishing() || g4Var.f476645n.isDestroyed() || g4Var.f476638d.getHeight() == 0 || g4Var.f476638d.getWidth() == 0) {
            return;
        }
        int width = g4Var.f476638d.getWidth();
        int height = g4Var.f476638d.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$22$1", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$22$1", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        g4Var.f476638d.draw(new android.graphics.Canvas(createBitmap));
        try {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
            sb7.append(q75.c.d());
            sb7.append("mm_facetoface_collect_qrcode_");
            sb7.append(java.lang.System.currentTimeMillis());
            sb7.append(".png");
            sb6 = sb7.toString();
            com.tencent.mm.sdk.platformtools.x.D0(createBitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, sb6, false);
            a3Var = g4Var.f476639e;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletCollectQrCodeUI", "save fixed amount qrcode failed!, errmsg:%s", e17.getMessage());
            dp.a.makeText(g4Var.f476645n.getContext(), g4Var.f476645n.getString(com.tencent.mm.R.string.b_v), 1).show();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 17, java.lang.Integer.valueOf(g4Var.f476644m));
            g4Var.f476639e.getClass();
        }
        if (a3Var.Q == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "doSaveQrCode success ");
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = g4Var.f476645n;
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.Z6(walletCollectQrCodeUI, walletCollectQrCodeUI.getContext(), g4Var.f476645n.getContext().getResources().getString(com.tencent.mm.R.string.b_p), com.tencent.mm.R.raw.icons_filled_done, g4Var.f476640f);
            return;
        }
        if (g4Var.f476641g == 1) {
            r45.mu5 mu5Var = g4Var.f476642h;
            if (mu5Var != null && mu5Var.f380837d) {
                zw1.n6.b(g4Var.f476642h, zw1.n6.c(a3Var), g4Var.f476645n.getContext());
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalite190b0cf18204487696c6d9890f89c090@pay");
            bundle.putBoolean("isHalfScreen", true);
            bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, true);
            bundle.putBoolean("forbidRightGesture", true);
            bundle.putDouble("heightPercent", 0.99d);
            bundle.putString("query", "data=" + java.net.URLEncoder.encode(android.util.Base64.encodeToString(g4Var.f476639e.Q.initialProtobufBytes(), 2), com.tencent.mapsdk.internal.rv.f51270c));
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(g4Var.f476645n.getContext(), bundle, true, false, new zw1.e4(this));
        } else {
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.a7(g4Var.f476645n, g4Var.f476643i, a3Var);
        }
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        androidx.appcompat.app.AppCompatActivity context = g4Var.f476645n.getContext();
        ((ub0.r) oVar).getClass();
        q75.c.f(sb6, context);
        g4Var.f476639e.getClass();
        android.view.View view = g4Var.f476645n.f96448t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$22$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$22$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
