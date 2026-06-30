package e04;

/* loaded from: classes12.dex */
public class w2 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f246148c = ((ku5.t0) ku5.t0.f312615d).p("ScanTranslationRender");

    /* renamed from: a, reason: collision with root package name */
    public volatile int f246149a;

    /* renamed from: b, reason: collision with root package name */
    public volatile e04.v2 f246150b;

    public static android.graphics.Bitmap a(e04.w2 w2Var, android.graphics.Bitmap bitmap, android.graphics.Rect rect) {
        w2Var.getClass();
        int height = (int) (rect.height() * 0.1f);
        int width = ((int) (rect.width() * 0.1f)) / 2;
        int i17 = rect.left - width;
        if (i17 < 0) {
            i17 = 0;
        }
        rect.left = i17;
        int i18 = height / 2;
        int i19 = rect.top - i18;
        if (i19 < 0) {
            i19 = 0;
        }
        rect.top = i19;
        rect.right = rect.right + width > bitmap.getWidth() ? bitmap.getWidth() : width + rect.right;
        rect.bottom = rect.bottom + i18 > bitmap.getHeight() ? bitmap.getHeight() : rect.bottom + i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender", "get bg area rect %s", rect);
        int i27 = rect.left;
        int i28 = rect.top;
        int width2 = rect.width();
        int height2 = rect.height();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height2));
        arrayList.add(java.lang.Integer.valueOf(width2));
        arrayList.add(java.lang.Integer.valueOf(i28));
        arrayList.add(java.lang.Integer.valueOf(i27));
        arrayList.add(bitmap);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/scanner/util/ScanTranslationRender", "getBgAreaBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/scanner/util/ScanTranslationRender", "getBgAreaBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    public static int[] b(e04.w2 w2Var, android.graphics.Bitmap bitmap) {
        w2Var.getClass();
        i4.i iVar = new i4.f(bitmap).b().f288359d;
        if (iVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender", "can not find suitable swatch");
            return com.tencent.mm.ui.bk.c(bitmap, bitmap.getWidth(), bitmap.getHeight());
        }
        iVar.a();
        return new int[]{iVar.f288349d, iVar.f288353h};
    }

    public static float c(e04.w2 w2Var, r45.eq6 eq6Var) {
        w2Var.getClass();
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setStyle(android.graphics.Paint.Style.FILL);
        textPaint.setTextSize(16.0f);
        android.text.DynamicLayout dynamicLayout = new android.text.DynamicLayout(eq6Var.f373683i, textPaint, eq6Var.f373680f, android.text.Layout.Alignment.ALIGN_NORMAL, 1.5f, 0.0f, true);
        while (dynamicLayout.getLineBottom(dynamicLayout.getLineCount() - 1) < eq6Var.f373681g) {
            textPaint.setTextSize(textPaint.getTextSize() + 0.5f);
            textPaint.getTextSize();
            dynamicLayout = new android.text.DynamicLayout(eq6Var.f373683i, textPaint, eq6Var.f373680f, android.text.Layout.Alignment.ALIGN_NORMAL, 1.5f, 0.0f, true);
        }
        while (dynamicLayout.getLineBottom(dynamicLayout.getLineCount() - 1) > eq6Var.f373681g && textPaint.getTextSize() > 1.0f) {
            textPaint.setTextSize(textPaint.getTextSize() - 0.5f);
            textPaint.getTextSize();
            dynamicLayout = new android.text.DynamicLayout(eq6Var.f373683i, textPaint, eq6Var.f373680f, android.text.Layout.Alignment.ALIGN_NORMAL, 1.5f, 0.0f, true);
        }
        return textPaint.getTextSize();
    }

    public static void d(e04.w2 w2Var, float f17, int i17, r45.eq6 eq6Var, android.graphics.Canvas canvas) {
        w2Var.getClass();
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setStyle(android.graphics.Paint.Style.FILL);
        textPaint.setColor(i17);
        textPaint.setTextSize(f17);
        textPaint.setAntiAlias(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender", "alignment %d", java.lang.Integer.valueOf(eq6Var.f373686o));
        android.text.DynamicLayout dynamicLayout = new android.text.DynamicLayout(eq6Var.f373683i, textPaint, eq6Var.f373680f, eq6Var.f373686o == 2 ? android.text.Layout.Alignment.ALIGN_CENTER : android.text.Layout.Alignment.ALIGN_NORMAL, 1.5f, 0.0f, true);
        canvas.save();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender", "translate %d, %d, textHeight %d, rect Height %d", java.lang.Integer.valueOf(eq6Var.f373678d), java.lang.Integer.valueOf(eq6Var.f373679e), java.lang.Integer.valueOf(dynamicLayout.getHeight()), java.lang.Integer.valueOf(eq6Var.f373681g));
        if (dynamicLayout.getHeight() < eq6Var.f373681g) {
            canvas.translate(eq6Var.f373678d, eq6Var.f373679e + ((r0 - dynamicLayout.getHeight()) / 2));
        } else {
            canvas.translate(eq6Var.f373678d, eq6Var.f373679e);
        }
        dynamicLayout.draw(canvas);
        canvas.restore();
    }

    public void e(int i17, java.util.List list, float f17, android.graphics.Bitmap bitmap, e04.v2 v2Var) {
        if (i17 == 0 || list == null || list.size() <= 0 || v2Var == null) {
            return;
        }
        if (this.f246149a != 0 && i17 != this.f246149a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationRender", "stop current session %d, start new session %d", java.lang.Integer.valueOf(this.f246149a), java.lang.Integer.valueOf(i17));
            this.f246149a = 0;
            this.f246150b = null;
        }
        this.f246149a = i17;
        this.f246150b = v2Var;
        new e04.u2(this, i17, list, f17, bitmap).f(new java.lang.Void[0]);
    }
}
