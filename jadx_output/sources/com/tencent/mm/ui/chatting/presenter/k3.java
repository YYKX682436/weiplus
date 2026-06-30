package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes12.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.n3 f202298d;

    public k3(com.tencent.mm.ui.chatting.presenter.n3 n3Var) {
        this.f202298d = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        zb5.g gVar = this.f202298d.f202356d;
        if (gVar != null) {
            ((com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) gVar).V6();
        }
    }
}
