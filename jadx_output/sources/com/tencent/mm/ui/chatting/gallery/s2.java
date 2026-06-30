package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public class s2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.DoFavoriteEvent f201352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f201353e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI f201354f;

    public s2(com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI imageGalleryGridUI, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, java.util.List list) {
        this.f201354f = imageGalleryGridUI;
        this.f201352d = doFavoriteEvent;
        this.f201353e = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = this.f201352d;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        int i18 = c4Var.f6317c;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI imageGalleryGridUI = this.f201354f;
        if (i18 == 14 && c4Var.f6315a.f370964f.size() == 0) {
            imageGalleryGridUI.a7();
            return;
        }
        int i19 = com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI.E;
        imageGalleryGridUI.U6(doFavoriteEvent);
        java.util.Iterator it = this.f201353e.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.chatting.e.c(com.tencent.mm.ui.chatting.c.Fav, com.tencent.mm.ui.chatting.d.Samll, (com.tencent.mm.storage.f9) it.next(), 0);
        }
    }
}
