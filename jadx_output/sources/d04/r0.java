package d04;

/* loaded from: classes13.dex */
public final class r0 implements d04.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d04.h f225495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView f225496b;

    public r0(d04.h hVar, com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView) {
        this.f225495a = hVar;
        this.f225496b = scanCodeProductMergeMaskView;
    }

    @Override // d04.h
    public void a(int i17) {
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = this.f225496b;
        scanCodeProductMergeMaskView.X1 = i17;
        this.f225495a.a(i17);
        if (i17 != 3) {
            if (i17 != 6) {
                return;
            }
            android.graphics.Bitmap bitmap = scanCodeProductMergeMaskView.U1;
            if (bitmap != null && !bitmap.isRecycled()) {
                android.widget.ImageView imageView = scanCodeProductMergeMaskView.L1;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("blurView");
                    throw null;
                }
                imageView.setAlpha(1.0f);
                imageView.setImageBitmap(scanCodeProductMergeMaskView.U1);
                imageView.setVisibility(0);
                scanCodeProductMergeMaskView.W1 = true;
            }
            android.view.View view = scanCodeProductMergeMaskView.I1;
            if (view != null) {
                view.setOnClickListener(null);
                return;
            } else {
                kotlin.jvm.internal.o.o("maskView");
                throw null;
            }
        }
        android.widget.ImageView imageView2 = scanCodeProductMergeMaskView.L1;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("blurView");
            throw null;
        }
        android.view.ViewPropertyAnimator animate = imageView2.animate();
        if (animate != null) {
            animate.cancel();
        }
        android.view.View view2 = scanCodeProductMergeMaskView.I1;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("maskView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "switchScanProductViewExpand", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "switchScanProductViewExpand", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        e04.i3.a(view2, 0.0f, 0.7f, 250L, new d04.s0(scanCodeProductMergeMaskView));
        view2.setOnClickListener(new d04.t0(scanCodeProductMergeMaskView));
        e04.i3.a(scanCodeProductMergeMaskView.getScanTips(), 1.0f, 0.0f, 250L, null);
    }

    @Override // d04.h
    public void b(int i17, int i18) {
        this.f225495a.b(i17, i18);
    }

    @Override // d04.h
    public void c(int i17, long j17, int i18, sz3.a1 a1Var) {
        this.f225495a.c(i17, j17, i18, a1Var);
    }
}
