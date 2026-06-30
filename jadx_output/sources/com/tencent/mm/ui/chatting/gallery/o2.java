package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.p2 f201235d;

    public o2(com.tencent.mm.ui.chatting.gallery.p2 p2Var) {
        this.f201235d = p2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.p2 p2Var = this.f201235d;
        p2Var.f201261e.f200575o.startAnimation(android.view.animation.AnimationUtils.loadAnimation(p2Var.f201261e.getContext(), com.tencent.mm.R.anim.f477784bd));
        p2Var.f201261e.f200575o.setVisibility(8);
    }
}
