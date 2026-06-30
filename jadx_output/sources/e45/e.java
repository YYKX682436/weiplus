package e45;

/* loaded from: classes10.dex */
public final class e implements d45.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e45.h f249379a;

    public e(e45.h hVar) {
        this.f249379a = hVar;
    }

    @Override // d45.d
    public void a(int i17, boolean z17) {
        d45.d dVar = this.f249379a.f249400y;
        if (dVar != null) {
            dVar.a(i17, z17);
        }
    }

    @Override // d45.d
    public void b(int i17, android.view.View view, int i18) {
        int i19;
        if (i18 == 1) {
            e45.h hVar = this.f249379a;
            d45.q qVar = hVar.f249391p;
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem z17 = qVar != null ? qVar.z(i17) : null;
            if (z17 == null || com.tencent.mm.sdk.platformtools.t8.K0(z17.f138430e)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Boolean.valueOf(z17 == null);
                com.tencent.mars.xlog.Log.w("FS.AlbumFileUIC", "item is null %s, item original path is null", objArr);
            } else {
                int i27 = t23.p0.k().f415297f;
                com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = hVar.f249382d;
                if (i27 == 5 && r26.i0.p(z17.f138438p, "image/gif", true)) {
                    db5.e1.T(fileSelectorUI.getContext(), fileSelectorUI.getString(com.tencent.mm.R.string.fjl));
                } else {
                    d45.q qVar2 = hVar.f249391p;
                    java.util.ArrayList arrayList = qVar2 != null ? qVar2.f226457g : null;
                    if (arrayList != null) {
                        java.util.ArrayList x17 = qVar2 != null ? qVar2.x(arrayList) : null;
                        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(i17);
                        if (galleryItem$MediaItem != null && x17 != null) {
                            i19 = 0;
                            for (java.lang.Object obj : x17) {
                                int i28 = i19 + 1;
                                if (i19 < 0) {
                                    kz5.c0.p();
                                    throw null;
                                }
                                if (kotlin.jvm.internal.o.b((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj, galleryItem$MediaItem)) {
                                    break;
                                } else {
                                    i19 = i28;
                                }
                            }
                        }
                    }
                    i19 = -1;
                    if (i19 == -1) {
                        com.tencent.mars.xlog.Log.e("FS.AlbumFileUIC", "onMediaClick, oldPos:" + i17 + ", newPos:-1");
                    } else {
                        d45.q qVar3 = hVar.f249391p;
                        t23.p0.p(qVar3 != null ? qVar3.x(qVar3.f226457g) : null);
                        android.content.Intent intent = new android.content.Intent(fileSelectorUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.class);
                        intent.putExtra("query_source_type", hVar.f249384f);
                        d45.q qVar4 = hVar.f249391p;
                        intent.putStringArrayListExtra("preview_image_list", qVar4 != null ? qVar4.E() : null);
                        d45.q qVar5 = hVar.f249391p;
                        intent.putParcelableArrayListExtra("preview_media_item_list", qVar5 != null ? qVar5.f226458h : null);
                        intent.putExtra("preview_all", true);
                        intent.putExtra("preview_position", i19);
                        hVar.b(i19, true);
                        intent.putExtra("send_raw_img", true);
                        intent.putExtra("key_force_hide_edit_image_button", true);
                        intent.putExtra("key_force_show_raw_image_button", false);
                        intent.putExtra("key_is_raw_image_button_disable", true);
                        intent.putExtra("max_select_count", hVar.f249387i - fileSelectorUI.b7());
                        intent.putExtra("GalleryUI_FromUser", hVar.f249392q);
                        intent.putExtra("GalleryUI_ToUser", hVar.f249393r);
                        intent.putExtra("album_video_max_duration", Integer.MAX_VALUE);
                        intent.putExtra("album_video_min_duration", 0);
                        intent.putExtra("media_type", 2);
                        intent.putExtra("select_type_tag", hVar.f249389n);
                        fileSelectorUI.startActivityForResult(intent, 0);
                    }
                }
            }
            d45.d dVar = hVar.f249400y;
            if (dVar != null) {
                dVar.b(i17, view, i18);
            }
        }
    }
}
