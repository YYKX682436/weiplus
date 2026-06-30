package com.tencent.mm.ui.chatting.component;

/* loaded from: classes7.dex */
public final class ka extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ta f199358d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(com.tencent.mm.ui.chatting.component.ta taVar) {
        super(0);
        this.f199358d = taVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.component.ta taVar = this.f199358d;
        yb5.d mChattingContext = taVar.f198580d;
        kotlin.jvm.internal.o.f(mChattingContext, "mChattingContext");
        com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView mEHolderView = (com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView) ((jz5.n) taVar.f199986u).getValue();
        kotlin.jvm.internal.o.f(mEHolderView, "access$getMagicEmojiHolder(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) taVar.f199987v).getValue();
        kotlin.jvm.internal.o.f(frameLayout, "access$getMagicEmojiBeneathCoverViewHolder(...)");
        return new kh5.h(mChattingContext, mEHolderView, frameLayout, new com.tencent.mm.ui.chatting.component.ja(taVar));
    }
}
