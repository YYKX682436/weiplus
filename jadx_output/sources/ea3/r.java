package ea3;

/* loaded from: classes10.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ea3.p f250673d;

    public r(ea3.p pVar) {
        this.f250673d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onAlbumChanged");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ea3.p pVar = this.f250673d;
        java.util.Iterator it = pVar.G.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) it.next();
            java.lang.String e17 = com.tencent.mm.plugin.lite.w.e(galleryItem$AlbumItem.f138420i, false);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator it6 = it;
            java.lang.String str4 = galleryItem$AlbumItem.f138418g;
            java.lang.String str5 = galleryItem$AlbumItem.f138415d;
            if (str4 != null) {
                str5 = str5 + "|" + galleryItem$AlbumItem.f138418g;
            }
            hashMap.put(dm.i4.COL_ID, android.util.Base64.encodeToString(str5.getBytes(), 0));
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, galleryItem$AlbumItem.f138416e);
            if (e17 != null) {
                str3 = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(e17).f182736e;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppAlbumViewImpl", "thumbPath is null");
                str3 = "";
            }
            hashMap.put(com.tencent.tav.core.AssetExtension.SCENE_THUMBNAIL, str3);
            hashMap.put("photoCount", java.lang.Integer.valueOf(galleryItem$AlbumItem.f138417f));
            arrayList.add(hashMap);
            it = it6;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.lang.String e18 = com.tencent.mm.plugin.lite.w.e(pVar.E.f138420i, false);
        com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem2 = pVar.E;
        if (galleryItem$AlbumItem2.f138418g != null) {
            str = pVar.E.f138415d + "|" + pVar.E.f138418g;
        } else {
            str = galleryItem$AlbumItem2.f138415d;
        }
        hashMap2.put(dm.i4.COL_ID, android.util.Base64.encodeToString(str.getBytes(), 0));
        hashMap2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, pVar.E.f138416e);
        if (e18 != null) {
            str2 = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(e18).f182736e;
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppAlbumViewImpl", "thumbPath is null");
            str2 = "";
        }
        hashMap2.put(com.tencent.tav.core.AssetExtension.SCENE_THUMBNAIL, str2);
        hashMap2.put("photoCount", java.lang.Integer.valueOf(pVar.E.f138417f));
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("albums", arrayList);
        hashMap3.put("currentalbum", hashMap2);
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new ea3.q(this, hashMap3));
    }
}
