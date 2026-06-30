package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190636d;

    public s0(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190636d = chatFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f190636d.f190086w4.animate().alpha(1.0f).setDuration(150L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).start();
    }
}
