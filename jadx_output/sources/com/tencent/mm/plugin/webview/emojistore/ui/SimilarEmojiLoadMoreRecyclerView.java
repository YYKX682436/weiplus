package com.tencent.mm.plugin.webview.emojistore.ui;

/* loaded from: classes15.dex */
public class SimilarEmojiLoadMoreRecyclerView extends com.tencent.mm.emoji.panel.EmojiPanelRecyclerView implements com.tencent.mm.feature.emoji.api.z6 {

    /* renamed from: u2, reason: collision with root package name */
    public com.tencent.mm.feature.emoji.api.y6 f182048u2;

    /* renamed from: v2, reason: collision with root package name */
    public boolean f182049v2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimilarEmojiLoadMoreRecyclerView(android.content.Context context) {
        super(context, null);
        kotlin.jvm.internal.o.g(context, "context");
        setEnableLongPress(false);
        i(new kr.b(this));
        i(new iw4.c(this));
    }

    @Override // com.tencent.mm.feature.emoji.api.z6
    public void setOnLoadingStateChangedListener(com.tencent.mm.feature.emoji.api.y6 y6Var) {
        this.f182048u2 = y6Var;
    }

    public SimilarEmojiLoadMoreRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setEnableLongPress(false);
        i(new kr.b(this));
        i(new iw4.c(this));
    }

    public SimilarEmojiLoadMoreRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setEnableLongPress(false);
        i(new kr.b(this));
        i(new iw4.c(this));
    }
}
