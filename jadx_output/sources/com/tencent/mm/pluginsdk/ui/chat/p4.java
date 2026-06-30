package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class p4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190558e;

    public p4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, java.lang.String str) {
        this.f190558e = chatFooter;
        this.f190557d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f190558e.f190090x0.k(this.f190557d);
    }
}
