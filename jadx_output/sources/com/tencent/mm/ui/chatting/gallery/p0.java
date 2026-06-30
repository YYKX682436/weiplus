package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public final class p0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView f201258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.gih);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f201258d = (com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView) findViewById;
    }
}
