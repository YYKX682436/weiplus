package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201503d;

    public v2(com.tencent.mm.ui.chatting.gallery.t2 t2Var, com.tencent.mm.storage.f9 f9Var) {
        this.f201503d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 f9Var = this.f201503d;
        f9Var.c1(0);
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).bb(f9Var.getMsgId(), f9Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryHolderImage", "msg.setNotClean msgId = " + f9Var.getMsgId());
    }
}
