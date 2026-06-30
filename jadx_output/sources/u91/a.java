package u91;

/* loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u91.b f425816d;

    public a(u91.b bVar) {
        this.f425816d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("DirectGame.AppBrandDirectGameCoverViewContainer", "destroy");
        u91.b bVar = this.f425816d;
        bVar.setVisibility(8);
        android.view.ViewParent parent = bVar.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(bVar);
        }
    }
}
