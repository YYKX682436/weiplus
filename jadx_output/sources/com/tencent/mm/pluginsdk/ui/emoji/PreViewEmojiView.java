package com.tencent.mm.pluginsdk.ui.emoji;

/* loaded from: classes10.dex */
public class PreViewEmojiView extends com.tencent.mm.emoji.view.EmojiStatusView {

    /* renamed from: r, reason: collision with root package name */
    public int f190818r;

    public PreViewEmojiView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f190818r = 0;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int i19 = this.f190818r;
        if (i19 > 0) {
            setMeasuredDimension(i19, i19);
        }
    }

    public void setSize(int i17) {
        this.f190818r = i17;
    }

    public PreViewEmojiView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f190818r = 0;
    }
}
