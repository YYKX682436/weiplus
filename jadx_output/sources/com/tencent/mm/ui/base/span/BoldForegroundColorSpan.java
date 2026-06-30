package com.tencent.mm.ui.base.span;

/* loaded from: classes5.dex */
public class BoldForegroundColorSpan extends android.text.style.ForegroundColorSpan {
    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        com.tencent.mm.ui.bk.r0(textPaint, 0.8f);
    }
}
