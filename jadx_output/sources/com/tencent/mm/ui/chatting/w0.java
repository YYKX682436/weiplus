package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class w0 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.v0 f206179a;

    public w0(com.tencent.mm.ui.chatting.v0 v0Var) {
        this.f206179a = v0Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mars.xlog.Log.w("MicroMsg.AutoPlay", "onExitForeground: ");
        this.f206179a.J(true);
    }
}
