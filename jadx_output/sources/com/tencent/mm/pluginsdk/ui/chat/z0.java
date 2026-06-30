package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class z0 implements pn4.s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190767a;

    public z0(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190767a = chatFooter;
    }

    public void a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.equals("zh_CN")) {
            return;
        }
        int i17 = pn4.c2.f357063d;
        pn4.c2.f357064e = "zh_CN";
        java.lang.String string = this.f190767a.getContext().getResources().getString(com.tencent.mm.R.string.nd7);
        kotlin.jvm.internal.o.g(string, "<set-?>");
        pn4.c2.f357065f = string;
    }
}
