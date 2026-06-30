package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class uf implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.vf f200067a;

    public uf(com.tencent.mm.ui.chatting.component.vf vfVar) {
        this.f200067a = vfVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.tencent.mm.ui.chatting.component.vf vfVar = this.f200067a;
        com.tencent.mm.ui.chatting.component.rf rfVar = vfVar.f200128e;
        rfVar.B = false;
        if (rfVar.f199830f == null || !(!rfVar.f199847z.f252843c.isEmpty())) {
            return;
        }
        vfVar.f200128e.f199830f.setText(vfVar.f200127d);
    }
}
