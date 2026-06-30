package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class a2 extends com.tencent.matrix.lifecycle.h {
    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvExposeHelper", "onEnterForeground");
        com.tencent.mm.ui.conversation.ConvExposeHelper.f207293d.getClass();
        if (com.tencent.mm.ui.conversation.ConvExposeHelper.f207304r.get()) {
            ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Ui(rv.g3.AppStateChange);
        }
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvExposeHelper", "onExitForeground");
        com.tencent.mm.ui.conversation.ConvExposeHelper.f207293d.getClass();
        if (com.tencent.mm.ui.conversation.ConvExposeHelper.f207304r.get()) {
            ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Ri(rv.g3.AppStateChange);
        }
    }
}
