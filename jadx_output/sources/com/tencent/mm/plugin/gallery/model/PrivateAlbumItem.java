package com.tencent.mm.plugin.gallery.model;

/* loaded from: classes10.dex */
public class PrivateAlbumItem extends com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem {

    /* renamed from: p, reason: collision with root package name */
    public final t23.f2 f138449p;

    public PrivateAlbumItem(t23.f2 f2Var) {
        super(f2Var.f415149d, f2Var.f415150e);
        this.f138449p = f2Var;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem
    public java.lang.String h() {
        return this.f138449p.f415152g;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem
    public long i() {
        return this.f138449p.f415151f;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem
    public java.lang.String n() {
        return this.f138449p.f415152g;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem
    public int o() {
        t23.g2 g2Var = this.f138449p.f415153h;
        return (g2Var == null || !g2Var.f415156c) ? 1 : 2;
    }
}
