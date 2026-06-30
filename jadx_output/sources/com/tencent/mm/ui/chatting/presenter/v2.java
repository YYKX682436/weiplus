package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes12.dex */
public class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.x2 f202507d;

    public v2(com.tencent.mm.ui.chatting.presenter.x2 x2Var) {
        this.f202507d = x2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        zb5.g gVar = this.f202507d.f202536b.f202356d;
        if (gVar != null) {
            ((com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) gVar).V6();
        }
    }
}
