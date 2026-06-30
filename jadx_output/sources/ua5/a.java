package ua5;

/* loaded from: classes10.dex */
public final class a extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {

    /* renamed from: d, reason: collision with root package name */
    public int f425978d;

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint tp6) {
        kotlin.jvm.internal.o.g(tp6, "tp");
        tp6.setAlpha((int) ((tp6.getAlpha() * this.f425978d) / 255.0f));
    }
}
