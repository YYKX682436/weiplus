package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes12.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.n3 f202344e;

    public m3(com.tencent.mm.ui.chatting.presenter.n3 n3Var, java.util.List list) {
        this.f202344e = n3Var;
        this.f202343d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.n3 n3Var = this.f202344e;
        n3Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<com.tencent.mm.storage.f9> list = this.f202343d;
        for (com.tencent.mm.storage.f9 f9Var : list) {
            if (!com.tencent.mm.ui.chatting.gallery.k1.M(f9Var) && !com.tencent.mm.ui.chatting.gallery.k1.F(f9Var)) {
                if (!(f9Var == null ? false : f9Var.M2())) {
                    arrayList.add(f9Var);
                }
            }
        }
        if (arrayList.size() != list.size()) {
            db5.e1.n(n3Var.f202358f, com.tencent.mm.R.string.fjf, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.ui.chatting.presenter.l3(this, arrayList), null);
            return;
        }
        com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI mediaHistoryGalleryUI = (com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) n3Var.f202356d;
        mediaHistoryGalleryUI.f200753q = true;
        mediaHistoryGalleryUI.W6(true, mediaHistoryGalleryUI.getString(com.tencent.mm.R.string.f492305g01));
        s75.d.b(new com.tencent.mm.ui.chatting.presenter.r2(n3Var, arrayList), "handleSave");
    }
}
