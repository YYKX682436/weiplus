package ea3;

/* loaded from: classes10.dex */
public class w implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ea3.p f250678a;

    public w(ea3.p pVar) {
        this.f250678a = pVar;
    }

    @Override // q80.x
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        ea3.p pVar = this.f250678a;
        pVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "dealPreviewResult requestCode:%d resultCode:%d, data:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent);
        if (i17 == 56055) {
            new java.util.HashMap();
            if (i18 == -2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppAlbumViewImpl", "dealPreviewResult back");
            } else if (i18 == -1) {
                if (intent == null) {
                    java.util.ArrayList arrayList = pVar.f250662u.f250630g;
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
                        if (pVar.l(galleryItem$MediaItem)) {
                            java.util.ArrayList arrayList2 = pVar.H;
                            arrayList2.add(galleryItem$MediaItem);
                            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "new item, add to cache:%d", java.lang.Integer.valueOf(arrayList2.size()));
                        }
                    }
                    pVar.n(arrayList);
                } else {
                    java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_select_multi_pic_item");
                    if (parcelableArrayListExtra == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "mediaItems == null");
                    } else {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.util.Iterator it6 = parcelableArrayListExtra.iterator();
                        while (it6.hasNext()) {
                            arrayList3.add(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it6.next()).f138430e);
                        }
                        pVar.q(arrayList3);
                    }
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("result", "ok");
                com.tencent.mm.plugin.lite.media.album.LiteAppAlbumView liteAppAlbumView = (com.tencent.mm.plugin.lite.media.album.LiteAppAlbumView) pVar.F;
                liteAppAlbumView.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "onAlbumFinish" + hashMap);
                io.flutter.plugin.common.MethodChannel methodChannel = liteAppAlbumView.f144121e;
                if (methodChannel != null) {
                    methodChannel.invokeMethod("onAlbumFinish", hashMap);
                }
            } else if (i18 == 0 && intent != null) {
                pVar.q(intent.getStringArrayListExtra("preview_image_list"));
            }
        }
        if (intent == null || !intent.getBooleanExtra("show_photo_edit_tip", false)) {
            return;
        }
        android.content.Context context = pVar.f250649e;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("photo_edit_pref", 0);
        if (sharedPreferences.getBoolean("has_show_tip", false)) {
            return;
        }
        pVar.f250663v.setVisibility(0);
        pVar.f250663v.setText(context.getString(com.tencent.mm.R.string.o7i));
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(pVar.getContext(), com.tencent.mm.R.anim.f477783bc);
        pVar.f250663v.startAnimation(loadAnimation);
        loadAnimation.setAnimationListener(new ea3.y(pVar));
        sharedPreferences.edit().putBoolean("has_show_tip", true).apply();
    }
}
