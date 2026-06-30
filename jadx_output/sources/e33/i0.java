package e33;

/* loaded from: classes10.dex */
public class i0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final i33.e1 f247280d;

    /* renamed from: e, reason: collision with root package name */
    public final i33.t0 f247281e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f247282f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.GridLayoutManager f247283g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247284h;

    public i0(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI, androidx.recyclerview.widget.GridLayoutManager gridLayoutManager) {
        this.f247284h = albumPreviewUI;
        this.f247283g = gridLayoutManager;
        androidx.appcompat.app.AppCompatActivity activity = albumPreviewUI.getContext();
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f247280d = (i33.e1) pf5.z.f353948a.a(activity).e(i33.e1.class);
        androidx.appcompat.app.AppCompatActivity activity2 = albumPreviewUI.getContext();
        kotlin.jvm.internal.o.g(activity2, "activity");
        this.f247281e = (i33.t0) pf5.z.f353948a.a(activity2).e(i33.t0.class);
        this.f247282f = new e33.h0(this);
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247284h;
        java.lang.String B = albumPreviewUI.f138528m.B(this.f247283g.w());
        if (com.tencent.mm.sdk.platformtools.t8.K0(B) || !B.equals("album_business_bubble_media_by_coordinate")) {
            return B;
        }
        return albumPreviewUI.f138536p1 + "附近的照片和视频";
    }

    public final void b(boolean z17) {
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247284h;
        i33.e1 e1Var = this.f247280d;
        if (e1Var != null) {
            e1Var.X6(albumPreviewUI.f138528m);
            return;
        }
        java.lang.Runnable runnable = this.f247282f;
        if (!z17) {
            albumPreviewUI.f138532o.removeCallbacks(runnable);
            albumPreviewUI.f138532o.postDelayed(runnable, 256L);
            return;
        }
        albumPreviewUI.f138532o.removeCallbacks(runnable);
        if (albumPreviewUI.f138532o.getVisibility() != 0) {
            albumPreviewUI.f138532o.setText(a());
            albumPreviewUI.f138532o.setVisibility(0);
            albumPreviewUI.f138532o.setAlpha(0.0f);
            albumPreviewUI.f138532o.animate().alpha(1.0f).setDuration(300L).start();
        }
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247284h;
        if (1 == i17) {
            b(true);
            albumPreviewUI.f138534p.setVisibility(8);
            t23.p0.h().b();
        } else {
            if (i17 == 0) {
                b(false);
                androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = this.f247283g;
                albumPreviewUI.f138537p2 = gridLayoutManager.w();
                albumPreviewUI.f138539q2 = gridLayoutManager.y();
                int i18 = albumPreviewUI.f138537p2;
                int i19 = albumPreviewUI.f138539q2;
                t23.z1 z1Var = t23.z1.f415313d;
                t23.z1.f415313d.b(t23.p1.f415247d, albumPreviewUI.f138537p2, albumPreviewUI.f138539q2, albumPreviewUI.f138528m.I());
            } else if (2 == i17) {
                com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollEnable(), albumPreviewUI.f138535p0);
                albumPreviewUI.f138535p0 = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollTimeout(), 702, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollAction(), "MicroMsg.AlbumPreviewUI");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247284h;
        i33.e1 e1Var = this.f247280d;
        if (e1Var != null) {
            e1Var.X6(albumPreviewUI.f138528m);
        } else {
            albumPreviewUI.f138532o.setText(a());
        }
        i33.t0 t0Var = this.f247281e;
        if (t0Var != null && t0Var.f288248g) {
            yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = this.f247283g;
        int w17 = gridLayoutManager.w();
        int y17 = gridLayoutManager.y();
        int i19 = albumPreviewUI.f138537p2;
        int i27 = albumPreviewUI.f138539q2;
        if (albumPreviewUI.f138537p2 != w17 || albumPreviewUI.f138539q2 != y17) {
            albumPreviewUI.f138537p2 = w17;
            albumPreviewUI.f138539q2 = y17;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int i28 = albumPreviewUI.f138537p2; i28 <= albumPreviewUI.f138539q2; i28++) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem E = albumPreviewUI.f138528m.E(i28);
                if (E != null) {
                    arrayList2.add(j33.d0.d(E.o(), null, -1));
                }
            }
            arrayList2.size();
            t23.p0.h().d(arrayList2);
            androidx.appcompat.app.AppCompatActivity activity = albumPreviewUI.getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            i33.b1 b1Var = (i33.b1) pf5.z.f353948a.a(activity).a(i33.b1.class);
            int size = arrayList2.size();
            com.tencent.mm.autogen.mmdata.rpt.GalleryTecReportStruct galleryTecReportStruct = b1Var.f288162g;
            if (galleryTecReportStruct.f58297h <= 0) {
                galleryTecReportStruct.f58297h = size;
            }
            if (i18 != 0) {
                if (i18 < 0) {
                    albumPreviewUI.f138533o2 = t23.p1.f415248e;
                } else {
                    albumPreviewUI.f138533o2 = t23.p1.f415249f;
                }
                t23.p1 p1Var = albumPreviewUI.f138533o2;
                t23.z1 z1Var = t23.z1.f415313d;
                t23.z1.f415313d.b(p1Var, albumPreviewUI.f138537p2, albumPreviewUI.f138539q2, albumPreviewUI.f138528m.I());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI$13", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
