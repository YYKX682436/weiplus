package q23;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.livephoto.ui.GalleryLivePhotoTagLayout f359809d;

    public b(com.tencent.mm.plugin.gallery.livephoto.ui.GalleryLivePhotoTagLayout galleryLivePhotoTagLayout) {
        this.f359809d = galleryLivePhotoTagLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/livephoto/ui/GalleryLivePhotoTagLayout$initBuildScene$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gallery.livephoto.ui.GalleryLivePhotoTagLayout galleryLivePhotoTagLayout = this.f359809d;
        if (galleryLivePhotoTagLayout.f138410g == null || galleryLivePhotoTagLayout.f138411h == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GalleryLivePhotoTagLayout", "onClick : " + galleryLivePhotoTagLayout.hashCode() + ", itemData is invalid");
        }
        if (galleryLivePhotoTagLayout.f138407d == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GalleryLivePhotoTagLayout", "onClick disabled in SCENE_ALBUM_UI: " + galleryLivePhotoTagLayout.hashCode());
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick : ");
            sb6.append(galleryLivePhotoTagLayout.hashCode());
            sb6.append(", mediaId: ");
            sb6.append(galleryLivePhotoTagLayout.f138411h);
            sb6.append(" state: ");
            com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = galleryLivePhotoTagLayout.f138410g;
            kotlin.jvm.internal.o.d(galleryItem$LivePhotoMediaItem);
            sb6.append(galleryItem$LivePhotoMediaItem.A);
            sb6.append(" currentShowState: ");
            sb6.append(galleryLivePhotoTagLayout.f138412i);
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLivePhotoTagLayout", sb6.toString());
            int i17 = galleryLivePhotoTagLayout.f138412i;
            p23.a aVar = p23.a.f351426a;
            java.lang.String str3 = "";
            if (i17 == 1) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem2 = galleryLivePhotoTagLayout.f138410g;
                kotlin.jvm.internal.o.d(galleryItem$LivePhotoMediaItem2);
                galleryItem$LivePhotoMediaItem2.A = 2;
                galleryLivePhotoTagLayout.b(2);
                q23.g gVar = galleryLivePhotoTagLayout.f138413m;
                if (gVar != null) {
                    ((e33.n2) gVar).a(false);
                }
                com.tencent.mm.autogen.events.LivePhotoUseStateEvent livePhotoUseStateEvent = new com.tencent.mm.autogen.events.LivePhotoUseStateEvent();
                am.zi ziVar = livePhotoUseStateEvent.f54476g;
                ziVar.f8567b = false;
                ziVar.f8566a = galleryLivePhotoTagLayout.f138411h;
                ziVar.f8568c = galleryLivePhotoTagLayout.f138407d;
                com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem3 = galleryLivePhotoTagLayout.f138410g;
                if (galleryItem$LivePhotoMediaItem3 != null && (str2 = galleryItem$LivePhotoMediaItem3.f138430e) != null) {
                    str3 = str2;
                }
                ziVar.f8569d = str3;
                livePhotoUseStateEvent.e();
                int i18 = galleryLivePhotoTagLayout.f138407d == 0 ? 1 : 2;
                com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem4 = galleryLivePhotoTagLayout.f138410g;
                aVar.a(i18, 0, galleryItem$LivePhotoMediaItem4 != null ? galleryItem$LivePhotoMediaItem4.B : 0, java.lang.String.valueOf(galleryLivePhotoTagLayout.f138411h));
            } else if (i17 == 2) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem5 = galleryLivePhotoTagLayout.f138410g;
                kotlin.jvm.internal.o.d(galleryItem$LivePhotoMediaItem5);
                galleryItem$LivePhotoMediaItem5.A = 1;
                galleryLivePhotoTagLayout.b(1);
                q23.g gVar2 = galleryLivePhotoTagLayout.f138413m;
                if (gVar2 != null) {
                    ((e33.n2) gVar2).a(true);
                }
                com.tencent.mm.autogen.events.LivePhotoUseStateEvent livePhotoUseStateEvent2 = new com.tencent.mm.autogen.events.LivePhotoUseStateEvent();
                am.zi ziVar2 = livePhotoUseStateEvent2.f54476g;
                ziVar2.f8567b = true;
                ziVar2.f8566a = galleryLivePhotoTagLayout.f138411h;
                ziVar2.f8568c = galleryLivePhotoTagLayout.f138407d;
                com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem6 = galleryLivePhotoTagLayout.f138410g;
                if (galleryItem$LivePhotoMediaItem6 != null && (str = galleryItem$LivePhotoMediaItem6.f138430e) != null) {
                    str3 = str;
                }
                ziVar2.f8569d = str3;
                livePhotoUseStateEvent2.e();
                int i19 = galleryLivePhotoTagLayout.f138407d == 0 ? 1 : 2;
                com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem7 = galleryLivePhotoTagLayout.f138410g;
                aVar.a(i19, 1, galleryItem$LivePhotoMediaItem7 != null ? galleryItem$LivePhotoMediaItem7.B : 0, java.lang.String.valueOf(galleryLivePhotoTagLayout.f138411h));
                q23.g gVar3 = galleryLivePhotoTagLayout.f138413m;
                if (gVar3 != null) {
                    e33.n2 n2Var = (e33.n2) gVar3;
                    ((y51.b) n2Var.f247381b).c();
                    n2Var.f247383d.p(n2Var.f247382c, 2);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.GalleryLivePhotoTagLayout", galleryLivePhotoTagLayout.hashCode() + " error state");
            }
        }
        com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem8 = galleryLivePhotoTagLayout.f138410g;
        if (galleryItem$LivePhotoMediaItem8 != null && galleryItem$LivePhotoMediaItem8.f138428z == 6 && galleryItem$LivePhotoMediaItem8.A == 1 && galleryItem$LivePhotoMediaItem8.H == 1) {
            kotlin.jvm.internal.o.e(galleryItem$LivePhotoMediaItem8, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.model.GalleryItem.LivePhotoMediaItem");
            if (galleryItem$LivePhotoMediaItem8.I == 0) {
                q23.e eVar = q23.e.f359812a;
                android.content.Context context = galleryLivePhotoTagLayout.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_LIVE_PHOTO_MANUAL_ENABLE_SHOW_INT;
                boolean z17 = c17.r(u3Var, 0) == 1;
                com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLivePhotoTeaDialogHelper", "checkShowTeachDialogWhenSelect >> " + z17);
                if (!z17) {
                    gm0.j1.u().c().x(u3Var, 1);
                    com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 0);
                    z2Var.F = new q23.d(z2Var);
                    z2Var.x(1);
                    z2Var.y(i65.a.r(context, com.tencent.mm.R.string.f490454vi));
                    z2Var.i(com.tencent.mm.R.layout.eiw);
                    z2Var.C();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/livephoto/ui/GalleryLivePhotoTagLayout$initBuildScene$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
