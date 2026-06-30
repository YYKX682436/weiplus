package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.b f151196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q f151197e;

    public i(com.tencent.mm.plugin.mv.ui.uic.b bVar, com.tencent.mm.plugin.mv.ui.uic.q qVar) {
        this.f151196d = bVar;
        this.f151197e = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.uic.b bVar = this.f151196d;
        im3.j jVar = ((pm3.a) bVar.O6().f298088f).f356869f;
        if (jVar != null) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = jVar.f292704m;
            if (galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) {
                kotlin.jvm.internal.o.e(galleryItem$MediaItem, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem");
                java.lang.Integer valueOf = java.lang.Integer.valueOf(((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) galleryItem$MediaItem).f138446x);
                if (valueOf != null && valueOf.intValue() <= 2000) {
                    com.tencent.mm.plugin.mv.ui.uic.q qVar = this.f151197e;
                    com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(qVar.getActivity());
                    u1Var.g(qVar.getResources().getString(com.tencent.mm.R.string.f492602h43));
                    u1Var.n(qVar.getResources().getString(com.tencent.mm.R.string.f490454vi));
                    u1Var.q(false);
                    yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            jVar.f292702h = !jVar.f292702h;
            bVar.O6().B3(new pm3.d(pm3.c.f356873f, jVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
