package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class na implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f190525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.oa f190526e;

    public na(com.tencent.mm.pluginsdk.ui.chat.oa oaVar, androidx.recyclerview.widget.k3 k3Var) {
        this.f190526e = oaVar;
        this.f190525d = k3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$SuggestEmojiAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.chat.oa oaVar = this.f190526e;
        com.tencent.mm.pluginsdk.ui.chat.ra raVar = oaVar.f190547e;
        raVar.e("chat_emo_bubble_search", "view_clk", raVar.c());
        com.tencent.mm.pluginsdk.ui.chat.ra raVar2 = oaVar.f190547e;
        int adapterPosition = this.f190525d.getAdapterPosition();
        if (android.text.TextUtils.isEmpty(raVar2.f190618i)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SuggestEmoticonBubble", "Whoops! navToSearch without any input");
            raVar2.f190614e.dismiss();
        } else {
            raVar2.f(null, 0);
            com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconStruct suggestEmoiconStruct = raVar2.f190624o;
            suggestEmoiconStruct.f61001g = adapterPosition;
            suggestEmoiconStruct.f60998d = 3L;
            suggestEmoiconStruct.f61013s = java.lang.System.currentTimeMillis() - raVar2.f190626q;
            suggestEmoiconStruct.k();
            suggestEmoiconStruct.f61001g = 0L;
            if (raVar2.f190628s != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.SuggestEmoticonBubble", "Call `onSearchMore`");
                raVar2.f190628s.a(raVar2.f190618i);
            }
            raVar2.f190614e.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$SuggestEmojiAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
