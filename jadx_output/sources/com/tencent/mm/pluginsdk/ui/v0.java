package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public final class v0 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.d2 f192029d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f192030e;

    public v0(com.tencent.mm.pluginsdk.ui.tools.d2 d2Var, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, com.tencent.mm.pluginsdk.ui.tools.c2 c2Var, int i17, kotlin.jvm.internal.i iVar) {
        d2Var = (i17 & 1) != 0 ? null : d2Var;
        galleryItem$MediaItem = (i17 & 2) != 0 ? null : galleryItem$MediaItem;
        this.f192029d = d2Var;
        this.f192030e = galleryItem$MediaItem;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.pluginsdk.ui.v0) && getItemId() == ((com.tencent.mm.pluginsdk.ui.v0) obj).getItemId();
    }

    @Override // in5.c
    public long getItemId() {
        if (h() == 1) {
            return this.f192029d != null ? r0.hashCode() : hashCode();
        }
        if (h() != 2) {
            return hashCode();
        }
        return this.f192030e != null ? r0.hashCode() : hashCode();
    }

    @Override // in5.c
    public int h() {
        if (this.f192029d != null) {
            return 1;
        }
        return this.f192030e != null ? 2 : 0;
    }
}
