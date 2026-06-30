package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes12.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.u2 f202481d;

    public t2(com.tencent.mm.ui.chatting.presenter.u2 u2Var) {
        this.f202481d = u2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        zb5.g gVar = this.f202481d.f202494b.f202356d;
        if (gVar != null) {
            ((com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) gVar).U6(com.tencent.mm.R.string.fjx);
        }
    }
}
