package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.c6 f200814d;

    public b6(com.tencent.mm.ui.chatting.gallery.c6 c6Var) {
        this.f200814d = c6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.c6 c6Var = this.f200814d;
        c6Var.f200833a.finish();
        if (c6Var.f200833a.isVASValid()) {
            return;
        }
        c6Var.f200833a.overridePendingTransition(0, 0);
    }
}
