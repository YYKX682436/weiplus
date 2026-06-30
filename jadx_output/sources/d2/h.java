package d2;

/* loaded from: classes10.dex */
public final class h extends android.text.style.CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f225772a;

    /* renamed from: b, reason: collision with root package name */
    public final float f225773b;

    /* renamed from: c, reason: collision with root package name */
    public final float f225774c;

    /* renamed from: d, reason: collision with root package name */
    public final float f225775d;

    public h(int i17, float f17, float f18, float f19) {
        this.f225772a = i17;
        this.f225773b = f17;
        this.f225774c = f18;
        this.f225775d = f19;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint tp6) {
        kotlin.jvm.internal.o.g(tp6, "tp");
        tp6.setShadowLayer(this.f225775d, this.f225773b, this.f225774c, this.f225772a);
    }
}
