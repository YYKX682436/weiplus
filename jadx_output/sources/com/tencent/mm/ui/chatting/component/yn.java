package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class yn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ho f200348d;

    public yn(com.tencent.mm.ui.chatting.component.ho hoVar) {
        this.f200348d = hoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$initUseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.ho hoVar = this.f200348d;
        java.lang.String x17 = hoVar.f198580d.x();
        int length = hoVar.f199191u.length();
        com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView = hoVar.f199183m;
        if (loadableTextView == null) {
            kotlin.jvm.internal.o.o("resultTv");
            throw null;
        }
        int length2 = loadableTextView.getF131525i().toString().length();
        java.lang.String m07 = hoVar.m0();
        com.tencent.mm.autogen.mmdata.rpt.TranslateMsgStruct translateMsgStruct = new com.tencent.mm.autogen.mmdata.rpt.TranslateMsgStruct();
        if (pn4.f1.f357105a.length() == 0) {
            str = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(str, "toString(...)");
            pn4.f1.f357105a = str;
        } else {
            str = pn4.f1.f357105a;
        }
        translateMsgStruct.r(str);
        translateMsgStruct.f61351f = 2;
        translateMsgStruct.p("6");
        translateMsgStruct.f61354i = length;
        translateMsgStruct.f61355j = length2;
        translateMsgStruct.f61357l = translateMsgStruct.b("TargetLanguage", m07, true);
        translateMsgStruct.q(x17);
        translateMsgStruct.k();
        sb5.n2 n2Var = hoVar.f199178e;
        if (n2Var != null) {
            com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView2 = hoVar.f199183m;
            if (loadableTextView2 == null) {
                kotlin.jvm.internal.o.o("resultTv");
                throw null;
            }
            java.lang.String obj = loadableTextView2.getF131525i().toString();
            hoVar.f199190t = obj;
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.pluginsdk.ui.chat.h2) n2Var).f190340a;
            com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
            if (y4Var != null) {
                ((com.tencent.mm.ui.chatting.component.y8) ((sb5.i0) y4Var.a().f460708c.a(sb5.i0.class))).P0(51);
            }
            chatFooter.f190021m.setText(obj);
            chatFooter.f190021m.setSelection(obj.length());
        }
        com.tencent.mm.ui.chatting.component.ln lnVar = hoVar.A;
        lnVar.getClass();
        com.tencent.mm.sdk.platformtools.o4.M(lnVar.f199451a.r0()).putInt(lnVar.a("useTrans"), 0);
        hoVar.u0(com.tencent.mm.ui.chatting.component.kn.f199376d);
        com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView3 = hoVar.f199183m;
        if (loadableTextView3 == null) {
            kotlin.jvm.internal.o.o("resultTv");
            throw null;
        }
        loadableTextView3.setOriginText("");
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$initUseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
