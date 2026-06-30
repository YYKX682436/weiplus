package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class wn extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ho f200185d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn(com.tencent.mm.ui.chatting.component.ho hoVar) {
        super(2);
        this.f200185d = hoVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        android.view.View view = (android.view.View) obj;
        android.view.MotionEvent event = (android.view.MotionEvent) obj2;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.ui.chatting.component.ho hoVar = this.f200185d;
        com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView = hoVar.f199183m;
        if (loadableTextView == null) {
            kotlin.jvm.internal.o.o("resultTv");
            throw null;
        }
        java.lang.String f198559n = loadableTextView.getF198559n();
        android.content.Intent intent = new android.content.Intent(hoVar.f198580d.g(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.TextPreviewUI.class);
        intent.addFlags(67108864);
        intent.putExtra("key_chat_text", f198559n);
        intent.putExtra("key_chat_preview_hide_toolbar", true);
        android.app.Activity g17 = hoVar.f198580d.g();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent", "startPreviewUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        g17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(g17, "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent", "startPreviewUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.j(hoVar.f198580d.g());
        hoVar.f199194x = true;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) hoVar.f198580d.f460708c.a(sb5.s0.class))).f199263e;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        chatFooter.setIgnoreScroll(bool);
        java.lang.String x17 = hoVar.f198580d.x();
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
        translateMsgStruct.p("5");
        translateMsgStruct.q(x17);
        translateMsgStruct.k();
        return bool;
    }
}
