package k2;

/* loaded from: classes14.dex */
public final class a extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {

    /* renamed from: d, reason: collision with root package name */
    public final e1.y0 f303464d;

    /* renamed from: e, reason: collision with root package name */
    public d1.k f303465e;

    public a(e1.y0 shaderBrush) {
        kotlin.jvm.internal.o.g(shaderBrush, "shaderBrush");
        this.f303464d = shaderBrush;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        d1.k kVar;
        if (textPaint == null || (kVar = this.f303465e) == null) {
            return;
        }
        textPaint.setShader(this.f303464d.b(kVar.f225644a));
    }
}
