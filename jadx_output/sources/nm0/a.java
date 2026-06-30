package nm0;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f338451a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f338452b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f338453c = -1;

    /* renamed from: d, reason: collision with root package name */
    public android.text.TextPaint f338454d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.text.Layout.Alignment f338455e = android.text.Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public android.text.TextUtils.TruncateAt f338456f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f338457g = 51;

    /* renamed from: h, reason: collision with root package name */
    public int f338458h = -1;

    /* renamed from: i, reason: collision with root package name */
    public float f338459i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f338460j = 1.1f;

    /* renamed from: k, reason: collision with root package name */
    public final int f338461k = -1;

    /* renamed from: l, reason: collision with root package name */
    public float f338462l = -1.0f;

    /* renamed from: m, reason: collision with root package name */
    public int f338463m = -1;

    /* renamed from: n, reason: collision with root package name */
    public final int f338464n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f338465o = -1;

    public int hashCode() {
        int i17 = (this.f338451a * 31) + 0 + (this.f338453c * 31);
        android.text.TextPaint textPaint = this.f338454d;
        if (textPaint != null) {
            i17 += textPaint.hashCode() * 31;
        }
        int hashCode = i17 + (this.f338455e.hashCode() * 31);
        android.text.TextUtils.TruncateAt truncateAt = this.f338456f;
        if (truncateAt != null) {
            hashCode += truncateAt.hashCode() * 31;
        }
        return ((int) (((int) (((int) (hashCode + (this.f338457g * 31) + (this.f338458h * 31) + (this.f338459i * 31.0f))) + (this.f338460j * 31.0f))) + 0 + (this.f338461k * 31) + (this.f338462l * 31.0f))) + (this.f338463m * 31) + (this.f338464n * 31) + (this.f338465o * 31);
    }

    public java.lang.String toString() {
        return "" + java.lang.String.format("maxLines: %d ", java.lang.Integer.valueOf(this.f338451a)) + java.lang.String.format("maxLength: %d ", java.lang.Integer.valueOf(this.f338453c)) + java.lang.String.format("textPaint: %s ", this.f338454d) + java.lang.String.format("alignment: %s ", this.f338455e) + java.lang.String.format("ellipsize: %s ", this.f338456f) + java.lang.String.format("gravity: %s ", java.lang.Integer.valueOf(this.f338457g)) + java.lang.String.format("ellipsizeWidth: %s ", java.lang.Integer.valueOf(this.f338458h)) + java.lang.String.format("textDirection: %s ", null) + java.lang.String.format("spacingAdd: %s spacingMult: %s ", java.lang.Float.valueOf(this.f338459i), java.lang.Float.valueOf(this.f338460j)) + java.lang.String.format("includedPad: %b ", java.lang.Boolean.FALSE) + java.lang.String.format("typeface: %s ", null) + java.lang.String.format("fontStyle: %d ", java.lang.Integer.valueOf(this.f338461k)) + java.lang.String.format("textSize: %s ", java.lang.Float.valueOf(this.f338462l)) + java.lang.String.format("textColor: %d", java.lang.Integer.valueOf(this.f338463m)) + java.lang.String.format("linkColor: %d", java.lang.Integer.valueOf(this.f338464n)) + java.lang.String.format("breakStrategy: %d", java.lang.Integer.valueOf(this.f338465o));
    }
}
