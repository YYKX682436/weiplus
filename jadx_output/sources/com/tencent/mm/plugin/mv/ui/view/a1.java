package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class a1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView f151774d;

    public a1(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView) {
        this.f151774d = musicMVCardChooseView;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        java.util.HashSet<gm3.c> hashSet = (java.util.HashSet) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMVCardChooseView", "collect selectedItemFlow " + hashSet.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (gm3.c cVar : hashSet) {
            int i17 = cVar.f273544e;
            if (i17 != 1) {
                if (i17 == 2) {
                    gm3.b bVar = cVar.f273548i;
                    if (bVar != null && (finderObject = bVar.f273542b) != null) {
                        arrayList.add(new java.lang.Long(finderObject.getId()));
                    }
                } else if (i17 != 3) {
                }
            }
            gm3.a aVar = cVar.f273547h;
            if (aVar != null) {
                arrayList.add(new java.lang.Long(aVar.f273535a));
            }
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView = this.f151774d;
        km3.t tVar = musicMVCardChooseView.f151621f;
        if (tVar != null) {
            java.util.Iterator it = tVar.f309261e.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) next;
                boolean z17 = galleryItem$MediaItem.f138442t;
                boolean contains = arrayList.contains(java.lang.Long.valueOf(galleryItem$MediaItem.f138434i));
                java.util.LinkedList linkedList = tVar.f309265i;
                if (contains) {
                    if (!z17) {
                        galleryItem$MediaItem.f138442t = true;
                        tVar.notifyItemChanged(i18 + linkedList.size());
                    }
                } else if (z17) {
                    galleryItem$MediaItem.f138442t = false;
                    tVar.notifyItemChanged(i18 + linkedList.size());
                }
                i18 = i19;
            }
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment musicMvTabMachineFragment = musicMVCardChooseView.f151638w;
        if (musicMvTabMachineFragment != null) {
            musicMvTabMachineFragment.b(arrayList);
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment musicMvTabMyPostFragment = musicMVCardChooseView.f151639x;
        if (musicMvTabMyPostFragment != null) {
            musicMvTabMyPostFragment.b(arrayList);
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment musicMvTabMyFavFragment = musicMVCardChooseView.f151642y;
        if (musicMvTabMyFavFragment != null) {
            musicMvTabMyFavFragment.b(arrayList);
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment musicMvTabMyLikeFragment = musicMVCardChooseView.f151645z;
        if (musicMvTabMyLikeFragment != null) {
            musicMvTabMyLikeFragment.b(arrayList);
        }
        return jz5.f0.f302826a;
    }
}
