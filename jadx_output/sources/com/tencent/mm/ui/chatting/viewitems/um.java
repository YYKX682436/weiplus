package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public abstract class um {
    public abstract void a(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, com.tencent.mm.ui.chatting.adapter.q qVar, yb5.d dVar, rd5.d dVar2, java.lang.String str);

    public void b(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, com.tencent.mm.ui.chatting.adapter.q qVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        com.tencent.mm.ui.chatting.viewitems.vm vmVar = (com.tencent.mm.ui.chatting.viewitems.vm) g0Var;
        android.view.View view = vmVar.f205880d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemSys$ChattingItemSysInterface", "fillingExtraParts", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemSys$ChattingItemSysInterface", "fillingExtraParts", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ProgressBar progressBar = vmVar.uploadingPB;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public void c(android.text.SpannableString spannableString) {
        for (com.tencent.mm.pluginsdk.ui.span.z0 z0Var : (com.tencent.mm.pluginsdk.ui.span.z0[]) spannableString.getSpans(0, spannableString.length(), com.tencent.mm.pluginsdk.ui.span.z0.class)) {
            z0Var.setTextBold(true);
        }
    }
}
