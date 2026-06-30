package zw1;

/* loaded from: classes15.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.y0 f476841d;

    public x0(zw1.y0 y0Var) {
        this.f476841d = y0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        boolean z17;
        java.lang.String sb6;
        r45.jv3 jv3Var;
        zw1.y0 y0Var = this.f476841d;
        android.widget.LinearLayout linearLayout = y0Var.f476851d;
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = y0Var.f476856i;
        linearLayout.getHeight();
        android.widget.LinearLayout linearLayout2 = y0Var.f476851d;
        linearLayout2.getWidth();
        int width = linearLayout2.getWidth();
        int height = linearLayout2.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/CollectMainUI$16$1", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/collect/ui/CollectMainUI$16$1", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        linearLayout2.draw(new android.graphics.Canvas(createBitmap));
        try {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
            sb7.append(q75.c.d());
            sb7.append("mm_facetoface_collect_qrcode_");
            sb7.append(java.lang.System.currentTimeMillis());
            sb7.append(".png");
            sb6 = sb7.toString();
            com.tencent.mm.sdk.platformtools.x.D0(createBitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, sb6, false);
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Boolean.valueOf(collectMainUI.V1 == null);
            objArr[1] = java.lang.Boolean.valueOf(collectMainUI.f96391c2);
            objArr[2] = java.lang.Boolean.valueOf(collectMainUI.f96411x0 == 8);
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "mHalfPageInfo:%s,hasHalfPageShown:%s,isRegionHK()%s", objArr);
            jv3Var = collectMainUI.V1;
        } catch (java.lang.Exception e17) {
            e = e17;
            i17 = 1;
            z17 = false;
        }
        if (jv3Var != null && !collectMainUI.f96391c2) {
            if (!(collectMainUI.f96411x0 == 8)) {
                com.tencent.mm.plugin.collect.ui.CollectMainUI.Y6(collectMainUI, jv3Var);
                i17 = 1;
                z17 = false;
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                androidx.appcompat.app.AppCompatActivity context = collectMainUI.getContext();
                ((ub0.r) oVar).getClass();
                q75.c.f(sb6, context);
                collectMainUI.f96391c2 = z17;
                collectMainUI.A.setVisibility(8);
            }
        }
        if (y0Var.f476852e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectMainUI", "doSaveQrCode success ");
            i17 = 1;
            z17 = false;
            try {
                com.tencent.mm.plugin.collect.ui.CollectMainUI.Z6(collectMainUI, collectMainUI.getContext(), collectMainUI.getContext().getResources().getString(com.tencent.mm.R.string.b_p), com.tencent.mm.R.raw.icons_filled_done, y0Var.f476853f, y0Var.f476854g);
                vb0.o oVar2 = (vb0.o) i95.n0.c(vb0.o.class);
                androidx.appcompat.app.AppCompatActivity context2 = collectMainUI.getContext();
                ((ub0.r) oVar2).getClass();
                q75.c.f(sb6, context2);
                collectMainUI.f96391c2 = z17;
            } catch (java.lang.Exception e18) {
                e = e18;
                collectMainUI.f96391c2 = z17;
                com.tencent.mars.xlog.Log.w("MicroMsg.CollectMainUI", "save fixed amount qrcode failed!" + e.getMessage());
                dp.a.makeText(collectMainUI.getContext(), collectMainUI.getString(com.tencent.mm.R.string.b_v), i17).show();
                collectMainUI.A.setVisibility(8);
            }
            collectMainUI.A.setVisibility(8);
        }
        i17 = 1;
        z17 = false;
        vb0.o oVar22 = (vb0.o) i95.n0.c(vb0.o.class);
        androidx.appcompat.app.AppCompatActivity context22 = collectMainUI.getContext();
        ((ub0.r) oVar22).getClass();
        q75.c.f(sb6, context22);
        collectMainUI.f96391c2 = z17;
        collectMainUI.A.setVisibility(8);
    }
}
