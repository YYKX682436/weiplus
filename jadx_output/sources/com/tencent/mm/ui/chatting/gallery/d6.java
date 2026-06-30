package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class d6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.e6 f200867d;

    public d6(com.tencent.mm.ui.chatting.gallery.e6 e6Var) {
        this.f200867d = e6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.e6 e6Var = this.f200867d;
        e6Var.f200891a.finish();
        if (e6Var.f200891a.isVASValid()) {
            return;
        }
        e6Var.f200891a.overridePendingTransition(0, 0);
    }
}
