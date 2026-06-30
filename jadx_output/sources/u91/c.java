package u91;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u91.d f425818d;

    public c(u91.d dVar) {
        this.f425818d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.ia iaVar;
        android.view.ViewGroup viewGroup;
        com.tencent.mars.xlog.Log.i("DirectGame.AppBrandServiceDirectGameComponentView", "destroy view containers");
        u91.d dVar = this.f425818d;
        iaVar = dVar.f425820r;
        if (iaVar != null) {
            iaVar.h();
        }
        dVar.f425820r = null;
        viewGroup = dVar.f425821s;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        dVar.f425821s = null;
    }
}
