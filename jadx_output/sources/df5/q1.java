package df5;

/* loaded from: classes10.dex */
public final class q1 extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {

    /* renamed from: d, reason: collision with root package name */
    public int f232195d;

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint tp6) {
        kotlin.jvm.internal.o.g(tp6, "tp");
        tp6.setAlpha((int) ((tp6.getAlpha() * this.f232195d) / 255.0f));
    }
}
