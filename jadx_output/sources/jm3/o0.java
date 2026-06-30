package jm3;

/* loaded from: classes10.dex */
public final class o0 implements gm3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvMakerUI f300340a;

    public o0(com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI) {
        this.f300340a = musicMvMakerUI;
    }

    @Override // gm3.f
    public void a(int i17, gm3.c item) {
        long j17;
        java.lang.Long l17;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("OnDelBtnClicked, pos:");
        sb6.append(i17);
        sb6.append(", type:");
        int i18 = item.f273544e;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerUI", sb6.toString());
        if (i18 == 1 || i18 == 3) {
            gm3.a aVar = item.f273547h;
            if (aVar != null) {
                j17 = aVar.f273535a;
                l17 = java.lang.Long.valueOf(j17);
            }
            l17 = null;
        } else {
            gm3.b bVar = item.f273548i;
            if (bVar != null && (finderObject = bVar.f273542b) != null) {
                j17 = finderObject.getId();
                l17 = java.lang.Long.valueOf(j17);
            }
            l17 = null;
        }
        com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct c17 = fm3.g0.f264070a.c();
        c17.f59482k = 13L;
        c17.H = 1;
        int i19 = fm3.g0.f264072c;
        c17.f59496y = i19;
        if (i19 != 1 && i19 != 2) {
            c17.f59493v = i17;
        }
        c17.k();
        c17.o();
        int i27 = com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.f150868u;
        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView Z6 = this.f300340a.Z6();
        if (Z6 != null) {
            if (l17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Mv.MusicMVCardChooseView", "invalid parameters, type:" + i18 + ", uniqueId:" + l17);
                return;
            }
            if (i18 != 1) {
                if (i18 == 2) {
                    com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment musicMvTabMachineFragment = Z6.f151638w;
                    if (musicMvTabMachineFragment != null) {
                        musicMvTabMachineFragment.d(l17.longValue());
                    }
                    com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment musicMvTabMyPostFragment = Z6.f151639x;
                    if (musicMvTabMyPostFragment != null) {
                        musicMvTabMyPostFragment.d(l17.longValue());
                    }
                    com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment musicMvTabMyFavFragment = Z6.f151642y;
                    if (musicMvTabMyFavFragment != null) {
                        musicMvTabMyFavFragment.d(l17.longValue());
                    }
                    com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment musicMvTabMyLikeFragment = Z6.f151645z;
                    if (musicMvTabMyLikeFragment != null) {
                        musicMvTabMyLikeFragment.d(l17.longValue());
                        return;
                    }
                    return;
                }
                if (i18 != 3) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Mv.MusicMVCardChooseView", "error logic.type:" + i18 + ", uniqueId:" + l17);
                    return;
                }
            }
            km3.t tVar = Z6.f151621f;
            if (tVar != null) {
                long longValue = l17.longValue();
                java.util.Iterator it = tVar.f309261e.iterator();
                int i28 = 0;
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i29 = i28 + 1;
                    if (i28 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) next;
                    if (galleryItem$MediaItem.f138434i == longValue) {
                        galleryItem$MediaItem.f138442t = false;
                        tVar.notifyItemChanged(i28 + tVar.f309265i.size());
                    }
                    i28 = i29;
                }
            }
        }
    }
}
