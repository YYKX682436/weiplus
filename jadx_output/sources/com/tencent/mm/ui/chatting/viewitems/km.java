package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes8.dex */
public final class km implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final yb5.d f204361d;

    public km(yb5.d ui6) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        this.f204361d = ui6;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.ui.chatting.viewitems.er erVar;
        java.lang.String str;
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemOpenIMKefuNameCard$CardOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemOpenIMKefuNameCard$CardOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getTag() instanceof com.tencent.mm.ui.chatting.viewitems.er) {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
            erVar = (com.tencent.mm.ui.chatting.viewitems.er) tag;
        } else {
            erVar = null;
        }
        if (erVar == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemOpenIMKefuNameCard$CardOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        sb5.k1 k1Var = (sb5.k1) this.f204361d.f460708c.a(sb5.k1.class);
        java.lang.String str2 = erVar.f203906b;
        android.os.Bundle bundle = erVar.f203904J;
        com.tencent.mm.ui.chatting.component.li liVar = (com.tencent.mm.ui.chatting.component.li) k1Var;
        liVar.getClass();
        com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest();
        yb5.d dVar = liVar.f198580d;
        openIMKefuStartConversationRequest.f72272d = dVar != null ? dVar.g() : null;
        openIMKefuStartConversationRequest.f72274f = 2;
        openIMKefuStartConversationRequest.f72276h = j41.f0.a(2);
        openIMKefuStartConversationRequest.f72287v = true;
        openIMKefuStartConversationRequest.f72283r = true;
        openIMKefuStartConversationRequest.f72281p = true;
        android.content.Context context = openIMKefuStartConversationRequest.f72272d;
        java.lang.String str3 = "";
        if (context == null || (str = context.getString(com.tencent.mm.R.string.hez)) == null) {
            str = "";
        }
        openIMKefuStartConversationRequest.f72282q = str;
        r45.s4 s4Var = new r45.s4();
        if (bundle != null && (string = bundle.getString("kefu_card_ticket", "")) != null) {
            str3 = string;
        }
        s4Var.f385488f = str3;
        s4Var.f385490h = str2;
        openIMKefuStartConversationRequest.f72277i = s4Var;
        openIMKefuStartConversationRequest.f72273e = java.lang.System.currentTimeMillis();
        android.content.Intent intent = new android.content.Intent();
        android.os.Handler createFreeHandler = com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper());
        kotlin.jvm.internal.o.f(createFreeHandler, "createFreeHandler(...)");
        intent.putExtra("key_result_receiver", new com.tencent.mm.openim.model.OpenImKefuStartChattingResultReceiver(createFreeHandler, new com.tencent.mm.ui.chatting.component.ji(liVar)));
        openIMKefuStartConversationRequest.f72288w = intent;
        j41.z zVar = (j41.z) i95.n0.c(j41.z.class);
        if (zVar != null) {
            ((l41.g2) zVar).Bi(openIMKefuStartConversationRequest);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemOpenIMKefuNameCard$CardOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
