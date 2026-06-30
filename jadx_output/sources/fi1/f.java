package fi1;

/* loaded from: classes8.dex */
public final class f implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi1.g f262782d;

    public f(fi1.g gVar) {
        this.f262782d = gVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView hybridOpenMaterialView = this.f262782d.f262783f;
        hybridOpenMaterialView.D = true;
        float f17 = hybridOpenMaterialView.f86278i ? hybridOpenMaterialView.f86282p : hybridOpenMaterialView.f86283q;
        com.tencent.mm.ui.widget.MMWebView mMWebView = hybridOpenMaterialView.f86276g;
        if (mMWebView != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) mMWebView.getLayoutParams();
            if (-1 != layoutParams.width || -1 != layoutParams.height) {
                layoutParams.width = -1;
                layoutParams.height = -1;
                hybridOpenMaterialView.f86276g.setLayoutParams(layoutParams);
            }
            hybridOpenMaterialView.f86276g.setBackgroundColor(hybridOpenMaterialView.getResources().getColor(com.tencent.mm.R.color.f478490b));
        }
        float f18 = hybridOpenMaterialView.f86281o;
        android.widget.LinearLayout linearLayout = hybridOpenMaterialView.f86273d;
        linearLayout.setTranslationY(f18);
        linearLayout.animate().translationY(f17).setDuration(200L).setInterpolator(new android.view.animation.DecelerateInterpolator()).setUpdateListener(new fi1.o(hybridOpenMaterialView)).setListener(new fi1.n(hybridOpenMaterialView)).start();
    }
}
