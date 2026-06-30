package nf;

/* loaded from: classes7.dex */
public final class x implements nf.y {

    /* renamed from: a, reason: collision with root package name */
    public static final nf.x f336615a = new nf.x();

    /* renamed from: b, reason: collision with root package name */
    public static nf.y f336616b;

    @Override // nf.y
    public boolean a() {
        nf.y yVar = f336616b;
        if (yVar != null) {
            return yVar.a();
        }
        return false;
    }

    @Override // nf.y
    public int b(int i17) {
        nf.y yVar = f336616b;
        return yVar != null ? yVar.b(i17) : i17;
    }

    @Override // nf.y
    public int c(android.content.Context context) {
        if (context == null) {
            return 0;
        }
        nf.y yVar = f336616b;
        return yVar != null ? yVar.c(context) : com.tencent.mm.ui.v9.b(context);
    }

    @Override // nf.y
    public int d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        nf.y yVar = f336616b;
        return yVar != null ? yVar.d(context) : fp.j0.a(context, 0);
    }

    @Override // nf.y
    public boolean e() {
        nf.y yVar = f336616b;
        if (yVar != null) {
            return yVar.e();
        }
        return false;
    }

    @Override // nf.y
    public boolean f() {
        nf.y yVar = f336616b;
        if (yVar != null) {
            return yVar.f();
        }
        return false;
    }

    @Override // nf.y
    public void g(android.text.TextPaint textPaint) {
        nf.y yVar = f336616b;
        if (yVar != null) {
            yVar.g(textPaint);
            return;
        }
        if (textPaint != null) {
            textPaint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        if (textPaint != null) {
            textPaint.setStrokeWidth(0.8f);
        }
    }

    @Override // nf.y
    public boolean h(android.content.Context context) {
        android.view.Window window;
        android.view.View decorView;
        android.view.WindowInsets rootWindowInsets;
        android.view.DisplayCutout displayCutout;
        java.util.List<android.graphics.Rect> boundingRects;
        if (context == null) {
            return false;
        }
        nf.y yVar = f336616b;
        if (yVar != null) {
            return yVar.h(context);
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (((activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootWindowInsets = decorView.getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null || (boundingRects = displayCutout.getBoundingRects()) == null) ? 0 : boundingRects.size()) <= 0) {
                return false;
            }
        } else if (!u75.g.a(context) && !context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism") && !u75.b.b(context)) {
            return false;
        }
        return true;
    }

    @Override // nf.y
    public boolean i(java.lang.String str) {
        nf.y yVar = f336616b;
        if (yVar != null) {
            return yVar.i(str);
        }
        return false;
    }

    @Override // nf.y
    public boolean isDarkMode() {
        nf.y yVar = f336616b;
        if (yVar != null) {
            return yVar.isDarkMode();
        }
        return false;
    }
}
