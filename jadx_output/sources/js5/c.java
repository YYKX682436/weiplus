package js5;

/* loaded from: classes15.dex */
public class c extends js5.b {

    /* renamed from: h, reason: collision with root package name */
    public boolean f301572h;

    public c(int i17, int i18, android.text.style.ClickableSpan clickableSpan) {
        super(i17, i18, clickableSpan);
    }

    @Override // js5.b
    public void b(android.graphics.Canvas canvas, android.text.TextPaint textPaint, java.util.List list) {
        a(list);
        if (this.f301572h) {
            int color = textPaint.getColor();
            int i17 = textPaint.bgColor;
            boolean isUnderlineText = textPaint.isUnderlineText();
            ((android.text.style.ClickableSpan) this.f301571g).updateDrawState(textPaint);
            textPaint.setColor(textPaint.bgColor);
            java.util.Iterator it = this.f301568d.iterator();
            while (it.hasNext()) {
                canvas.drawRect((android.graphics.RectF) it.next(), textPaint);
            }
            textPaint.setColor(color);
            textPaint.setUnderlineText(isUnderlineText);
            textPaint.bgColor = i17;
            this.f301572h = false;
        }
    }

    public void onClick(android.view.View view) {
        android.text.style.CharacterStyle characterStyle = this.f301571g;
        if (characterStyle != null) {
            ((android.text.style.ClickableSpan) characterStyle).onClick(view);
        }
    }
}
