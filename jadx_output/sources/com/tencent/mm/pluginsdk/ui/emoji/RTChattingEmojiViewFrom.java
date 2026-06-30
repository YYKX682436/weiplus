package com.tencent.mm.pluginsdk.ui.emoji;

/* loaded from: classes9.dex */
public class RTChattingEmojiViewFrom extends com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView {
    public RTChattingEmojiViewFrom(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    @Override // com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView
    public void a() {
        super.a();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        addView(this.f190826m, layoutParams);
    }

    public RTChattingEmojiViewFrom(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
