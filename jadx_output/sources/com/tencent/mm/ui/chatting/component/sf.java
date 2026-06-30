package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class sf implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.tf f199938a;

    public sf(com.tencent.mm.ui.chatting.component.tf tfVar) {
        this.f199938a = tfVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.ui.chatting.component.tf tfVar = this.f199938a;
        if (tfVar.f199995d) {
            return;
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(tfVar.f199996e.a(), tfVar.f199996e.f149480d);
        if (Li.s2(c01.z1.r())) {
            com.tencent.mm.ui.chatting.component.rf rfVar = tfVar.f199997f;
            rfVar.f199830f.setText(rfVar.f198580d.s().getString(com.tencent.mm.R.string.n7l));
        } else if (Li.r2()) {
            com.tencent.mm.ui.chatting.component.rf rfVar2 = tfVar.f199997f;
            rfVar2.f199830f.setText(rfVar2.f198580d.s().getString(com.tencent.mm.R.string.n7k));
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
