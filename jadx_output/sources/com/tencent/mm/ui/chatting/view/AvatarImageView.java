package com.tencent.mm.ui.chatting.view;

/* loaded from: classes5.dex */
public class AvatarImageView extends com.tencent.mm.plugin.patmsg.ui.AvatarPatImageView {
    public AvatarImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    public void setChattingBG(boolean z17) {
    }

    public AvatarImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setLayerType(1, null);
    }
}
