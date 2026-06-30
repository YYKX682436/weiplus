package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f190498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190499e;

    public n4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, boolean z17) {
        this.f190499e = chatFooter;
        this.f190498d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        hv4.l lVar = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f189950x6;
        this.f190499e.B1(this.f190498d);
    }
}
