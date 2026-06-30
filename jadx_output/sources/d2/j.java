package d2;

/* loaded from: classes14.dex */
public final class j extends android.text.style.CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f225777a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f225778b;

    public j(boolean z17, boolean z18) {
        this.f225777a = z17;
        this.f225778b = z18;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        kotlin.jvm.internal.o.g(textPaint, "textPaint");
        textPaint.setUnderlineText(this.f225777a);
        textPaint.setStrikeThruText(this.f225778b);
    }
}
