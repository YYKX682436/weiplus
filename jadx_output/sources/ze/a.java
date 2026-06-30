package ze;

/* loaded from: classes7.dex */
public abstract class a implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public int f471715d;

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int i39 = this.f471715d + 1;
        this.f471715d = i39;
        ze.d dVar = (ze.d) this;
        android.view.View view2 = dVar.f471720e;
        if (i39 == 10) {
            view2.removeOnLayoutChangeListener(dVar);
            return;
        }
        boolean z17 = i17 == i18 && i17 == i27 && i17 == i19;
        if (i17 == i28 && i19 == i37 && i27 == i38 && i18 == i29 && !z17) {
            com.tencent.mars.xlog.Log.i("Luggage.AppBrandWindowLayoutManager", "onLayoutChange: no changed, ignore");
            return;
        }
        ze.g gVar = dVar.f471721f;
        if (gVar.getInitConfig() != null) {
            ze.g.tuningRtContentView$default(gVar, "onConfigurationChanged", false, 2, null);
        }
        view2.removeOnLayoutChangeListener(dVar);
    }
}
