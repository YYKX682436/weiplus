package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190324d;

    public g0(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190324d = chatFooter;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f190324d.M3.dismiss();
    }
}
