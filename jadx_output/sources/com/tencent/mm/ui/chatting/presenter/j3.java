package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes12.dex */
public class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.n3 f202283d;

    public j3(com.tencent.mm.ui.chatting.presenter.n3 n3Var) {
        this.f202283d = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        zb5.g gVar = this.f202283d.f202356d;
        if (gVar != null) {
            ((com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) gVar).U6(com.tencent.mm.R.string.fjx);
        }
    }
}
