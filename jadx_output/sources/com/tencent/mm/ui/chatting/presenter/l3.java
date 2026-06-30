package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes12.dex */
public class l3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.m3 f202326e;

    public l3(com.tencent.mm.ui.chatting.presenter.m3 m3Var, java.util.List list) {
        this.f202326e = m3Var;
        this.f202325d = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.util.List list = this.f202325d;
        int size = list.size();
        com.tencent.mm.ui.chatting.presenter.m3 m3Var = this.f202326e;
        if (size == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "handleSave size = 0");
            com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI mediaHistoryGalleryUI = (com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) m3Var.f202344e.f202356d;
            mediaHistoryGalleryUI.X6();
            mediaHistoryGalleryUI.f200753q = false;
            mediaHistoryGalleryUI.W6(false, "");
            return;
        }
        com.tencent.mm.ui.chatting.presenter.n3 n3Var = m3Var.f202344e;
        com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI mediaHistoryGalleryUI2 = (com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) n3Var.f202356d;
        mediaHistoryGalleryUI2.f200753q = true;
        mediaHistoryGalleryUI2.W6(true, mediaHistoryGalleryUI2.getString(com.tencent.mm.R.string.f492305g01));
        s75.d.b(new com.tencent.mm.ui.chatting.presenter.r2(n3Var, list), "handleSave");
    }
}
