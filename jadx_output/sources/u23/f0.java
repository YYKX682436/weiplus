package u23;

/* loaded from: classes10.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u23.f0 f424074a = new u23.f0();

    public final boolean a(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem item) {
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.Object obj = item.f138443u.get("KEY_MEDIA_PARENT");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str.concat(b(item)));
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            return m17.f213266a.F(m17.f213267b);
        }
        return false;
    }

    public final java.lang.String b(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        java.util.HashMap hashMap;
        java.lang.Object obj = (galleryItem$MediaItem == null || (hashMap = galleryItem$MediaItem.f138443u) == null) ? null : hashMap.get("KEY_MEDIA_NAME");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        return str == null ? "" : str;
    }

    public final android.net.Uri c(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        java.util.HashMap hashMap;
        java.lang.Object obj = (galleryItem$MediaItem == null || (hashMap = galleryItem$MediaItem.f138443u) == null) ? null : hashMap.get("KEY_MEDIA_URI");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            return null;
        }
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str != null) {
            return android.net.Uri.parse(str);
        }
        return null;
    }
}
