package com.tencent.mm.ui.widget;

/* loaded from: classes4.dex */
public class QFadeImageView extends com.tencent.mm.memory.ui.QPictureView {
    public long H;
    public java.lang.String I;

    public QFadeImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public java.lang.String getImageKey() {
        return this.I;
    }

    public long getStartTimeMillis() {
        return this.H;
    }

    public QFadeImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
