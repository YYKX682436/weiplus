package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes12.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.r2 f202430d;

    public q2(com.tencent.mm.ui.chatting.presenter.r2 r2Var) {
        this.f202430d = r2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        zb5.g gVar = this.f202430d.f202441e.f202356d;
        if (gVar != null) {
            ((com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) gVar).V6();
        }
    }
}
