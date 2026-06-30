package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class t5 implements com.tencent.mm.ui.widget.snackbar.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.c6 f199967a;

    public t5(com.tencent.mm.ui.chatting.component.c6 c6Var) {
        this.f199967a = c6Var;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void a() {
        com.tencent.mm.ui.chatting.component.jb jbVar = (com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f199967a.f198873d.f198580d.f460708c.a(sb5.s0.class));
        jbVar.getClass();
        jbVar.f199270o = new android.view.animation.AnimationSet(false);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(2, 0.0f, 2, 0.0f, 1, 1.0f, 1, 0.0f);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        jbVar.f199270o.setInterpolator(new android.view.animation.DecelerateInterpolator(1.5f));
        jbVar.f199270o.addAnimation(translateAnimation);
        jbVar.f199270o.addAnimation(alphaAnimation);
        jbVar.f199270o.setDuration(300L);
        jbVar.f199270o.setFillBefore(true);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = jbVar.f199263e;
        if (chatFooter != null) {
            chatFooter.startAnimation(jbVar.f199270o);
        }
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onHide() {
        this.f199967a.f198873d.o0();
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onShow() {
        this.f199967a.f198873d.o0();
    }
}
