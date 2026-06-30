package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes4.dex */
public class MMTextAppearanceSpan extends android.text.style.TextAppearanceSpan {
    @Override // android.text.style.TextAppearanceSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        com.tencent.mm.ui.bk.r0(textPaint, 0.1f);
    }
}
