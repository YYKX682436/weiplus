package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f190342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190343e;

    public h4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, int i17) {
        this.f190343e = chatFooter;
        this.f190342d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        hv4.l lVar = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f189950x6;
        this.f190343e.F1(true, null, this.f190342d);
    }
}
