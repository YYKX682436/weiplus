package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.g0 f203754d;

    public d0(com.tencent.mm.ui.chatting.viewitems.a0 a0Var, com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
        this.f203754d = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.viewitems.g0 g0Var = this.f203754d;
        java.lang.Object tag = g0Var.uploadingPB.getTag(com.tencent.mm.R.id.bpk);
        if (tag != null && !((java.lang.Boolean) tag).booleanValue()) {
            g0Var.uploadingPB.setVisibility(8);
        } else {
            g0Var.uploadingPB.setVisibility(0);
            g0Var.uploadingPB.setTag(com.tencent.mm.R.id.bpk, java.lang.Boolean.TRUE);
        }
    }
}
