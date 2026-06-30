package hr3;

/* loaded from: classes3.dex */
public final class j9 {

    /* renamed from: a, reason: collision with root package name */
    public final int f283684a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f283685b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f283686c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f283687d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f283688e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f283689f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f283690g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f283691h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f283692i;

    /* renamed from: j, reason: collision with root package name */
    public int f283693j;

    /* renamed from: k, reason: collision with root package name */
    public final yz5.a f283694k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f283695l;

    public j9(int i17, android.view.View section, android.widget.TextView title, android.widget.TextView summary, android.widget.TextView summaryMore, android.widget.ImageView image, android.graphics.drawable.Drawable drawable, yz5.l imageOnClick, java.lang.CharSequence charSequence, int i18, yz5.a aVar, boolean z17) {
        kotlin.jvm.internal.o.g(section, "section");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(summary, "summary");
        kotlin.jvm.internal.o.g(summaryMore, "summaryMore");
        kotlin.jvm.internal.o.g(image, "image");
        kotlin.jvm.internal.o.g(imageOnClick, "imageOnClick");
        this.f283684a = i17;
        this.f283685b = section;
        this.f283686c = title;
        this.f283687d = summary;
        this.f283688e = summaryMore;
        this.f283689f = image;
        this.f283690g = drawable;
        this.f283691h = imageOnClick;
        this.f283692i = charSequence;
        this.f283693j = i18;
        this.f283694k = aVar;
        this.f283695l = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr3.j9)) {
            return false;
        }
        hr3.j9 j9Var = (hr3.j9) obj;
        return this.f283684a == j9Var.f283684a && kotlin.jvm.internal.o.b(this.f283685b, j9Var.f283685b) && kotlin.jvm.internal.o.b(this.f283686c, j9Var.f283686c) && kotlin.jvm.internal.o.b(this.f283687d, j9Var.f283687d) && kotlin.jvm.internal.o.b(this.f283688e, j9Var.f283688e) && kotlin.jvm.internal.o.b(this.f283689f, j9Var.f283689f) && kotlin.jvm.internal.o.b(this.f283690g, j9Var.f283690g) && kotlin.jvm.internal.o.b(this.f283691h, j9Var.f283691h) && kotlin.jvm.internal.o.b(this.f283692i, j9Var.f283692i) && this.f283693j == j9Var.f283693j && kotlin.jvm.internal.o.b(this.f283694k, j9Var.f283694k) && this.f283695l == j9Var.f283695l;
    }

    public int hashCode() {
        int hashCode = ((((((((((java.lang.Integer.hashCode(this.f283684a) * 31) + this.f283685b.hashCode()) * 31) + this.f283686c.hashCode()) * 31) + this.f283687d.hashCode()) * 31) + this.f283688e.hashCode()) * 31) + this.f283689f.hashCode()) * 31;
        android.graphics.drawable.Drawable drawable = this.f283690g;
        int hashCode2 = (((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31) + this.f283691h.hashCode()) * 31;
        java.lang.CharSequence charSequence = this.f283692i;
        int hashCode3 = (((hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + java.lang.Integer.hashCode(this.f283693j)) * 31;
        yz5.a aVar = this.f283694k;
        return ((hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f283695l);
    }

    public java.lang.String toString() {
        return "ItemView(titleStringResId=" + this.f283684a + ", section=" + this.f283685b + ", title=" + this.f283686c + ", summary=" + this.f283687d + ", summaryMore=" + this.f283688e + ", image=" + this.f283689f + ", imagePrepend=" + this.f283690g + ", imageOnClick=" + this.f283691h + ", text=" + ((java.lang.Object) this.f283692i) + ", maxLines=" + this.f283693j + ", onClickMore=" + this.f283694k + ", forceShowMoreBtn=" + this.f283695l + ')';
    }
}
