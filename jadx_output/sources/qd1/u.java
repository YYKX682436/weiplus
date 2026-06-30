package qd1;

/* loaded from: classes7.dex */
public class u extends yl1.a {
    public u(qd1.v vVar, float f17, int i17) {
        super(f17, i17);
    }

    @Override // yl1.a, android.text.style.LineHeightSpan
    public void chooseHeight(java.lang.CharSequence charSequence, int i17, int i18, int i19, int i27, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt == null || this.f462958d < fontMetricsInt.bottom - fontMetricsInt.top) {
            return;
        }
        super.chooseHeight(charSequence, i17, i18, i19, i27, fontMetricsInt);
    }
}
