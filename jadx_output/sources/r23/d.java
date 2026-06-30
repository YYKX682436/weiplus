package r23;

/* loaded from: classes4.dex */
public abstract class d {
    public static final java.lang.String a(java.util.List list) {
        int i17;
        java.util.HashSet hashSet = new java.util.HashSet();
        int i18 = 0;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            int i19 = 0;
            while (it.hasNext()) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
                if (galleryItem$MediaItem.getType() == 2) {
                    i18++;
                }
                if (galleryItem$MediaItem.getType() == 1) {
                    i19++;
                }
                hashSet.add(java.lang.Integer.valueOf(galleryItem$MediaItem.getType()));
                if (hashSet.size() >= 2) {
                    java.lang.String r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f492179fi3);
                    kotlin.jvm.internal.o.f(r17, "getString(...)");
                    return r17;
                }
            }
            i17 = i18;
            i18 = i19;
        } else {
            i17 = 0;
        }
        if (i18 > 9) {
            java.lang.String r18 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f492177fi1);
            kotlin.jvm.internal.o.f(r18, "getString(...)");
            return r18;
        }
        if (i17 < 2) {
            return "";
        }
        java.lang.String r19 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f492178fi2);
        kotlin.jvm.internal.o.f(r19, "getString(...)");
        return r19;
    }
}
