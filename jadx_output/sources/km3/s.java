package km3;

/* loaded from: classes10.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km3.t f309259d;

    public s(km3.t tVar) {
        this.f309259d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Boolean bool;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.f485389hj2);
        if (tag == null || !(tag instanceof java.lang.Integer)) {
            com.tencent.mars.xlog.Log.e("Music.MusicMvAlbumAdapter", "error tag");
            yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Number number = (java.lang.Number) tag;
        int intValue = number.intValue();
        km3.t tVar = this.f309259d;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem x17 = tVar.x(intValue);
        if (x17 == null || com.tencent.mm.sdk.platformtools.t8.K0(x17.f138430e)) {
            com.tencent.mars.xlog.Log.e("Music.MusicMvAlbumAdapter", "[onClick] null == item!");
            tVar.notifyItemChanged(number.intValue());
            yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("Music.MusicMvAlbumAdapter", "click image path:" + x17.f138430e);
        boolean z17 = true;
        boolean z18 = x17.f138442t ^ true;
        x17.f138442t = z18;
        km3.k kVar = tVar.f309268o;
        if (kVar != null) {
            int i17 = com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.B1;
            com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView = ((com.tencent.mm.plugin.mv.ui.view.r0) kVar).f151932a;
            if (musicMVCardChooseView.h()) {
                com.tencent.mm.plugin.mv.ui.view.b0 b0Var = musicMVCardChooseView.G;
                if (b0Var != null) {
                    com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI = (com.tencent.mm.plugin.mv.ui.MusicMvMakerUI) b0Var;
                    java.lang.String str3 = "local_" + x17.f138434i;
                    boolean z19 = x17 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
                    int i18 = z19 ? 3 : 1;
                    int i19 = z19 ? ((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) x17).f138446x : 0;
                    androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(musicMvMakerUI).a(com.tencent.mm.plugin.mv.ui.uic.v4.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    com.tencent.mm.plugin.mv.ui.uic.v4 v4Var = (com.tencent.mm.plugin.mv.ui.uic.v4) a17;
                    v4Var.f151499s = true;
                    com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList musicMvFlexLiveList = v4Var.f151491h;
                    if (!z18) {
                        musicMvMakerUI.f150879r -= i18;
                        musicMvFlexLiveList.s(str3);
                        musicMvFlexLiveList.D();
                        str = "(Landroid/view/View;)V";
                        str2 = "onClick";
                    } else if (musicMvMakerUI.W6(i19, i18, z19)) {
                        fm3.q qVar = new fm3.q();
                        qVar.f264109g = 1;
                        qVar.f264112m = new fm3.m(x17);
                        if (z19) {
                            java.lang.String n17 = x17.n();
                            kotlin.jvm.internal.o.f(n17, "uniqueValue(...)");
                            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) x17;
                            java.lang.String str4 = galleryItem$VideoMediaItem.f138430e;
                            str = "(Landroid/view/View;)V";
                            kotlin.jvm.internal.o.f(str4, "getOriginalPath(...)");
                            str2 = "onClick";
                            fm3.p pVar = new fm3.p(n17, str4, galleryItem$VideoMediaItem.f138446x, 0, 0, 24, null);
                            pVar.f264098d = galleryItem$VideoMediaItem.f138448z;
                            pVar.f264099e = galleryItem$VideoMediaItem.f138447y;
                            qVar.f264113n = pVar;
                        } else {
                            str = "(Landroid/view/View;)V";
                            str2 = "onClick";
                        }
                        fm3.g0 g0Var = fm3.g0.f264070a;
                        fm3.g0.f264072c = 2;
                        g0Var.b(musicMvFlexLiveList.f152065o.size(), qVar);
                        gm3.c cVar = new gm3.c(str3, 1, java.lang.System.currentTimeMillis(), 0);
                        gm3.a aVar = new gm3.a(0L, 0L, null, null, 0, 0, 63, null);
                        cVar.f273547h = aVar;
                        aVar.f273537c = x17.o();
                        gm3.a aVar2 = cVar.f273547h;
                        if (aVar2 != null) {
                            aVar2.f273535a = x17.f138434i;
                        }
                        if (aVar2 != null) {
                            aVar2.f273536b = x17.f138435m;
                        }
                        if (aVar2 != null) {
                            aVar2.f273538d = x17;
                        }
                        if (z19) {
                            cVar.f273549m = ((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) x17).f138446x;
                        } else {
                            cVar.f273549m = 0;
                            android.graphics.Point q07 = com.tencent.mm.sdk.platformtools.x.q0(x17.o());
                            gm3.a aVar3 = cVar.f273547h;
                            if (aVar3 != null) {
                                aVar3.f273539e = q07 != null ? q07.x : 0;
                            }
                            if (aVar3 != null) {
                                aVar3.f273540f = q07 != null ? q07.y : 0;
                            }
                        }
                        com.tencent.mm.plugin.mvvmlist.MvvmList.q(musicMvFlexLiveList, cVar, false, 2, null);
                        musicMvFlexLiveList.D();
                    }
                    z17 = true;
                }
                str = "(Landroid/view/View;)V";
                str2 = "onClick";
                z17 = false;
            } else {
                str = "(Landroid/view/View;)V";
                str2 = "onClick";
            }
            bool = java.lang.Boolean.valueOf(z17);
        } else {
            str = "(Landroid/view/View;)V";
            str2 = "onClick";
            bool = null;
        }
        if (bool != null && !bool.booleanValue()) {
            x17.f138442t = false;
        }
        tVar.notifyItemChanged(number.intValue());
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$selectListener$1", "android/view/View$OnClickListener", str2, str);
    }
}
