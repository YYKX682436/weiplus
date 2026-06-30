package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes2.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190567d;

    public q0(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190567d = chatFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190567d;
        chatFooter.U4.setTextColor(chatFooter.getResources().getColor(com.tencent.mm.R.color.adh));
        chatFooter.U4.setText(chatFooter.getResources().getString(com.tencent.mm.R.string.oau));
        chatFooter.U4.setTextSize(0, i65.a.f(chatFooter.getContext(), com.tencent.mm.R.dimen.f479919iy));
    }
}
