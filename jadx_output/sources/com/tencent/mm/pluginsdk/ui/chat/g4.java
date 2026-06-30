package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190328d;

    public g4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190328d = chatFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        hv4.l lVar = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f189950x6;
        this.f190328d.G1(true, null);
        ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).getClass();
        if (((se0.e) ((te0.e) i95.n0.c(te0.e.class))).isTeenMode()) {
            return;
        }
        ((xu4.e) ((ur.m) i95.n0.c(ur.m.class))).wi();
    }
}
