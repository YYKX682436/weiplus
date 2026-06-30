package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class m1 implements nl5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190481a;

    public m1(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190481a = chatFooter;
    }

    @Override // nl5.p
    public boolean a(java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190481a;
        try {
            return i45.j.f288415a.h((android.view.View) chatFooter.f190021m.getRealEditText(), str, chatFooter.f189955a3.c(), bundle, chatFooter.f190090x0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatFooter", e17, null, new java.lang.Object[0]);
            return false;
        }
    }
}
