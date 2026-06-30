package df2;

/* loaded from: classes3.dex */
public final class ps implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f231109d;

    public ps(df2.lt ltVar) {
        this.f231109d = ltVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        if (i18 == i29 || i27 == i38) {
            return;
        }
        java.lang.String str = df2.lt.W;
        com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "addOnLayoutChangeListener change");
        df2.nv nvVar = (df2.nv) this.f231109d.controller(df2.nv.class);
        if (nvVar != null) {
            df2.nv.Z6(nvVar, true, nvVar.a7(), false, 4, null);
        }
    }
}
