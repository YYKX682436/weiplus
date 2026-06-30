package rh1;

/* loaded from: classes7.dex */
public class e extends ak3.i {

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f395629q;

    /* renamed from: r, reason: collision with root package name */
    public final rh1.d f395630r;

    public e(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super(null);
        this.f395630r = new rh1.d(this);
        this.f395629q = o6Var;
    }

    public static android.graphics.Bitmap u(android.graphics.Bitmap bitmap) {
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / 1.0f), (int) (bitmap.getHeight() / 1.0f), true);
        bitmap.recycle();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(90.0f);
        int width = createScaledBitmap.getWidth();
        int height = createScaledBitmap.getHeight();
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(height));
        aVar.c(java.lang.Integer.valueOf(width));
        aVar.c(0);
        aVar.c(0);
        aVar.c(createScaledBitmap);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/appbrand/multitask/AppBrandMultiTaskPageAdapter", "getScaledRotateBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/multitask/AppBrandMultiTaskPageAdapter", "getScaledRotateBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        createScaledBitmap.recycle();
        return createBitmap;
    }

    @Override // ak3.i, ak3.c
    public boolean c() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f395629q;
        return !(o6Var != null ? o6Var.q2() : false);
    }

    @Override // ak3.i, ak3.c
    public void f(ak3.b bVar) {
        super.f(bVar);
        if (!com.tencent.mm.plugin.appbrand.utils.m3.b(getActivity()) || getActivity().getResources().getConfiguration().orientation == 2) {
            return;
        }
        ((android.view.ViewGroup) getContentView().getParent()).setBackground(null);
    }

    @Override // ak3.i, ak3.c
    public boolean g() {
        if (!rh1.b.f395624a) {
            return super.g();
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f395629q;
        return (o6Var.q2() || o6Var.e3() || o6Var.Q0() || com.tencent.mm.plugin.appbrand.kf.a(o6Var)) ? false : true;
    }

    @Override // ak3.i, ak3.c
    public android.app.Activity getActivity() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f395629q;
        if (o6Var != null) {
            return o6Var.r0();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[Catch: Exception -> 0x007a, all -> 0x0107, TryCatch #2 {Exception -> 0x007a, blocks: (B:10:0x0012, B:12:0x0018, B:14:0x0022, B:16:0x0030, B:20:0x006f, B:22:0x0075, B:25:0x00de, B:27:0x00e4, B:29:0x00fc, B:31:0x007d, B:34:0x0092, B:37:0x00a2, B:39:0x00a8, B:41:0x00ae, B:43:0x00b8, B:46:0x00c0, B:47:0x0101, B:50:0x004a, B:52:0x0066), top: B:9:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de A[Catch: Exception -> 0x007a, all -> 0x0107, TryCatch #2 {Exception -> 0x007a, blocks: (B:10:0x0012, B:12:0x0018, B:14:0x0022, B:16:0x0030, B:20:0x006f, B:22:0x0075, B:25:0x00de, B:27:0x00e4, B:29:0x00fc, B:31:0x007d, B:34:0x0092, B:37:0x00a2, B:39:0x00a8, B:41:0x00ae, B:43:0x00b8, B:46:0x00c0, B:47:0x0101, B:50:0x004a, B:52:0x0066), top: B:9:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: Exception -> 0x007a, all -> 0x0107, TryCatch #2 {Exception -> 0x007a, blocks: (B:10:0x0012, B:12:0x0018, B:14:0x0022, B:16:0x0030, B:20:0x006f, B:22:0x0075, B:25:0x00de, B:27:0x00e4, B:29:0x00fc, B:31:0x007d, B:34:0x0092, B:37:0x00a2, B:39:0x00a8, B:41:0x00ae, B:43:0x00b8, B:46:0x00c0, B:47:0x0101, B:50:0x004a, B:52:0x0066), top: B:9:0x0012 }] */
    @Override // ak3.i, ak3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap getBitmap() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rh1.e.getBitmap():android.graphics.Bitmap");
    }

    @Override // ak3.i, ak3.c
    public android.view.View getContentView() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f395629q;
        if (o6Var != null) {
            return o6Var.f74810s;
        }
        return null;
    }

    @Override // ak3.i, ak3.c
    public android.view.View getMaskView() {
        return getContentView();
    }

    @Override // ak3.i, ak3.c
    public void h(ak3.a aVar) {
        this.f5586h = aVar;
    }

    @Override // ak3.i, ak3.c
    public void j(boolean z17, jk3.e eVar) {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f395629q;
        if (o6Var != null) {
            if (getActivity() instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandUI) {
                ((com.tencent.mm.plugin.appbrand.ui.AppBrandUI) getActivity()).A = !z17;
            }
            o6Var.G2();
        }
    }

    @Override // ak3.i, ak3.c
    public void l() {
    }

    @Override // ak3.i
    public boolean q() {
        if (rh1.b.f395624a) {
            return true;
        }
        return this instanceof pa3.r;
    }
}
