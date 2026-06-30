package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final /* synthetic */ class c2$$t2 implements we5.t0 {
    @Override // we5.t0
    public final void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
        com.tencent.mm.ui.chatting.viewitems.v1 v1Var = (com.tencent.mm.ui.chatting.viewitems.v1) g0Var;
        com.tencent.mm.ui.MMImageView mMImageView = v1Var.f205735b;
        if (mMImageView == null || v1Var.f205739d == null) {
            return;
        }
        mMImageView.setVisibility(8);
        v1Var.f205739d.setMinLines(3);
        v1Var.f205739d.setLines(3);
        v1Var.f205739d.setGravity(48);
    }
}
