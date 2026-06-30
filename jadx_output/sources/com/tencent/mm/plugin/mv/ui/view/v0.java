package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f151963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView f151964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f151965f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.view.View view, com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        super(0);
        this.f151963d = view;
        this.f151964e = musicMVCardChooseView;
        this.f151965f = galleryItem$MediaItem;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r4 = this;
            android.view.View r0 = r4.f151963d
            if (r0 == 0) goto L2d
            r1 = 2131314119(0x7f0945c7, float:1.8246654E38)
            android.view.View r0 = r0.findViewById(r1)     // Catch: java.lang.Exception -> L15
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch: java.lang.Exception -> L15
            kotlin.jvm.internal.o.d(r0)     // Catch: java.lang.Exception -> L15
            fm3.w r0 = fm3.x.a(r0)     // Catch: java.lang.Exception -> L15
            goto L2e
        L15:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "generate animation info fail:"
            r1.<init>(r2)
            java.lang.String r0 = r0.getLocalizedMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MicroMsg.Mv.MusicMVCardChooseView"
            com.tencent.mars.xlog.Log.e(r1, r0)
        L2d:
            r0 = 0
        L2e:
            r1 = 2
            fm3.g0.f264072c = r1
            com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView r1 = r4.f151964e
            com.tencent.mm.plugin.mv.ui.view.b0 r1 = r1.G
            if (r1 == 0) goto L54
            com.tencent.mm.plugin.mv.ui.MusicMvMakerUI r1 = (com.tencent.mm.plugin.mv.ui.MusicMvMakerUI) r1
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r2 = r4.f151965f
            java.lang.String r3 = "data"
            kotlin.jvm.internal.o.g(r2, r3)
            boolean r3 = r2 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r3 == 0) goto L4d
            jm3.v r3 = new jm3.v
            r3.<init>(r1, r2)
            r1.a7(r0, r3)
            goto L54
        L4d:
            java.lang.String r0 = "MicroMsg.Mv.MusicMvMakerUI"
            java.lang.String r1 = "data must be GalleryItem.VideoMediaItem"
            com.tencent.mars.xlog.Log.e(r0, r1)
        L54:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.view.v0.invoke():java.lang.Object");
    }
}
