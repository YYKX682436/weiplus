package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class oa extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f190546d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ra f190547e;

    public oa(com.tencent.mm.pluginsdk.ui.chat.ra raVar) {
        this.f190547e = raVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.LinkedList linkedList = this.f190546d;
        if (linkedList == null) {
            return 0;
        }
        return linkedList.size() + this.f190547e.f190629t;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        java.util.LinkedList linkedList = this.f190546d;
        return (linkedList == null || i17 != linkedList.size()) ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.util.LinkedList linkedList = this.f190546d;
        jr.p pVar = (linkedList == null || linkedList.size() <= i17) ? null : (jr.p) linkedList.get(i17);
        int itemViewType = getItemViewType(i17);
        com.tencent.mm.pluginsdk.ui.chat.ra raVar = this.f190547e;
        if (itemViewType == 1) {
            if (!raVar.f190627r) {
                raVar.f190627r = true;
                int adapterPosition = k3Var.getAdapterPosition();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconStruct suggestEmoiconStruct = new com.tencent.mm.autogen.mmdata.rpt.SuggestEmoiconStruct();
                sb6.append(adapterPosition);
                suggestEmoiconStruct.f61002h = suggestEmoiconStruct.b("md5", "emoticon_search_more", true);
                suggestEmoiconStruct.f61006l = suggestEmoiconStruct.b("IsLocalSearch", "1", true);
                suggestEmoiconStruct.f61004j = suggestEmoiconStruct.b("Index", sb6.toString(), true);
                suggestEmoiconStruct.f60999e = suggestEmoiconStruct.b("Word", raVar.f190618i.replace(",", ""), true);
                suggestEmoiconStruct.f61001g = adapterPosition;
                suggestEmoiconStruct.f60998d = 3L;
                suggestEmoiconStruct.f61013s = java.lang.System.currentTimeMillis() - raVar.f190626q;
                suggestEmoiconStruct.k();
                suggestEmoiconStruct.f61001g = 0L;
            }
            if (!raVar.f190634y) {
                raVar.f190634y = true;
                raVar.e("chat_emo_bubble_search", "view_exp", raVar.c());
            }
            k3Var.itemView.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.na(this, k3Var));
        }
        if (pVar != null && (k3Var instanceof com.tencent.mm.pluginsdk.ui.chat.qa)) {
            com.tencent.mm.pluginsdk.ui.chat.qa qaVar = (com.tencent.mm.pluginsdk.ui.chat.qa) k3Var;
            qaVar.f190591e = pVar;
            android.widget.ImageView.ScaleType scaleType = android.widget.ImageView.ScaleType.CENTER_INSIDE;
            com.tencent.mm.emoji.view.EmojiStatusView emojiStatusView = qaVar.f190590d;
            emojiStatusView.setScaleType(scaleType);
            s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = pVar.f301316a;
            java.lang.String v17 = ((y12.h) wi6).v(emojiInfo.getMd5());
            if (com.tencent.mm.sdk.platformtools.t8.K0(v17)) {
                emojiStatusView.setContentDescription(raVar.f190610a.getString(com.tencent.mm.R.string.bzu));
            } else {
                emojiStatusView.setContentDescription(v17);
            }
            emojiStatusView.setEmojiInfo(emojiInfo);
            raVar.f190631v.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.pluginsdk.ui.chat.ra raVar = this.f190547e;
        return i17 == 1 ? new com.tencent.mm.pluginsdk.ui.chat.ma(this, android.view.LayoutInflater.from(raVar.f190610a).inflate(com.tencent.mm.R.layout.f488440td, viewGroup, false)) : new com.tencent.mm.pluginsdk.ui.chat.qa(raVar, android.view.LayoutInflater.from(raVar.f190610a).inflate(com.tencent.mm.R.layout.f488442tf, viewGroup, false));
    }
}
