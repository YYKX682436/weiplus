package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class r4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190598e;

    public r4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, java.lang.String str) {
        this.f190598e = chatFooter;
        this.f190597d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f190598e.f190090x0.k(this.f190597d);
    }
}
