package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class qa extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.emoji.view.EmojiStatusView f190590d;

    /* renamed from: e, reason: collision with root package name */
    public jr.p f190591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ra f190592f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(com.tencent.mm.pluginsdk.ui.chat.ra raVar, android.view.View view) {
        super(view);
        this.f190592f = raVar;
        com.tencent.mm.emoji.view.EmojiStatusView emojiStatusView = (com.tencent.mm.emoji.view.EmojiStatusView) view.findViewById(com.tencent.mm.R.id.f487173ns1);
        this.f190590d = emojiStatusView;
        emojiStatusView.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.pa(this, raVar));
    }
}
