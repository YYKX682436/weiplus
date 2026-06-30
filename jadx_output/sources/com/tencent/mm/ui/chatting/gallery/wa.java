package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class wa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.xa f201545d;

    public wa(com.tencent.mm.ui.chatting.gallery.xa xaVar) {
        this.f201545d = xaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.xa xaVar = this.f201545d;
        xaVar.f201564e.f200746g.startAnimation(android.view.animation.AnimationUtils.loadAnimation(xaVar.f201564e.getContext(), com.tencent.mm.R.anim.f477784bd));
        xaVar.f201564e.f200746g.setVisibility(8);
    }
}
