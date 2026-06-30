package d04;

/* loaded from: classes13.dex */
public final class l0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView f225456d;

    public l0(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView) {
        this.f225456d = scanCodeProductMergeMaskView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = this.f225456d;
        java.lang.Object obj = scanCodeProductMergeMaskView.N1;
        if (obj == null) {
            kotlin.jvm.internal.o.o("scanProductListView");
            throw null;
        }
        ((android.view.View) obj).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        d04.j jVar = scanCodeProductMergeMaskView.N1;
        if (jVar != null) {
            jVar.c(scanCodeProductMergeMaskView.getMBottomExtraHeight());
        } else {
            kotlin.jvm.internal.o.o("scanProductListView");
            throw null;
        }
    }
}
