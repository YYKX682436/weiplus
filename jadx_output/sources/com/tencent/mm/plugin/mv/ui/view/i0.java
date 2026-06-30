package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class i0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView f151868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.FirstRowLayoutManager f151869e;

    public i0(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView, com.tencent.mm.plugin.mv.ui.view.FirstRowLayoutManager firstRowLayoutManager) {
        this.f151868d = musicMVCardChooseView;
        this.f151869e = firstRowLayoutManager;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initAlbumChooseArea$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (1 == i17) {
            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
            t23.p0.h().b();
        } else {
            com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView = this.f151868d;
            if (i17 == 0) {
                com.tencent.mm.plugin.mv.ui.view.FirstRowLayoutManager firstRowLayoutManager = this.f151869e;
                musicMVCardChooseView.Q = firstRowLayoutManager.w();
                musicMVCardChooseView.R = firstRowLayoutManager.y();
                km3.t tVar = musicMVCardChooseView.f151621f;
                if (tVar != null) {
                    int y17 = tVar.y();
                    t23.q1 q1Var = (t23.q1) i95.n0.c(t23.q1.class);
                    t23.p1 p1Var = t23.p1.f415247d;
                    int i18 = musicMVCardChooseView.Q;
                    int i19 = musicMVCardChooseView.R;
                    ((t23.a2) q1Var).getClass();
                    t23.z1.f415313d.b(p1Var, i18, i19, y17);
                }
            } else if (2 == i17) {
                com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollEnable(), musicMVCardChooseView.S);
                musicMVCardChooseView.S = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollTimeout(), 702, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcAlbumScrollAction(), "MicroMsg.Mv.MusicMVCardChooseView");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initAlbumChooseArea$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initAlbumChooseArea$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.mv.ui.view.FirstRowLayoutManager firstRowLayoutManager = this.f151869e;
        int w17 = firstRowLayoutManager.w();
        int y17 = firstRowLayoutManager.y();
        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView = this.f151868d;
        int i19 = musicMVCardChooseView.Q;
        int i27 = musicMVCardChooseView.R;
        if (i19 != w17 || i27 != y17) {
            musicMVCardChooseView.Q = w17;
            musicMVCardChooseView.R = y17;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i28 = musicMVCardChooseView.Q;
            int i29 = musicMVCardChooseView.R;
            if (i28 <= i29) {
                while (true) {
                    km3.t tVar = musicMVCardChooseView.f151621f;
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem x17 = tVar != null ? tVar.x(i28) : null;
                    if (x17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(x17.o())) {
                        java.lang.String o17 = x17.o();
                        if (o17 == null) {
                            throw new java.lang.NullPointerException("getDecodeTaskKey filePath is null!!!");
                        }
                        arrayList2.add(o17 + musicMVCardChooseView.K + "");
                    }
                    if (i28 == i29) {
                        break;
                    } else {
                        i28++;
                    }
                }
            }
            arrayList2.size();
            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
            t23.p0.h().d(arrayList2);
            if (i18 != 0) {
                musicMVCardChooseView.T = i18 < 0 ? t23.p1.f415248e : t23.p1.f415249f;
                km3.t tVar2 = musicMVCardChooseView.f151621f;
                if (tVar2 != null) {
                    int y18 = tVar2.y();
                    t23.q1 q1Var = (t23.q1) i95.n0.c(t23.q1.class);
                    t23.p1 state = musicMVCardChooseView.T;
                    int i37 = musicMVCardChooseView.Q;
                    int i38 = musicMVCardChooseView.R;
                    ((t23.a2) q1Var).getClass();
                    kotlin.jvm.internal.o.g(state, "state");
                    t23.z1.f415313d.b(state, i37, i38, y18);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initAlbumChooseArea$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
