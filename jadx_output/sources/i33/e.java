package i33;

/* loaded from: classes10.dex */
public final class e extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f288174f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f288175g;

    /* renamed from: h, reason: collision with root package name */
    public final int f288176h;

    /* renamed from: i, reason: collision with root package name */
    public final int f288177i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f288178m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f288174f = "MicroMsg.AlbumCommonEventSdkReportUIC";
        this.f288175g = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        this.f288176h = 31754;
        this.f288177i = 50098;
    }

    public final int W6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(i33.c0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        if (((i33.c0) a17).Z6()) {
            return 2;
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = activity2 instanceof com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI ? (com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) activity2 : null;
        if (albumPreviewUI != null) {
            return albumPreviewUI.B7() ? 1 : 3;
        }
        return 4;
    }

    public final void X6(java.lang.String viewId) {
        kotlin.jvm.internal.o.g(viewId, "viewId");
        java.util.Map k17 = kz5.c1.k(new jz5.l("album_session_id", this.f288175g), new jz5.l("view_id", viewId));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Gj(this.f288177i, "view_clk", k17, this.f288176h);
        }
        k17.toString();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        java.util.Map k17 = kz5.c1.k(new jz5.l("cur_album_purview", java.lang.String.valueOf(W6())), new jz5.l("album_session_id", this.f288175g));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Ej("in_album", k17, this.f288176h);
        }
        k17.toString();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f288178m) {
            this.f288178m = false;
            java.util.Map k17 = kz5.c1.k(new jz5.l("purview_result", java.lang.String.valueOf(W6())), new jz5.l("album_session_id", this.f288175g));
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            if (rVar != null) {
                ((cy1.a) rVar).Ej("album_purview_result_cgi_resp", k17, this.f288176h);
            }
            k17.toString();
        }
    }
}
