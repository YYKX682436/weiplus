package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class f1 implements com.tencent.mm.pluginsdk.ui.chat.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190304d;

    public f1(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190304d = chatFooter;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.f190304d.getContext(), com.tencent.mm.R.anim.f477843d1);
        loadAnimation.setDuration(150L);
        return loadAnimation;
    }
}
