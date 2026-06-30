package e22;

/* loaded from: classes10.dex */
public final class e1 {
    public e1(kotlin.jvm.internal.i iVar) {
    }

    public static final java.util.List a(e22.e1 e1Var, java.util.List list) {
        e1Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj;
            e22.e1 e1Var2 = com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI.f98154p;
            arrayList.add(new or.a(i18, 1, galleryItem$MediaItem.getType() == 2 ? 3 : kotlin.jvm.internal.o.b(galleryItem$MediaItem.f138438p, "image/gif") ? 4 : 1, null, 8, null));
            i17 = i18;
        }
        return arrayList;
    }
}
