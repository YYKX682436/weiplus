package i9;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.CharSequence f289665d;

    /* renamed from: e, reason: collision with root package name */
    public final float f289666e;

    /* renamed from: f, reason: collision with root package name */
    public final float f289667f;

    public a(java.lang.CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public a(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, float f17, int i17, int i18, float f18, int i19, float f19) {
        this(charSequence, alignment, f17, i17, i18, f18, i19, f19, false, -16777216);
    }

    public a(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, float f17, int i17, int i18, float f18, int i19, float f19, boolean z17, int i27) {
        this(charSequence, alignment, null, f17, i17, i18, f18, i19, f19, Float.MIN_VALUE, z17, i27);
    }

    public a(java.lang.CharSequence charSequence, android.text.Layout.Alignment alignment, android.graphics.Bitmap bitmap, float f17, int i17, int i18, float f18, int i19, float f19, float f27, boolean z17, int i27) {
        this.f289665d = charSequence;
        this.f289666e = f17;
        this.f289667f = f18;
    }
}
