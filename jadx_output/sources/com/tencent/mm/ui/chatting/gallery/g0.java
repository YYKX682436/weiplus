package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f200942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.h0 f200943f;

    public g0(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, com.tencent.mm.ui.chatting.gallery.h0 h0Var) {
        this.f200941d = f9Var;
        this.f200942e = emojiInfo;
        this.f200943f = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/EmojiHistoryListAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onClick] :: clicked with msgId: ");
        com.tencent.mm.storage.f9 f9Var = this.f200941d;
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
        com.tencent.mars.xlog.Log.i("EmojiHistoryListAdapter", sb6.toString());
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f200942e;
        if (emojiInfo != null ? emojiInfo.k() : true) {
            com.tencent.mars.xlog.Log.i("EmojiHistoryListAdapter", "[onClick] :: game emoji click disabled");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/EmojiHistoryListAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.ui.chatting.gallery.h0 h0Var = this.f200943f;
        if (h0Var.f200973f) {
            de5.a.f229396a.k(5, 7, 8);
        } else {
            de5.a.e(de5.a.f229396a, 8, 0, 0, 6, null);
        }
        java.lang.String md52 = emojiInfo != null ? emojiInfo.getMd5() : null;
        if (md52 == null) {
            md52 = "";
        }
        qk.u uVar = new qk.u(md52, emojiInfo);
        java.lang.String str = emojiInfo != null ? emojiInfo.field_app_id : null;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        uVar.f364005g = str != null ? str : "";
        ((com.tencent.mm.feature.emoji.f4) ((com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class))).wi(h0Var.f200971d, uVar);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/EmojiHistoryListAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
