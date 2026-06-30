package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class q4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f190571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190572f;

    public q4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, java.lang.String str, long j17) {
        this.f190572f = chatFooter;
        this.f190570d = str;
        this.f190571e = j17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190572f;
        chatFooter.f190090x0.p(this.f190570d, (int) this.f190571e, chatFooter.getQuoteMsgInfo());
    }
}
