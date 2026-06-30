package dl1;

/* loaded from: classes8.dex */
public class f extends dl1.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f235177a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f235178b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f235179c;

    /* renamed from: d, reason: collision with root package name */
    public dl1.a f235180d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f235181e;

    /* renamed from: f, reason: collision with root package name */
    public final dl1.g f235182f;

    /* renamed from: g, reason: collision with root package name */
    public int f235183g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f235184h = 0;

    public f(android.widget.FrameLayout frameLayout, java.util.List list, dl1.g gVar) {
        this.f235177a = frameLayout;
        this.f235179c = list;
        this.f235182f = gVar;
    }

    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, float f17, float f18, androidx.recyclerview.widget.k3 k3Var, int i17, float f19, float f27) {
        if (view == null) {
            return;
        }
        view.setTranslationX(view.getTranslationX() - f17);
        view.setTranslationY(view.getTranslationY() - f18);
        dl1.a aVar = this.f235180d;
        if (aVar != null) {
            com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView appBrandDesktopDragView = ((cl1.h) aVar).f42871a;
            if (appBrandDesktopDragView.H != null) {
                view.getGlobalVisibleRect(appBrandDesktopDragView.M);
                appBrandDesktopDragView.H.a(f19, f27);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(androidx.recyclerview.widget.RecyclerView r19, androidx.recyclerview.widget.k3 r20, int r21, boolean r22, boolean r23, java.lang.Runnable r24) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dl1.f.b(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.k3, int, boolean, boolean, java.lang.Runnable):void");
    }

    public boolean c(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.k3 k3Var2, int i17, int i18) {
        dl1.a aVar = this.f235180d;
        if (aVar == null) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView appBrandDesktopDragView = ((cl1.h) aVar).f42871a;
        if (appBrandDesktopDragView.I != null) {
            if (appBrandDesktopDragView.K) {
                if (k3Var2.getItemViewType() == 2 || k3Var2.getItemViewType() == 5) {
                    return true;
                }
                ((rh4.f0) appBrandDesktopDragView.I).getClass();
                if (recyclerView.getId() == com.tencent.mm.R.id.f487232nz0) {
                    return true;
                }
            }
        } else if (appBrandDesktopDragView.K && (k3Var2.getItemViewType() == 2 || k3Var2.getItemViewType() == 5)) {
            return true;
        }
        return false;
    }
}
