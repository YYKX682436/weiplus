package e45;

/* loaded from: classes10.dex */
public final class d extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e45.h f249377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.GridLayoutManager f249378e;

    public d(e45.h hVar, androidx.recyclerview.widget.GridLayoutManager gridLayoutManager) {
        this.f249377d = hVar;
        this.f249378e = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$initView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (1 == i17) {
            t23.p0.h().b();
        } else {
            e45.h hVar = this.f249377d;
            if (i17 == 0) {
                androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = this.f249378e;
                hVar.f249396u = gridLayoutManager.w();
                hVar.f249397v = gridLayoutManager.y();
                int i18 = hVar.f249396u;
                int i19 = hVar.f249397v;
                d45.q qVar = hVar.f249391p;
                if (qVar != null) {
                    int B = qVar.B();
                    t23.z1 z1Var = t23.z1.f415313d;
                    t23.z1.f415313d.b(t23.p1.f415247d, hVar.f249396u, hVar.f249397v, B);
                }
            } else if (2 == i17) {
                com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollEnable(), hVar.f249398w);
                hVar.f249398w = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollTimeout(), 702, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollAction(), "FS.AlbumFileUIC");
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$initView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$initView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = this.f249378e;
        int w17 = gridLayoutManager.w();
        int y17 = gridLayoutManager.y();
        e45.h hVar = this.f249377d;
        int i19 = hVar.f249396u;
        int i27 = hVar.f249397v;
        if (hVar.f249396u != w17 || hVar.f249397v != y17) {
            hVar.f249396u = w17;
            hVar.f249397v = y17;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i28 = hVar.f249396u;
            int i29 = hVar.f249397v;
            if (i28 <= i29) {
                while (true) {
                    d45.q qVar = hVar.f249391p;
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem z17 = qVar != null ? qVar.z(i28) : null;
                    if (z17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(z17.o())) {
                        arrayList2.add(j33.d0.d(z17.o(), null, -1));
                    }
                    if (i28 == i29) {
                        break;
                    } else {
                        i28++;
                    }
                }
            }
            arrayList2.size();
            t23.p0.h().d(arrayList2);
            if (i18 != 0) {
                hVar.f249395t = i18 < 0 ? t23.p1.f415248e : t23.p1.f415249f;
                t23.p1 p1Var = hVar.f249395t;
                d45.q qVar2 = hVar.f249391p;
                if (qVar2 != null) {
                    int B = qVar2.B();
                    t23.z1 z1Var = t23.z1.f415313d;
                    t23.z1.f415313d.b(hVar.f249395t, hVar.f249396u, hVar.f249397v, B);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$initView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
