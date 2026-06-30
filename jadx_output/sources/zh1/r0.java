package zh1;

/* loaded from: classes8.dex */
public final class r0 extends zh1.v {

    /* renamed from: o, reason: collision with root package name */
    public zh1.b0 f472935o;

    /* renamed from: p, reason: collision with root package name */
    public db5.g4 f472936p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f472937q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f472938r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(long j17, bi1.g openMaterialScene, android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 bottomSheet, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection openMaterialCollection, zh1.v0 v0Var, zh1.c1 launchAppBrandExecutor) {
        super(j17, openMaterialScene, context, bottomSheet, openMaterialCollection, v0Var, launchAppBrandExecutor);
        kotlin.jvm.internal.o.g(openMaterialScene, "openMaterialScene");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        kotlin.jvm.internal.o.g(openMaterialCollection, "openMaterialCollection");
        kotlin.jvm.internal.o.g(launchAppBrandExecutor, "launchAppBrandExecutor");
        this.f472935o = new zh1.b0(zh1.y0.HIDE, true);
        this.f472937q = jz5.h.b(new zh1.o0(bottomSheet, launchAppBrandExecutor, context, openMaterialCollection));
        this.f472938r = jz5.h.b(zh1.q0.f472933d);
    }

    public static final boolean a(zh1.r0 r0Var, android.view.View view) {
        r0Var.getClass();
        if (!view.isShown()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "isViewExposure view is not shown");
            return false;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        if (rect.width() >= view.getMeasuredWidth()) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "isViewExposure, view is visible but not exposure");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0137 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r24) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zh1.r0.b(boolean):void");
    }

    public final void c(boolean z17) {
        java.util.List<android.view.MenuItem> list;
        db5.g4 g4Var = this.f472936p;
        if (g4Var != null && (list = g4Var.f228344d) != null) {
            for (android.view.MenuItem menuItem : list) {
                db5.h4 h4Var = menuItem instanceof db5.h4 ? (db5.h4) menuItem : null;
                if (h4Var != null) {
                    h4Var.f228375s = !z17;
                }
            }
        }
        this.f472948f.f211865i2 = z17;
    }

    public final android.graphics.Bitmap d(android.graphics.Bitmap bitmap) {
        int width = bitmap.getWidth();
        int i17 = width / 14;
        int i18 = (i17 * 2) + width;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "wrapIconWithPadding, sideLen: " + width + ", padding: " + i17 + ", newSideLen: " + i18);
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        kotlin.jvm.internal.o.d(config);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/openmaterial/GridBottomSheetEnhanceLogic", "wrapIconWithPadding", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/openmaterial/GridBottomSheetEnhanceLogic", "wrapIconWithPadding", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        float f17 = i17;
        new android.graphics.Canvas(createBitmap).drawBitmap(bitmap, f17, f17, (android.graphics.Paint) null);
        return createBitmap;
    }

    @Override // zh1.z0
    public void o(zh1.y0 newEnhanceType) {
        kotlin.jvm.internal.o.g(newEnhanceType, "newEnhanceType");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "enhance, newEnhanceType: " + newEnhanceType + ", curEnhanceState: " + this.f472935o);
        if (this.f472935o.f472863a == newEnhanceType) {
            return;
        }
        int ordinal = newEnhanceType.ordinal();
        android.content.Context context = this.f472947e;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f472948f;
        if (ordinal == 0) {
            b(true);
        } else if (ordinal == 1) {
            b(false);
        } else if (ordinal == 2) {
            k0Var.a(new db5.g4(context), null, null);
            k0Var.H = null;
            zh1.p0 p0Var = zh1.p0.f472932a;
            k0Var.f211891y1 = false;
            k0Var.A = p0Var;
            k0Var.f211865i2 = false;
            this.f472935o = new zh1.b0(zh1.y0.HIDE, true);
        }
        if (k0Var.i()) {
            zh1.w.b(k0Var, context);
        }
    }
}
