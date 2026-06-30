package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes12.dex */
public class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.x2 f202516d;

    public w2(com.tencent.mm.ui.chatting.presenter.x2 x2Var) {
        this.f202516d = x2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        zb5.g gVar = this.f202516d.f202536b.f202356d;
        if (gVar != null) {
            ((com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) gVar).U6(com.tencent.mm.R.string.fjx);
        }
    }
}
