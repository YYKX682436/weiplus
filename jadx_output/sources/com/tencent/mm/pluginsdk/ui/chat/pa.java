package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class pa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.qa f190566d;

    public pa(com.tencent.mm.pluginsdk.ui.chat.qa qaVar, com.tencent.mm.pluginsdk.ui.chat.ra raVar) {
        this.f190566d = qaVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.chat.qa qaVar = this.f190566d;
        com.tencent.mm.pluginsdk.ui.chat.ra raVar = qaVar.f190592f;
        int adapterPosition = qaVar.getAdapterPosition();
        jr.p pVar = qaVar.f190591e;
        java.util.HashMap c17 = raVar.c();
        raVar.b(c17, pVar, adapterPosition);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        c17.put("click_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        raVar.e("chat_emo_bubble", "view_clk", c17);
        com.tencent.mm.pluginsdk.ui.chat.la laVar = qaVar.f190592f.A;
        int adapterPosition2 = qaVar.getAdapterPosition();
        jr.p pVar2 = qaVar.f190591e;
        com.tencent.mm.pluginsdk.ui.chat.ra raVar2 = ((com.tencent.mm.pluginsdk.ui.chat.ga) laVar).f190336a;
        if (pVar2 != null && raVar2.f190616g != null && raVar2.f190617h != null) {
            z85.l c18 = com.tencent.mm.storage.n5.f().c();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = pVar2.f301316a;
            if (c18.u1(emojiInfo.field_md5) == null) {
                com.tencent.mm.storage.n5.f().c().insert(emojiInfo);
            }
            emojiInfo.K2 = qk.z6.SEND_FROM_SCENE_RECOMMEND_BUBBLE;
            raVar2.f190616g.b(emojiInfo);
            raVar2.f190617h.clear();
            raVar2.f(java.util.Collections.singletonList(pVar2), 0);
            com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconStruct suggestEmoiconStruct = raVar2.f190624o;
            suggestEmoiconStruct.f61001g = adapterPosition2;
            suggestEmoiconStruct.f60998d = 1L;
            suggestEmoiconStruct.f61013s = java.lang.System.currentTimeMillis() - raVar2.f190626q;
            suggestEmoiconStruct.k();
            suggestEmoiconStruct.f61001g = 0L;
        }
        raVar2.f190614e.dismiss();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/SuggestEmoticonBubble$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
