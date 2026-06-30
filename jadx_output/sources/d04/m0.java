package d04;

/* loaded from: classes13.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView f225461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f225462e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView, boolean z17) {
        super(0);
        this.f225461d = scanCodeProductMergeMaskView;
        this.f225462e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = this.f225461d;
        android.widget.ImageView imageView = scanCodeProductMergeMaskView.L1;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("blurView");
            throw null;
        }
        imageView.setVisibility(8);
        android.widget.ImageView imageView2 = scanCodeProductMergeMaskView.L1;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("blurView");
            throw null;
        }
        imageView2.setImageBitmap(null);
        android.widget.ImageView imageView3 = scanCodeProductMergeMaskView.J1;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("bottomBlurView");
            throw null;
        }
        imageView3.setVisibility(8);
        android.widget.ImageView imageView4 = scanCodeProductMergeMaskView.J1;
        if (imageView4 == null) {
            kotlin.jvm.internal.o.o("bottomBlurView");
            throw null;
        }
        imageView4.setImageBitmap(null);
        android.widget.ImageView imageView5 = scanCodeProductMergeMaskView.K1;
        if (imageView5 == null) {
            kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
            throw null;
        }
        imageView5.setVisibility(8);
        android.widget.ImageView imageView6 = scanCodeProductMergeMaskView.K1;
        if (imageView6 == null) {
            kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
            throw null;
        }
        imageView6.setImageBitmap(null);
        scanCodeProductMergeMaskView.u(!this.f225462e);
        android.view.View view = scanCodeProductMergeMaskView.I1;
        if (view == null) {
            kotlin.jvm.internal.o.o("maskView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView7 = scanCodeProductMergeMaskView.M1;
        if (imageView7 == null) {
            kotlin.jvm.internal.o.o("successMarkView");
            throw null;
        }
        imageView7.setVisibility(8);
        android.view.View view2 = scanCodeProductMergeMaskView.O1;
        if (view2 != null) {
            view2.setTranslationY(0.0f);
        }
        java.lang.Object obj = scanCodeProductMergeMaskView.N1;
        if (obj == null) {
            kotlin.jvm.internal.o.o("scanProductListView");
            throw null;
        }
        android.view.View view3 = (android.view.View) obj;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        scanCodeProductMergeMaskView.R1 = false;
        scanCodeProductMergeMaskView.S1 = false;
        scanCodeProductMergeMaskView.T1 = false;
        scanCodeProductMergeMaskView.V1 = null;
        scanCodeProductMergeMaskView.M();
        return jz5.f0.f302826a;
    }
}
