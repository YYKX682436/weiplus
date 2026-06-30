package r85;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f393335a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.CharSequence f393336b;

    /* renamed from: c, reason: collision with root package name */
    public float f393337c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.res.ColorStateList f393338d;

    /* renamed from: e, reason: collision with root package name */
    public int f393339e;

    public c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f393335a = context;
        this.f393336b = "";
    }

    public final android.text.SpannableString a() {
        if (this.f393336b.length() == 0) {
            throw new java.lang.IllegalStateException("Text must be set before building");
        }
        if (this.f393337c == 0.0f) {
            throw new java.lang.IllegalStateException("Text size must be set before building");
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(this.f393336b);
        android.content.res.ColorStateList colorStateList = this.f393338d;
        if (colorStateList == null) {
            throw new java.lang.IllegalStateException("Color must be set before building");
        }
        spannableString.setSpan(new android.text.style.TextAppearanceSpan(null, this.f393339e, (int) this.f393337c, colorStateList, colorStateList), 0, spannableString.length(), 33);
        spannableString.setSpan(new r85.a((int) this.f393337c), 0, spannableString.length(), 33);
        return spannableString;
    }

    public final r85.c b(int i17) {
        this.f393337c = this.f393335a.getResources().getDimension(i17);
        return this;
    }
}
